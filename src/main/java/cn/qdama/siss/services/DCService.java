package cn.qdama.siss.services;

import cn.qdama.siss.bean.Detail4im;
import cn.qdama.siss.bean.Master4im;
import cn.qdama.siss.bean.SysSheetNo;
import cn.qdama.siss.bean.SysSheetNoKey;
import cn.qdama.siss.mapper.*;
import com.sun.javafx.binding.BindingHelperObserver;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DCService {

    @Autowired
    private Detail4imMapper detail4imMapper;
    @Autowired
    private SysSheetNoMapper sysSheetNoMapper;
    @Autowired
    private Master4imMapper master4imMapper;
    @Autowired
    private Branch_stockMapper stockMapper;
    @Autowired
    private JavaMailSenderImpl javaMailSender;
    @Autowired
    private InsertMasterService insertMasterService;
    @Autowired
    private JXCDaySumMapper jxcDaySumMapper;
    @Autowired
            private  ItemInfoMapper itemInfoMapper;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "0 00 23 * * ?")
    public int getDC() throws IOException{
        //1.先获取目前的值再更新
        long value = insertMasterService.getSysSheetValue("DC", "0000");
        //2、获得门店日清数据
                //2.1 生成excel文件
                String[] tableHeaders = {"序号", "货号","品名", "单据号", "日清箱数", "日清数量", "单价", "日清金额", "售价", "备注"};
                HSSFWorkbook wbook = new HSSFWorkbook();
                HSSFCellStyle cellStyle = wbook.createCellStyle();
                cellStyle.setAlignment(HorizontalAlignment.CENTER);
                cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
                HSSFSheet sheet = wbook.createSheet("-门店日清单据-");
                HSSFRow row = sheet.createRow(0);

        //2.2 获取单据
        List<Detail4im> list1 = stockMapper.getMDDayClean("100101%");
        int i=1;
        for (Detail4im detail4im : list1) {
            //判断全壳的数量，需要加半壳的数量，再减去猪肉类未做BOM的散件
            if (detail4im.getItemNo().equals("40044")) {
                BigDecimal v = new BigDecimal(stockMapper.selectMeatMinusStock()).setScale(4, RoundingMode.HALF_UP);
                // System.out.println(v.toString() + "===" + detail4im.getValidPrice().multiply(v));
                detail4im.setLargeQty(v);
                detail4im.setRealQty(v);
                detail4im.setSubAmt(detail4im.getValidPrice().multiply(v));
            }
                 //插入excel中
            HSSFRow content = sheet.createRow(i);
            content.createCell(0).setCellValue(detail4im.getRowId().toString());
            content.createCell(1).setCellValue(detail4im.getItemNo());
            content.createCell(2).setCellValue(itemInfoMapper.getName(detail4im.getItemNo()));
            content.createCell(3).setCellValue(detail4im.getSheetNo());
            content.createCell(4).setCellValue(detail4im.getLargeQty().toString());
            content.createCell(5).setCellValue(detail4im.getRealQty().toString());
            content.createCell(6).setCellValue(detail4im.getValidPrice().toString());
            content.createCell(7).setCellValue(detail4im.getSubAmt().toString());
            content.createCell(8).setCellValue(detail4im.getSalePrice().toString());
            content.createCell(9).setCellValue(detail4im.getMemo());

            detail4imMapper.insertAuto(detail4im);
            i++;
        }
                //格式化单元格
                for (int j=0;j<tableHeaders.length;j++) {
                    HSSFCell cell = row.createCell(j);
                    cell.setCellValue(tableHeaders[j]);
                    cell.setCellStyle(cellStyle);
                    sheet.autoSizeColumn(j);
                }
        //第3步
        //计算单据总额,及日清比例
        BigDecimal sub_amt = detail4imMapper.getSub_amt(list1.get(0).getSheetNo());
            HSSFRow totalRow = sheet.createRow(list1.size() + 1);
        totalRow.createCell(0).setCellValue("合计");
        totalRow.createCell(6).setCellValue(sub_amt.toString());
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String filepath ="E:\\FTPData\\hkadmin\\hk\\门店日清单据-"+format+".xls";
        String filepath1="E:\\FTPData\\hkadmin\\hk\\门店日清单据.xls";
        OutputStream out = new FileOutputStream(new File(filepath));
        OutputStream out1 = new FileOutputStream(new File(filepath1));
        wbook.write(out);
        wbook.write(out1);
        out.close();
        out1.close();
        //日清比例，先查出入库金额
        Double acceptanceAmount = jxcDaySumMapper.getAcceptanceAmount(format, "1001");
        DecimalFormat percentFormat =new DecimalFormat("##.00%");
        String DCPercent = percentFormat.format(sub_amt.doubleValue() / acceptanceAmount);
        //数据插入到主表中
        int dcnum = insertMasterService.insertMasterData("100101",
                list1.get(0).getSheetNo(), "-", "DC", sub_amt);
        //控制台输出
        System.out.println(new Date()+"     =>标识:"+dcnum+"    =>门店日清单据:"+list1.get(0).getSheetNo());
        //发送邮件

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper( mimeMessage,true,"utf-8");

            helper.setSubject("门店"+format+"日清数据");
            helper.setText("附件为"+format+"日清数据,日清金额为:"+sub_amt+",日清比例为:"+DCPercent+"。详情见附件，邮件为定时发送，如有问题，请及时联系!\n ");
            String[] to={"zhoufei@qdama.cn","zhongguoming@qdama.cn"};//,
            //String[] cc={"dengxiaobiao@qdama.cn","zhuangzhouhu@qdama.cn","lvjiankang@qdama.cn","yuhanwen@qdama.cn","zhoujiantao@qdama.cn","lijian@qdama.cn","chenfeiyu@qdama.cn"};
            String[] cc={"dengxiaobiao@qdama.cn","zhuangzhouhu@qdama.cn","yuhanwen@qdama.cn","zhoujiantao@qdama.cn","qiuziwen@qdama.cn","chenfeiyu@qdama.cn","xiexiaojie@qdama.cn"};
            helper.setTo(to);
            helper.setCc(cc);
            helper.setFrom("xiexiaojie@qdama.cn");
            helper.addAttachment("门店日清单据.xls",new File(filepath1));
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        //审核单据
        return insertMasterService.confirmSheet(list1.get(0).getSheetNo());

    }

}
