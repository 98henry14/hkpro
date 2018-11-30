package cn.qdama.siss.bean;

import java.math.BigDecimal;
import java.util.Date;

public class PMMaster {
    private String sheetNo;

    private String transNo;

    private String dbNo;

    private String branchNo;

    private String dBranchNo;

    private String voucherNo;

    private String supcustNo;

    private String coinNo;

    private String payWay;

    private Date payDate;

    private String approveFlag;

    private Date operDate;

    private Date workDate;

    private Date validDate;

    private BigDecimal orderAmt;

    private String orderStatus;

    private String orderMan;

    private String operId;

    private String confirmMan;

    private String acctFlag;

    private BigDecimal sheetAmt;

    private String branchFlag;

    private String comFlag;

    private String inFlag;

    private String memo;

    private Integer printNum;

    private String modifiedId;

    private Date modifiedDate;

    private String transFlag;

    private BigDecimal orderPaid;

    private String saleWay;

    private BigDecimal paidAmt;

    private String auditStatus;

    private byte[] timeStamp;

    public String getSheetNo() {
        return sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo == null ? null : sheetNo.trim();
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo == null ? null : transNo.trim();
    }

    public String getDbNo() {
        return dbNo;
    }

    public void setDbNo(String dbNo) {
        this.dbNo = dbNo == null ? null : dbNo.trim();
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo == null ? null : branchNo.trim();
    }

    public String getdBranchNo() {
        return dBranchNo;
    }

    public void setdBranchNo(String dBranchNo) {
        this.dBranchNo = dBranchNo == null ? null : dBranchNo.trim();
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo == null ? null : voucherNo.trim();
    }

    public String getSupcustNo() {
        return supcustNo;
    }

    public void setSupcustNo(String supcustNo) {
        this.supcustNo = supcustNo == null ? null : supcustNo.trim();
    }

    public String getCoinNo() {
        return coinNo;
    }

    public void setCoinNo(String coinNo) {
        this.coinNo = coinNo == null ? null : coinNo.trim();
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getApproveFlag() {
        return approveFlag;
    }

    public void setApproveFlag(String approveFlag) {
        this.approveFlag = approveFlag == null ? null : approveFlag.trim();
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderMan() {
        return orderMan;
    }

    public void setOrderMan(String orderMan) {
        this.orderMan = orderMan == null ? null : orderMan.trim();
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public String getConfirmMan() {
        return confirmMan;
    }

    public void setConfirmMan(String confirmMan) {
        this.confirmMan = confirmMan == null ? null : confirmMan.trim();
    }

    public String getAcctFlag() {
        return acctFlag;
    }

    public void setAcctFlag(String acctFlag) {
        this.acctFlag = acctFlag == null ? null : acctFlag.trim();
    }

    public BigDecimal getSheetAmt() {
        return sheetAmt;
    }

    public void setSheetAmt(BigDecimal sheetAmt) {
        this.sheetAmt = sheetAmt;
    }

    public String getBranchFlag() {
        return branchFlag;
    }

    public void setBranchFlag(String branchFlag) {
        this.branchFlag = branchFlag == null ? null : branchFlag.trim();
    }

    public String getComFlag() {
        return comFlag;
    }

    public void setComFlag(String comFlag) {
        this.comFlag = comFlag == null ? null : comFlag.trim();
    }

    public String getInFlag() {
        return inFlag;
    }

    public void setInFlag(String inFlag) {
        this.inFlag = inFlag == null ? null : inFlag.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getPrintNum() {
        return printNum;
    }

    public void setPrintNum(Integer printNum) {
        this.printNum = printNum;
    }

    public String getModifiedId() {
        return modifiedId;
    }

    public void setModifiedId(String modifiedId) {
        this.modifiedId = modifiedId == null ? null : modifiedId.trim();
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getTransFlag() {
        return transFlag;
    }

    public void setTransFlag(String transFlag) {
        this.transFlag = transFlag == null ? null : transFlag.trim();
    }

    public BigDecimal getOrderPaid() {
        return orderPaid;
    }

    public void setOrderPaid(BigDecimal orderPaid) {
        this.orderPaid = orderPaid;
    }

    public String getSaleWay() {
        return saleWay;
    }

    public void setSaleWay(String saleWay) {
        this.saleWay = saleWay == null ? null : saleWay.trim();
    }

    public BigDecimal getPaidAmt() {
        return paidAmt;
    }

    public void setPaidAmt(BigDecimal paidAmt) {
        this.paidAmt = paidAmt;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public byte[] getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(byte[] timeStamp) {
        this.timeStamp = timeStamp;
    }
}