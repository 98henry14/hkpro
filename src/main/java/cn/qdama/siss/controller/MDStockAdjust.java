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

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @RequestMapping("/adjust4md")
    public List<Branch_stock> getHQOutput() {
        //1.先从t_sys_sheet_flow获取库存调整单单据目前的值，+1更新 --OO库存调整单
        SysSheetNoKey key = new SysSheetNoKey();
        key.setBranchNo("0000");
        key.setSheetId("OO");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);
        //2.更新sheet_value 值+1
        sysSheetNo.setSheetValue(sysSheetNo.getSheetValue() + 1);
        sysSheetNo.setLastTime(new Date());
        sysSheetNoMapper.updateByPrimaryKey(sysSheetNo);
        //3.查询当天门店的库存 h
        Branch_stockExample ex = new Branch_stockExample();
        ex.createCriteria().andBranchNoEqualTo("100101").andStockQtyLessThan(new BigDecimal(0));//待判断是否被淘汰，淘汰不做处理！！！
        List<Branch_stock> list = stockMapper.selectByExample(ex);
        if (list!=null && list.size()>0){
            /*//如果不为空则利用总部人员制作的直调入库单插入
            for (Branch_stock branchStock : list) {
                detail4im.setFlowId(null);
                detail4im.setOrderQty(null);
                detail4im.setNum2(null);
                detail4im.setMemo("程序插入");
                detail4im.setSheetNo("OO0000"+s+String.format("%04d",sysSheetNo.getSheetValue()));
                detail4imMapper.insertAuto(detail4im);
            }
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
            master4im.setBranchNo("000101");//
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
}
