package cn.qdama.siss;

import cn.qdama.siss.bean.Detail4im;
import cn.qdama.siss.mapper.*;
import cn.qdama.siss.services.InsertMasterService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.InputStreamSource;
import org.springframework.format.number.PercentStyleFormatter;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import javax.sql.DataSource;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SissApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    private SysSheetNoMapper sysSheetNoMapper;
    @Autowired
    private Detail4imMapper detail4imMapper;
    @Autowired
    private Branch_stockMapper stockMapper;
    @Autowired
    JavaMailSenderImpl javaMailSender;
    @Autowired
    InsertMasterService masterService;
    @Autowired
    RMDaySumMapper daySumMapper;
    @Autowired
    JXCDaySumMapper jxcDaySumMapper;


    @Test
    public void contextLoads() throws Exception {
        /*String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Double totalSaleAmt = daySumMapper.getTotalSaleAmt(date);
        System.out.println(totalSaleAmt);
        BigDecimal sub_amt = detail4imMapper.getSub_amt("DC00001811230091");
        double dc = sub_amt.doubleValue();
        System.out.println(dc);

        Double acceptanceAmount = jxcDaySumMapper.getAcceptanceAmount(date, "1001");
        String format = NumberFormat.getPercentInstance(Locale.CHINA).format(dc / acceptanceAmount);
        DecimalFormat format1 = new DecimalFormat("##.00%");

        System.out.println("入库金额："+acceptanceAmount+";      销售金额:"+totalSaleAmt+"     比例为："+format+"    带小数点："+format1.format(dc/acceptanceAmount));*/


        /*long oo = masterService.getSysSheetValue("OO", "0000");
        System.out.println(oo);*/

        /*String format = new SimpleDateFormat("yyyy年MM月dd日").format(new Date());
//        String filepath ="E:\\FTPData\\hkadmin\\hk\\门店日清单据-"+format+".xls";
        String filepath ="E:\\FTPData\\hkadmin\\hk\\日清表.xls";
        String filename =format+"日清数据.xls";
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

            helper.setSubject("门店"+format+"日清数据");
            helper.setText("附件为"+format+"日清数据,日清金额为:"+0.00+"。如有问题，请联系信息部!\n ");
            String[] to={"805595996@qq.com","xiexiaojie@qdama.cn"};

            helper.setTo(to);
            helper.setFrom("xiexiaojie@qdama.cn");

            helper.addAttachment("日清表.xls",new File(filepath));
//            helper.addAttachment(MimeUtility.encodeWord("日清表.xls"),new File(filepath));

            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }*/
        /*System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();*/
        /*//1.先获取目前的值再更新 OO库存调整单
        SysSheetNoKey key = new SysSheetNoKey();
        key.setBranchNo("0000");
        key.setSheetId("OO");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);
       // Long num=173l;
        String s = String.format("%04d", sysSheetNo.getSheetValue());
        System.out.println(s);*/


/*        List<Detail4im> list = detail4imMapper.selectListLikeSheetNo("DI0000181119%");
        System.out.println(list.size()+"------"+list.get(0).getSheetNo());

        BigDecimal result = detail4imMapper.getSub_amt("DI00001811190085");
        System.out.println(result);*/


        /*Branch_stockExample ex = new Branch_stockExample();
        ex.createCriteria().andBranchNoEqualTo("100101").andStockQtyLessThan(new BigDecimal(0));//andStockQtyGreaterThan(new BigDecimal(0));
        List<Branch_stock> list = stockMapper.selectByExample(ex);
        System.out.println(list.get(0).getItemNo()+"----"+list.get(0).getStockQty()+"_____"+list.size());
        List<Detail4im> ims = stockMapper.selectMinusStock();
        int i=0;
        for (Detail4im im : ims) {
            System.out.println(im.getItemNo()+"+++++"+im.getLargeQty()+"++++"+im.getSubAmt()+"+++++"+im.getRealQty()+"=======");

        }
        System.out.println(ims.size());*/


        /*double count = stockMapper.selectMeatMinusStock();
        System.out.println(count);
        for (Detail4im detail4im : stockMapper.getMDDayClean()) {
            System.out.println(detail4im.getSheetNo()+"--货号---"+detail4im.getItemNo()+"--数量--"+detail4im.getRealQty());
        }
        ;*/
        /*BigDecimal b = new BigDecimal("6.02155445489742132132154").setScale(4, RoundingMode.HALF_UP);
        System.out.println(b+"======="+new Date().toString());

        String[] tableHeaders = {"序号", "货号", "单据号", "日清箱数", "日清数量", "单价", "日清金额", "售价", "备注"};
        HSSFWorkbook wbook = new HSSFWorkbook();
        HSSFCellStyle cellStyle = wbook.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);

        HSSFSheet sheet = wbook.createSheet("Sheet1");
        HSSFRow row = sheet.createRow(0);
        for (int i=0;i<tableHeaders.length;i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellValue(tableHeaders[i]);
            cell.setCellStyle(cellStyle);
        }
        wbook.setActiveSheet(0);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        OutputStream out = new FileOutputStream(new File("E:\\FTPData\\hkadmin\\hk\\门店日清单据-"+format+".xls"));
        wbook.write(out);
        out.close();*/


    }

}
