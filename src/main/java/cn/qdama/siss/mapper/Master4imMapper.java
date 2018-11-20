package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.Master4im;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface Master4imMapper {
    @Delete({
        "delete from t_im_sheet_master",
        "where sheet_no = #{sheetNo,jdbcType=VARCHAR}"
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
        "values (#{sheetNo,jdbcType=VARCHAR}, #{transNo,jdbcType=VARCHAR}, ",
        "#{dbNo,jdbcType=VARCHAR}, #{branchNo,jdbcType=VARCHAR}, #{dBranchNo,jdbcType=VARCHAR}, ",
        "#{voucherNo,jdbcType=VARCHAR}, #{supcustNo,jdbcType=VARCHAR}, ",
        "#{coinNo,jdbcType=VARCHAR}, #{payWay,jdbcType=VARCHAR}, #{payDate,jdbcType=TIMESTAMP}, ",
        "#{deptId,jdbcType=VARCHAR}, #{deptFlag,jdbcType=VARCHAR}, #{approveFlag,jdbcType=VARCHAR}, ",
        "#{otherApprFlag,jdbcType=VARCHAR}, #{otherApprDate,jdbcType=TIMESTAMP}, ",
        "#{operDate,jdbcType=TIMESTAMP}, #{workDate,jdbcType=TIMESTAMP}, ",
        "#{orderMan,jdbcType=VARCHAR}, #{operId,jdbcType=VARCHAR}, #{confirmMan,jdbcType=VARCHAR}, ",
        "#{otherApprMan,jdbcType=VARCHAR}, #{saleWay,jdbcType=VARCHAR}, ",
        "#{reverseFlag,jdbcType=VARCHAR}, #{reverseSheet,jdbcType=VARCHAR}, ",
        "#{directFlag,jdbcType=VARCHAR}, #{transFlag,jdbcType=VARCHAR}, ",
        "#{acctFlag,jdbcType=VARCHAR}, #{other1,jdbcType=VARCHAR}, #{other2,jdbcType=VARCHAR}, ",
        "#{other3,jdbcType=VARCHAR}, #{sheetAmt,jdbcType=NUMERIC}, ",
        "#{branchFlag,jdbcType=VARCHAR}, #{comFlag,jdbcType=VARCHAR}, #{orderStatus,jdbcType=VARCHAR}, ",
        "#{areaApprFlag,jdbcType=VARCHAR}, #{areaApprDate,jdbcType=TIMESTAMP}, ",
        "#{areaApprMan,jdbcType=VARCHAR}, #{memo,jdbcType=VARCHAR}, ",
        "#{reasonNo,jdbcType=VARCHAR}, #{printNum,jdbcType=INTEGER}, ",
        "#{inFlag,jdbcType=VARCHAR}, #{mdFlag,jdbcType=VARCHAR}, #{auditStatus,jdbcType=VARCHAR}, ",
        "#{checkFlag,jdbcType=VARCHAR})"
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
        "where sheet_no = #{sheetNo,jdbcType=VARCHAR}"
    })
    Master4im selectByPrimaryKey(String sheetNo);

    @UpdateProvider(type=Master4imSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Master4im record);

    @Update({
        "update t_im_sheet_master",
        "set trans_no = #{transNo,jdbcType=VARCHAR},",
          "db_no = #{dbNo,jdbcType=VARCHAR},",
          "branch_no = #{branchNo,jdbcType=VARCHAR},",
          "d_branch_no = #{dBranchNo,jdbcType=VARCHAR},",
          "voucher_no = #{voucherNo,jdbcType=VARCHAR},",
          "supcust_no = #{supcustNo,jdbcType=VARCHAR},",
          "coin_no = #{coinNo,jdbcType=VARCHAR},",
          "pay_way = #{payWay,jdbcType=VARCHAR},",
          "pay_date = #{payDate,jdbcType=TIMESTAMP},",
          "dept_id = #{deptId,jdbcType=VARCHAR},",
          "dept_flag = #{deptFlag,jdbcType=VARCHAR},",
          "approve_flag = #{approveFlag,jdbcType=VARCHAR},",
          "other_appr_flag = #{otherApprFlag,jdbcType=VARCHAR},",
          "other_appr_date = #{otherApprDate,jdbcType=TIMESTAMP},",
          "oper_date = #{operDate,jdbcType=TIMESTAMP},",
          "work_date = #{workDate,jdbcType=TIMESTAMP},",
          "order_man = #{orderMan,jdbcType=VARCHAR},",
          "oper_id = #{operId,jdbcType=VARCHAR},",
          "confirm_man = #{confirmMan,jdbcType=VARCHAR},",
          "other_appr_man = #{otherApprMan,jdbcType=VARCHAR},",
          "sale_way = #{saleWay,jdbcType=VARCHAR},",
          "reverse_flag = #{reverseFlag,jdbcType=VARCHAR},",
          "reverse_sheet = #{reverseSheet,jdbcType=VARCHAR},",
          "direct_flag = #{directFlag,jdbcType=VARCHAR},",
          "trans_flag = #{transFlag,jdbcType=VARCHAR},",
          "acct_flag = #{acctFlag,jdbcType=VARCHAR},",
          "other1 = #{other1,jdbcType=VARCHAR},",
          "other2 = #{other2,jdbcType=VARCHAR},",
          "other3 = #{other3,jdbcType=VARCHAR},",
          "sheet_amt = #{sheetAmt,jdbcType=NUMERIC},",
          "branch_flag = #{branchFlag,jdbcType=VARCHAR},",
          "com_flag = #{comFlag,jdbcType=VARCHAR},",
          "order_status = #{orderStatus,jdbcType=VARCHAR},",
          "area_appr_flag = #{areaApprFlag,jdbcType=VARCHAR},",
          "area_appr_date = #{areaApprDate,jdbcType=TIMESTAMP},",
          "area_appr_man = #{areaApprMan,jdbcType=VARCHAR},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "reason_no = #{reasonNo,jdbcType=VARCHAR},",
          "print_num = #{printNum,jdbcType=INTEGER},",
          "in_flag = #{inFlag,jdbcType=VARCHAR},",
          "md_flag = #{mdFlag,jdbcType=VARCHAR},",
          "audit_status = #{auditStatus,jdbcType=VARCHAR},",
          "check_flag = #{checkFlag,jdbcType=VARCHAR},",
          "time_stamp = #{timeStamp,jdbcType=BINARY}",
        "where sheet_no = #{sheetNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(Master4im record);

    @Update({
        "update t_im_sheet_master",
        "set trans_no = #{transNo,jdbcType=VARCHAR},",
          "db_no = #{dbNo,jdbcType=VARCHAR},",
          "branch_no = #{branchNo,jdbcType=VARCHAR},",
          "d_branch_no = #{dBranchNo,jdbcType=VARCHAR},",
          "voucher_no = #{voucherNo,jdbcType=VARCHAR},",
          "supcust_no = #{supcustNo,jdbcType=VARCHAR},",
          "coin_no = #{coinNo,jdbcType=VARCHAR},",
          "pay_way = #{payWay,jdbcType=VARCHAR},",
          "pay_date = #{payDate,jdbcType=TIMESTAMP},",
          "dept_id = #{deptId,jdbcType=VARCHAR},",
          "dept_flag = #{deptFlag,jdbcType=VARCHAR},",
          "approve_flag = #{approveFlag,jdbcType=VARCHAR},",
          "other_appr_flag = #{otherApprFlag,jdbcType=VARCHAR},",
          "other_appr_date = #{otherApprDate,jdbcType=TIMESTAMP},",
          "oper_date = #{operDate,jdbcType=TIMESTAMP},",
          "work_date = #{workDate,jdbcType=TIMESTAMP},",
          "order_man = #{orderMan,jdbcType=VARCHAR},",
          "oper_id = #{operId,jdbcType=VARCHAR},",
          "confirm_man = #{confirmMan,jdbcType=VARCHAR},",
          "other_appr_man = #{otherApprMan,jdbcType=VARCHAR},",
          "sale_way = #{saleWay,jdbcType=VARCHAR},",
          "reverse_flag = #{reverseFlag,jdbcType=VARCHAR},",
          "reverse_sheet = #{reverseSheet,jdbcType=VARCHAR},",
          "direct_flag = #{directFlag,jdbcType=VARCHAR},",
          "trans_flag = #{transFlag,jdbcType=VARCHAR},",
          "acct_flag = #{acctFlag,jdbcType=VARCHAR},",
          "other1 = #{other1,jdbcType=VARCHAR},",
          "other2 = #{other2,jdbcType=VARCHAR},",
          "other3 = #{other3,jdbcType=VARCHAR},",
          "sheet_amt = #{sheetAmt,jdbcType=NUMERIC},",
          "branch_flag = #{branchFlag,jdbcType=VARCHAR},",
          "com_flag = #{comFlag,jdbcType=VARCHAR},",
          "order_status = #{orderStatus,jdbcType=VARCHAR},",
          "area_appr_flag = #{areaApprFlag,jdbcType=VARCHAR},",
          "area_appr_date = #{areaApprDate,jdbcType=TIMESTAMP},",
          "area_appr_man = #{areaApprMan,jdbcType=VARCHAR},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "reason_no = #{reasonNo,jdbcType=VARCHAR},",
          "print_num = #{printNum,jdbcType=INTEGER},",
          "in_flag = #{inFlag,jdbcType=VARCHAR},",
          "md_flag = #{mdFlag,jdbcType=VARCHAR},",
          "audit_status = #{auditStatus,jdbcType=VARCHAR},",
          "check_flag = #{checkFlag,jdbcType=VARCHAR}",
        "where sheet_no = #{sheetNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Master4im record);
}