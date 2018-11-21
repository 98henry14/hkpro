package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.Branch_stock;
import cn.qdama.siss.bean.Branch_stockExample;
import cn.qdama.siss.bean.Branch_stockKey;
import java.util.List;

import cn.qdama.siss.bean.Detail4im;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
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
    //查询门店负库存
    @Select({"select a.item_no," ,
            "a.avg_cost as valid_price," ,
            "ABS(a.stock_qty/b.purchase_spec) as large_qty," ,
            "ABS(a.stock_qty) as real_qty," ,
            "ABS(a.cost_amt) as sub_amt," ,
            "c.sale_price ," ,
            "row_number() OVER (ORDER by a.item_no) as row_id",
            "from t_im_branch_stock a " ,
            "LEFT JOIN t_bd_item_info b on a.item_no = b.item_no " ,
            "LEFT JOIN t_pc_branch_price c on LEFT(a.branch_no,4)=c.branch_no and a.item_no=c.item_no " ,
            "where a.branch_no='100101' and a.stock_qty <0 and b.sale_flag<>2"})
    List<Detail4im> selectMinusStock();
    //查询门店正库存
    @Select({"select a.item_no," ,
            "a.avg_cost as valid_price," ,
            "ABS(a.stock_qty/b.purchase_spec) as large_qty," ,
            "ABS(a.stock_qty) as real_qty," ,
            "ABS(a.cost_amt) as sub_amt," ,
            "c.sale_price ," ,
            "row_number() OVER (ORDER by a.item_no) as row_id",
            "from t_im_branch_stock a " ,
            "LEFT JOIN t_bd_item_info b on a.item_no = b.item_no " ,
            "LEFT JOIN t_pc_branch_price c on LEFT(a.branch_no,4)=c.branch_no and a.item_no=c.item_no " ,
            "where a.branch_no='100101' and a.stock_qty >0 and b.sale_flag<>2"})
    List<Detail4im> selectPositiveStock();
    //查询猪肉类负库存汇总，
}