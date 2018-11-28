package cn.qdama.siss.bean;

public class PredictResults {
    private String orderDate;
    private String sellSKUNumber;
    private double sellSKUPredict;
    private String orderSKUNumber;
    private double orderPredict;

    @Override
    public String toString() {
        return "PredictResults{" +
                "orderDate='" + orderDate + '\'' +
                ", sellSKUNumber='" + sellSKUNumber + '\'' +
                ", sellSKUPredict=" + sellSKUPredict +
                ", orderSKUNumber='" + orderSKUNumber + '\'' +
                ", orderPredict=" + orderPredict +
                '}';
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getSellSKUNumber() {
        return sellSKUNumber;
    }

    public void setSellSKUNumber(String sellSKUNumber) {
        this.sellSKUNumber = sellSKUNumber;
    }

    public double getSellSKUPredict() {
        return sellSKUPredict;
    }

    public void setSellSKUPredict(double sellSKUPredict) {
        this.sellSKUPredict = sellSKUPredict;
    }

    public String getOrderSKUNumber() {
        return orderSKUNumber;
    }

    public void setOrderSKUNumber(String orderSKUNumber) {
        this.orderSKUNumber = orderSKUNumber;
    }

    public double getOrderPredict() {
        return orderPredict;
    }

    public void setOrderPredict(double orderPredict) {
        this.orderPredict = orderPredict;
    }
}
