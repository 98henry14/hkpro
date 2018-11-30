package cn.qdama.siss.services;

import cn.qdama.siss.bean.PMDetail;
import cn.qdama.siss.bean.PMMaster;
import cn.qdama.siss.mapper.HKShopMapper;
import cn.qdama.siss.mapper.PMDetailMapper;
import cn.qdama.siss.mapper.PMMasterMapper;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class DYPredirectPushService {

    @Autowired
    private InsertMasterService insertService;
    @Autowired
    private HKShopMapper shopMapper;
    @Autowired
    private PMDetailMapper pmDetailMapper;
    @Autowired
    private PMMasterMapper pmMasterMapper;

    @Value("#{'${setTo}'.split(',')}")
    private List<String> setTo;
    @Value("#{'${setCc}'.split(',')}")
    private List<String> setCc;


    @Autowired
    JavaMailSenderImpl javaMailSender;
    Logger logger = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "0 00 13 * * ?")
    public void pushDY(){
        //设置日期格式
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.HOUR_OF_DAY,0);
        instance.set(Calendar.MINUTE,0);
        instance.set(Calendar.SECOND,0);
        instance.set(Calendar.MILLISECOND,0);
        Date time = instance.getTime();
        String date = new SimpleDateFormat("yyyy-MM-dd").format(time);
        //设置生成excel文件
        String[] tableHeaders = {"序号", "货号","品名", "要货箱数", "要货数量", "要货单价", "要货金额", "售价", "备注"};
        HSSFWorkbook wbook = new HSSFWorkbook();
        HSSFCellStyle cellStyle = wbook.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        HSSFSheet sheet = wbook.createSheet("要货单据明细预览");
        HSSFRow row = sheet.createRow(0);
        //现获取门店要货单门店的单据流水号
        String sheetNo=insertService.getSheetNo("DY","1001");
        //将预测数据插入到t_pm_sheet_detail中
        List<PMDetail> predictDeatil = shopMapper.getPredictDeatil("1001");
        //遍历插入数据表
        int i=1;
        for (PMDetail pmDetail : predictDeatil) {
            //插入t_pm_sheet_detail表中
            pmDetail.setSheetNo(sheetNo);
            pmDetailMapper.insertOBJ(pmDetail);
            //写入excel表中
            HSSFRow detailRow = sheet.createRow(i);
            detailRow.createCell(0).setCellValue(pmDetail.getRowId().toString());
            detailRow.createCell(1).setCellValue(pmDetail.getItemNo());
            detailRow.createCell(2).setCellValue(pmDetail.getItemName());
            detailRow.createCell(3).setCellValue(pmDetail.getLargeQty().toString());
            detailRow.createCell(4).setCellValue(pmDetail.getRealQty().toString());
            detailRow.createCell(5).setCellValue(pmDetail.getValidPrice().toString());
            detailRow.createCell(6).setCellValue(pmDetail.getSubAmt().toString());
            detailRow.createCell(7).setCellValue(pmDetail.getSalePrice().doubleValue());
            detailRow.createCell(8).setCellValue(pmDetail.getMemo());
            i++;
        }
        //格式化插入excel的数据
            for(int j=0;j<tableHeaders.length;j++){
                HSSFCell cell = row.createCell(j);
                cell.setCellStyle(cellStyle);
                cell.setCellValue(tableHeaders[j]);
                sheet.autoSizeColumn(j);
            }


        BigDecimal bigDecimal = new BigDecimal(0);
        //计算单据金额
        BigDecimal sheetAmt = pmDetailMapper.getSheetTotalAmt(sheetNo);
        //将预测值插入到t_pm_sheet_master主表中
        PMMaster master = new PMMaster();
        master.setSheetNo(sheetNo);
        master.setTransNo("DY");
        master.setDbNo("+");
        master.setdBranchNo("0000");
        master.setBranchNo("1001");
        master.setCoinNo("RMB");
        master.setApproveFlag("0");
        master.setOperDate(new Date());
        master.setValidDate(time);//这个有效日期要截取？?这个日期能否正常转过去？
        master.setOrderAmt(bigDecimal);
        master.setOrderStatus("0");
        master.setOrderMan("1102");
        master.setOperId("1102");
        master.setSheetAmt(sheetAmt);
        master.setBranchFlag("1001");
        master.setComFlag("0");
        master.setMemo(date +"门店预测值下发！预测数据不包含猪肉类及李锦、星朗德供货烧腊。");
        master.setPrintNum(0);
        master.setAuditStatus("0");
        pmMasterMapper.insert(master);
        //插入汇总数据
            HSSFRow totalRow = sheet.createRow(predictDeatil.size() + 1);
            totalRow.createCell(0).setCellValue("合计");
            totalRow.createCell(6).setCellValue(sheetAmt.toString());

        //写邮件
        MimeMessage mimeMessag= javaMailSender.createMimeMessage();
        try {
            //输出文件
            String filepath ="E:\\FTPData\\hkadmin\\hk\\要货单.xls";
            OutputStream out = new FileOutputStream(new File(filepath));
            wbook.write(out);
            out.close();

            MimeMessageHelper helper = new MimeMessageHelper(mimeMessag,true);
            helper.setSubject("门店今日订购建议值及要货单下发");
                    /*helper.setText("附件为香港店门店订购预测值文件，请注意查收！移动端打开如遇乱码情况，请使用WPS打开。\n" +
                            "--------以上邮件请勿回复--------");*/

            helper.setText("<span style='font-size: 19px;'>Dear all:</span></br>" +
                    "<span style='font-size: 19px;'>附件为香港店门店订购预测值文件及要货单明细！result_predict.csv在移动端打开如遇乱码情况，请使用WPS打开。</span></br>" +
                    "<span style='font-size: 19px;'>预测文件已生成要货单进行推送,可作为今天订货参考，单据号：" +
                    "<a href='http://120.79.56.4:8088/wtqdm/login.aspx' style='color: red;font-size: 19px;'>"+sheetNo+"</a>,订购金额为："+sheetAmt+"。请注意查收!</span></br>" +
                    "<span style='font-size: 19px;'>另：要货单暂时剔除猪肉类及新增烧腊品类的预测值。</span></br>--------以上邮件无需回复--------",true);


            helper.setTo(setTo.toArray(new String[setTo.size()]));         //收件人
            helper.setCc(setCc.toArray(new String[setCc.size()]));          //抄送

            helper.setFrom("xiexiaojie@qdama.cn");

            helper.addAttachment("result_predict.csv",new File("E:\\FTPData\\hkadmin\\hk\\result_predict.csv"));
            helper.addAttachment("要货单.xls",new File("E:\\FTPData\\hkadmin\\hk\\要货单.xls"));

            logger.info(date+" :邮件发送成功！\n   發送人員："+ setTo.toString()+"\n    抄送人員："+setCc.toString());
            javaMailSender.send(mimeMessag);
        }catch (Exception e){
            logger.error("出现异常信息："+e);
        }

    }
}
