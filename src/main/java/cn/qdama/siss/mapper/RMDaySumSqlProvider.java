package cn.qdama.siss.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.qdama.siss.bean.RMDaySum;

public class RMDaySumSqlProvider {

    public String insertSelective(RMDaySum record) {
        BEGIN();
        INSERT_INTO("t_rm_daysum");
        
        if (record.getItemNo() != null) {
            VALUES("item_no", "#{itemNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOperDate() != null) {
            VALUES("oper_date", "#{operDate,jdbcType=CHAR}");
        }
        
        if (record.getBranchNo() != null) {
            VALUES("branch_no", "#{branchNo,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleQty() != null) {
            VALUES("sale_qty", "#{saleQty,jdbcType=NUMERIC}");
        }
        
        if (record.getRetQty() != null) {
            VALUES("ret_qty", "#{retQty,jdbcType=NUMERIC}");
        }
        
        if (record.getGivQty() != null) {
            VALUES("giv_qty", "#{givQty,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleAmt() != null) {
            VALUES("sale_amt", "#{saleAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getRetAmt() != null) {
            VALUES("ret_amt", "#{retAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getGivAmt() != null) {
            VALUES("giv_amt", "#{givAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSalePrice() != null) {
            VALUES("sale_price", "#{salePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getPreQty() != null) {
            VALUES("pre_qty", "#{preQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPreAmt() != null) {
            VALUES("pre_amt", "#{preAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getDctAmount() != null) {
            VALUES("dct_amount", "#{dctAmount,jdbcType=NUMERIC}");
        }
        
        if (record.getCostPrice() != null) {
            VALUES("cost_price", "#{costPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getMemo() != null) {
            VALUES("memo", "#{memo,jdbcType=VARCHAR}");
        }
        
        if (record.getComFlag() != null) {
            VALUES("com_flag", "#{comFlag,jdbcType=CHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(RMDaySum record) {
        BEGIN();
        UPDATE("t_rm_daysum");
        
        if (record.getSaleQty() != null) {
            SET("sale_qty = #{saleQty,jdbcType=NUMERIC}");
        }
        
        if (record.getRetQty() != null) {
            SET("ret_qty = #{retQty,jdbcType=NUMERIC}");
        }
        
        if (record.getGivQty() != null) {
            SET("giv_qty = #{givQty,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleAmt() != null) {
            SET("sale_amt = #{saleAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getRetAmt() != null) {
            SET("ret_amt = #{retAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getGivAmt() != null) {
            SET("giv_amt = #{givAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSalePrice() != null) {
            SET("sale_price = #{salePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getPreQty() != null) {
            SET("pre_qty = #{preQty,jdbcType=NUMERIC}");
        }
        
        if (record.getPreAmt() != null) {
            SET("pre_amt = #{preAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getDctAmount() != null) {
            SET("dct_amount = #{dctAmount,jdbcType=NUMERIC}");
        }
        
        if (record.getCostPrice() != null) {
            SET("cost_price = #{costPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getMemo() != null) {
            SET("memo = #{memo,jdbcType=VARCHAR}");
        }
        
        if (record.getComFlag() != null) {
            SET("com_flag = #{comFlag,jdbcType=CHAR}");
        }
        
        WHERE("item_no = #{itemNo,jdbcType=VARCHAR}");
        WHERE("oper_date = #{operDate,jdbcType=CHAR}");
        WHERE("branch_no = #{branchNo,jdbcType=VARCHAR}");
        
        return SQL();
    }
}