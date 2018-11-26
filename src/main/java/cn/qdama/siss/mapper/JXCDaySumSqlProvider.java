package cn.qdama.siss.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.qdama.siss.bean.JXCDaySum;

public class JXCDaySumSqlProvider {

    public String insertSelective(JXCDaySum record) {
        BEGIN();
        INSERT_INTO("t_da_jxc_daysum");
        
        if (record.getItemNo() != null) {
            VALUES("item_no", "#{itemNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOperDate() != null) {
            VALUES("oper_date", "#{operDate,jdbcType=CHAR}");
        }
        
        if (record.getBranchNo() != null) {
            VALUES("branch_no", "#{branchNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCostPrice() != null) {
            VALUES("cost_price", "#{costPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getInitQty() != null) {
            VALUES("init_qty", "#{initQty,jdbcType=NUMERIC}");
        }
        
        if (record.getInitAmt() != null) {
            VALUES("init_amt", "#{initAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getInitAmt2() != null) {
            VALUES("init_amt2", "#{initAmt2,jdbcType=NUMERIC}");
        }
        
        if (record.getAvgCostAmt() != null) {
            VALUES("avg_cost_amt", "#{avgCostAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getAvgProfitAmt() != null) {
            VALUES("avg_profit_amt", "#{avgProfitAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPiQty() != null) {
            VALUES("pi_qty", "#{piQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPiAmt() != null) {
            VALUES("pi_amt", "#{piAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSoQty() != null) {
            VALUES("so_qty", "#{soQty,jdbcType=NUMERIC}");
        }
        
        if (record.getSoAmt() != null) {
            VALUES("so_amt", "#{soAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getMiQty() != null) {
            VALUES("mi_qty", "#{miQty,jdbcType=NUMERIC}");
        }
        
        if (record.getMiAmt() != null) {
            VALUES("mi_amt", "#{miAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getMoQty() != null) {
            VALUES("mo_qty", "#{moQty,jdbcType=NUMERIC}");
        }
        
        if (record.getMoAmt() != null) {
            VALUES("mo_amt", "#{moAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getDiQty() != null) {
            VALUES("di_qty", "#{diQty,jdbcType=NUMERIC}");
        }
        
        if (record.getDiAmt() != null) {
            VALUES("di_amt", "#{diAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getDoQty() != null) {
            VALUES("do_qty", "#{doQty,jdbcType=NUMERIC}");
        }
        
        if (record.getDoAmt() != null) {
            VALUES("do_amt", "#{doAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPosQty() != null) {
            VALUES("pos_qty", "#{posQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPosAmt() != null) {
            VALUES("pos_amt", "#{posAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPosRetQty() != null) {
            VALUES("pos_ret_qty", "#{posRetQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPosRetAmt() != null) {
            VALUES("pos_ret_amt", "#{posRetAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPosSendQty() != null) {
            VALUES("pos_send_qty", "#{posSendQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPosSendAmt() != null) {
            VALUES("pos_send_amt", "#{posSendAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getOoQty() != null) {
            VALUES("oo_qty", "#{ooQty,jdbcType=NUMERIC}");
        }
        
        if (record.getOoAmt() != null) {
            VALUES("oo_amt", "#{ooAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSettleQty() != null) {
            VALUES("settle_qty", "#{settleQty,jdbcType=NUMERIC}");
        }
        
        if (record.getSettleAmt() != null) {
            VALUES("settle_amt", "#{settleAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSettleAmt2() != null) {
            VALUES("settle_amt2", "#{settleAmt2,jdbcType=NUMERIC}");
        }
        
        if (record.getCostChangeAmt() != null) {
            VALUES("cost_change_amt", "#{costChangeAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPosDctAmt() != null) {
            VALUES("pos_dct_amt", "#{posDctAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getMainSup() != null) {
            VALUES("main_sup", "#{mainSup,jdbcType=VARCHAR}");
        }
        
        if (record.getDecRate() != null) {
            VALUES("dec_rate", "#{decRate,jdbcType=NUMERIC}");
        }
        
        if (record.getSoPrice() != null) {
            VALUES("so_price", "#{soPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getSalePrice() != null) {
            VALUES("sale_price", "#{salePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getComFlag() != null) {
            VALUES("com_flag", "#{comFlag,jdbcType=CHAR}");
        }
        
        if (record.getItemSupFlag() != null) {
            VALUES("item_sup_flag", "#{itemSupFlag,jdbcType=CHAR}");
        }
        
        if (record.getSupLyRate() != null) {
            VALUES("sup_ly_rate", "#{supLyRate,jdbcType=NUMERIC}");
        }
        
        if (record.getFlag() != null) {
            VALUES("flag", "#{flag,jdbcType=CHAR}");
        }
        
        if (record.getOfflineFlag() != null) {
            VALUES("offline_flag", "#{offlineFlag,jdbcType=CHAR}");
        }
        
        if (record.getDcQty() != null) {
            VALUES("dc_qty", "#{dcQty,jdbcType=DECIMAL}");
        }
        
        if (record.getDcAmt() != null) {
            VALUES("dc_amt", "#{dcAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getKbQty() != null) {
            VALUES("kb_qty", "#{kbQty,jdbcType=NUMERIC}");
        }
        
        if (record.getKbAmt() != null) {
            VALUES("kb_amt", "#{kbAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getKbQty2() != null) {
            VALUES("kb_qty2", "#{kbQty2,jdbcType=NUMERIC}");
        }
        
        if (record.getKbAmt2() != null) {
            VALUES("kb_amt2", "#{kbAmt2,jdbcType=NUMERIC}");
        }
        
        if (record.getPurchaseTax() != null) {
            VALUES("purchase_tax", "#{purchaseTax,jdbcType=DECIMAL}");
        }
        
        if (record.getSaleTax() != null) {
            VALUES("sale_tax", "#{saleTax,jdbcType=DECIMAL}");
        }
        
        if (record.getCsAmt() != null) {
            VALUES("cs_amt", "#{csAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getCsQty() != null) {
            VALUES("cs_qty", "#{csQty,jdbcType=NUMERIC}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(JXCDaySum record) {
        BEGIN();
        UPDATE("t_da_jxc_daysum");
        
        if (record.getCostPrice() != null) {
            SET("cost_price = #{costPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getInitQty() != null) {
            SET("init_qty = #{initQty,jdbcType=NUMERIC}");
        }
        
        if (record.getInitAmt() != null) {
            SET("init_amt = #{initAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getInitAmt2() != null) {
            SET("init_amt2 = #{initAmt2,jdbcType=NUMERIC}");
        }
        
        if (record.getAvgCostAmt() != null) {
            SET("avg_cost_amt = #{avgCostAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getAvgProfitAmt() != null) {
            SET("avg_profit_amt = #{avgProfitAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPiQty() != null) {
            SET("pi_qty = #{piQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPiAmt() != null) {
            SET("pi_amt = #{piAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSoQty() != null) {
            SET("so_qty = #{soQty,jdbcType=NUMERIC}");
        }
        
        if (record.getSoAmt() != null) {
            SET("so_amt = #{soAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getMiQty() != null) {
            SET("mi_qty = #{miQty,jdbcType=NUMERIC}");
        }
        
        if (record.getMiAmt() != null) {
            SET("mi_amt = #{miAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getMoQty() != null) {
            SET("mo_qty = #{moQty,jdbcType=NUMERIC}");
        }
        
        if (record.getMoAmt() != null) {
            SET("mo_amt = #{moAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getDiQty() != null) {
            SET("di_qty = #{diQty,jdbcType=NUMERIC}");
        }
        
        if (record.getDiAmt() != null) {
            SET("di_amt = #{diAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getDoQty() != null) {
            SET("do_qty = #{doQty,jdbcType=NUMERIC}");
        }
        
        if (record.getDoAmt() != null) {
            SET("do_amt = #{doAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPosQty() != null) {
            SET("pos_qty = #{posQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPosAmt() != null) {
            SET("pos_amt = #{posAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPosRetQty() != null) {
            SET("pos_ret_qty = #{posRetQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPosRetAmt() != null) {
            SET("pos_ret_amt = #{posRetAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPosSendQty() != null) {
            SET("pos_send_qty = #{posSendQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPosSendAmt() != null) {
            SET("pos_send_amt = #{posSendAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getOoQty() != null) {
            SET("oo_qty = #{ooQty,jdbcType=NUMERIC}");
        }
        
        if (record.getOoAmt() != null) {
            SET("oo_amt = #{ooAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSettleQty() != null) {
            SET("settle_qty = #{settleQty,jdbcType=NUMERIC}");
        }
        
        if (record.getSettleAmt() != null) {
            SET("settle_amt = #{settleAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSettleAmt2() != null) {
            SET("settle_amt2 = #{settleAmt2,jdbcType=NUMERIC}");
        }
        
        if (record.getCostChangeAmt() != null) {
            SET("cost_change_amt = #{costChangeAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getPosDctAmt() != null) {
            SET("pos_dct_amt = #{posDctAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getMainSup() != null) {
            SET("main_sup = #{mainSup,jdbcType=VARCHAR}");
        }
        
        if (record.getDecRate() != null) {
            SET("dec_rate = #{decRate,jdbcType=NUMERIC}");
        }
        
        if (record.getSoPrice() != null) {
            SET("so_price = #{soPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getSalePrice() != null) {
            SET("sale_price = #{salePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getComFlag() != null) {
            SET("com_flag = #{comFlag,jdbcType=CHAR}");
        }
        
        if (record.getItemSupFlag() != null) {
            SET("item_sup_flag = #{itemSupFlag,jdbcType=CHAR}");
        }
        
        if (record.getSupLyRate() != null) {
            SET("sup_ly_rate = #{supLyRate,jdbcType=NUMERIC}");
        }
        
        if (record.getFlag() != null) {
            SET("flag = #{flag,jdbcType=CHAR}");
        }
        
        if (record.getOfflineFlag() != null) {
            SET("offline_flag = #{offlineFlag,jdbcType=CHAR}");
        }
        
        if (record.getDcQty() != null) {
            SET("dc_qty = #{dcQty,jdbcType=DECIMAL}");
        }
        
        if (record.getDcAmt() != null) {
            SET("dc_amt = #{dcAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getKbQty() != null) {
            SET("kb_qty = #{kbQty,jdbcType=NUMERIC}");
        }
        
        if (record.getKbAmt() != null) {
            SET("kb_amt = #{kbAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getKbQty2() != null) {
            SET("kb_qty2 = #{kbQty2,jdbcType=NUMERIC}");
        }
        
        if (record.getKbAmt2() != null) {
            SET("kb_amt2 = #{kbAmt2,jdbcType=NUMERIC}");
        }
        
        if (record.getPurchaseTax() != null) {
            SET("purchase_tax = #{purchaseTax,jdbcType=DECIMAL}");
        }
        
        if (record.getSaleTax() != null) {
            SET("sale_tax = #{saleTax,jdbcType=DECIMAL}");
        }
        
        if (record.getCsAmt() != null) {
            SET("cs_amt = #{csAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getCsQty() != null) {
            SET("cs_qty = #{csQty,jdbcType=NUMERIC}");
        }
        
        WHERE("item_no = #{itemNo,jdbcType=VARCHAR}");
        WHERE("oper_date = #{operDate,jdbcType=CHAR}");
        WHERE("branch_no = #{branchNo,jdbcType=VARCHAR}");
        
        return SQL();
    }
}