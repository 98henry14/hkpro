package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.Branch_stock;
import cn.qdama.siss.bean.Branch_stockExample;
import cn.qdama.siss.bean.Branch_stockKey;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface Branch_stockMapper {
    @Delete({
        "delete from t_im_branch_stock",
        "where item_no = #{itemNo,jdbcType=VARCHAR}",
          "and branch_no = #{branchNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(Branch_stockKey key);

    @Insert({
        "insert into t_im_branch_stock (item_no, branch_no, ",
        "stock_qty, route_qty, ",
        "avg_cost, cost_amt, ",
        "last_inprice, last_baseprice, ",
        "min_qty, max_qty, ",
        "acc_qty, oper_date, ",
        "com_flag)",
        "values (#{itemNo,jdbcType=VARCHAR}, #{branchNo,jdbcType=VARCHAR}, ",
        "#{stockQty,jdbcType=NUMERIC}, #{routeQty,jdbcType=NUMERIC}, ",
        "#{avgCost,jdbcType=NUMERIC}, #{costAmt,jdbcType=NUMERIC}, ",
        "#{lastInprice,jdbcType=NUMERIC}, #{lastBaseprice,jdbcType=NUMERIC}, ",
        "#{minQty,jdbcType=NUMERIC}, #{maxQty,jdbcType=NUMERIC}, ",
        "#{accQty,jdbcType=DECIMAL}, #{operDate,jdbcType=TIMESTAMP}, ",
        "#{comFlag,jdbcType=CHAR})"
    })
    int insert(Branch_stock record);

    @InsertProvider(type=Branch_stockSqlProvider.class, method="insertSelective")
    int insertSelective(Branch_stock record);

    @SelectProvider(type=Branch_stockSqlProvider.class, method="selectByExample")
    List<Branch_stock> selectByExample(Branch_stockExample example);

    @Select({
        "select",
        "item_no, branch_no, stock_qty, route_qty, avg_cost, cost_amt, last_inprice, ",
        "last_baseprice, min_qty, max_qty, acc_qty, oper_date, com_flag",
        "from t_im_branch_stock",
        "where item_no = #{itemNo,jdbcType=VARCHAR}",
          "and branch_no = #{branchNo,jdbcType=VARCHAR}"
    })
    Branch_stock selectByPrimaryKey(Branch_stockKey key);
    @UpdateProvider(type=Branch_stockSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Branch_stock record);

    @Update({
        "update t_im_branch_stock",
        "set stock_qty = #{stockQty,jdbcType=NUMERIC},",
          "route_qty = #{routeQty,jdbcType=NUMERIC},",
          "avg_cost = #{avgCost,jdbcType=NUMERIC},",
          "cost_amt = #{costAmt,jdbcType=NUMERIC},",
          "last_inprice = #{lastInprice,jdbcType=NUMERIC},",
          "last_baseprice = #{lastBaseprice,jdbcType=NUMERIC},",
          "min_qty = #{minQty,jdbcType=NUMERIC},",
          "max_qty = #{maxQty,jdbcType=NUMERIC},",
          "acc_qty = #{accQty,jdbcType=DECIMAL},",
          "oper_date = #{operDate,jdbcType=TIMESTAMP},",
          "com_flag = #{comFlag,jdbcType=CHAR}",
        "where item_no = #{itemNo,jdbcType=VARCHAR}",
          "and branch_no = #{branchNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Branch_stock record);
}