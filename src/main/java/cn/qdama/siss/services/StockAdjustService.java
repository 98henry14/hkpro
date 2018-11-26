package cn.qdama.siss.services;

import cn.qdama.siss.bean.Detail4im;
import cn.qdama.siss.bean.Master4im;
import cn.qdama.siss.bean.SysSheetNo;
import cn.qdama.siss.bean.SysSheetNoKey;
import cn.qdama.siss.mapper.Branch_stockMapper;
import cn.qdama.siss.mapper.Detail4imMapper;
import cn.qdama.siss.mapper.SysSheetNoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class StockAdjustService {

    @Autowired
    private SysSheetNoMapper sysSheetNoMapper;
    @Autowired
    private Detail4imMapper detail4imMapper;
    @Autowired
    private InsertMasterService masterService;
    @Autowired
    private Branch_stockMapper stockMapper;

    @Scheduled(cron = "0 02 23 * * ?")
    public void adjustHQStock() throws Exception{
        //1.先从t_sys_sheet_flow获取库存调整单单据目前的值，+1更新 --OO库存调整单
        /*SysSheetNoKey key = new SysSheetNoKey();
        key.setBranchNo("0000");
        key.setSheetId("OO");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);
        //2.更新sheet_value 值+1
        sysSheetNo.setSheetValue(sysSheetNo.getSheetValue() + 1);
        sysSheetNo.setLastTime(new Date());
        sysSheetNoMapper.updateByPrimaryKey(sysSheetNo);*/
        long value = masterService.getSysSheetValue("OO", "0000");
        //3.查询当天的出库单，并插入到t_im_sheet_detail中
        //3.1格式化日期，拼凑模糊查询的单据单号
        String s = new SimpleDateFormat("yyMMdd").format(new Date());
        String sheetNoA = "DI0000" + s + "%";
        String sheetNoB = "DI1001" + s + "%";
//        String sheetNo = "do0000181118%";
//        System.out.println(sheetNoA);
        //3.2.获取直调出库单的数据，需要判断入库库单是由管理员制单，还是由门店制单

        List<Detail4im> list = detail4imMapper.selectListLikeSheetNo(sheetNoA);
        System.out.println(list.size());
        if (list!=null && list.size()>0){
            //如果不为空则利用总部人员制作的直调入库单插入
            for (Detail4im detail4im : list) {
                detail4im.setFlowId(null);//
                detail4im.setOrderQty(null);
                detail4im.setNum2(null);
                detail4im.setMemo("程序插入-总部制单");
                detail4im.setSheetNo("OO0000"+s+String.format("%04d",value));
                detail4imMapper.insertAuto(detail4im);
            }
            //4.插入到主表t_im_sheet_naster中
            //计算单据总额
            BigDecimal sub_amt = detail4imMapper.getSub_amt(list.get(0).getSheetNo());
            masterService.insertMasterData("000001",list.get(0).getSheetNo(),"+","OO",sub_amt);

            masterService.confirmSheet(list.get(0).getSheetNo());

        }else {
            //如果为空，则查询门店制单员录入的单，并插入
            List<Detail4im> ims = detail4imMapper.selectListLikeSheetNo(sheetNoB);
            for (Detail4im im : ims) {
                im.setFlowId(null);
                im.setOrderQty(null);
                im.setNum2(null);
                im.setMemo("程序插入-门店制单");
                im.setSheetNo("OO0000"+s+String.format("%04d",value));
                detail4imMapper.insertAuto(im);
            }
            //计算单据总额，并插入主表中
            BigDecimal sub_amt = detail4imMapper.getSub_amt(ims.get(0).getSheetNo());
            masterService.insertMasterData("000001",ims.get(0).getSheetNo(),"+","OO",sub_amt);
            //审核单据
            int i = masterService.confirmSheet(ims.get(0).getSheetNo());
            System.out.println("标识:"+i+"    =>总部库存调整单据:"+ims.get(0).getSheetNo());
        }
    }

    @Scheduled(cron = "0 05 23 * * ?")
    public void adjustMDStockInput() throws Exception{
        //1.先从t_sys_sheet_flow获取库存调整单单据目前的值，+1更新 --OO库存调整单
        long value = masterService.getSysSheetValue("OO", "0000");

        String s = new SimpleDateFormat("yyMMdd").format(new Date());
        //3.查询当天门店的负库存 h
        List<Detail4im> list = stockMapper.selectMinusStock();

        if (list!=null && list.size()>0){
            for (Detail4im im : list) {
                im.setSheetNo("OO0000"+s+String.format("%04d",value));
                im.setMemo("程序插入");
                im.setTax(new BigDecimal(0));
                detail4imMapper.insertAuto(im);
            }
            //如果不为空则利用总部人员制作的直调入库单插入

            //4.插入到主表t_im_sheet_naster中
            //计算单据总额
            BigDecimal sub_amt = detail4imMapper.getSub_amt(list.get(0).getSheetNo());
            masterService.insertMasterData("100101",list.get(0).getSheetNo(),"+","OO",sub_amt);
        }
        //审核单据
        int i = masterService.confirmSheet(list.get(0).getSheetNo());
        System.out.println("标识:"+i+"    =>门店负库存入库调整单据:"+list.get(0).getSheetNo());
    }
    @Scheduled(cron = "0 10 23 * * ?")
    public void adjustMDStockOutput() {
        //1.先从t_sys_sheet_flow，+1更新 --OO库存调整单
        long value = masterService.getSysSheetValue("OO", "0000");
        /*SysSheetNoKey key = new SysSheetNoKey();
        key.setSheetId("OO");
        key.setBranchNo("0000");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);
        sysSheetNo.setSheetValue(sysSheetNo.getSheetValue() + 1);
        sysSheetNo.setLastTime(new Date());
        sysSheetNoMapper.updateByPrimaryKey(sysSheetNo);*/
        String s = new SimpleDateFormat("yyMMdd").format(new Date());
        //2.查询当天门店的正库存 h
        List<Detail4im> list = stockMapper.selectPositiveStock();

        if (list!=null && list.size()>0){
            for (Detail4im im : list) {
                im.setSheetNo("OO0000"+s+String.format("%04d",value));
                im.setMemo("程序插入!");
                im.setTax(new BigDecimal(0));
                detail4imMapper.insertAuto(im);
            }
            //4.插入到主表t_im_sheet_naster中
            //计算单据总额
            BigDecimal sub_amt = detail4imMapper.getSub_amt(list.get(0).getSheetNo());
            masterService.insertMasterData("100101",list.get(0).getSheetNo(),"-","OO",sub_amt);
        }
        //审核单据
        int i = masterService.confirmSheet(list.get(0).getSheetNo());
        System.out.println("标识:"+i+"    =>门店正库存出库调整单据:"+list.get(0).getSheetNo());
    }

}
