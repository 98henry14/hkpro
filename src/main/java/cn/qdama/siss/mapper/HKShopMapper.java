package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.ItemInfo;
import cn.qdama.siss.bean.PMDetail;
import cn.qdama.siss.bean.PredictResults;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HKShopMapper {
    /**
     * 獲取當天的預測值
     * @param order_date
     * @return
     */
    @Select({"select     order_date," ,
            "            right(sell_SKU_number,5) as sellSKUNumber," ,
            "            sell_SKU_predict, " ,
            "            RIGHT(order_SKU_number,5) as orderSKUNumber," ,
            "            order_predict " ,
            "from HK_shop.dbo.results_predict " ,
            "where order_date=#{order_date}"})
    List<PredictResults> getTodayPredict(String order_date);

    /**
     * 獲取的不重複的預測值
     * @param order_date
     * @return
     */
    @Select({"select DISTINCT(order_predict) from HK_shop.dbo.results_predict " ,
            "where order_date=#{order_date}"})
    List<Integer> getS1Value(String order_date);

    /**
     * 将预测值设置到系统中，烧腊不应该推
     * @param branch_no
     * @return
     */
    @Select({"SELECT " ,
            "flow_id =null," ,
            "sheet_no =null," ,
            "b.item_no," ,
            "c.item_name," ,
            "ROW_NUMBER() over (order by b.item_no) as row_id," ,
            "order_qty=0.0000," ,
            "CAST(a.order_predict*c.purchase_spec as NUMERIC(10,4)) as real_qty," , //预测数量，必须直接*进货规格
            "CAST(a.order_predict as NUMERIC (10,4)) as large_qty," ,               //预测箱数
            "send_qty=0.0000," ,
            "orgi_price=0.0000," ,
            "b.price as valid_price," ,
            "CAST(a.order_predict * c.purchase_spec * b.price as NUMERIC(10,4)) as sub_amt," ,
            "tax=0.0000," ,
            "b.sale_price," ,
            "come_num =0.0000," ,
            "memo='建议值下发'," ,
            "product_date=null," ,
            "item_barcode=null," ,
            "valid_date=null," ,
            "licence =null," ,
            "domestic_qty =null," ,
            "domestic_price =null," ,
            "domestic_amt=null" ,
            "FROM HK_shop.dbo.results_predict a" ,
            " left JOIN [dbo].[t_pc_branch_price] b on b.item_no = RIGHT(a.order_SKU_number,5) " ,
            "LEFT JOIN dbo.t_bd_item_info c on c.item_no=RIGHT(a.order_SKU_number,5) " ,
            "where a.order_date=CONVERT(VARCHAR(10),GETDATE(),23) " ,
                    "   and c.main_supcust not in ('HK0024','HK0022') " ,   //排除烧腊两家供应商
                    "   and c.item_clsno not like '0101%' " ,               //排除猪肉类及箱装鸡蛋类
                    "   and c.item_no not in ('40200','40201','40204') " ,
                    "   and b.branch_no = #{branch_no,jdbcType=VARCHAR}" })
    List<PMDetail> getPredictDeatil(String branch_no);


}
