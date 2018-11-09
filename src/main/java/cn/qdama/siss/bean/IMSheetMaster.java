package cn.qdama.siss.bean;

public class IMSheetMaster {
    private String sheet_no ;
    private String trans_no ;
    private String db_no ;
    private String branch_no ;
    private String d_branch_no ;
    private String voucher_no ;
    private String supcust_no ;
    private String coin_no ;
    private String pay_way ;
    private String pay_date ;
    private String dept_id ;
    private String dept_flag ;
    private String approve_flag ;
    private String other_appr_flag ;
    private String other_appr_date ;
    private String oper_date ;
    private String work_date ;
    private String order_man ;
    private String oper_id ;
    private String confirm_man ;
    private String other_appr_man ;
    private String sale_way ;
    private String reverse_flag ;
    private String reverse_sheet ;
    private String direct_flag ;
    private String trans_flag ;
    private String acct_flag ;
    private String other1 ;
    private String other2 ;
    private String other3 ;
    private Double sheet_amt ;
    private String branch_flag ;
    private String com_flag ;
    private String order_status ;
    private String area_appr_flag ;
    private String area_appr_date ;
    private String area_appr_man ;
    private String memo ;
    private String reason_no ;
    private int print_num ;
    private String time_stamp ;
    private String in_flag ;
    private String md_flag ;
    private String audit_status ;
    private String check_flag ;

    @Override
    public String toString() {
        return "IMSheetMaster{" +
                "sheet_no='" + sheet_no + '\'' +
                ", trans_no='" + trans_no + '\'' +
                ", db_no='" + db_no + '\'' +
                ", branch_no='" + branch_no + '\'' +
                ", d_branch_no='" + d_branch_no + '\'' +
                ", voucher_no='" + voucher_no + '\'' +
                ", supcust_no='" + supcust_no + '\'' +
                ", coin_no='" + coin_no + '\'' +
                ", pay_way='" + pay_way + '\'' +
                ", pay_date='" + pay_date + '\'' +
                ", dept_id='" + dept_id + '\'' +
                ", dept_flag='" + dept_flag + '\'' +
                ", approve_flag='" + approve_flag + '\'' +
                ", other_appr_flag='" + other_appr_flag + '\'' +
                ", other_appr_date='" + other_appr_date + '\'' +
                ", oper_date='" + oper_date + '\'' +
                ", work_date='" + work_date + '\'' +
                ", order_man='" + order_man + '\'' +
                ", oper_id='" + oper_id + '\'' +
                ", confirm_man='" + confirm_man + '\'' +
                ", other_appr_man='" + other_appr_man + '\'' +
                ", sale_way='" + sale_way + '\'' +
                ", reverse_flag='" + reverse_flag + '\'' +
                ", reverse_sheet='" + reverse_sheet + '\'' +
                ", direct_flag='" + direct_flag + '\'' +
                ", trans_flag='" + trans_flag + '\'' +
                ", acct_flag='" + acct_flag + '\'' +
                ", other1='" + other1 + '\'' +
                ", other2='" + other2 + '\'' +
                ", other3='" + other3 + '\'' +
                ", sheet_amt=" + sheet_amt +
                ", branch_flag='" + branch_flag + '\'' +
                ", com_flag='" + com_flag + '\'' +
                ", order_status='" + order_status + '\'' +
                ", area_appr_flag='" + area_appr_flag + '\'' +
                ", area_appr_date='" + area_appr_date + '\'' +
                ", area_appr_man='" + area_appr_man + '\'' +
                ", memo='" + memo + '\'' +
                ", reason_no='" + reason_no + '\'' +
                ", print_num=" + print_num +
                ", time_stamp='" + time_stamp + '\'' +
                ", in_flag='" + in_flag + '\'' +
                ", md_flag='" + md_flag + '\'' +
                ", audit_status='" + audit_status + '\'' +
                ", check_flag='" + check_flag + '\'' +
                '}';
    }

    public String getSheet_no() {
        return sheet_no;
    }

    public void setSheet_no(String sheet_no) {
        this.sheet_no = sheet_no;
    }

    public String getTrans_no() {
        return trans_no;
    }

    public void setTrans_no(String trans_no) {
        this.trans_no = trans_no;
    }

    public String getDb_no() {
        return db_no;
    }

    public void setDb_no(String db_no) {
        this.db_no = db_no;
    }

    public String getBranch_no() {
        return branch_no;
    }

    public void setBranch_no(String branch_no) {
        this.branch_no = branch_no;
    }

    public String getD_branch_no() {
        return d_branch_no;
    }

    public void setD_branch_no(String d_branch_no) {
        this.d_branch_no = d_branch_no;
    }

    public String getVoucher_no() {
        return voucher_no;
    }

    public void setVoucher_no(String voucher_no) {
        this.voucher_no = voucher_no;
    }

    public String getSupcust_no() {
        return supcust_no;
    }

