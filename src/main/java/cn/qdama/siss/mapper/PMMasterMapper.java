package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.PMMaster;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface PMMasterMapper {
    @Delete({
        "delete from t_pm_sheet_master",
        "where sheet_no = #{sheetNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String sheetNo);

    @Insert({
        "insert into t_pm_sheet_master (sheet_no, trans_no, ",
        "db_no, branch_no, d_branch_no, ",
        "voucher_no, supcust_no, ",
        "coin_no, pay_way, ",
        "pay_date, approve_flag, ",
        "oper_date, work_date, ",
        "valid_date, order_amt, ",
        "order_status, order_man, ",
        "oper_id, confirm_man, ",
        "acct_flag, sheet_amt, ",
        "branch_flag, com_flag, ",
        "in_flag, memo, print_num, ",
        "modified_id, modified_date, ",
        "trans_flag, order_paid, ",
        "sale_way, paid_amt, audit_status )",
        "values (#{sheetNo,jdbcType=VARCHAR}, #{transNo,jdbcType=CHAR}, ",
        "#{dbNo,jdbcType=CHAR}, #{branchNo,jdbcType=VARCHAR}, #{dBranchNo,jdbcType=VARCHAR}, ",
        "#{voucherNo,jdbcType=VARCHAR}, #{supcustNo,jdbcType=VARCHAR}, ",
        "#{coinNo,jdbcType=VARCHAR}, #{payWay,jdbcType=VARCHAR}, ",
        "#{payDate,jdbcType=TIMESTAMP}, #{approveFlag,jdbcType=CHAR}, ",
        "#{operDate,jdbcType=TIMESTAMP}, #{workDate,jdbcType=TIMESTAMP}, ",
        "#{validDate,jdbcType=TIMESTAMP}, #{orderAmt,jdbcType=NUMERIC}, ",
        "#{orderStatus,jdbcType=CHAR}, #{orderMan,jdbcType=VARCHAR}, ",
        "#{operId,jdbcType=VARCHAR}, #{confirmMan,jdbcType=VARCHAR}, ",
        "#{acctFlag,jdbcType=CHAR}, #{sheetAmt,jdbcType=NUMERIC}, ",
        "#{branchFlag,jdbcType=VARCHAR}, #{comFlag,jdbcType=CHAR}, ",
        "#{inFlag,jdbcType=CHAR}, #{memo,jdbcType=VARCHAR}, #{printNum,jdbcType=INTEGER}, ",
        "#{modifiedId,jdbcType=VARCHAR}, #{modifiedDate,jdbcType=TIMESTAMP}, ",
        "#{transFlag,jdbcType=CHAR}, #{orderPaid,jdbcType=NUMERIC}, ",
        "#{saleWay,jdbcType=CHAR}, #{paidAmt,jdbcType=NUMERIC},  ",
        "#{auditStatus,jdbcType=CHAR})"
    })
    int insert(PMMaster record);

    @Select({
        "select",
        "sheet_no, trans_no, db_no, branch_no, d_branch_no, voucher_no, supcust_no, coin_no, ",
        "pay_way, pay_date, approve_flag, oper_date, work_date, valid_date, order_amt, ",
        "order_status, order_man, oper_id, confirm_man, acct_flag, sheet_amt, branch_flag, ",
        "com_flag, in_flag, memo, print_num, modified_id, modified_date, trans_flag, ",
        "order_paid, sale_way, paid_amt, audit_status, time_stamp",
        "from t_pm_sheet_master",
        "where sheet_no = #{sheetNo,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sheet_no", property="sheetNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trans_no", property="transNo", jdbcType=JdbcType.CHAR),
        @Result(column="db_no", property="dbNo", jdbcType=JdbcType.CHAR),
        @Result(column="branch_no", property="branchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="d_branch_no", property="dBranchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="voucher_no", property="voucherNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="supcust_no", property="supcustNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="coin_no", property="coinNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_way", property="payWay", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_date", property="payDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approve_flag", property="approveFlag", jdbcType=JdbcType.CHAR),
        @Result(column="oper_date", property="operDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="work_date", property="workDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="valid_date", property="validDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_amt", property="orderAmt", jdbcType=JdbcType.NUMERIC),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.CHAR),
        @Result(column="order_man", property="orderMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="oper_id", property="operId", jdbcType=JdbcType.VARCHAR),
        @Result(column="confirm_man", property="confirmMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="acct_flag", property="acctFlag", jdbcType=JdbcType.CHAR),
        @Result(column="sheet_amt", property="sheetAmt", jdbcType=JdbcType.NUMERIC),
        @Result(column="branch_flag", property="branchFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="com_flag", property="comFlag", jdbcType=JdbcType.CHAR),
        @Result(column="in_flag", property="inFlag", jdbcType=JdbcType.CHAR),
        @Result(column="memo", property="memo", jdbcType=JdbcType.VARCHAR),
        @Result(column="print_num", property="printNum", jdbcType=JdbcType.INTEGER),
        @Result(column="modified_id", property="modifiedId", jdbcType=JdbcType.VARCHAR),
        @Result(column="modified_date", property="modifiedDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trans_flag", property="transFlag", jdbcType=JdbcType.CHAR),
        @Result(column="order_paid", property="orderPaid", jdbcType=JdbcType.NUMERIC),
        @Result(column="sale_way", property="saleWay", jdbcType=JdbcType.CHAR),
        @Result(column="paid_amt", property="paidAmt", jdbcType=JdbcType.NUMERIC),
        @Result(column="audit_status", property="auditStatus", jdbcType=JdbcType.CHAR),
        @Result(column="time_stamp", property="timeStamp", jdbcType=JdbcType.BINARY)
    })
    PMMaster selectByPrimaryKey(String sheetNo);

    @Select({
        "select",
        "sheet_no, trans_no, db_no, branch_no, d_branch_no, voucher_no, supcust_no, coin_no, ",
        "pay_way, pay_date, approve_flag, oper_date, work_date, valid_date, order_amt, ",
        "order_status, order_man, oper_id, confirm_man, acct_flag, sheet_amt, branch_flag, ",
        "com_flag, in_flag, memo, print_num, modified_id, modified_date, trans_flag, ",
        "order_paid, sale_way, paid_amt, audit_status, time_stamp",
        "from t_pm_sheet_master"
    })
    @Results({
        @Result(column="sheet_no", property="sheetNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trans_no", property="transNo", jdbcType=JdbcType.CHAR),
        @Result(column="db_no", property="dbNo", jdbcType=JdbcType.CHAR),
        @Result(column="branch_no", property="branchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="d_branch_no", property="dBranchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="voucher_no", property="voucherNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="supcust_no", property="supcustNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="coin_no", property="coinNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_way", property="payWay", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_date", property="payDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="approve_flag", property="approveFlag", jdbcType=JdbcType.CHAR),
        @Result(column="oper_date", property="operDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="work_date", property="workDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="valid_date", property="validDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_amt", property="orderAmt", jdbcType=JdbcType.NUMERIC),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.CHAR),
        @Result(column="order_man", property="orderMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="oper_id", property="operId", jdbcType=JdbcType.VARCHAR),
        @Result(column="confirm_man", property="confirmMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="acct_flag", property="acctFlag", jdbcType=JdbcType.CHAR),
        @Result(column="sheet_amt", property="sheetAmt", jdbcType=JdbcType.NUMERIC),
        @Result(column="branch_flag", property="branchFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="com_flag", property="comFlag", jdbcType=JdbcType.CHAR),
        @Result(column="in_flag", property="inFlag", jdbcType=JdbcType.CHAR),
        @Result(column="memo", property="memo", jdbcType=JdbcType.VARCHAR),
        @Result(column="print_num", property="printNum", jdbcType=JdbcType.INTEGER),
        @Result(column="modified_id", property="modifiedId", jdbcType=JdbcType.VARCHAR),
        @Result(column="modified_date", property="modifiedDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trans_flag", property="transFlag", jdbcType=JdbcType.CHAR),
        @Result(column="order_paid", property="orderPaid", jdbcType=JdbcType.NUMERIC),
        @Result(column="sale_way", property="saleWay", jdbcType=JdbcType.CHAR),
        @Result(column="paid_amt", property="paidAmt", jdbcType=JdbcType.NUMERIC),
        @Result(column="audit_status", property="auditStatus", jdbcType=JdbcType.CHAR),
        @Result(column="time_stamp", property="timeStamp", jdbcType=JdbcType.BINARY)
    })
    List<PMMaster> selectAll();

    @Update({
        "update t_pm_sheet_master",
        "set trans_no = #{transNo,jdbcType=CHAR},",
          "db_no = #{dbNo,jdbcType=CHAR},",
          "branch_no = #{branchNo,jdbcType=VARCHAR},",
          "d_branch_no = #{dBranchNo,jdbcType=VARCHAR},",
          "voucher_no = #{voucherNo,jdbcType=VARCHAR},",
          "supcust_no = #{supcustNo,jdbcType=VARCHAR},",
          "coin_no = #{coinNo,jdbcType=VARCHAR},",
          "pay_way = #{payWay,jdbcType=VARCHAR},",
          "pay_date = #{payDate,jdbcType=TIMESTAMP},",
          "approve_flag = #{approveFlag,jdbcType=CHAR},",
          "oper_date = #{operDate,jdbcType=TIMESTAMP},",
          "work_date = #{workDate,jdbcType=TIMESTAMP},",
          "valid_date = #{validDate,jdbcType=TIMESTAMP},",
          "order_amt = #{orderAmt,jdbcType=NUMERIC},",
          "order_status = #{orderStatus,jdbcType=CHAR},",
          "order_man = #{orderMan,jdbcType=VARCHAR},",
          "oper_id = #{operId,jdbcType=VARCHAR},",
          "confirm_man = #{confirmMan,jdbcType=VARCHAR},",
          "acct_flag = #{acctFlag,jdbcType=CHAR},",
          "sheet_amt = #{sheetAmt,jdbcType=NUMERIC},",
          "branch_flag = #{branchFlag,jdbcType=VARCHAR},",
          "com_flag = #{comFlag,jdbcType=CHAR},",
          "in_flag = #{inFlag,jdbcType=CHAR},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "print_num = #{printNum,jdbcType=INTEGER},",
          "modified_id = #{modifiedId,jdbcType=VARCHAR},",
          "modified_date = #{modifiedDate,jdbcType=TIMESTAMP},",
          "trans_flag = #{transFlag,jdbcType=CHAR},",
          "order_paid = #{orderPaid,jdbcType=NUMERIC},",
          "sale_way = #{saleWay,jdbcType=CHAR},",
          "paid_amt = #{paidAmt,jdbcType=NUMERIC},",
          "audit_status = #{auditStatus,jdbcType=CHAR},",
          "time_stamp = #{timeStamp,jdbcType=BINARY}",
        "where sheet_no = #{sheetNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PMMaster record);
}