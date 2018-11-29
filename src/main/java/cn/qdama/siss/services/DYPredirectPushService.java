package cn.qdama.siss.services;

import cn.qdama.siss.bean.PMDetail;
import cn.qdama.siss.bean.PMMaster;
import cn.qdama.siss.mapper.HKShopMapper;
import cn.qdama.siss.mapper.PMDetailMapper;
import cn.qdama.siss.mapper.PMMasterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
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

    public void pushDY(){
        //现获取门店要货单门店的单据流水号
        //long sheetValue = insertService.getSysSheetValue("DY", "1001");
        String sheetNo=insertService.getSheetNo("DY","1001");
        //将预测数据插入到t_pm_sheet_detail中
        List<PMDetail> predictDeatil = shopMapper.getPredictDeatil("1001");
        for (PMDetail pmDetail : predictDeatil) {
            pmDetail.setSheetNo(sheetNo);
            pmDetailMapper.insertOBJ(pmDetail);
        }
        BigDecimal bigDecimal = new BigDecimal(0);
        //将预测值插入到t_pm_sheet_master主表中
        BigDecimal sheetAmt = pmDetailMapper.getSheetTotalAmt(sheetNo);
        PMMaster master = new PMMaster();
        master.setSheetNo(sheetNo);
        master.setTransNo("DY");
        master.setDbNo("+");
        master.setdBranchNo("0000");
        master.setBranchNo("1001");
        master.setCoinNo("RMB");
        master.setApproveFlag("0");
        master.setOperDate(new Date());
        master.setValidDate(new Date());//这个日期要截取？？
        master.setOrderAmt(bigDecimal);
        master.setOrderStatus("0");
        master.setOrderMan("1102");
        master.setOperId("1102");
        master.setSheetAmt(sheetAmt);
        master.setBranchFlag("1001");
        master.setComFlag("0");
        master.setMemo(new Date()+"门店预测值下发");
        master.setPrintNum(0);
        master.setAuditStatus("0");
        pmMasterMapper.insert(master);




    }
}