    public void setSupcust_no(String supcust_no) {
        this.supcust_no = supcust_no;
    }

    public String getCoin_no() {
        return coin_no;
    }

    public void setCoin_no(String coin_no) {
        this.coin_no = coin_no;
    }

    public String getPay_way() {
        return pay_way;
    }

    public void setPay_way(String pay_way) {
        this.pay_way = pay_way;
    }

    public String getPay_date() {
        return pay_date;
    }

    public void setPay_date(String pay_date) {
        this.pay_date = pay_date;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_flag() {
        return dept_flag;
    }

    public void setDept_flag(String dept_flag) {
        this.dept_flag = dept_flag;
    }

    public String getApprove_flag() {
        return approve_flag;
    }

    public void setApprove_flag(String approve_flag) {
        this.approve_flag = approve_flag;
    }

    public String getOther_appr_flag() {
        return other_appr_flag;
    }

    public void setOther_appr_flag(String other_appr_flag) {
        this.other_appr_flag = other_appr_flag;
    }

    public String getOther_appr_date() {
        return other_appr_date;
    }

    public void setOther_appr_date(String other_appr_date) {
        this.other_appr_date = other_appr_date;
    }

    public String getOper_date() {
        return oper_date;
    }

    public void setOper_date(String oper_date) {
        this.oper_date = oper_date;
    }

    public String getWork_date() {
        return work_date;
    }

    public void setWork_date(String work_date) {
        this.work_date = work_date;
    }

    public String getOrder_man() {
        return order_man;
    }

    public void setOrder_man(String order_man) {
        this.order_man = order_man;
    }

    public String getOper_id() {
        return oper_id;
    }

    public void setOper_id(String oper_id) {
        this.oper_id = oper_id;
    }

    public String getConfirm_man() {
        return confirm_man;
    }

    public void setConfirm_man(String confirm_man) {
        this.confirm_man = confirm_man;
    }

    public String getOther_appr_man() {
        return other_appr_man;
    }

    public void setOther_appr_man(String other_appr_man) {
        this.other_appr_man = other_appr_man;
    }

    public String getSale_way() {
        return sale_way;
    }

    public void setSale_way(String sale_way) {
        this.sale_way = sale_way;
    }

    public String getReverse_flag() {
        return reverse_flag;
    }

    public void setReverse_flag(String reverse_flag) {
        this.reverse_flag = reverse_flag;
    }

    public String getReverse_sheet() {
        return reverse_sheet;
    }

    public void setReverse_sheet(String reverse_sheet) {
        this.reverse_sheet = reverse_sheet;
    }

    public String getDirect_flag() {
        return direct_flag;
    }

    public void setDirect_flag(String direct_flag) {
        this.direct_flag = direct_flag;
    }

    public String getTrans_flag() {
        return trans_flag;
    }

    public void setTrans_flag(String trans_flag) {
        this.trans_flag = trans_flag;
    }

    public String getAcct_flag() {
        return acct_flag;
    }

    public void setAcct_flag(String acct_flag) {
        this.acct_flag = acct_flag;
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

    public Double getSheet_amt() {
        return sheet_amt;
    }

    public void setSheet_amt(Double sheet_amt) {
        this.sheet_amt = sheet_amt;
    }

    public String getBranch_flag() {
        return branch_flag;
    }

    public void setBranch_flag(String branch_flag) {
        this.branch_flag = branch_flag;
    }

    public String getCom_flag() {
        return com_flag;
    }

    public void setCom_flag(String com_flag) {
        this.com_flag = com_flag;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getArea_appr_flag() {
        return area_appr_flag;
    }

    public void setArea_appr_flag(String area_appr_flag) {
        this.area_appr_flag = area_appr_flag;
    }

    public String getArea_appr_date() {
        return area_appr_date;
    }

    public void setArea_appr_date(String area_appr_date) {
        this.area_appr_date = area_appr_date;
    }

    public String getArea_appr_man() {
        return area_appr_man;
    }

    public void setArea_appr_man(String area_appr_man) {
        this.area_appr_man = area_appr_man;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getReason_no() {
        return reason_no;
    }

    public void setReason_no(String reason_no) {
        this.reason_no = reason_no;
    }

    public int getPrint_num() {
        return print_num;
    }

    public void setPrint_num(int print_num) {
        this.print_num = print_num;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getIn_flag() {
        return in_flag;
    }

    public void setIn_flag(String in_flag) {
        this.in_flag = in_flag;
    }

    public String getMd_flag() {
        return md_flag;
    }

    public void setMd_flag(String md_flag) {
        this.md_flag = md_flag;
    }

    public String getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(String audit_status) {
        this.audit_status = audit_status;
    }

    public String getCheck_flag() {
        return check_flag;
    }

    public void setCheck_flag(String check_flag) {
        this.check_flag = check_flag;
    }
}
