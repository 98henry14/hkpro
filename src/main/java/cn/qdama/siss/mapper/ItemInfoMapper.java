package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.ItemInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface ItemInfoMapper {
    @Delete({
        "delete from t_bd_item_info",
        "where item_no = #{itemNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String itemNo);

    @Insert({
        "insert into t_bd_item_info (item_no, item_subno, ",
        "item_name, item_subname, ",
        "item_clsno, item_brand, ",
        "item_brandname, unit_no, ",
        "item_size, price, ",
        "base_price, sale_price, ",
        "vip_price, combine_sta, ",
        "measure_flag, status, sale_flag, ",
        "display_flag, po_cycle, ",
        "so_cycle, automin_flag, ",
        "en_gift, change_price, en_dis, ",
        "branch_price, item_com, ",
        "purchase_tax, sale_tax, ",
        "purchase_spec, shipment_spec, ",
        "item_supcust, main_supcust, ",
        "item_sup_flag, sup_rate, ",
        "item_stock, build_date, ",
        "modify_date, stop_date, ",
        "abc, item_rem, sale_min_price, ",
        "vip_acc_flag, vip_acc_num, ",
        "dpfm_type, return_rate, ",
        "update_date, pro_code1, ",
        "pro_code2, pro_code3, ",
        "pro_code4, pro_code5, ",
        "pro_code6, scheme_price, ",
        "vip_price2, vip_price3, ",
        "vip_price4, vip_price5, ",
        "valid_days, product_area, ",
        "memo, item_picture, ",
        "picture_type, base_price1, ",
        "base_price2, base_price3, ",
        "base_price4, base_price5, ",
        "base_price6, base_price7, ",
        "base_price8, new_oper_id, ",
        "modify_oper_id, base_sn_flag, ",
        "com_flag, used_days, ",
        "package_ratio, try_flag, ",
        "stock_type, not_sale_days, ",
        "item_englishname, first_remind, ",
        "second_remind, third_remind, ",
        "item_day_clear, vip_mark_percentage, ",
        "pro_code7, pro_code8, ",
        "pro_code9, time_stamp)",
        "values (#{itemNo,jdbcType=VARCHAR}, #{itemSubno,jdbcType=VARCHAR}, ",
        "#{itemName,jdbcType=VARCHAR}, #{itemSubname,jdbcType=VARCHAR}, ",
        "#{itemClsno,jdbcType=VARCHAR}, #{itemBrand,jdbcType=VARCHAR}, ",
        "#{itemBrandname,jdbcType=VARCHAR}, #{unitNo,jdbcType=VARCHAR}, ",
        "#{itemSize,jdbcType=VARCHAR}, #{price,jdbcType=NUMERIC}, ",
        "#{basePrice,jdbcType=NUMERIC}, #{salePrice,jdbcType=NUMERIC}, ",
        "#{vipPrice,jdbcType=NUMERIC}, #{combineSta,jdbcType=CHAR}, ",
        "#{measureFlag,jdbcType=CHAR}, #{status,jdbcType=CHAR}, #{saleFlag,jdbcType=CHAR}, ",
        "#{displayFlag,jdbcType=CHAR}, #{poCycle,jdbcType=SMALLINT}, ",
        "#{soCycle,jdbcType=SMALLINT}, #{autominFlag,jdbcType=CHAR}, ",
        "#{enGift,jdbcType=CHAR}, #{changePrice,jdbcType=CHAR}, #{enDis,jdbcType=CHAR}, ",
        "#{branchPrice,jdbcType=CHAR}, #{itemCom,jdbcType=CHAR}, ",
        "#{purchaseTax,jdbcType=NUMERIC}, #{saleTax,jdbcType=NUMERIC}, ",
        "#{purchaseSpec,jdbcType=NUMERIC}, #{shipmentSpec,jdbcType=NUMERIC}, ",
        "#{itemSupcust,jdbcType=NVARCHAR}, #{mainSupcust,jdbcType=VARCHAR}, ",
        "#{itemSupFlag,jdbcType=CHAR}, #{supRate,jdbcType=NUMERIC}, ",
        "#{itemStock,jdbcType=CHAR}, #{buildDate,jdbcType=TIMESTAMP}, ",
        "#{modifyDate,jdbcType=TIMESTAMP}, #{stopDate,jdbcType=TIMESTAMP}, ",
        "#{abc,jdbcType=CHAR}, #{itemRem,jdbcType=VARCHAR}, #{saleMinPrice,jdbcType=NUMERIC}, ",
        "#{vipAccFlag,jdbcType=CHAR}, #{vipAccNum,jdbcType=NUMERIC}, ",
        "#{dpfmType,jdbcType=CHAR}, #{returnRate,jdbcType=NUMERIC}, ",
        "#{updateDate,jdbcType=VARCHAR}, #{proCode1,jdbcType=VARCHAR}, ",
        "#{proCode2,jdbcType=VARCHAR}, #{proCode3,jdbcType=VARCHAR}, ",
        "#{proCode4,jdbcType=VARCHAR}, #{proCode5,jdbcType=VARCHAR}, ",
        "#{proCode6,jdbcType=VARCHAR}, #{schemePrice,jdbcType=NUMERIC}, ",
        "#{vipPrice2,jdbcType=NUMERIC}, #{vipPrice3,jdbcType=NUMERIC}, ",
        "#{vipPrice4,jdbcType=NUMERIC}, #{vipPrice5,jdbcType=NUMERIC}, ",
        "#{validDays,jdbcType=NUMERIC}, #{productArea,jdbcType=VARCHAR}, ",
        "#{memo,jdbcType=VARCHAR}, #{itemPicture,jdbcType=VARCHAR}, ",
        "#{pictureType,jdbcType=VARCHAR}, #{basePrice1,jdbcType=NUMERIC}, ",
        "#{basePrice2,jdbcType=NUMERIC}, #{basePrice3,jdbcType=NUMERIC}, ",
        "#{basePrice4,jdbcType=NUMERIC}, #{basePrice5,jdbcType=NUMERIC}, ",
        "#{basePrice6,jdbcType=NUMERIC}, #{basePrice7,jdbcType=NUMERIC}, ",
        "#{basePrice8,jdbcType=NUMERIC}, #{newOperId,jdbcType=VARCHAR}, ",
        "#{modifyOperId,jdbcType=VARCHAR}, #{baseSnFlag,jdbcType=CHAR}, ",
        "#{comFlag,jdbcType=CHAR}, #{usedDays,jdbcType=SMALLINT}, ",
        "#{packageRatio,jdbcType=INTEGER}, #{tryFlag,jdbcType=VARCHAR}, ",
        "#{stockType,jdbcType=VARCHAR}, #{notSaleDays,jdbcType=SMALLINT}, ",
        "#{itemEnglishname,jdbcType=VARCHAR}, #{firstRemind,jdbcType=NUMERIC}, ",
        "#{secondRemind,jdbcType=NUMERIC}, #{thirdRemind,jdbcType=NUMERIC}, ",
        "#{itemDayClear,jdbcType=CHAR}, #{vipMarkPercentage,jdbcType=CHAR}, ",
        "#{proCode7,jdbcType=VARCHAR}, #{proCode8,jdbcType=VARCHAR}, ",
        "#{proCode9,jdbcType=VARCHAR}, #{timeStamp,jdbcType=BINARY})"
    })
    int insert(ItemInfo record);

    @InsertProvider(type=ItemInfoSqlProvider.class, method="insertSelective")
    int insertSelective(ItemInfo record);

    @Select({
        "select",
        "item_no, item_subno, item_name, item_subname, item_clsno, item_brand, item_brandname, ",
        "unit_no, item_size, price, base_price, sale_price, vip_price, combine_sta, measure_flag, ",
        "status, sale_flag, display_flag, po_cycle, so_cycle, automin_flag, en_gift, ",
        "change_price, en_dis, branch_price, item_com, purchase_tax, sale_tax, purchase_spec, ",
        "shipment_spec, item_supcust, main_supcust, item_sup_flag, sup_rate, item_stock, ",
        "build_date, modify_date, stop_date, abc, item_rem, sale_min_price, vip_acc_flag, ",
        "vip_acc_num, dpfm_type, return_rate, update_date, pro_code1, pro_code2, pro_code3, ",
        "pro_code4, pro_code5, pro_code6, scheme_price, vip_price2, vip_price3, vip_price4, ",
        "vip_price5, valid_days, product_area, memo, item_picture, picture_type, base_price1, ",
        "base_price2, base_price3, base_price4, base_price5, base_price6, base_price7, ",
        "base_price8, new_oper_id, modify_oper_id, base_sn_flag, com_flag, used_days, ",
        "package_ratio, try_flag, stock_type, not_sale_days, item_englishname, first_remind, ",
        "second_remind, third_remind, item_day_clear, vip_mark_percentage, pro_code7, ",
        "pro_code8, pro_code9, time_stamp",
        "from t_bd_item_info",
        "where item_no = #{itemNo,jdbcType=VARCHAR}"
    })
    ItemInfo selectByPrimaryKey(String itemNo);

    @Select({
            "select",
            "item_name  ",
            "from t_bd_item_info",
            "where item_no = #{itemNo,jdbcType=VARCHAR}"
    })
    String getName(String itemNo);

    @UpdateProvider(type=ItemInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ItemInfo record);

    @Update({
        "update t_bd_item_info",
        "set item_subno = #{itemSubno,jdbcType=VARCHAR},",
          "item_name = #{itemName,jdbcType=VARCHAR},",
          "item_subname = #{itemSubname,jdbcType=VARCHAR},",
          "item_clsno = #{itemClsno,jdbcType=VARCHAR},",
          "item_brand = #{itemBrand,jdbcType=VARCHAR},",
          "item_brandname = #{itemBrandname,jdbcType=VARCHAR},",
          "unit_no = #{unitNo,jdbcType=VARCHAR},",
          "item_size = #{itemSize,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=NUMERIC},",
          "base_price = #{basePrice,jdbcType=NUMERIC},",
          "sale_price = #{salePrice,jdbcType=NUMERIC},",
          "vip_price = #{vipPrice,jdbcType=NUMERIC},",
          "combine_sta = #{combineSta,jdbcType=CHAR},",
          "measure_flag = #{measureFlag,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR},",
          "sale_flag = #{saleFlag,jdbcType=CHAR},",
          "display_flag = #{displayFlag,jdbcType=CHAR},",
          "po_cycle = #{poCycle,jdbcType=SMALLINT},",
          "so_cycle = #{soCycle,jdbcType=SMALLINT},",
          "automin_flag = #{autominFlag,jdbcType=CHAR},",
          "en_gift = #{enGift,jdbcType=CHAR},",
          "change_price = #{changePrice,jdbcType=CHAR},",
          "en_dis = #{enDis,jdbcType=CHAR},",
          "branch_price = #{branchPrice,jdbcType=CHAR},",
          "item_com = #{itemCom,jdbcType=CHAR},",
          "purchase_tax = #{purchaseTax,jdbcType=NUMERIC},",
          "sale_tax = #{saleTax,jdbcType=NUMERIC},",
          "purchase_spec = #{purchaseSpec,jdbcType=NUMERIC},",
          "shipment_spec = #{shipmentSpec,jdbcType=NUMERIC},",
          "item_supcust = #{itemSupcust,jdbcType=NVARCHAR},",
          "main_supcust = #{mainSupcust,jdbcType=VARCHAR},",
          "item_sup_flag = #{itemSupFlag,jdbcType=CHAR},",
          "sup_rate = #{supRate,jdbcType=NUMERIC},",
          "item_stock = #{itemStock,jdbcType=CHAR},",
          "build_date = #{buildDate,jdbcType=TIMESTAMP},",
          "modify_date = #{modifyDate,jdbcType=TIMESTAMP},",
          "stop_date = #{stopDate,jdbcType=TIMESTAMP},",
          "abc = #{abc,jdbcType=CHAR},",
          "item_rem = #{itemRem,jdbcType=VARCHAR},",
          "sale_min_price = #{saleMinPrice,jdbcType=NUMERIC},",
          "vip_acc_flag = #{vipAccFlag,jdbcType=CHAR},",
          "vip_acc_num = #{vipAccNum,jdbcType=NUMERIC},",
          "dpfm_type = #{dpfmType,jdbcType=CHAR},",
          "return_rate = #{returnRate,jdbcType=NUMERIC},",
          "update_date = #{updateDate,jdbcType=VARCHAR},",
          "pro_code1 = #{proCode1,jdbcType=VARCHAR},",
          "pro_code2 = #{proCode2,jdbcType=VARCHAR},",
          "pro_code3 = #{proCode3,jdbcType=VARCHAR},",
          "pro_code4 = #{proCode4,jdbcType=VARCHAR},",
          "pro_code5 = #{proCode5,jdbcType=VARCHAR},",
          "pro_code6 = #{proCode6,jdbcType=VARCHAR},",
          "scheme_price = #{schemePrice,jdbcType=NUMERIC},",
          "vip_price2 = #{vipPrice2,jdbcType=NUMERIC},",
          "vip_price3 = #{vipPrice3,jdbcType=NUMERIC},",
          "vip_price4 = #{vipPrice4,jdbcType=NUMERIC},",
          "vip_price5 = #{vipPrice5,jdbcType=NUMERIC},",
          "valid_days = #{validDays,jdbcType=NUMERIC},",
          "product_area = #{productArea,jdbcType=VARCHAR},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "item_picture = #{itemPicture,jdbcType=VARCHAR},",
          "picture_type = #{pictureType,jdbcType=VARCHAR},",
          "base_price1 = #{basePrice1,jdbcType=NUMERIC},",
          "base_price2 = #{basePrice2,jdbcType=NUMERIC},",
          "base_price3 = #{basePrice3,jdbcType=NUMERIC},",
          "base_price4 = #{basePrice4,jdbcType=NUMERIC},",
          "base_price5 = #{basePrice5,jdbcType=NUMERIC},",
          "base_price6 = #{basePrice6,jdbcType=NUMERIC},",
          "base_price7 = #{basePrice7,jdbcType=NUMERIC},",
          "base_price8 = #{basePrice8,jdbcType=NUMERIC},",
          "new_oper_id = #{newOperId,jdbcType=VARCHAR},",
          "modify_oper_id = #{modifyOperId,jdbcType=VARCHAR},",
          "base_sn_flag = #{baseSnFlag,jdbcType=CHAR},",
          "com_flag = #{comFlag,jdbcType=CHAR},",
          "used_days = #{usedDays,jdbcType=SMALLINT},",
          "package_ratio = #{packageRatio,jdbcType=INTEGER},",
          "try_flag = #{tryFlag,jdbcType=VARCHAR},",
          "stock_type = #{stockType,jdbcType=VARCHAR},",
          "not_sale_days = #{notSaleDays,jdbcType=SMALLINT},",
          "item_englishname = #{itemEnglishname,jdbcType=VARCHAR},",
          "first_remind = #{firstRemind,jdbcType=NUMERIC},",
          "second_remind = #{secondRemind,jdbcType=NUMERIC},",
          "third_remind = #{thirdRemind,jdbcType=NUMERIC},",
          "item_day_clear = #{itemDayClear,jdbcType=CHAR},",
          "vip_mark_percentage = #{vipMarkPercentage,jdbcType=CHAR},",
          "pro_code7 = #{proCode7,jdbcType=VARCHAR},",
          "pro_code8 = #{proCode8,jdbcType=VARCHAR},",
          "pro_code9 = #{proCode9,jdbcType=VARCHAR},",
          "time_stamp = #{timeStamp,jdbcType=BINARY}",
        "where item_no = #{itemNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(ItemInfo record);

    /**
     * "update t_bd_item_info",
     *             "set pro_code1 = #{proCode1,jdbcType=VARCHAR},",
     *             "pro_code2 = #{proCode2,jdbcType=VARCHAR},",
     *             "where item_no = #{itemNo,jdbcType=VARCHAR}"
     * @param record
     * @return
     */
    @Update({
            "update t_bd_item_info",
            "set pro_code1 = #{proCode1,jdbcType=VARCHAR},",
            "pro_code2 = #{proCode2,jdbcType=VARCHAR}",
            "where item_no = #{itemNo,jdbcType=VARCHAR}"
    })
    int updateProCode(ItemInfo record);

    @Update({
        "update t_bd_item_info",
        "set item_subno = #{itemSubno,jdbcType=VARCHAR},",
          "item_name = #{itemName,jdbcType=VARCHAR},",
          "item_subname = #{itemSubname,jdbcType=VARCHAR},",
          "item_clsno = #{itemClsno,jdbcType=VARCHAR},",
          "item_brand = #{itemBrand,jdbcType=VARCHAR},",
          "item_brandname = #{itemBrandname,jdbcType=VARCHAR},",
          "unit_no = #{unitNo,jdbcType=VARCHAR},",
          "item_size = #{itemSize,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=NUMERIC},",
          "base_price = #{basePrice,jdbcType=NUMERIC},",
          "sale_price = #{salePrice,jdbcType=NUMERIC},",
          "vip_price = #{vipPrice,jdbcType=NUMERIC},",
          "combine_sta = #{combineSta,jdbcType=CHAR},",
          "measure_flag = #{measureFlag,jdbcType=CHAR},",
          "status = #{status,jdbcType=CHAR},",
          "sale_flag = #{saleFlag,jdbcType=CHAR},",
          "display_flag = #{displayFlag,jdbcType=CHAR},",
          "po_cycle = #{poCycle,jdbcType=SMALLINT},",
          "so_cycle = #{soCycle,jdbcType=SMALLINT},",
          "automin_flag = #{autominFlag,jdbcType=CHAR},",
          "en_gift = #{enGift,jdbcType=CHAR},",
          "change_price = #{changePrice,jdbcType=CHAR},",
          "en_dis = #{enDis,jdbcType=CHAR},",
          "branch_price = #{branchPrice,jdbcType=CHAR},",
          "item_com = #{itemCom,jdbcType=CHAR},",
          "purchase_tax = #{purchaseTax,jdbcType=NUMERIC},",
          "sale_tax = #{saleTax,jdbcType=NUMERIC},",
          "purchase_spec = #{purchaseSpec,jdbcType=NUMERIC},",
          "shipment_spec = #{shipmentSpec,jdbcType=NUMERIC},",
          "item_supcust = #{itemSupcust,jdbcType=NVARCHAR},",
          "main_supcust = #{mainSupcust,jdbcType=VARCHAR},",
          "item_sup_flag = #{itemSupFlag,jdbcType=CHAR},",
          "sup_rate = #{supRate,jdbcType=NUMERIC},",
          "item_stock = #{itemStock,jdbcType=CHAR},",
          "build_date = #{buildDate,jdbcType=TIMESTAMP},",
          "modify_date = #{modifyDate,jdbcType=TIMESTAMP},",
          "stop_date = #{stopDate,jdbcType=TIMESTAMP},",
          "abc = #{abc,jdbcType=CHAR},",
          "item_rem = #{itemRem,jdbcType=VARCHAR},",
          "sale_min_price = #{saleMinPrice,jdbcType=NUMERIC},",
          "vip_acc_flag = #{vipAccFlag,jdbcType=CHAR},",
          "vip_acc_num = #{vipAccNum,jdbcType=NUMERIC},",
          "dpfm_type = #{dpfmType,jdbcType=CHAR},",
          "return_rate = #{returnRate,jdbcType=NUMERIC},",
          "update_date = #{updateDate,jdbcType=VARCHAR},",
          "pro_code1 = #{proCode1,jdbcType=VARCHAR},",
          "pro_code2 = #{proCode2,jdbcType=VARCHAR},",
          "pro_code3 = #{proCode3,jdbcType=VARCHAR},",
          "pro_code4 = #{proCode4,jdbcType=VARCHAR},",
          "pro_code5 = #{proCode5,jdbcType=VARCHAR},",
          "pro_code6 = #{proCode6,jdbcType=VARCHAR},",
          "scheme_price = #{schemePrice,jdbcType=NUMERIC},",
          "vip_price2 = #{vipPrice2,jdbcType=NUMERIC},",
          "vip_price3 = #{vipPrice3,jdbcType=NUMERIC},",
          "vip_price4 = #{vipPrice4,jdbcType=NUMERIC},",
          "vip_price5 = #{vipPrice5,jdbcType=NUMERIC},",
          "valid_days = #{validDays,jdbcType=NUMERIC},",
          "product_area = #{productArea,jdbcType=VARCHAR},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "item_picture = #{itemPicture,jdbcType=VARCHAR},",
          "picture_type = #{pictureType,jdbcType=VARCHAR},",
          "base_price1 = #{basePrice1,jdbcType=NUMERIC},",
          "base_price2 = #{basePrice2,jdbcType=NUMERIC},",
          "base_price3 = #{basePrice3,jdbcType=NUMERIC},",
          "base_price4 = #{basePrice4,jdbcType=NUMERIC},",
          "base_price5 = #{basePrice5,jdbcType=NUMERIC},",
          "base_price6 = #{basePrice6,jdbcType=NUMERIC},",
          "base_price7 = #{basePrice7,jdbcType=NUMERIC},",
          "base_price8 = #{basePrice8,jdbcType=NUMERIC},",
          "new_oper_id = #{newOperId,jdbcType=VARCHAR},",
          "modify_oper_id = #{modifyOperId,jdbcType=VARCHAR},",
          "base_sn_flag = #{baseSnFlag,jdbcType=CHAR},",
          "com_flag = #{comFlag,jdbcType=CHAR},",
          "used_days = #{usedDays,jdbcType=SMALLINT},",
          "package_ratio = #{packageRatio,jdbcType=INTEGER},",
          "try_flag = #{tryFlag,jdbcType=VARCHAR},",
          "stock_type = #{stockType,jdbcType=VARCHAR},",
          "not_sale_days = #{notSaleDays,jdbcType=SMALLINT},",
          "item_englishname = #{itemEnglishname,jdbcType=VARCHAR},",
          "first_remind = #{firstRemind,jdbcType=NUMERIC},",
          "second_remind = #{secondRemind,jdbcType=NUMERIC},",
          "third_remind = #{thirdRemind,jdbcType=NUMERIC},",
          "item_day_clear = #{itemDayClear,jdbcType=CHAR},",
          "vip_mark_percentage = #{vipMarkPercentage,jdbcType=CHAR},",
          "pro_code7 = #{proCode7,jdbcType=VARCHAR},",
          "pro_code8 = #{proCode8,jdbcType=VARCHAR},",
          "pro_code9 = #{proCode9,jdbcType=VARCHAR}",
        "where item_no = #{itemNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ItemInfo record);
}