package cn.qdama.siss.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.qdama.siss.bean.Master4im;

public class Master4imSqlProvider {

    public String insertSelective(Master4im record) {
        BEGIN();
        INSERT_INTO("t_im_sheet_master");
        
        if (record.getSheetNo() != null) {
            VALUES("sheet_no", "#{sheetNo,jdbcType=CHAR}");
        }
        
        if (record.getTransNo() != null) {
            VALUES("trans_no", "#{transNo,jdbcType=CHAR}");
        }
        
        if (record.getDbNo() != null) {
            VALUES("db_no", "#{dbNo,jdbcType=CHAR}");
        }
        
        if (record.getBranchNo() != null) {
            VALUES("branch_no", "#{branchNo,jdbcType=CHAR}");
        }
        
        if (record.getdBranchNo() != null) {
            VALUES("d_branch_no", "#{dBranchNo,jdbcType=CHAR}");
        }
        
        if (record.getVoucherNo() != null) {
            VALUES("voucher_no", "#{voucherNo,jdbcType=CHAR}");
        }
        
        if (record.getSupcustNo() != null) {
            VALUES("supcust_no", "#{supcustNo,jdbcType=CHAR}");
        }
        
        if (record.getCoinNo() != null) {
            VALUES("coin_no", "#{coinNo,jdbcType=CHAR}");
        }
        
        if (record.getPayWay() != null) {
            VALUES("pay_way", "#{payWay,jdbcType=CHAR}");
        }
        
        if (record.getPayDate() != null) {
            VALUES("pay_date", "#{payDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeptId() != null) {
            VALUES("dept_id", "#{deptId,jdbcType=CHAR}");
        }
        
        if (record.getDeptFlag() != null) {
            VALUES("dept_flag", "#{deptFlag,jdbcType=CHAR}");
        }
        
        if (record.getApproveFlag() != null) {
            VALUES("approve_flag", "#{approveFlag,jdbcType=CHAR}");
        }
        
        if (record.getOtherApprFlag() != null) {
            VALUES("other_appr_flag", "#{otherApprFlag,jdbcType=CHAR}");
        }
        
        if (record.getOtherApprDate() != null) {
            VALUES("other_appr_date", "#{otherApprDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperDate() != null) {
            VALUES("oper_date", "#{operDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getWorkDate() != null) {
            VALUES("work_date", "#{workDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderMan() != null) {
            VALUES("order_man", "#{orderMan,jdbcType=CHAR}");
        }
        
        if (record.getOperId() != null) {
            VALUES("oper_id", "#{operId,jdbcType=CHAR}");
        }
        
        if (record.getConfirmMan() != null) {
            VALUES("confirm_man", "#{confirmMan,jdbcType=CHAR}");
        }
        
        if (record.getOtherApprMan() != null) {
            VALUES("other_appr_man", "#{otherApprMan,jdbcType=CHAR}");
        }
        
        if (record.getSaleWay() != null) {
            VALUES("sale_way", "#{saleWay,jdbcType=CHAR}");
        }
        
        if (record.getReverseFlag() != null) {
            VALUES("reverse_flag", "#{reverseFlag,jdbcType=CHAR}");
        }
        
        if (record.getReverseSheet() != null) {
            VALUES("reverse_sheet", "#{reverseSheet,jdbcType=CHAR}");
        }
        
        if (record.getDirectFlag() != null) {
            VALUES("direct_flag", "#{directFlag,jdbcType=CHAR}");
        }
        
        if (record.getTransFlag() != null) {
            VALUES("trans_flag", "#{transFlag,jdbcType=CHAR}");
        }
        
        if (record.getAcctFlag() != null) {
            VALUES("acct_flag", "#{acctFlag,jdbcType=CHAR}");
        }
        
        if (record.getOther1() != null) {
            VALUES("other1", "#{other1,jdbcType=VARCHAR}");
        }
        
        if (record.getOther2() != null) {
            VALUES("other2", "#{other2,jdbcType=VARCHAR}");
        }
        
        if (record.getOther3() != null) {
            VALUES("other3", "#{other3,jdbcType=VARCHAR}");
        }
        
        if (record.getSheetAmt() != null) {
            VALUES("sheet_amt", "#{sheetAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getBranchFlag() != null) {
            VALUES("branch_flag", "#{branchFlag,jdbcType=CHAR}");
        }
        
        if (record.getComFlag() != null) {
            VALUES("com_flag", "#{comFlag,jdbcType=CHAR}");
        }
        
        if (record.getOrderStatus() != null) {
            VALUES("order_status", "#{orderStatus,jdbcType=CHAR}");
        }
        
        if (record.getAreaApprFlag() != null) {
            VALUES("area_appr_flag", "#{areaApprFlag,jdbcType=CHAR}");
        }
        
        if (record.getAreaApprDate() != null) {
            VALUES("area_appr_date", "#{areaApprDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAreaApprMan() != null) {
            VALUES("area_appr_man", "#{areaApprMan,jdbcType=CHAR}");
        }
        
        if (record.getMemo() != null) {
            VALUES("memo", "#{memo,jdbcType=VARCHAR}");
        }
        
        if (record.getReasonNo() != null) {
            VALUES("reason_no", "#{reasonNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPrintNum() != null) {
            VALUES("print_num", "#{printNum,jdbcType=INTEGER}");
        }
        
        if (record.getInFlag() != null) {
            VALUES("in_flag", "#{inFlag,jdbcType=CHAR}");
        }
        
        if (record.getMdFlag() != null) {
            VALUES("md_flag", "#{mdFlag,jdbcType=CHAR}");
        }
        
        if (record.getAuditStatus() != null) {
            VALUES("audit_status", "#{auditStatus,jdbcType=CHAR}");
        }
        
        if (record.getCheckFlag() != null) {
            VALUES("check_flag", "#{checkFlag,jdbcType=CHAR}");
        }
        
        if (record.getTimeStamp() != null) {
            VALUES("time_stamp", "#{timeStamp,jdbcType=BINARY}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Master4im record) {
        BEGIN();
        UPDATE("t_im_sheet_master");
        
        if (record.getTransNo() != null) {
            SET("trans_no = #{transNo,jdbcType=CHAR}");
        }
        
        if (record.getDbNo() != null) {
            SET("db_no = #{dbNo,jdbcType=CHAR}");
        }
        
        if (record.getBranchNo() != null) {
            SET("branch_no = #{branchNo,jdbcType=CHAR}");
        }
        
        if (record.getdBranchNo() != null) {
            SET("d_branch_no = #{dBranchNo,jdbcType=CHAR}");
        }
        
        if (record.getVoucherNo() != null) {
            SET("voucher_no = #{voucherNo,jdbcType=CHAR}");
        }
        
        if (record.getSupcustNo() != null) {
            SET("supcust_no = #{supcustNo,jdbcType=CHAR}");
        }
        
        if (record.getCoinNo() != null) {
            SET("coin_no = #{coinNo,jdbcType=CHAR}");
        }
        
        if (record.getPayWay() != null) {
            SET("pay_way = #{payWay,jdbcType=CHAR}");
        }
        
        if (record.getPayDate() != null) {
            SET("pay_date = #{payDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeptId() != null) {
            SET("dept_id = #{deptId,jdbcType=CHAR}");
        }
        
        if (record.getDeptFlag() != null) {
            SET("dept_flag = #{deptFlag,jdbcType=CHAR}");
        }
        
        if (record.getApproveFlag() != null) {
            SET("approve_flag = #{approveFlag,jdbcType=CHAR}");
        }
        
        if (record.getOtherApprFlag() != null) {
            SET("other_appr_flag = #{otherApprFlag,jdbcType=CHAR}");
        }
        
        if (record.getOtherApprDate() != null) {
            SET("other_appr_date = #{otherApprDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperDate() != null) {
            SET("oper_date = #{operDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getWorkDate() != null) {
            SET("work_date = #{workDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderMan() != null) {
            SET("order_man = #{orderMan,jdbcType=CHAR}");
        }
        
        if (record.getOperId() != null) {
            SET("oper_id = #{operId,jdbcType=CHAR}");
        }
        
        if (record.getConfirmMan() != null) {
            SET("confirm_man = #{confirmMan,jdbcType=CHAR}");
        }
        
        if (record.getOtherApprMan() != null) {
            SET("other_appr_man = #{otherApprMan,jdbcType=CHAR}");
        }
        
        if (record.getSaleWay() != null) {
            SET("sale_way = #{saleWay,jdbcType=CHAR}");
        }
        
        if (record.getReverseFlag() != null) {
            SET("reverse_flag = #{reverseFlag,jdbcType=CHAR}");
        }
        
        if (record.getReverseSheet() != null) {
            SET("reverse_sheet = #{reverseSheet,jdbcType=CHAR}");
        }
        
        if (record.getDirectFlag() != null) {
            SET("direct_flag = #{directFlag,jdbcType=CHAR}");
        }
        
        if (record.getTransFlag() != null) {
            SET("trans_flag = #{transFlag,jdbcType=CHAR}");
        }
        
        if (record.getAcctFlag() != null) {
            SET("acct_flag = #{acctFlag,jdbcType=CHAR}");
        }
        
        if (record.getOther1() != null) {
            SET("other1 = #{other1,jdbcType=VARCHAR}");
        }
        
        if (record.getOther2() != null) {
            SET("other2 = #{other2,jdbcType=VARCHAR}");
        }
        
        if (record.getOther3() != null) {
            SET("other3 = #{other3,jdbcType=VARCHAR}");
        }
        
        if (record.getSheetAmt() != null) {
            SET("sheet_amt = #{sheetAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getBranchFlag() != null) {
            SET("branch_flag = #{branchFlag,jdbcType=CHAR}");
        }
        
        if (record.getComFlag() != null) {
            SET("com_flag = #{comFlag,jdbcType=CHAR}");
        }
        
        if (record.getOrderStatus() != null) {
            SET("order_status = #{orderStatus,jdbcType=CHAR}");
        }
        
        if (record.getAreaApprFlag() != null) {
            SET("area_appr_flag = #{areaApprFlag,jdbcType=CHAR}");
        }
        
        if (record.getAreaApprDate() != null) {
            SET("area_appr_date = #{areaApprDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAreaApprMan() != null) {
            SET("area_appr_man = #{areaApprMan,jdbcType=CHAR}");
        }
        
        if (record.getMemo() != null) {
            SET("memo = #{memo,jdbcType=VARCHAR}");
        }
        
        if (record.getReasonNo() != null) {
            SET("reason_no = #{reasonNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPrintNum() != null) {
            SET("print_num = #{printNum,jdbcType=INTEGER}");
        }
        
        if (record.getInFlag() != null) {
            SET("in_flag = #{inFlag,jdbcType=CHAR}");
        }
        
        if (record.getMdFlag() != null) {
            SET("md_flag = #{mdFlag,jdbcType=CHAR}");
        }
        
        if (record.getAuditStatus() != null) {
            SET("audit_status = #{auditStatus,jdbcType=CHAR}");
        }
        
        if (record.getCheckFlag() != null) {
            SET("check_flag = #{checkFlag,jdbcType=CHAR}");
        }
        
        if (record.getTimeStamp() != null) {
            SET("time_stamp = #{timeStamp,jdbcType=BINARY}");
        }
        
        WHERE("sheet_no = #{sheetNo,jdbcType=CHAR}");
        
        return SQL();
    }
}