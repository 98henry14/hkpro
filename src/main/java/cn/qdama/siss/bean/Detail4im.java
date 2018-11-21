package cn.qdama.siss.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Detail4im {
    private Long flowId;

    private String sheetNo;

    private String itemNo;

    private BigDecimal orderQty;

    private BigDecimal realQty;

    private BigDecimal largeQty;

    private BigDecimal orgiPrice;

    private BigDecimal validPrice;

    private BigDecimal subAmt;

    private BigDecimal salePrice;

    private BigDecimal tax;

    private Date validDate;

    private String other1;

    private String other2;

    private String other3;

    private BigDecimal num1;

    private BigDecimal num2;

    private BigDecimal num3;

    private String memo;

    private Date produceDate;

    private BigDecimal rowId;

    private String itemBarcode;

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

    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    public BigDecimal getRealQty() {
        return realQty;
    }

    public void setRealQty(BigDecimal realQty) {
        this.realQty = realQty;
    }

    public BigDecimal getLargeQty() {
        return largeQty;
    }

    public void setLargeQty(BigDecimal largeQty) {
        this.largeQty = largeQty;
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

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3 == null ? null : other3.trim();
    }

    public BigDecimal getNum1() {
        return num1;
    }

    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }

    public BigDecimal getNum2() {
        return num2;
    }

    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }

    public BigDecimal getNum3() {
        return num3;
    }

    public void setNum3(BigDecimal num3) {
        this.num3 = num3;
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

    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode == null ? null : itemBarcode.trim();
    }
}