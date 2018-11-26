package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.RMDaySum;
import cn.qdama.siss.bean.RMDaySumKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
@Mapper
public interface RMDaySumMapper {
    @Delete({
        "delete from t_rm_daysum",
        "where item_no = #{itemNo,jdbcType=VARCHAR}",
          "and oper_date = #{operDate,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(RMDaySumKey key);

    @Insert({
        "insert into t_rm_daysum (item_no, oper_date, ",
        "branch_no, sale_qty, ",
        "ret_qty, giv_qty, ",
        "sale_amt, ret_amt, ",
        "giv_amt, sale_price, ",
        "pre_qty, pre_amt, ",
        "dct_amount, cost_price, ",
        "memo, com_flag)",
        "values (#{itemNo,jdbcType=VARCHAR}, #{operDate,jdbcType=CHAR}, ",
        "#{branchNo,jdbcType=VARCHAR}, #{saleQty,jdbcType=NUMERIC}, ",
        "#{retQty,jdbcType=NUMERIC}, #{givQty,jdbcType=NUMERIC}, ",
        "#{saleAmt,jdbcType=NUMERIC}, #{retAmt,jdbcType=NUMERIC}, ",
        "#{givAmt,jdbcType=NUMERIC}, #{salePrice,jdbcType=NUMERIC}, ",
        "#{preQty,jdbcType=NUMERIC}, #{preAmt,jdbcType=NUMERIC}, ",
        "#{dctAmount,jdbcType=NUMERIC}, #{costPrice,jdbcType=NUMERIC}, ",
        "#{memo,jdbcType=VARCHAR}, #{comFlag,jdbcType=CHAR})"
    })
    int insert(RMDaySum record);

    @InsertProvider(type=RMDaySumSqlProvider.class, method="insertSelective")
    int insertSelective(RMDaySum record);

    @Select({
        "select",
        "item_no, oper_date, branch_no, sale_qty, ret_qty, giv_qty, sale_amt, ret_amt, ",
        "giv_amt, sale_price, pre_qty, pre_amt, dct_amount, cost_price, memo, com_flag",
        "from t_rm_daysum",
        "where item_no = #{itemNo,jdbcType=VARCHAR}",
          "and oper_date = #{operDate,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=VARCHAR}"
    })
    RMDaySum selectByPrimaryKey(RMDaySumKey key);
    @Select({"select SUM(sale_amt) from t_rm_daysum where oper_date=#{operDate}"})
    Double getTotalSaleAmt(String operDate);

    @UpdateProvider(type=RMDaySumSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RMDaySum record);

    @Update({
        "update t_rm_daysum",
        "set sale_qty = #{saleQty,jdbcType=NUMERIC},",
          "ret_qty = #{retQty,jdbcType=NUMERIC},",
          "giv_qty = #{givQty,jdbcType=NUMERIC},",
          "sale_amt = #{saleAmt,jdbcType=NUMERIC},",
          "ret_amt = #{retAmt,jdbcType=NUMERIC},",
          "giv_amt = #{givAmt,jdbcType=NUMERIC},",
          "sale_price = #{salePrice,jdbcType=NUMERIC},",
          "pre_qty = #{preQty,jdbcType=NUMERIC},",
          "pre_amt = #{preAmt,jdbcType=NUMERIC},",
          "dct_amount = #{dctAmount,jdbcType=NUMERIC},",
          "cost_price = #{costPrice,jdbcType=NUMERIC},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "com_flag = #{comFlag,jdbcType=CHAR}",
        "where item_no = #{itemNo,jdbcType=VARCHAR}",
          "and oper_date = #{operDate,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(RMDaySum record);
}