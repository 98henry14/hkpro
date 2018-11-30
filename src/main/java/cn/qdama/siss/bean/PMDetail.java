package cn.qdama.siss.bean;

import java.math.BigDecimal;
import java.util.Date;

public class PMDetail {
    private Long flowId;

    private String sheetNo;

    private String itemNo;

    //增加一列用于记录品名
    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private BigDecimal rowId;

    private BigDecimal orderQty;

    private BigDecimal largeQty;

    private BigDecimal realQty;

    private BigDecimal sendQty;

    private BigDecimal orgiPrice;

    private BigDecimal validPrice;

    private BigDecimal subAmt;

    private BigDecimal tax;

    private BigDecimal salePrice;

    private BigDecimal comeNum;

    private String memo;

    private Date produceDate;

    private String itemBarcode;

    private Date validDate;

    private String licence;

    private BigDecimal domesticQty;

    private BigDecimal domesticPrice;

    private BigDecimal domesticAmt;

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public String getSheetNo() {
        return sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo == null ? null : sheetNo.trim();
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    public BigDecimal getLargeQty() {
        return largeQty;
    }

    public void setLargeQty(BigDecimal largeQty) {
        this.largeQty = largeQty;
    }

    public BigDecimal getRealQty() {
        return realQty;
    }

    public void setRealQty(BigDecimal realQty) {
        this.realQty = realQty;
    }

    public BigDecimal getSendQty() {
        return sendQty;
    }

    public void setSendQty(BigDecimal sendQty) {
        this.sendQty = sendQty;
    }

    public BigDecimal getOrgiPrice() {
        return orgiPrice;
    }

    public void setOrgiPrice(BigDecimal orgiPrice) {
        this.orgiPrice = orgiPrice;
    }

    public BigDecimal getValidPrice() {
        return validPrice;
    }

    public void setValidPrice(BigDecimal validPrice) {
        this.validPrice = validPrice;
    }

    public BigDecimal getSubAmt() {
        return subAmt;
    }

    public void setSubAmt(BigDecimal subAmt) {
        this.subAmt = subAmt;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getComeNum() {
        return comeNum;
    }

    public void setComeNum(BigDecimal comeNum) {
        this.comeNum = comeNum;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode == null ? null : itemBarcode.trim();
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence == null ? null : licence.trim();
    }

    public BigDecimal getDomesticQty() {
        return domesticQty;
    }

    public void setDomesticQty(BigDecimal domesticQty) {
        this.domesticQty = domesticQty;
    }

    public BigDecimal getDomesticPrice() {
        return domesticPrice;
    }

    public void setDomesticPrice(BigDecimal domesticPrice) {
        this.domesticPrice = domesticPrice;
    }

    public BigDecimal getDomesticAmt() {
        return domesticAmt;
    }

    public void setDomesticAmt(BigDecimal domesticAmt) {
        this.domesticAmt = domesticAmt;
    }

    @Override
    public String toString() {
        return "PMDetail{" +
                "flowId=" + flowId +
                ", sheetNo='" + sheetNo + '\'' +
                ", itemNo='" + itemNo + '\'' +
                ", rowId=" + rowId +
                ", orderQty=" + orderQty +
                ", largeQty=" + largeQty +
                ", realQty=" + realQty +
                ", sendQty=" + sendQty +
                ", orgiPrice=" + orgiPrice +
                ", validPrice=" + validPrice +
                ", subAmt=" + subAmt +
                ", tax=" + tax +
                ", salePrice=" + salePrice +
                ", comeNum=" + comeNum +
                ", memo='" + memo + '\'' +
                ", produceDate=" + produceDate +
                ", itemBarcode='" + itemBarcode + '\'' +
                ", validDate=" + validDate +
                ", licence='" + licence + '\'' +
                ", domesticQty=" + domesticQty +
                ", domesticPrice=" + domesticPrice +
                ", domesticAmt=" + domesticAmt +
                '}';
    }
}