package cn.qdama.siss.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Branch_stock extends Branch_stockKey {
    private BigDecimal stockQty;

    private BigDecimal routeQty;

    private BigDecimal avgCost;

    private BigDecimal costAmt;

    private BigDecimal lastInprice;

    private BigDecimal lastBaseprice;

    private BigDecimal minQty;

    private BigDecimal maxQty;

    private BigDecimal accQty;

    private Date operDate;

    private String comFlag;

    public BigDecimal getStockQty() {
        return stockQty;
    }

    public void setStockQty(BigDecimal stockQty) {
        this.stockQty = stockQty;
    }

    public BigDecimal getRouteQty() {
        return routeQty;
    }

    public void setRouteQty(BigDecimal routeQty) {
        this.routeQty = routeQty;
    }

    public BigDecimal getAvgCost() {
        return avgCost;
    }

    public void setAvgCost(BigDecimal avgCost) {
        this.avgCost = avgCost;
    }

    public BigDecimal getCostAmt() {
        return costAmt;
    }

    public void setCostAmt(BigDecimal costAmt) {
        this.costAmt = costAmt;
    }

    public BigDecimal getLastInprice() {
        return lastInprice;
    }

    public void setLastInprice(BigDecimal lastInprice) {
        this.lastInprice = lastInprice;
    }

    public BigDecimal getLastBaseprice() {
        return lastBaseprice;
    }

    public void setLastBaseprice(BigDecimal lastBaseprice) {
        this.lastBaseprice = lastBaseprice;
    }

    public BigDecimal getMinQty() {
        return minQty;
    }

    public void setMinQty(BigDecimal minQty) {
        this.minQty = minQty;
    }

    public BigDecimal getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(BigDecimal maxQty) {
        this.maxQty = maxQty;
    }

    public BigDecimal getAccQty() {
        return accQty;
    }

    public void setAccQty(BigDecimal accQty) {
        this.accQty = accQty;
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public String getComFlag() {
        return comFlag;
    }

    public void setComFlag(String comFlag) {
        this.comFlag = comFlag == null ? null : comFlag.trim();
    }
}