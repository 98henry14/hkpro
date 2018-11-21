package cn.qdama.siss.controller;

import cn.qdama.siss.bean.*;
import cn.qdama.siss.mapper.Branch_stockMapper;
import cn.qdama.siss.mapper.Detail4imMapper;
import cn.qdama.siss.mapper.Master4imMapper;
import cn.qdama.siss.mapper.SysSheetNoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.soap.Detail;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 清理门店库存
 */
@RestController
public class MDStockAdjust {
    @Autowired
    private JdbcTemplate template;
    @Autowired
    private Detail4imMapper detail4imMapper;
    @Autowired
    private SysSheetNoMapper sysSheetNoMapper;
    @Autowired
    private Master4imMapper master4imMapper;
    @Autowired
    private Branch_stockMapper stockMapper;

    /**
     * 清理门店负库存
     * @return
     */
    @RequestMapping("/adjust4mdm")
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
        String s = new SimpleDateFormat("yyMMdd").format(new Date());
        //3.查询当天门店的库存 h
        /*Branch_stockExample ex = new Branch_stockExample();
        ex.createCriteria().andBranchNoEqualTo("100101").andStockQtyLessThan(new BigDecimal(0));//待判断是否被淘汰，淘汰不做处理！！！
        List<Branch_stock> list = stockMapper.selectByExample(ex);
        List<Detail4im> detail4imList = new ArrayList<>();*/
        List<Detail4im> list = stockMapper.selectMinusStock();

        if (list!=null && list.size()>0){
            for (Detail4im im : list) {
                im.setSheetNo("OO0000"+s+String.format("%04d",sysSheetNo.getSheetValue()));
                im.setTax(new BigDecimal(0));
                im.setMemo("程序插入");
                detail4imMapper.insertAuto(im);
            }
            //如果不为空则利用总部人员制作的直调入库单插入

            //4.插入到主表t_im_sheet_naster中
            //计算单据总额
            BigDecimal sub_amt = detail4imMapper.getSub_amt(list.get(0).getSheetNo());

            Master4im master4im = new Master4im();
            master4im.setSheetNo(list.get(0).getSheetNo());//
            master4im.setDbNo("+");//
            master4im.setCoinNo("RMB");//
            master4im.setComFlag("0");//
            master4im.setOrderMan("9999");//
            master4im.setReasonNo("");//
            master4im.setAuditStatus("0");//
            master4im.setCheckFlag("2");//
            master4im.setOrderStatus("0");//有0有4不知道什么意思
            master4im.setApproveFlag("0");//0未审核，1审核
            master4im.setSheetAmt(sub_amt);//
            master4im.setBranchNo("100101");//
            master4im.setOperDate(new Date());//*操作日期*//*
            master4im.setOperId("9999");//操作人
            master4im.setBranchFlag("0000");//操作人部门
            master4im.setMemo("清理门店负库存");//
            master4im.setTransNo("OO");//
            master4im.setPrintNum(0);//打印次数
            master4imMapper.insert(master4im);
        }
        return list;

    }

    /**
     * 清理门店正库存
     * @return
     */
    @RequestMapping("/adjust4mdp")
    public List<Detail4im> getMDOutput() {
        //1.先从t_sys_sheet_flow获取库存调整单单据目前的值，+1更新 --OO库存调整单
        SysSheetNoKey key = new SysSheetNoKey();
        key.setBranchNo("0000");
        key.setSheetId("OO");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);
        //2.更新sheet_value 值+1
        sysSheetNo.setSheetValue(sysSheetNo.getSheetValue() + 1);
        sysSheetNo.setLastTime(new Date());
        sysSheetNoMapper.updateByPrimaryKey(sysSheetNo);
        String s = new SimpleDateFormat("yyMMdd").format(new Date());
        //3.查询当天门店的正库存 h
        List<Detail4im> list = stockMapper.selectPositiveStock();

        if (list!=null && list.size()>0){
            for (Detail4im im : list) {
                im.setSheetNo("OO0000"+s+String.format("%04d",sysSheetNo.getSheetValue()));
                im.setTax(new BigDecimal(0));
                im.setMemo("程序插入");
                detail4imMapper.insertAuto(im);
            }
            //4.插入到主表t_im_sheet_naster中
            //计算单据总额
            BigDecimal sub_amt = detail4imMapper.getSub_amt(list.get(0).getSheetNo());

            Master4im master4im = new Master4im();
            master4im.setSheetNo(list.get(0).getSheetNo());//
            master4im.setDbNo("-");//
            master4im.setCoinNo("RMB");//
            master4im.setComFlag("0");//
            master4im.setOrderMan("9999");//
            master4im.setReasonNo("");//
            master4im.setAuditStatus("0");//
            master4im.setCheckFlag("2");//
            master4im.setOrderStatus("0");//有0有4不知道什么意思
            master4im.setApproveFlag("0");//0未审核，1审核
            master4im.setSheetAmt(sub_amt);//
            master4im.setBranchNo("100101");//
            master4im.setOperDate(new Date());//*操作日期*//*
            master4im.setOperId("9999");//操作人
            master4im.setBranchFlag("0000");//操作人部门
            master4im.setMemo("清理门店正库存");//
            master4im.setTransNo("OO");//
            master4im.setPrintNum(0);//打印次数
            master4imMapper.insert(master4im);
        }
        return list;

    }
}
