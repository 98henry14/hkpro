package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.Detail4im;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.List;
@Mapper
public interface Detail4imMapper {
    @Delete({
        "delete from t_im_sheet_detail",
        "where flow_id = #{flowId,jdbcType=NUMERIC}"
    })
    int deleteByPrimaryKey(Long flowId);

    @Insert({
        "insert into t_im_sheet_detail (flow_id, sheet_no, ",
        "item_no, order_qty, real_qty, ",
        "large_qty, orgi_price, ",
        "valid_price, sub_amt, ",
        "sale_price, tax, ",
        "valid_date, other1, ",
        "other2, other3, ",
        "num1, num2, num3, ",
        "memo, produce_date, ",
        "row_id, item_barcode)",
        "values (#{flowId,jdbcType=NUMERIC}, #{sheetNo,jdbcType=CHAR}, ",
        "#{itemNo,jdbcType=CHAR}, #{orderQty,jdbcType=NUMERIC}, #{realQty,jdbcType=NUMERIC}, ",
        "#{largeQty,jdbcType=NUMERIC}, #{orgiPrice,jdbcType=NUMERIC}, ",
        "#{validPrice,jdbcType=NUMERIC}, #{subAmt,jdbcType=NUMERIC}, ",
        "#{salePrice,jdbcType=NUMERIC}, #{tax,jdbcType=NUMERIC}, ",
        "#{validDate,jdbcType=TIMESTAMP}, #{other1,jdbcType=VARCHAR}, ",
        "#{other2,jdbcType=VARCHAR}, #{other3,jdbcType=VARCHAR}, ",
        "#{num1,jdbcType=NUMERIC}, #{num2,jdbcType=NUMERIC}, #{num3,jdbcType=NUMERIC}, ",
        "#{memo,jdbcType=VARCHAR}, #{produceDate,jdbcType=TIMESTAMP}, ",
        "#{rowId,jdbcType=NUMERIC}, #{itemBarcode,jdbcType=VARCHAR})"
    })
    int insert(Detail4im record);

    @Insert({
            "insert into t_im_sheet_detail (sheet_no, ",
            "item_no, order_qty, real_qty, ",
            "large_qty, orgi_price, ",
            "valid_price, sub_amt, ",
            "sale_price, tax, ",
            "valid_date, other1, ",
            "other2, other3, ",
            "num1, num2, num3, ",
            "memo, produce_date, ",
            "row_id, item_barcode)",
            "values (#{sheetNo,jdbcType=CHAR}, ",
            "#{itemNo,jdbcType=CHAR}, #{orderQty,jdbcType=NUMERIC}, #{realQty,jdbcType=NUMERIC}, ",
            "#{largeQty,jdbcType=NUMERIC}, #{orgiPrice,jdbcType=NUMERIC}, ",
            "#{validPrice,jdbcType=NUMERIC}, #{subAmt,jdbcType=NUMERIC}, ",
            "#{salePrice,jdbcType=NUMERIC}, #{tax,jdbcType=NUMERIC}, ",
            "#{validDate,jdbcType=TIMESTAMP}, #{other1,jdbcType=VARCHAR}, ",
            "#{other2,jdbcType=VARCHAR}, #{other3,jdbcType=VARCHAR}, ",
            "#{num1,jdbcType=NUMERIC}, #{num2,jdbcType=NUMERIC}, #{num3,jdbcType=NUMERIC}, ",
            "#{memo,jdbcType=VARCHAR}, #{produceDate,jdbcType=TIMESTAMP}, ",
            "#{rowId,jdbcType=NUMERIC}, #{itemBarcode,jdbcType=VARCHAR})"
    })
    @SelectKey(before = false,keyProperty = "flowId",resultType = Long.class,statement = {"select @@IDENTITY"})
    int insertAuto(Detail4im record);

    @InsertProvider(type=Detail4imSqlProvider.class, method="insertSelective")
    int insertSelective(Detail4im record);

    @Select({
        "select",
        "flow_id, sheet_no, item_no, order_qty, real_qty, large_qty, orgi_price, valid_price, ",
        "sub_amt, sale_price, tax, valid_date, other1, other2, other3, num1, num2, num3, ",
        "memo, produce_date, row_id, item_barcode",
        "from t_im_sheet_detail",
        "where flow_id = #{flowId,jdbcType=NUMERIC}"
    })
    Detail4im selectByPrimaryKey(Long flowId);

    @Select({
            "select ",
            "flow_id, sheet_no, item_no, order_qty, real_qty, large_qty, orgi_price, valid_price, ",
            "sub_amt, sale_price, tax, valid_date, other1, other2, other3, num1, num2, num3, ",
            "memo, produce_date, row_id, item_barcode",
            "from t_im_sheet_detail",
            "where sheet_no = #{sheetNo,jdbcType=CHAR}"
    })
    List<Detail4im> selectListBySheetNo(String sheetNo);



    //c
    @Select({
            "select ",
            "flow_id, sheet_no, item_no, order_qty, real_qty, large_qty, orgi_price, valid_price, ",
            "sub_amt, sale_price, tax, valid_date, other1, other2, other3, num1, num2, num3, ",
            "memo, produce_date, row_id, item_barcode ",
            "from t_im_sheet_detail ",
            "where sheet_no like #{sheetNo}"
    })
    List<Detail4im> selectListLikeSheetNo(String sheetNo);

    @UpdateProvider(type=Detail4imSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Detail4im record);

    @Update({
        "update t_im_sheet_detail",
        "set sheet_no = #{sheetNo,jdbcType=CHAR},",
          "item_no = #{itemNo,jdbcType=CHAR},",
          "order_qty = #{orderQty,jdbcType=NUMERIC},",
          "real_qty = #{realQty,jdbcType=NUMERIC},",
          "large_qty = #{largeQty,jdbcType=NUMERIC},",
          "orgi_price = #{orgiPrice,jdbcType=NUMERIC},",
          "valid_price = #{validPrice,jdbcType=NUMERIC},",
          "sub_amt = #{subAmt,jdbcType=NUMERIC},",
          "sale_price = #{salePrice,jdbcType=NUMERIC},",
          "tax = #{tax,jdbcType=NUMERIC},",
          "valid_date = #{validDate,jdbcType=TIMESTAMP},",
          "other1 = #{other1,jdbcType=VARCHAR},",
          "other2 = #{other2,jdbcType=VARCHAR},",
          "other3 = #{other3,jdbcType=VARCHAR},",
          "num1 = #{num1,jdbcType=NUMERIC},",
          "num2 = #{num2,jdbcType=NUMERIC},",
          "num3 = #{num3,jdbcType=NUMERIC},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "produce_date = #{produceDate,jdbcType=TIMESTAMP},",
          "row_id = #{rowId,jdbcType=NUMERIC},",
          "item_barcode = #{itemBarcode,jdbcType=VARCHAR}",
        "where flow_id = #{flowId,jdbcType=NUMERIC}"
    })
    int updateByPrimaryKey(Detail4im record);

    /**
     * 获取单据金额
     * @param sheetNo
     * @return
     */
    @Select({"select sum(sub_amt) from t_im_sheet_detail " +
            "where sheet_no = #{sheetNo,jdbcType=CHAR}"})
    BigDecimal getSub_amt(String sheetNo);
}