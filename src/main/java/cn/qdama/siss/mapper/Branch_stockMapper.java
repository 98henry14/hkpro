package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.Branch_stock;
import cn.qdama.siss.bean.Branch_stockExample;
import cn.qdama.siss.bean.Branch_stockKey;
import cn.qdama.siss.bean.Detail4im;
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
    //查询猪肉类库存汇总，将猪肉类库存总数作为全壳数量
    @Select({"select SUM(stock_qty) from t_im_branch_stock a ",
            "LEFT JOIN t_bd_item_info b on a.item_no = b.item_no ",
            "LEFT JOIN t_pc_branch_price c on LEFT(a.branch_no,4)=c.branch_no and a.item_no=c.item_no ",
            "where a.branch_no='100101'  and b.sale_flag<>2 and b.item_clsno like '0101__' "})
    double selectMeatMinusStock();

    @Select({
            "SELECT  " ,
            "        [flow_id]=null ,  " ,
            "        [order_qty]=null,  " ,
            "        [large_qty] =  case when '9996' <> '1001' then  " ,
            "                        case '0'  " ,
            "                        when '1'    " ,
            "                        then  " ,
            "                        case '1'  when '1' then  (CASE WHEN i.purchase_spec = 1 or i.purchase_spec <= 0 THEN s.stock_qty ELSE CONVERT(NUMERIC(16,4),s.stock_qty / i.purchase_spec) END)  " ,
            "                                                when '0' then 0 end   " ,
            "                        when '0' " ,
            "                        then     " ,
            "                                case when left(s.branch_no,4) = '0000'  " ,
            "                                then  case '1'  when '1' then  (CASE WHEN i.purchase_spec = 1 or i.purchase_spec <= 0 THEN s.stock_qty ELSE CONVERT(NUMERIC(16,4),s.stock_qty / i.purchase_spec) END)   " ,
            "                                                when '0' then 0 end   " ,
            "                                else   case '1' when '1' then  (CASE WHEN i.purchase_spec = 1 or i.purchase_spec <= 0 THEN s.stock_qty ELSE CONVERT(NUMERIC(16,4),s.stock_qty / i.purchase_spec) END)   " ,
            "                                                when '0' then 0 end   " ,
            "                                end  " ,
            "                        end  " ,
            "                    else  (CASE WHEN i.purchase_spec = 1 or i.purchase_spec <= 0 THEN s.stock_qty ELSE CONVERT(NUMERIC(16,4),s.stock_qty / i.purchase_spec) END)  " ,
            "                    end,  " ,
            "     [orgi_price]=null,  " ,
            "     [valid_price] = (case when '0' = '8' and '0' = '1' and info.trade_type <> '8'    " ,
            "         then CONVERT(NUMERIC(16,4),0) else s.avg_cost end),  " ,
            "     [sale_price]=bp.sale_price,  " ,
            "     [tax]=0,   " ,
            "     [valid_date]=null,   " ,
            "     [other1]=null,   " ,
            "     [other2]=null,   " ,
            "     [other3]=null,   " ,
            "     [num1]=null,   " ,
            "     [num2]=null,   " ,
            "     [num3]=null,   " ,
            "     [memo]='来自系统的自动插入',   " ,
            "     [item_barcode]=null,   " ,
            "     [produce_date]=null,      " ,
            "                    [item_no] = s.item_no,  " ,
            "                    [real_qty] = s.stock_qty, " ,
            "                    [sub_amt] = s.stock_qty*(case when '0' = '8'   " ,
            "                                                        and '0' = '1' and info.trade_type <> '8'  then CONVERT(NUMERIC(16,4),0) else s.avg_cost end),  " ,
            "                    [row_id]=ROW_NUMBER() over (order by s.item_no) ,   " ,
            "     [sheet_no]=(select sheet_id+left(branch_no,4)+CONVERT(nvarchar(50),last_time,12)+RIGHT('0000'+CAST(sheet_value as nvarchar(50)),4) as sheet_no   " ,
            "        from [t_sys_sheetno_flow]   " ,
            "        WHERE ([sheet_id] = 'DC') AND ('DC' IS NOT NULL) AND ([branch_no] = '0000')   " ,
            "        AND ('0000' IS NOT NULL))  " ,
            "FROM t_im_branch_stock s with(nolock)" ,
            "LEFT JOIN  " ,
            "      (  " ,
            "       SELECT t.branch_no, t.item_no, convert(numeric(16,4),sum(jcqty)) as jcstock_qty FROM  " ,
            "       (  " ,
            "       SELECT a.branch_no, a.item_no, limit_qty - isnull(real_qty,0) as jcqty  " ,
            "       FROM t_rm_tend_luggage_info a WHERE NOT EXISTS(SELECT 1 FROM t_bd_item_combsplit b WHERE a.item_no = b.item_no)  " ,
            "        and stock_flag='1' and sell_way='A'  " ,
            "       UNION ALL  " ,
            "       SELECT a.branch_no, a.item_no, limit_qty - isnull(real_qty,0) as jcqty  " ,
            "       FROM t_rm_tend_luggage_info a INNER JOIN t_bd_item_info b ON b.item_no = a.item_no   " ,
            "               LEFT JOIN t_bd_item_combsplit c ON b.item_no = c.item_no  " ,
            "               INNER JOIN t_bd_item_info d ON d.item_no = c.comb_item_no AND d.combine_sta = '1' where sell_way='A'  " ,
            "      UNION ALL  " ,
            "       SELECT a.branch_no, c.comb_item_no as item_no, (limit_qty - isnull(real_qty,0)) / (case when c.item_qty > 0 then c.item_qty ELSE 1 END) as jcqty  " ,
            "       FROM t_rm_tend_luggage_info a INNER JOIN t_bd_item_info b ON b.item_no = a.item_no   " ,
            "               LEFT JOIN t_bd_item_combsplit c ON b.item_no = c.item_no  " ,
            "               INNER JOIN t_bd_item_info d ON d.item_no = c.comb_item_no AND d.combine_sta = '4' where sell_way='A'  " ,
            "      UNION ALL  " ,
            "      SELECT a.branch_no, c.item_no as item_no, (limit_qty - isnull(real_qty,0)) * (case when c.item_qty > 0 then c.item_qty ELSE 1 END) as jcqty  " ,
            "       FROM t_rm_tend_luggage_info a INNER JOIN t_bd_item_element c ON c.comb_item_no = a.item_no AND c.branch_no = LEFT(a.branch_no,4) where sell_way='A'  " ,
            "      ) t  " ,
            "       GROUP by branch_no, item_no  " ,
            "     ) jc ON s.item_no = jc.item_no AND s.branch_no = jc.branch_no AND jc.jcstock_qty <> 0  " ,
            "                    INNER JOIN t_bd_item_info i ON s.item_no = i.item_no  " ,
            "     INNER JOIN t_bd_branch_info info ON info.branch_no=left(s.branch_no,4)   " ,
            "     left join t_pc_branch_price bp on bp.branch_no=left(s.branch_no,4) and bp.item_no =s.item_no  " ,
            "     LEFT JOIN t_bd_item_cls c ON  c.item_clsno = i.item_clsno   " ,
            "     LEFT JOIN t_bd_item_brand b ON b.item_brand = i.item_brand  " ,
            "     LEFT JOIN t_bd_supcust_info sup ON sup.supcust_no = i.main_supcust AND sup.supcust_flag = 'S'  " ,
            "      WHERE i.item_stock = '1'  AND s.branch_no LIKE #{branchNo} AND s.stock_qty > 0 " ,
            "      AND s.item_no not in ('40232','41059','40045')  " ,
            "      AND (s.stock_qty <> 0 or jc.jcstock_qty <> 0)    " ,
            "      AND i.sale_flag <> '2'   and info.branch_header='0000' and info.trade_type!='1'" ,
            "      AND (left(c.item_clsno,2) IN('01','02','03','04','05','07','LB')   " ,
            "      OR left(c.item_clsno,1) IN('01','02','03','04','05','07','LB'))   " ,
            "      order by s.item_no "
    })
    List<Detail4im> getMDDayClean(String branchNo);    //'100101%'
    /**
     * AND s.item_no not in ('40232','41059','40045')
     * 上述语句需排除物料及半壳
     */
}