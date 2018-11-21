package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.Master4im;
import org.apache.ibatis.annotations.*;
@Mapper
public interface Master4imMapper {
    @Delete({
        "delete from t_im_sheet_master",
        "where sheet_no = #{sheetNo,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String sheetNo);

    @Insert({
        "insert into t_im_sheet_master (sheet_no, trans_no, ",
        "db_no, branch_no, d_branch_no, ",
        "voucher_no, supcust_no, ",
        "coin_no, pay_way, pay_date, ",
        "dept_id, dept_flag, approve_flag, ",
        "other_appr_flag, other_appr_date, ",
        "oper_date, work_date, ",
        "order_man, oper_id, confirm_man, ",
        "other_appr_man, sale_way, ",
        "reverse_flag, reverse_sheet, ",
        "direct_flag, trans_flag, ",
        "acct_flag, other1, other2, ",
        "other3, sheet_amt, ",
        "branch_flag, com_flag, order_status, ",
        "area_appr_flag, area_appr_date, ",
        "area_appr_man, memo, ",
        "reason_no, print_num, ",
        "in_flag, md_flag, audit_status, ",
        "check_flag)",
        "values (#{sheetNo,jdbcType=CHAR}, #{transNo,jdbcType=CHAR}, ",
        "#{dbNo,jdbcType=CHAR}, #{branchNo,jdbcType=CHAR}, #{dBranchNo,jdbcType=CHAR}, ",
        "#{voucherNo,jdbcType=CHAR}, #{supcustNo,jdbcType=CHAR}, ",
        "#{coinNo,jdbcType=CHAR}, #{payWay,jdbcType=CHAR}, #{payDate,jdbcType=TIMESTAMP}, ",
        "#{deptId,jdbcType=CHAR}, #{deptFlag,jdbcType=CHAR}, #{approveFlag,jdbcType=CHAR}, ",
        "#{otherApprFlag,jdbcType=CHAR}, #{otherApprDate,jdbcType=TIMESTAMP}, ",
        "#{operDate,jdbcType=TIMESTAMP}, #{workDate,jdbcType=TIMESTAMP}, ",
        "#{orderMan,jdbcType=CHAR}, #{operId,jdbcType=CHAR}, #{confirmMan,jdbcType=CHAR}, ",
        "#{otherApprMan,jdbcType=CHAR}, #{saleWay,jdbcType=CHAR}, ",
        "#{reverseFlag,jdbcType=CHAR}, #{reverseSheet,jdbcType=CHAR}, ",
        "#{directFlag,jdbcType=CHAR}, #{transFlag,jdbcType=CHAR}, ",
        "#{acctFlag,jdbcType=CHAR}, #{other1,jdbcType=VARCHAR}, #{other2,jdbcType=VARCHAR}, ",
        "#{other3,jdbcType=VARCHAR}, #{sheetAmt,jdbcType=NUMERIC}, ",
        "#{branchFlag,jdbcType=CHAR}, #{comFlag,jdbcType=CHAR}, #{orderStatus,jdbcType=CHAR}, ",
        "#{areaApprFlag,jdbcType=CHAR}, #{areaApprDate,jdbcType=TIMESTAMP}, ",
        "#{areaApprMan,jdbcType=CHAR}, #{memo,jdbcType=VARCHAR}, ",
        "#{reasonNo,jdbcType=VARCHAR}, #{printNum,jdbcType=INTEGER}, ",
        "#{inFlag,jdbcType=CHAR}, #{mdFlag,jdbcType=CHAR}, #{auditStatus,jdbcType=CHAR}, ",
        "#{checkFlag,jdbcType=CHAR})"
    })
    int insert(Master4im record);

    @InsertProvider(type=Master4imSqlProvider.class, method="insertSelective")
    int insertSelective(Master4im record);

    @Select({
        "select",
        "sheet_no, trans_no, db_no, branch_no, d_branch_no, voucher_no, supcust_no, coin_no, ",
        "pay_way, pay_date, dept_id, dept_flag, approve_flag, other_appr_flag, other_appr_date, ",
        "oper_date, work_date, order_man, oper_id, confirm_man, other_appr_man, sale_way, ",
        "reverse_flag, reverse_sheet, direct_flag, trans_flag, acct_flag, other1, other2, ",
        "other3, sheet_amt, branch_flag, com_flag, order_status, area_appr_flag, area_appr_date, ",
        "area_appr_man, memo, reason_no, print_num, in_flag, md_flag, audit_status, check_flag, ",
        "time_stamp",
        "from t_im_sheet_master",
        "where sheet_no = #{sheetNo,jdbcType=CHAR}"
    })
    Master4im selectByPrimaryKey(String sheetNo);

    @UpdateProvider(type=Master4imSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Master4im record);

    @Update({
        "update t_im_sheet_master",
        "set trans_no = #{transNo,jdbcType=CHAR},",
          "db_no = #{dbNo,jdbcType=CHAR},",
          "branch_no = #{branchNo,jdbcType=CHAR},",
          "d_branch_no = #{dBranchNo,jdbcType=CHAR},",
          "voucher_no = #{voucherNo,jdbcType=CHAR},",
          "supcust_no = #{supcustNo,jdbcType=CHAR},",
          "coin_no = #{coinNo,jdbcType=CHAR},",
          "pay_way = #{payWay,jdbcType=CHAR},",
          "pay_date = #{payDate,jdbcType=TIMESTAMP},",
          "dept_id = #{deptId,jdbcType=CHAR},",
          "dept_flag = #{deptFlag,jdbcType=CHAR},",
          "approve_flag = #{approveFlag,jdbcType=CHAR},",
          "other_appr_flag = #{otherApprFlag,jdbcType=CHAR},",
          "other_appr_date = #{otherApprDate,jdbcType=TIMESTAMP},",
          "oper_date = #{operDate,jdbcType=TIMESTAMP},",
          "work_date = #{workDate,jdbcType=TIMESTAMP},",
          "order_man = #{orderMan,jdbcType=CHAR},",
          "oper_id = #{operId,jdbcType=CHAR},",
          "confirm_man = #{confirmMan,jdbcType=CHAR},",
          "other_appr_man = #{otherApprMan,jdbcType=CHAR},",
          "sale_way = #{saleWay,jdbcType=CHAR},",
          "reverse_flag = #{reverseFlag,jdbcType=CHAR},",
          "reverse_sheet = #{reverseSheet,jdbcType=CHAR},",
          "direct_flag = #{directFlag,jdbcType=CHAR},",
          "trans_flag = #{transFlag,jdbcType=CHAR},",
          "acct_flag = #{acctFlag,jdbcType=CHAR},",
          "other1 = #{other1,jdbcType=VARCHAR},",
          "other2 = #{other2,jdbcType=VARCHAR},",
          "other3 = #{other3,jdbcType=VARCHAR},",
          "sheet_amt = #{sheetAmt,jdbcType=NUMERIC},",
          "branch_flag = #{branchFlag,jdbcType=CHAR},",
          "com_flag = #{comFlag,jdbcType=CHAR},",
          "order_status = #{orderStatus,jdbcType=CHAR},",
          "area_appr_flag = #{areaApprFlag,jdbcType=CHAR},",
          "area_appr_date = #{areaApprDate,jdbcType=TIMESTAMP},",
          "area_appr_man = #{areaApprMan,jdbcType=CHAR},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "reason_no = #{reasonNo,jdbcType=VARCHAR},",
          "print_num = #{printNum,jdbcType=INTEGER},",
          "in_flag = #{inFlag,jdbcType=CHAR},",
          "md_flag = #{mdFlag,jdbcType=CHAR},",
          "audit_status = #{auditStatus,jdbcType=CHAR},",
          "check_flag = #{checkFlag,jdbcType=CHAR},",
          "time_stamp = #{timeStamp,jdbcType=BINARY}",
        "where sheet_no = #{sheetNo,jdbcType=CHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(Master4im record);

    @Update({
        "update t_im_sheet_master",
        "set trans_no = #{transNo,jdbcType=CHAR},",
          "db_no = #{dbNo,jdbcType=CHAR},",
          "branch_no = #{branchNo,jdbcType=CHAR},",
          "d_branch_no = #{dBranchNo,jdbcType=CHAR},",
          "voucher_no = #{voucherNo,jdbcType=CHAR},",
          "supcust_no = #{supcustNo,jdbcType=CHAR},",
          "coin_no = #{coinNo,jdbcType=CHAR},",
          "pay_way = #{payWay,jdbcType=CHAR},",
          "pay_date = #{payDate,jdbcType=TIMESTAMP},",
          "dept_id = #{deptId,jdbcType=CHAR},",
          "dept_flag = #{deptFlag,jdbcType=CHAR},",
          "approve_flag = #{approveFlag,jdbcType=CHAR},",
          "other_appr_flag = #{otherApprFlag,jdbcType=CHAR},",
          "other_appr_date = #{otherApprDate,jdbcType=TIMESTAMP},",
          "oper_date = #{operDate,jdbcType=TIMESTAMP},",
          "work_date = #{workDate,jdbcType=TIMESTAMP},",
          "order_man = #{orderMan,jdbcType=CHAR},",
          "oper_id = #{operId,jdbcType=CHAR},",
          "confirm_man = #{confirmMan,jdbcType=CHAR},",
          "other_appr_man = #{otherApprMan,jdbcType=CHAR},",
          "sale_way = #{saleWay,jdbcType=CHAR},",
          "reverse_flag = #{reverseFlag,jdbcType=CHAR},",
          "reverse_sheet = #{reverseSheet,jdbcType=CHAR},",
          "direct_flag = #{directFlag,jdbcType=CHAR},",
          "trans_flag = #{transFlag,jdbcType=CHAR},",
          "acct_flag = #{acctFlag,jdbcType=CHAR},",
          "other1 = #{other1,jdbcType=VARCHAR},",
          "other2 = #{other2,jdbcType=VARCHAR},",
          "other3 = #{other3,jdbcType=VARCHAR},",
          "sheet_amt = #{sheetAmt,jdbcType=NUMERIC},",
          "branch_flag = #{branchFlag,jdbcType=CHAR},",
          "com_flag = #{comFlag,jdbcType=CHAR},",
          "order_status = #{orderStatus,jdbcType=CHAR},",
          "area_appr_flag = #{areaApprFlag,jdbcType=CHAR},",
          "area_appr_date = #{areaApprDate,jdbcType=TIMESTAMP},",
          "area_appr_man = #{areaApprMan,jdbcType=CHAR},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "reason_no = #{reasonNo,jdbcType=VARCHAR},",
          "print_num = #{printNum,jdbcType=INTEGER},",
          "in_flag = #{inFlag,jdbcType=CHAR},",
          "md_flag = #{mdFlag,jdbcType=CHAR},",
          "audit_status = #{auditStatus,jdbcType=CHAR},",
          "check_flag = #{checkFlag,jdbcType=CHAR}",
        "where sheet_no = #{sheetNo,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Master4im record);
}