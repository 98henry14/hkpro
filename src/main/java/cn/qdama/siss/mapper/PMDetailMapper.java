package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.PMDetail;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.BigDecimalTypeHandler;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface PMDetailMapper {
    @Delete({
        "delete from t_pm_sheet_detail",
        "where flow_id = #{flowId,jdbcType=NUMERIC}"
    })
    int deleteByPrimaryKey(Long flowId);

    @Insert({
        "insert into t_pm_sheet_detail (flow_id, sheet_no, ",
        "item_no, row_id, order_qty, ",
        "large_qty, real_qty, ",
        "send_qty, orgi_price, ",
        "valid_price, sub_amt, ",
        "tax, sale_price, ",
        "come_num, memo, produce_date, ",
        "item_barcode, valid_date, ",
        "licence, domestic_qty, ",
        "domestic_price, domestic_amt)",
        "values (#{flowId,jdbcType=NUMERIC}, #{sheetNo,jdbcType=VARCHAR}, ",
        "#{itemNo,jdbcType=VARCHAR}, #{rowId,jdbcType=NUMERIC}, #{orderQty,jdbcType=NUMERIC}, ",
        "#{largeQty,jdbcType=NUMERIC}, #{realQty,jdbcType=NUMERIC}, ",
        "#{sendQty,jdbcType=NUMERIC}, #{orgiPrice,jdbcType=NUMERIC}, ",
        "#{validPrice,jdbcType=NUMERIC}, #{subAmt,jdbcType=NUMERIC}, ",
        "#{tax,jdbcType=NUMERIC}, #{salePrice,jdbcType=NUMERIC}, ",
        "#{comeNum,jdbcType=NUMERIC}, #{memo,jdbcType=VARCHAR}, #{produceDate,jdbcType=TIMESTAMP}, ",
        "#{itemBarcode,jdbcType=VARCHAR}, #{validDate,jdbcType=TIMESTAMP}, ",
        "#{licence,jdbcType=VARCHAR}, #{domesticQty,jdbcType=NUMERIC}, ",
        "#{domesticPrice,jdbcType=NUMERIC}, #{domesticAmt,jdbcType=NUMERIC})"
    })
    @SelectKey(before = false,keyProperty = "flowId",resultType = Long.class,statement = {"select @@IDENTITY"})
    int insert(PMDetail record);

    @Insert({
            "insert into t_pm_sheet_detail (sheet_no, ",
            "item_no, row_id, order_qty, ",
            "large_qty, real_qty, ",
            "send_qty, orgi_price, ",
            "valid_price, sub_amt, ",
            "tax, sale_price, ",
            "come_num, memo, produce_date, ",
            "item_barcode, valid_date, ",
            "licence, domestic_qty, ",
            "domestic_price, domestic_amt)",
            "values (#{sheetNo,jdbcType=VARCHAR}, ",
            "#{itemNo,jdbcType=VARCHAR}, #{rowId,jdbcType=NUMERIC}, #{orderQty,jdbcType=NUMERIC}, ",
            "#{largeQty,jdbcType=NUMERIC}, #{realQty,jdbcType=NUMERIC}, ",
            "#{sendQty,jdbcType=NUMERIC}, #{orgiPrice,jdbcType=NUMERIC}, ",
            "#{validPrice,jdbcType=NUMERIC}, #{subAmt,jdbcType=NUMERIC}, ",
            "#{tax,jdbcType=NUMERIC}, #{salePrice,jdbcType=NUMERIC}, ",
            "#{comeNum,jdbcType=NUMERIC}, #{memo,jdbcType=VARCHAR}, #{produceDate,jdbcType=TIMESTAMP}, ",
            "#{itemBarcode,jdbcType=VARCHAR}, #{validDate,jdbcType=TIMESTAMP}, ",
            "#{licence,jdbcType=VARCHAR}, #{domesticQty,jdbcType=NUMERIC}, ",
            "#{domesticPrice,jdbcType=NUMERIC}, #{domesticAmt,jdbcType=NUMERIC})"
    })
    int insertOBJ(PMDetail record);

    @Select({
        "select",
        "flow_id, sheet_no, item_no, row_id, order_qty, large_qty, real_qty, send_qty, ",
        "orgi_price, valid_price, sub_amt, tax, sale_price, come_num, memo, produce_date, ",
        "item_barcode, valid_date, licence, domestic_qty, domestic_price, domestic_amt",
        "from t_pm_sheet_detail",
        "where flow_id = #{flowId,jdbcType=NUMERIC}"
    })
    @Results({
        @Result(column="flow_id", property="flowId", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="sheet_no", property="sheetNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_no", property="itemNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="row_id", property="rowId", jdbcType=JdbcType.NUMERIC),
        @Result(column="order_qty", property="orderQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="large_qty", property="largeQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="real_qty", property="realQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="send_qty", property="sendQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="orgi_price", property="orgiPrice", jdbcType=JdbcType.NUMERIC),
        @Result(column="valid_price", property="validPrice", jdbcType=JdbcType.NUMERIC),
        @Result(column="sub_amt", property="subAmt", jdbcType=JdbcType.NUMERIC),
        @Result(column="tax", property="tax", jdbcType=JdbcType.NUMERIC),
        @Result(column="sale_price", property="salePrice", jdbcType=JdbcType.NUMERIC),
        @Result(column="come_num", property="comeNum", jdbcType=JdbcType.NUMERIC),
        @Result(column="memo", property="memo", jdbcType=JdbcType.VARCHAR),
        @Result(column="produce_date", property="produceDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="item_barcode", property="itemBarcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="valid_date", property="validDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="licence", property="licence", jdbcType=JdbcType.VARCHAR),
        @Result(column="domestic_qty", property="domesticQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="domestic_price", property="domesticPrice", jdbcType=JdbcType.NUMERIC),
        @Result(column="domestic_amt", property="domesticAmt", jdbcType=JdbcType.NUMERIC)
    })
    PMDetail selectByPrimaryKey(Long flowId);

    @Select({
        "select",
        "flow_id, sheet_no, item_no, row_id, order_qty, large_qty, real_qty, send_qty, ",
        "orgi_price, valid_price, sub_amt, tax, sale_price, come_num, memo, produce_date, ",
        "item_barcode, valid_date, licence, domestic_qty, domestic_price, domestic_amt",
        "from t_pm_sheet_detail"
    })
    @Results({
        @Result(column="flow_id", property="flowId", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="sheet_no", property="sheetNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_no", property="itemNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="row_id", property="rowId", jdbcType=JdbcType.NUMERIC),
        @Result(column="order_qty", property="orderQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="large_qty", property="largeQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="real_qty", property="realQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="send_qty", property="sendQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="orgi_price", property="orgiPrice", jdbcType=JdbcType.NUMERIC),
        @Result(column="valid_price", property="validPrice", jdbcType=JdbcType.NUMERIC),
        @Result(column="sub_amt", property="subAmt", jdbcType=JdbcType.NUMERIC),
        @Result(column="tax", property="tax", jdbcType=JdbcType.NUMERIC),
        @Result(column="sale_price", property="salePrice", jdbcType=JdbcType.NUMERIC),
        @Result(column="come_num", property="comeNum", jdbcType=JdbcType.NUMERIC),
        @Result(column="memo", property="memo", jdbcType=JdbcType.VARCHAR),
        @Result(column="produce_date", property="produceDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="item_barcode", property="itemBarcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="valid_date", property="validDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="licence", property="licence", jdbcType=JdbcType.VARCHAR),
        @Result(column="domestic_qty", property="domesticQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="domestic_price", property="domesticPrice", jdbcType=JdbcType.NUMERIC),
        @Result(column="domestic_amt", property="domesticAmt", jdbcType=JdbcType.NUMERIC)
    })
    List<PMDetail> selectAll();

    @Update({
        "update t_pm_sheet_detail",
        "set sheet_no = #{sheetNo,jdbcType=VARCHAR},",
          "item_no = #{itemNo,jdbcType=VARCHAR},",
          "row_id = #{rowId,jdbcType=NUMERIC},",
          "order_qty = #{orderQty,jdbcType=NUMERIC},",
          "large_qty = #{largeQty,jdbcType=NUMERIC},",
          "real_qty = #{realQty,jdbcType=NUMERIC},",
          "send_qty = #{sendQty,jdbcType=NUMERIC},",
          "orgi_price = #{orgiPrice,jdbcType=NUMERIC},",
          "valid_price = #{validPrice,jdbcType=NUMERIC},",
          "sub_amt = #{subAmt,jdbcType=NUMERIC},",
          "tax = #{tax,jdbcType=NUMERIC},",
          "sale_price = #{salePrice,jdbcType=NUMERIC},",
          "come_num = #{comeNum,jdbcType=NUMERIC},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "produce_date = #{produceDate,jdbcType=TIMESTAMP},",
          "item_barcode = #{itemBarcode,jdbcType=VARCHAR},",
          "valid_date = #{validDate,jdbcType=TIMESTAMP},",
          "licence = #{licence,jdbcType=VARCHAR},",
          "domestic_qty = #{domesticQty,jdbcType=NUMERIC},",
          "domestic_price = #{domesticPrice,jdbcType=NUMERIC},",
          "domestic_amt = #{domesticAmt,jdbcType=NUMERIC}",
        "where flow_id = #{flowId,jdbcType=NUMERIC}"
    })
    int updateByPrimaryKey(PMDetail record);

    /**
     * 获取单据总金额
     * @param sheetNo
     * @return
     */
    @Select("select sum(sub_amt) from t_pm_sheet_detail where sheet_no =#{sheetNo}")
    BigDecimal getSheetTotalAmt(String sheetNo);

}