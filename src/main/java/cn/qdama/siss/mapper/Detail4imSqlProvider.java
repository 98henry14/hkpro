package cn.qdama.siss.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.qdama.siss.bean.Detail4im;

public class Detail4imSqlProvider {

    public String insertSelective(Detail4im record) {
        BEGIN();
        INSERT_INTO("t_im_sheet_detail");
        
        if (record.getFlowId() != null) {
            VALUES("flow_id", "#{flowId,jdbcType=NUMERIC}");
        }
        
        if (record.getSheetNo() != null) {
            VALUES("sheet_no", "#{sheetNo,jdbcType=VARCHAR}");
        }

        if (record.getItemNo() != null) {
            VALUES("item_no", "#{itemNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderQty() != null) {
            VALUES("order_qty", "#{orderQty,jdbcType=NUMERIC}");
        }
        
        if (record.getRealQty() != null) {
            VALUES("real_qty", "#{realQty,jdbcType=NUMERIC}");
        }
        
        if (record.getLargeQty() != null) {
            VALUES("large_qty", "#{largeQty,jdbcType=NUMERIC}");
        }
        
        if (record.getOrgiPrice() != null) {
            VALUES("orgi_price", "#{orgiPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getValidPrice() != null) {
            VALUES("valid_price", "#{validPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getSubAmt() != null) {
            VALUES("sub_amt", "#{subAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSalePrice() != null) {
            VALUES("sale_price", "#{salePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getTax() != null) {
            VALUES("tax", "#{tax,jdbcType=NUMERIC}");
        }
        
        if (record.getValidDate() != null) {
            VALUES("valid_date", "#{validDate,jdbcType=TIMESTAMP}");
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
        
        if (record.getNum1() != null) {
            VALUES("num1", "#{num1,jdbcType=NUMERIC}");
        }
        
        if (record.getNum2() != null) {
            VALUES("num2", "#{num2,jdbcType=NUMERIC}");
        }
        
        if (record.getNum3() != null) {
            VALUES("num3", "#{num3,jdbcType=NUMERIC}");
        }
        
        if (record.getMemo() != null) {
            VALUES("memo", "#{memo,jdbcType=VARCHAR}");
        }
        
        if (record.getProduceDate() != null) {
            VALUES("produce_date", "#{produceDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRowId() != null) {
            VALUES("row_id", "#{rowId,jdbcType=NUMERIC}");
        }
        
        if (record.getItemBarcode() != null) {
            VALUES("item_barcode", "#{itemBarcode,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Detail4im record) {
        BEGIN();
        UPDATE("t_im_sheet_detail");
        
        if (record.getSheetNo() != null) {
            SET("sheet_no = #{sheetNo,jdbcType=VARCHAR}");
        }

        if (record.getItemNo() != null) {
            SET("item_no = #{itemNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderQty() != null) {
            SET("order_qty = #{orderQty,jdbcType=NUMERIC}");
        }
        
        if (record.getRealQty() != null) {
            SET("real_qty = #{realQty,jdbcType=NUMERIC}");
        }
        
        if (record.getLargeQty() != null) {
            SET("large_qty = #{largeQty,jdbcType=NUMERIC}");
        }
        
        if (record.getOrgiPrice() != null) {
            SET("orgi_price = #{orgiPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getValidPrice() != null) {
            SET("valid_price = #{validPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getSubAmt() != null) {
            SET("sub_amt = #{subAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getSalePrice() != null) {
            SET("sale_price = #{salePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getTax() != null) {
            SET("tax = #{tax,jdbcType=NUMERIC}");
        }
        
        if (record.getValidDate() != null) {
            SET("valid_date = #{validDate,jdbcType=TIMESTAMP}");
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
        
        if (record.getNum1() != null) {
            SET("num1 = #{num1,jdbcType=NUMERIC}");
        }
        
        if (record.getNum2() != null) {
            SET("num2 = #{num2,jdbcType=NUMERIC}");
        }
        
        if (record.getNum3() != null) {
            SET("num3 = #{num3,jdbcType=NUMERIC}");
        }
        
        if (record.getMemo() != null) {
            SET("memo = #{memo,jdbcType=VARCHAR}");
        }
        
        if (record.getProduceDate() != null) {
            SET("produce_date = #{produceDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRowId() != null) {
            SET("row_id = #{rowId,jdbcType=NUMERIC}");
        }
        
        if (record.getItemBarcode() != null) {
            SET("item_barcode = #{itemBarcode,jdbcType=VARCHAR}");
        }
        
        WHERE("flow_id = #{flowId,jdbcType=NUMERIC}");
        
        return SQL();
    }
}