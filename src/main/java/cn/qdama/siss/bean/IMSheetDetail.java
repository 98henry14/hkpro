package cn.qdama.siss.bean;

public class IMSheetDetail {
    private Double flow_id;
    private String sheet_no;
    private String item_no;
    private Double order_qty;
    private Double real_qty;
    private Double large_qty;
    private Double orgi_qty;
    private Double valid_price;
    private Double sub_amt;
    private Double sale_price;
    private Double tax;
    private String valid_date;
    private String other1 ;
    private String  other2;
    private String  other3;
    private Double  num1;
    private Double  num2;
    private Double  num3;
    private String  memo;
    private String  produce_date;
    private String  row_id;
    private String  item_barcode;
    /*private String  ;
    private String  ;*/

    @Override
    public String toString() {
        return "IMSheetDetail{" +
                "flow_id=" + flow_id +
                ", sheet_no='" + sheet_no + '\'' +
                ", item_no='" + item_no + '\'' +
                ", order_qty=" + order_qty +
                ", real_qty=" + real_qty +
                ", large_qty=" + large_qty +
                ", orgi_qty=" + orgi_qty +
                ", valid_price=" + valid_price +
                ", sub_amt=" + sub_amt +
                ", sale_price=" + sale_price +
                ", tax=" + tax +
                ", valid_date='" + valid_date + '\'' +
                ", other1='" + other1 + '\'' +
                ", other2='" + other2 + '\'' +
                ", other3='" + other3 + '\'' +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", memo='" + memo + '\'' +
                ", produce_date='" + produce_date + '\'' +
                ", row_id='" + row_id + '\'' +
                ", item_barcode='" + item_barcode + '\'' +
                '}';
    }

    public Double getFlow_id() {
        return flow_id;
    }

    public void setFlow_id(Double flow_id) {
        this.flow_id = flow_id;
    }

    public String getSheet_no() {
        return sheet_no;
    }

    public void setSheet_no(String sheet_no) {
        this.sheet_no = sheet_no;
    }

    public String getItem_no() {
        return item_no;
    }

    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    public Double getOrder_qty() {
        return order_qty;
    }

    public void setOrder_qty(Double order_qty) {
        this.order_qty = order_qty;
    }

    public Double getReal_qty() {
        return real_qty;
    }

    public void setReal_qty(Double real_qty) {
        this.real_qty = real_qty;
    }

    public Double getLarge_qty() {
        return large_qty;
    }

    public void setLarge_qty(Double large_qty) {
        this.large_qty = large_qty;
    }

    public Double getOrgi_qty() {
        return orgi_qty;
    }

    public void setOrgi_qty(Double orgi_qty) {
        this.orgi_qty = orgi_qty;
    }

    public Double getValid_price() {
        return valid_price;
    }

    public void setValid_price(Double valid_price) {
        this.valid_price = valid_price;
    }

    public Double getSub_amt() {
        return sub_amt;
    }

    public void setSub_amt(Double sub_amt) {
        this.sub_amt = sub_amt;
    }

    public Double getSale_price() {
        return sale_price;
    }

    public void setSale_price(Double sale_price) {
        this.sale_price = sale_price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public String getValid_date() {
        return valid_date;
    }

    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getNum3() {
        return num3;
    }

    public void setNum3(Double num3) {
        this.num3 = num3;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getProduce_date() {
        return produce_date;
    }

    public void setProduce_date(String produce_date) {
        this.produce_date = produce_date;
    }

    public String getRow_id() {
        return row_id;
    }

    public void setRow_id(String row_id) {
        this.row_id = row_id;
    }

    public String getItem_barcode() {
        return item_barcode;
    }

    public void setItem_barcode(String item_barcode) {
        this.item_barcode = item_barcode;
    }
}
