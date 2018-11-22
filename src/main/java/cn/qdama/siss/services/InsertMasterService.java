package cn.qdama.siss.services;

import cn.qdama.siss.bean.Master4im;
import cn.qdama.siss.bean.SysSheetNo;
import cn.qdama.siss.bean.SysSheetNoKey;
import cn.qdama.siss.mapper.Master4imMapper;
import cn.qdama.siss.mapper.SysSheetNoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class InsertMasterService {

    @Autowired
    Master4imMapper master4imMapper;
    @Autowired
    private SysSheetNoMapper sysSheetNoMapper;

    public int insertMasterData(String branchno, String sheetno, String dbno, String transno, BigDecimal sub_amt) {
        Master4im master4im = new Master4im();
        master4im.setBranchNo(branchno);//设置调整仓库
        master4im.setSheetNo(sheetno);  //设置单号
        master4im.setDbNo(dbno);        //设置出入库标示 -为出库 +为入库
        master4im.setTransNo(transno);  //设置单据标示  DC为日清 OO为库存调整单
        master4im.setSheetAmt(sub_amt); //设置单据中金额
        master4im.setCoinNo("RMB");
        master4im.setComFlag("0");
        master4im.setOrderMan("9999");
        master4im.setReasonNo("09");
        master4im.setAuditStatus("0");
        master4im.setCheckFlag("2");
        master4im.setOrderStatus("0");
        master4im.setApproveFlag("0");
        master4im.setOperDate(new Date());/**/
        master4im.setOperId("9999");
        master4im.setBranchFlag("0000");
        master4im.setMemo("来自系统自动插入");
        master4im.setPrintNum(0);
        int i = master4imMapper.insert(master4im);
        return i;
    }

    public int confirmSheet(String sheetno){

        Master4im master4im = master4imMapper.selectByPrimaryKey(sheetno);
        master4im.setApproveFlag("1"); //设置审批状态为1
        master4im.setWorkDate(new Date());//设置审批日期
        master4im.setConfirmMan("9999");//设置审批人
        int i = master4imMapper.updateByPrimaryKey(master4im);//更新数据
        return i;
    }

    public long getSysSheetValue(String type ,String branchno){
        SysSheetNoKey key = new SysSheetNoKey();
        key.setSheetId(type);
        key.setBranchNo(branchno);
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);
        sysSheetNo.setSheetValue(sysSheetNo.getSheetValue() + 1);
        sysSheetNo.setLastTime(new Date());
        sysSheetNoMapper.updateByPrimaryKey(sysSheetNo);
        return sysSheetNo.getSheetValue() + 1;
    }
}
