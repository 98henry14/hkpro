package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.ItemInfo;
import cn.qdama.siss.bean.PMDetail;
import cn.qdama.siss.bean.PredictResults;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HKShopMapper {

    @Select({"select     order_date," ,
            "            right(sell_SKU_number,5) as sellSKUNumber," ,
            "            sell_SKU_predict, " ,
            "            RIGHT(order_SKU_number,5) as orderSKUNumber," ,
            "            order_predict " ,
            "from HK_shop.dbo.results_predict " ,
            "where order_date=#{order_date}"})
    List<PredictResults> getTodayPredict(String order_date);


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
            "ROW_NUMBER() over (order by b.item_no) as row_id," ,
            "order_qty=0.0000," ,
            "CAST(a.sell_SKU_predict as NUMERIC(10,4)) as real_qty," ,
            "CAST(a.sell_SKU_predict/c.purchase_spec as NUMERIC (10,4)) as large_qty," ,
            "send_qty=0.0000," ,
            "orgi_price=0.0000," ,
            "b.price as valid_price," ,
            "a.sell_SKU_predict * b.price as sub_amt," ,
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
            "where a.order_date=CONVERT(VARCHAR(10),GETDATE(),23) and c.item_clsno not like '0101%' and b.branch_no=#{branch_no,jdbcType=VARCHAR}" ,
            "order by b.item_no"})
    List<PMDetail> getPredictDeatil(String branch_no);

    //以下方法不能直接更新，会有异常产生
   /* @Select({"select TOP 10 " ,
            "b.item_no ," ,
            "b.item_subno ," ,
            "b.item_name ," ,
            "b.item_subname ," ,
            "b.item_clsno ," ,
            "b.item_brand ," ,
            "b.item_brandname ," ,
            "b.unit_no ," ,
            "b.item_size ," ,
            "b.price ," ,
            "b.base_price ," ,
            "b.sale_price ," ,
            "b.vip_price ," ,
            "b.combine_sta ," ,
            "b.measure_flag ," ,
            "b.status ," ,
            "b.sale_flag ," ,
            "b.display_flag ," ,
            "b.po_cycle ," ,
            "b.so_cycle ," ,
            "b.automin_flag ," ,
            "b.en_gift ," ,
            "b.change_price ," ,
            "b.en_dis ," ,
            "b.branch_price ," ,
            "b.item_com ," ,
            "b.purchase_tax ," ,
            "b.sale_tax ," ,
            "b.purchase_spec ," ,
            "b.shipment_spec ," ,
            "b.item_supcust ," ,
            "b.main_supcust ," ,
            "b.item_sup_flag ," ,
            "b.sup_rate ," ,
            "b.item_stock ," ,
            "b.build_date ," ,
            "GETDATE() as modify_date," ,
            "b.stop_date ," ,
            "b.abc ," ,
            "b.item_rem ," ,
            "b.sale_min_price ," ,
            "b.vip_acc_flag ," ,
            "b.vip_acc_num ," ,
            "b.dpfm_type ," ,
            "b.return_rate ," ,
            "b.update_date ," ,
            "a.order_predict as pro_code1 ," ,
            "pro_code2 ='date' ," ,
            "b.pro_code3 ," ,
            "b.pro_code4 ," ,
            "b.pro_code5 ," ,
            "b.pro_code6 ," ,
            "b.scheme_price ," ,
            "b.vip_price2 ," ,
            "b.vip_price3 ," ,
            "b.vip_price4 ," ,
            "b.vip_price5 ," ,
            "b.valid_days ," ,
            "b.product_area ," ,
            "b.memo ," ,
            "b.item_picture ," ,
            "b.picture_type ," ,
            "b.base_price1 ," ,
            "b.base_price2 ," ,
            "b.base_price3 ," ,
            "b.base_price4 ," ,
            "b.base_price5 ," ,
            "b.base_price6 ," ,
            "b.base_price7 ," ,
            "b.base_price8 ," ,
            "b.new_oper_id ," ,
            " '9999' as modify_oper_id ," ,
            "b.base_sn_flag ," ,
            "b.com_flag ," ,
            "b.used_days ," ,
            "b.package_ratio ," ,
            "b.try_flag ," ,
            "b.stock_type ," ,
            "b.not_sale_days ," ,
            "b.item_englishname ," ,
            "b.first_remind ," ,
            "b.second_remind ," ,
            "b.third_remind ," ,
            "b.item_day_clear ," ,
            "b.vip_mark_percentage ," ,
            "b.time_stamp ," ,
            "b.pro_code7 ," ,
            "b.pro_code8 ," ,
            "b.pro_code9" ,
            "from HK_shop.dbo.results_predict a" ,
            "LEFT JOIN t_bd_item_info b on RIGHT(a.order_SKU_number,5)=b.item_no" ,
            "where b.item_clsno not like '0101%' and a.order_date=#{order_date}  "})
    List<ItemInfo> getPredict(String order_date);*/

}
