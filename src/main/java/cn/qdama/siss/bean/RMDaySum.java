package cn.qdama.siss.bean;

import java.math.BigDecimal;

public class RMDaySum extends RMDaySumKey {
    private BigDecimal saleQty;

    private BigDecimal retQty;

    private BigDecimal givQty;

    private BigDecimal saleAmt;

    private BigDecimal retAmt;

    private BigDecimal givAmt;

    private BigDecimal salePrice;

    private BigDecimal preQty;

    private BigDecimal preAmt;

    private BigDecimal dctAmount;

    private BigDecimal costPrice;

    private String memo;

    private String comFlag;

    public BigDecimal getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(BigDecimal saleQty) {
        this.saleQty = saleQty;
    }

    public BigDecimal getRetQty() {
        return retQty;
    }

    public void setRetQty(BigDecimal retQty) {
        this.retQty = retQty;
    }

    public BigDecimal getGivQty() {
        return givQty;
    }

    public void setGivQty(BigDecimal givQty) {
        this.givQty = givQty;
    }

    public BigDecimal getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(BigDecimal saleAmt) {
        this.saleAmt = saleAmt;
    }

    public BigDecimal getRetAmt() {
        return retAmt;
    }

    public void setRetAmt(BigDecimal retAmt) {
        this.retAmt = retAmt;
    }

    public BigDecimal getGivAmt() {
        return givAmt;
    }

    public void setGivAmt(BigDecimal givAmt) {
        this.givAmt = givAmt;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getPreQty() {
        return preQty;
    }

    public void setPreQty(BigDecimal preQty) {
        this.preQty = preQty;
    }

    public BigDecimal getPreAmt() {
        return preAmt;
    }

    public void setPreAmt(BigDecimal preAmt) {
        this.preAmt = preAmt;
    }

    public BigDecimal getDctAmount() {
        return dctAmount;
    }

    public void setDctAmount(BigDecimal dctAmount) {
        this.dctAmount = dctAmount;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getComFlag() {
        return comFlag;
    }

    public void setComFlag(String comFlag) {
        this.comFlag = comFlag == null ? null : comFlag.trim();
    }
}