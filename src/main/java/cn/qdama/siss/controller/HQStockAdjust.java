package cn.qdama.siss.controller;

import cn.qdama.siss.bean.Detail4im;
import cn.qdama.siss.bean.Master4im;
import cn.qdama.siss.bean.SysSheetNo;
import cn.qdama.siss.bean.SysSheetNoKey;
import cn.qdama.siss.mapper.Detail4imMapper;
import cn.qdama.siss.mapper.Master4imMapper;
import cn.qdama.siss.mapper.SysSheetNoMapper;
import cn.qdama.siss.services.InsertMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 清理总部库存。
 */
@RestController
public class HQStockAdjust {
    @Autowired
    private JdbcTemplate template;
    @Autowired
    private Detail4imMapper detail4imMapper;
    @Autowired
    private SysSheetNoMapper sysSheetNoMapper;
    @Autowired
    private Master4imMapper master4imMapper;
    @Autowired
    private InsertMasterService masterService;

    @RequestMapping("/adjust4hq")
    public List<Detail4im> getHQOutput() {
        //1.先从t_sys_sheet_flow获取库存调整单单据目前的值，+1更新 --OO库存调整单
        SysSheetNoKey key = new SysSheetNoKey();
        key.setBranchNo("0000");
        key.setSheetId("OO");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);
        //2.更新sheet_value 值+1
        sysSheetNo.setSheetValue(sysSheetNo.getSheetValue() + 1);
        sysSheetNo.setLastTime(new Date());
        sysSheetNoMapper.updateByPrimaryKey(sysSheetNo);
        //3.查询当天的出库单，并插入到t_im_sheet_detail中
        //3.1格式化日期，拼凑模糊查询的单据单号
        String s = new SimpleDateFormat("yyMMdd").format(new Date());
        String sheetNoA = "DI0000" + s + "%";
        String sheetNoB = "DI1001" + s + "%";
//        String sheetNo = "do0000181118%";
        System.out.println(sheetNoA);
        //3.2.获取直调出库单的数据，需要判断入库库单是由管理员制单，还是由门店制单

        List<Detail4im> list = detail4imMapper.selectListLikeSheetNo(sheetNoA);
        System.out.println(list.size());
        if (list!=null && list.size()>0){
            //如果不为空则利用总部人员制作的直调入库单插入
            for (Detail4im detail4im : list) {
                detail4im.setFlowId(null);//
                detail4im.setOrderQty(null);
                detail4im.setNum2(null);
                detail4im.setMemo("程序插入!");
                detail4im.setSheetNo("OO0000"+s+String.format("%04d",sysSheetNo.getSheetValue()));
                detail4imMapper.insertAuto(detail4im);
            }
            //4.插入到主表t_im_sheet_naster中
            //计算单据总额
            BigDecimal sub_amt = detail4imMapper.getSub_amt(list.get(0).getSheetNo());
            masterService.insertMasterData("000001",list.get(0).getSheetNo(),"+","OO",sub_amt);
            /*Master4im master4im = new Master4im();
            master4im.setSheetNo(list.get(0).getSheetNo());//
            master4im.setDbNo("+");//+表示入库，-表示出库
            master4im.setCoinNo("RMB");//
            master4im.setComFlag("0");//
            master4im.setOrderMan("9999");//
            master4im.setReasonNo("");//
            master4im.setAuditStatus("0");//审批状态
            master4im.setCheckFlag("2");//
            master4im.setOrderStatus("0");//有0有4不知道什么意思
            master4im.setApproveFlag("0");//0未审核，1审核
            master4im.setSheetAmt(sub_amt);//单据金额
            master4im.setBranchNo("000001");//仓库编码
            master4im.setOperDate(new Date());*//*操作日期*//*
            master4im.setOperId("9999");//操作人
            master4im.setBranchFlag("0000");//操作人部门
            master4im.setMemo("系统自动插入");//
            master4im.setTransNo("OO");//
            master4im.setPrintNum(0);//打印次数
            master4imMapper.insert(master4im);*/
        }else {
            //如果为空，则查询门店制单员录入的单，并插入
            List<Detail4im> ims = detail4imMapper.selectListLikeSheetNo(sheetNoB);
            for (Detail4im im : ims) {
                im.setFlowId(null);
                im.setOrderQty(null);
                im.setNum2(null);
                im.setMemo("程序插入");
                im.setSheetNo("OO0000"+s+String.format("%04d",sysSheetNo.getSheetValue()));
                detail4imMapper.insertAuto(im);
            }
            //计算单据总额，并插入主表中
            BigDecimal sub_amt = detail4imMapper.getSub_amt(ims.get(0).getSheetNo());
            masterService.insertMasterData("000001",ims.get(0).getSheetNo(),"+","OO",sub_amt);
            /*Master4im master4im = new Master4im();
            master4im.setSheetNo(ims.get(0).getSheetNo());//
            master4im.setDbNo("+");//
            master4im.setCoinNo("RMB");//
            master4im.setComFlag("0");//
            master4im.setOrderMan("9999");//
            master4im.setReasonNo("09");//
            master4im.setAuditStatus("0");//
            master4im.setCheckFlag("2");//
            master4im.setOrderStatus("0");//有0有4不知道什么意思
            master4im.setApproveFlag("0");//0未审核，1审核
            master4im.setSheetAmt(sub_amt);//
            master4im.setBranchNo("000001");//
            master4im.setOperDate(new Date());*//*操作日期*//*
            master4im.setOperId("9999");//操作人
            master4im.setBranchFlag("0000");//操作人部门
            master4im.setMemo("系统自动插入");//
            master4im.setTransNo("OO");//
            master4im.setPrintNum(0);//打印次数
            master4imMapper.insert(master4im);*/
        }



        return list;

    }
    //单据审核
    @RequestMapping("/confirm/{sheetNo}")
    public Master4im confirmOrder(@PathVariable String sheetNo){
        /**
         * 执行以下存储过程看下单据的情况
         * pr_get_sheet_status
         */
        Master4im master4im = master4imMapper.selectByPrimaryKey(sheetNo);
        master4im.setApproveFlag("1");
        master4im.setConfirmMan("9999");
        master4im.setWorkDate(new Date());
        //master4im.setTimeStamp();
        int i = master4imMapper.updateByPrimaryKey(master4im);
//        int i = master4imMapper.updateByPrimaryKeySelective(master4im);/**/
//        int i = master4imMapper.updateByPrimaryKeyWithBLOBs(master4im);/*System*/
        System.out.println(i);
        return master4im;
    }
}
