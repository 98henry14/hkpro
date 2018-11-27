package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.JXCDaySum;
import cn.qdama.siss.bean.JXCDaySumKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface JXCDaySumMapper {
    @Delete({
        "delete from t_da_jxc_daysum",
        "where item_no = #{itemNo,jdbcType=VARCHAR}",
          "and oper_date = #{operDate,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(JXCDaySumKey key);

    @Insert({
        "insert into t_da_jxc_daysum (item_no, oper_date, ",
        "branch_no, cost_price, ",
        "init_qty, init_amt, ",
        "init_amt2, avg_cost_amt, ",
        "avg_profit_amt, pi_qty, ",
        "pi_amt, so_qty, so_amt, ",
        "mi_qty, mi_amt, mo_qty, ",
        "mo_amt, di_qty, di_amt, ",
        "do_qty, do_amt, pos_qty, ",
        "pos_amt, pos_ret_qty, ",
        "pos_ret_amt, pos_send_qty, ",
        "pos_send_amt, oo_qty, ",
        "oo_amt, settle_qty, ",
        "settle_amt, settle_amt2, ",
        "cost_change_amt, pos_dct_amt, ",
        "main_sup, dec_rate, ",
        "so_price, sale_price, ",
        "com_flag, item_sup_flag, ",
        "sup_ly_rate, flag, offline_flag, ",
        "dc_qty, dc_amt, kb_qty, ",
        "kb_amt, kb_qty2, kb_amt2, ",
        "purchase_tax, sale_tax, ",
        "cs_amt, cs_qty)",
        "values (#{itemNo,jdbcType=VARCHAR}, #{operDate,jdbcType=CHAR}, ",
        "#{branchNo,jdbcType=VARCHAR}, #{costPrice,jdbcType=NUMERIC}, ",
        "#{initQty,jdbcType=NUMERIC}, #{initAmt,jdbcType=NUMERIC}, ",
        "#{initAmt2,jdbcType=NUMERIC}, #{avgCostAmt,jdbcType=NUMERIC}, ",
        "#{avgProfitAmt,jdbcType=NUMERIC}, #{piQty,jdbcType=NUMERIC}, ",
        "#{piAmt,jdbcType=NUMERIC}, #{soQty,jdbcType=NUMERIC}, #{soAmt,jdbcType=NUMERIC}, ",
        "#{miQty,jdbcType=NUMERIC}, #{miAmt,jdbcType=NUMERIC}, #{moQty,jdbcType=NUMERIC}, ",
        "#{moAmt,jdbcType=NUMERIC}, #{diQty,jdbcType=NUMERIC}, #{diAmt,jdbcType=NUMERIC}, ",
        "#{doQty,jdbcType=NUMERIC}, #{doAmt,jdbcType=NUMERIC}, #{posQty,jdbcType=NUMERIC}, ",
        "#{posAmt,jdbcType=NUMERIC}, #{posRetQty,jdbcType=NUMERIC}, ",
        "#{posRetAmt,jdbcType=NUMERIC}, #{posSendQty,jdbcType=NUMERIC}, ",
        "#{posSendAmt,jdbcType=NUMERIC}, #{ooQty,jdbcType=NUMERIC}, ",
        "#{ooAmt,jdbcType=NUMERIC}, #{settleQty,jdbcType=NUMERIC}, ",
        "#{settleAmt,jdbcType=NUMERIC}, #{settleAmt2,jdbcType=NUMERIC}, ",
        "#{costChangeAmt,jdbcType=NUMERIC}, #{posDctAmt,jdbcType=NUMERIC}, ",
        "#{mainSup,jdbcType=VARCHAR}, #{decRate,jdbcType=NUMERIC}, ",
        "#{soPrice,jdbcType=NUMERIC}, #{salePrice,jdbcType=NUMERIC}, ",
        "#{comFlag,jdbcType=CHAR}, #{itemSupFlag,jdbcType=CHAR}, ",
        "#{supLyRate,jdbcType=NUMERIC}, #{flag,jdbcType=CHAR}, #{offlineFlag,jdbcType=CHAR}, ",
        "#{dcQty,jdbcType=DECIMAL}, #{dcAmt,jdbcType=DECIMAL}, #{kbQty,jdbcType=NUMERIC}, ",
        "#{kbAmt,jdbcType=NUMERIC}, #{kbQty2,jdbcType=NUMERIC}, #{kbAmt2,jdbcType=NUMERIC}, ",
        "#{purchaseTax,jdbcType=DECIMAL}, #{saleTax,jdbcType=DECIMAL}, ",
        "#{csAmt,jdbcType=NUMERIC}, #{csQty,jdbcType=NUMERIC})"
    })
    int insert(JXCDaySum record);

    @InsertProvider(type=JXCDaySumSqlProvider.class, method="insertSelective")
    int insertSelective(JXCDaySum record);

    @Select({
        "select",
        "item_no, oper_date, branch_no, cost_price, init_qty, init_amt, init_amt2, avg_cost_amt, ",
        "avg_profit_amt, pi_qty, pi_amt, so_qty, so_amt, mi_qty, mi_amt, mo_qty, mo_amt, ",
        "di_qty, di_amt, do_qty, do_amt, pos_qty, pos_amt, pos_ret_qty, pos_ret_amt, ",
        "pos_send_qty, pos_send_amt, oo_qty, oo_amt, settle_qty, settle_amt, settle_amt2, ",
        "cost_change_amt, pos_dct_amt, main_sup, dec_rate, so_price, sale_price, com_flag, ",
        "item_sup_flag, sup_ly_rate, flag, offline_flag, dc_qty, dc_amt, kb_qty, kb_amt, ",
        "kb_qty2, kb_amt2, purchase_tax, sale_tax, cs_amt, cs_qty",
        "from t_da_jxc_daysum",
        "where item_no = #{itemNo,jdbcType=VARCHAR}",
          "and oper_date = #{operDate,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=VARCHAR}"
    })
    JXCDaySum selectByPrimaryKey(JXCDaySumKey key);

    @Select({"select " +
            "SUM(pi_amt)+SUM(di_amt) as acceptanceAmount ",
            "from t_da_jxc_daysum  " ,
            "where branch_no = #{branchNo,jdbcType=VARCHAR}" ,
            "and oper_date = #{operDate,jdbcType=VARCHAR} "})
    Double getAcceptanceAmount(@Param("operDate") String operDate, @Param("branchNo") String branchNo);

    @UpdateProvider(type=JXCDaySumSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(JXCDaySum record);

    @Update({
        "update t_da_jxc_daysum",
        "set cost_price = #{costPrice,jdbcType=NUMERIC},",
          "init_qty = #{initQty,jdbcType=NUMERIC},",
          "init_amt = #{initAmt,jdbcType=NUMERIC},",
          "init_amt2 = #{initAmt2,jdbcType=NUMERIC},",
          "avg_cost_amt = #{avgCostAmt,jdbcType=NUMERIC},",
          "avg_profit_amt = #{avgProfitAmt,jdbcType=NUMERIC},",
          "pi_qty = #{piQty,jdbcType=NUMERIC},",
          "pi_amt = #{piAmt,jdbcType=NUMERIC},",
          "so_qty = #{soQty,jdbcType=NUMERIC},",
          "so_amt = #{soAmt,jdbcType=NUMERIC},",
          "mi_qty = #{miQty,jdbcType=NUMERIC},",
          "mi_amt = #{miAmt,jdbcType=NUMERIC},",
          "mo_qty = #{moQty,jdbcType=NUMERIC},",
          "mo_amt = #{moAmt,jdbcType=NUMERIC},",
          "di_qty = #{diQty,jdbcType=NUMERIC},",
          "di_amt = #{diAmt,jdbcType=NUMERIC},",
          "do_qty = #{doQty,jdbcType=NUMERIC},",
          "do_amt = #{doAmt,jdbcType=NUMERIC},",
          "pos_qty = #{posQty,jdbcType=NUMERIC},",
          "pos_amt = #{posAmt,jdbcType=NUMERIC},",
          "pos_ret_qty = #{posRetQty,jdbcType=NUMERIC},",
          "pos_ret_amt = #{posRetAmt,jdbcType=NUMERIC},",
          "pos_send_qty = #{posSendQty,jdbcType=NUMERIC},",
          "pos_send_amt = #{posSendAmt,jdbcType=NUMERIC},",
          "oo_qty = #{ooQty,jdbcType=NUMERIC},",
          "oo_amt = #{ooAmt,jdbcType=NUMERIC},",
          "settle_qty = #{settleQty,jdbcType=NUMERIC},",
          "settle_amt = #{settleAmt,jdbcType=NUMERIC},",
          "settle_amt2 = #{settleAmt2,jdbcType=NUMERIC},",
          "cost_change_amt = #{costChangeAmt,jdbcType=NUMERIC},",
          "pos_dct_amt = #{posDctAmt,jdbcType=NUMERIC},",
          "main_sup = #{mainSup,jdbcType=VARCHAR},",
          "dec_rate = #{decRate,jdbcType=NUMERIC},",
          "so_price = #{soPrice,jdbcType=NUMERIC},",
          "sale_price = #{salePrice,jdbcType=NUMERIC},",
          "com_flag = #{comFlag,jdbcType=CHAR},",
          "item_sup_flag = #{itemSupFlag,jdbcType=CHAR},",
          "sup_ly_rate = #{supLyRate,jdbcType=NUMERIC},",
          "flag = #{flag,jdbcType=CHAR},",
          "offline_flag = #{offlineFlag,jdbcType=CHAR},",
          "dc_qty = #{dcQty,jdbcType=DECIMAL},",
          "dc_amt = #{dcAmt,jdbcType=DECIMAL},",
          "kb_qty = #{kbQty,jdbcType=NUMERIC},",
          "kb_amt = #{kbAmt,jdbcType=NUMERIC},",
          "kb_qty2 = #{kbQty2,jdbcType=NUMERIC},",
          "kb_amt2 = #{kbAmt2,jdbcType=NUMERIC},",
          "purchase_tax = #{purchaseTax,jdbcType=DECIMAL},",
          "sale_tax = #{saleTax,jdbcType=DECIMAL},",
          "cs_amt = #{csAmt,jdbcType=NUMERIC},",
          "cs_qty = #{csQty,jdbcType=NUMERIC}",
        "where item_no = #{itemNo,jdbcType=VARCHAR}",
          "and oper_date = #{operDate,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(JXCDaySum record);
}