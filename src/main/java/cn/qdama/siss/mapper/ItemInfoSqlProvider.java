package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.ItemInfo;
import org.apache.ibatis.jdbc.SQL;

public class ItemInfoSqlProvider {

    public String insertSelective(ItemInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_bd_item_info");
        
        if (record.getItemNo() != null) {
            sql.VALUES("item_no", "#{itemNo,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSubno() != null) {
            sql.VALUES("item_subno", "#{itemSubno,jdbcType=VARCHAR}");
        }
        
        if (record.getItemName() != null) {
            sql.VALUES("item_name", "#{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSubname() != null) {
            sql.VALUES("item_subname", "#{itemSubname,jdbcType=VARCHAR}");
        }
        
        if (record.getItemClsno() != null) {
            sql.VALUES("item_clsno", "#{itemClsno,jdbcType=VARCHAR}");
        }
        
        if (record.getItemBrand() != null) {
            sql.VALUES("item_brand", "#{itemBrand,jdbcType=VARCHAR}");
        }
        
        if (record.getItemBrandname() != null) {
            sql.VALUES("item_brandname", "#{itemBrandname,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitNo() != null) {
            sql.VALUES("unit_no", "#{unitNo,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSize() != null) {
            sql.VALUES("item_size", "#{itemSize,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice() != null) {
            sql.VALUES("base_price", "#{basePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getSalePrice() != null) {
            sql.VALUES("sale_price", "#{salePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice() != null) {
            sql.VALUES("vip_price", "#{vipPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getCombineSta() != null) {
            sql.VALUES("combine_sta", "#{combineSta,jdbcType=CHAR}");
        }
        
        if (record.getMeasureFlag() != null) {
            sql.VALUES("measure_flag", "#{measureFlag,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=CHAR}");
        }
        
        if (record.getSaleFlag() != null) {
            sql.VALUES("sale_flag", "#{saleFlag,jdbcType=CHAR}");
        }
        
        if (record.getDisplayFlag() != null) {
            sql.VALUES("display_flag", "#{displayFlag,jdbcType=CHAR}");
        }
        
        if (record.getPoCycle() != null) {
            sql.VALUES("po_cycle", "#{poCycle,jdbcType=SMALLINT}");
        }
        
        if (record.getSoCycle() != null) {
            sql.VALUES("so_cycle", "#{soCycle,jdbcType=SMALLINT}");
        }
        
        if (record.getAutominFlag() != null) {
            sql.VALUES("automin_flag", "#{autominFlag,jdbcType=CHAR}");
        }
        
        if (record.getEnGift() != null) {
            sql.VALUES("en_gift", "#{enGift,jdbcType=CHAR}");
        }
        
        if (record.getChangePrice() != null) {
            sql.VALUES("change_price", "#{changePrice,jdbcType=CHAR}");
        }
        
        if (record.getEnDis() != null) {
            sql.VALUES("en_dis", "#{enDis,jdbcType=CHAR}");
        }
        
        if (record.getBranchPrice() != null) {
            sql.VALUES("branch_price", "#{branchPrice,jdbcType=CHAR}");
        }
        
        if (record.getItemCom() != null) {
            sql.VALUES("item_com", "#{itemCom,jdbcType=CHAR}");
        }
        
        if (record.getPurchaseTax() != null) {
            sql.VALUES("purchase_tax", "#{purchaseTax,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleTax() != null) {
            sql.VALUES("sale_tax", "#{saleTax,jdbcType=NUMERIC}");
        }
        
        if (record.getPurchaseSpec() != null) {
            sql.VALUES("purchase_spec", "#{purchaseSpec,jdbcType=NUMERIC}");
        }
        
        if (record.getShipmentSpec() != null) {
            sql.VALUES("shipment_spec", "#{shipmentSpec,jdbcType=NUMERIC}");
        }
        
        if (record.getItemSupcust() != null) {
            sql.VALUES("item_supcust", "#{itemSupcust,jdbcType=NVARCHAR}");
        }
        
        if (record.getMainSupcust() != null) {
            sql.VALUES("main_supcust", "#{mainSupcust,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSupFlag() != null) {
            sql.VALUES("item_sup_flag", "#{itemSupFlag,jdbcType=CHAR}");
        }
        
        if (record.getSupRate() != null) {
            sql.VALUES("sup_rate", "#{supRate,jdbcType=NUMERIC}");
        }
        
        if (record.getItemStock() != null) {
            sql.VALUES("item_stock", "#{itemStock,jdbcType=CHAR}");
        }
        
        if (record.getBuildDate() != null) {
            sql.VALUES("build_date", "#{buildDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyDate() != null) {
            sql.VALUES("modify_date", "#{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStopDate() != null) {
            sql.VALUES("stop_date", "#{stopDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAbc() != null) {
            sql.VALUES("abc", "#{abc,jdbcType=CHAR}");
        }
        
        if (record.getItemRem() != null) {
            sql.VALUES("item_rem", "#{itemRem,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleMinPrice() != null) {
            sql.VALUES("sale_min_price", "#{saleMinPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getVipAccFlag() != null) {
            sql.VALUES("vip_acc_flag", "#{vipAccFlag,jdbcType=CHAR}");
        }
        
        if (record.getVipAccNum() != null) {
            sql.VALUES("vip_acc_num", "#{vipAccNum,jdbcType=NUMERIC}");
        }
        
        if (record.getDpfmType() != null) {
            sql.VALUES("dpfm_type", "#{dpfmType,jdbcType=CHAR}");
        }
        
        if (record.getReturnRate() != null) {
            sql.VALUES("return_rate", "#{returnRate,jdbcType=NUMERIC}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode1() != null) {
            sql.VALUES("pro_code1", "#{proCode1,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode2() != null) {
            sql.VALUES("pro_code2", "#{proCode2,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode3() != null) {
            sql.VALUES("pro_code3", "#{proCode3,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode4() != null) {
            sql.VALUES("pro_code4", "#{proCode4,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode5() != null) {
            sql.VALUES("pro_code5", "#{proCode5,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode6() != null) {
            sql.VALUES("pro_code6", "#{proCode6,jdbcType=VARCHAR}");
        }
        
        if (record.getSchemePrice() != null) {
            sql.VALUES("scheme_price", "#{schemePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice2() != null) {
            sql.VALUES("vip_price2", "#{vipPrice2,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice3() != null) {
            sql.VALUES("vip_price3", "#{vipPrice3,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice4() != null) {
            sql.VALUES("vip_price4", "#{vipPrice4,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice5() != null) {
            sql.VALUES("vip_price5", "#{vipPrice5,jdbcType=NUMERIC}");
        }
        
        if (record.getValidDays() != null) {
            sql.VALUES("valid_days", "#{validDays,jdbcType=NUMERIC}");
        }
        
        if (record.getProductArea() != null) {
            sql.VALUES("product_area", "#{productArea,jdbcType=VARCHAR}");
        }
        
        if (record.getMemo() != null) {
            sql.VALUES("memo", "#{memo,jdbcType=VARCHAR}");
        }
        
        if (record.getItemPicture() != null) {
            sql.VALUES("item_picture", "#{itemPicture,jdbcType=VARCHAR}");
        }
        
        if (record.getPictureType() != null) {
            sql.VALUES("picture_type", "#{pictureType,jdbcType=VARCHAR}");
        }
        
        if (record.getBasePrice1() != null) {
            sql.VALUES("base_price1", "#{basePrice1,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice2() != null) {
            sql.VALUES("base_price2", "#{basePrice2,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice3() != null) {
            sql.VALUES("base_price3", "#{basePrice3,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice4() != null) {
            sql.VALUES("base_price4", "#{basePrice4,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice5() != null) {
            sql.VALUES("base_price5", "#{basePrice5,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice6() != null) {
            sql.VALUES("base_price6", "#{basePrice6,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice7() != null) {
            sql.VALUES("base_price7", "#{basePrice7,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice8() != null) {
            sql.VALUES("base_price8", "#{basePrice8,jdbcType=NUMERIC}");
        }
        
        if (record.getNewOperId() != null) {
            sql.VALUES("new_oper_id", "#{newOperId,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyOperId() != null) {
            sql.VALUES("modify_oper_id", "#{modifyOperId,jdbcType=VARCHAR}");
        }
        
        if (record.getBaseSnFlag() != null) {
            sql.VALUES("base_sn_flag", "#{baseSnFlag,jdbcType=CHAR}");
        }
        
        if (record.getComFlag() != null) {
            sql.VALUES("com_flag", "#{comFlag,jdbcType=CHAR}");
        }
        
        if (record.getUsedDays() != null) {
            sql.VALUES("used_days", "#{usedDays,jdbcType=SMALLINT}");
        }
        
        if (record.getPackageRatio() != null) {
            sql.VALUES("package_ratio", "#{packageRatio,jdbcType=INTEGER}");
        }
        
        if (record.getTryFlag() != null) {
            sql.VALUES("try_flag", "#{tryFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getStockType() != null) {
            sql.VALUES("stock_type", "#{stockType,jdbcType=VARCHAR}");
        }
        
        if (record.getNotSaleDays() != null) {
            sql.VALUES("not_sale_days", "#{notSaleDays,jdbcType=SMALLINT}");
        }
        
        if (record.getItemEnglishname() != null) {
            sql.VALUES("item_englishname", "#{itemEnglishname,jdbcType=VARCHAR}");
        }
        
        if (record.getFirstRemind() != null) {
            sql.VALUES("first_remind", "#{firstRemind,jdbcType=NUMERIC}");
        }
        
        if (record.getSecondRemind() != null) {
            sql.VALUES("second_remind", "#{secondRemind,jdbcType=NUMERIC}");
        }
        
        if (record.getThirdRemind() != null) {
            sql.VALUES("third_remind", "#{thirdRemind,jdbcType=NUMERIC}");
        }
        
        if (record.getItemDayClear() != null) {
            sql.VALUES("item_day_clear", "#{itemDayClear,jdbcType=CHAR}");
        }
        
        if (record.getVipMarkPercentage() != null) {
            sql.VALUES("vip_mark_percentage", "#{vipMarkPercentage,jdbcType=CHAR}");
        }
        
        if (record.getProCode7() != null) {
            sql.VALUES("pro_code7", "#{proCode7,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode8() != null) {
            sql.VALUES("pro_code8", "#{proCode8,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode9() != null) {
            sql.VALUES("pro_code9", "#{proCode9,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeStamp() != null) {
            sql.VALUES("time_stamp", "#{timeStamp,jdbcType=BINARY}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ItemInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("t_bd_item_info");
        
        if (record.getItemSubno() != null) {
            sql.SET("item_subno = #{itemSubno,jdbcType=VARCHAR}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSubname() != null) {
            sql.SET("item_subname = #{itemSubname,jdbcType=VARCHAR}");
        }
        
        if (record.getItemClsno() != null) {
            sql.SET("item_clsno = #{itemClsno,jdbcType=VARCHAR}");
        }
        
        if (record.getItemBrand() != null) {
            sql.SET("item_brand = #{itemBrand,jdbcType=VARCHAR}");
        }
        
        if (record.getItemBrandname() != null) {
            sql.SET("item_brandname = #{itemBrandname,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitNo() != null) {
            sql.SET("unit_no = #{unitNo,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSize() != null) {
            sql.SET("item_size = #{itemSize,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice() != null) {
            sql.SET("base_price = #{basePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getSalePrice() != null) {
            sql.SET("sale_price = #{salePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice() != null) {
            sql.SET("vip_price = #{vipPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getCombineSta() != null) {
            sql.SET("combine_sta = #{combineSta,jdbcType=CHAR}");
        }
        
        if (record.getMeasureFlag() != null) {
            sql.SET("measure_flag = #{measureFlag,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=CHAR}");
        }
        
        if (record.getSaleFlag() != null) {
            sql.SET("sale_flag = #{saleFlag,jdbcType=CHAR}");
        }
        
        if (record.getDisplayFlag() != null) {
            sql.SET("display_flag = #{displayFlag,jdbcType=CHAR}");
        }
        
        if (record.getPoCycle() != null) {
            sql.SET("po_cycle = #{poCycle,jdbcType=SMALLINT}");
        }
        
        if (record.getSoCycle() != null) {
            sql.SET("so_cycle = #{soCycle,jdbcType=SMALLINT}");
        }
        
        if (record.getAutominFlag() != null) {
            sql.SET("automin_flag = #{autominFlag,jdbcType=CHAR}");
        }
        
        if (record.getEnGift() != null) {
            sql.SET("en_gift = #{enGift,jdbcType=CHAR}");
        }
        
        if (record.getChangePrice() != null) {
            sql.SET("change_price = #{changePrice,jdbcType=CHAR}");
        }
        
        if (record.getEnDis() != null) {
            sql.SET("en_dis = #{enDis,jdbcType=CHAR}");
        }
        
        if (record.getBranchPrice() != null) {
            sql.SET("branch_price = #{branchPrice,jdbcType=CHAR}");
        }
        
        if (record.getItemCom() != null) {
            sql.SET("item_com = #{itemCom,jdbcType=CHAR}");
        }
        
        if (record.getPurchaseTax() != null) {
            sql.SET("purchase_tax = #{purchaseTax,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleTax() != null) {
            sql.SET("sale_tax = #{saleTax,jdbcType=NUMERIC}");
        }
        
        if (record.getPurchaseSpec() != null) {
            sql.SET("purchase_spec = #{purchaseSpec,jdbcType=NUMERIC}");
        }
        
        if (record.getShipmentSpec() != null) {
            sql.SET("shipment_spec = #{shipmentSpec,jdbcType=NUMERIC}");
        }
        
        if (record.getItemSupcust() != null) {
            sql.SET("item_supcust = #{itemSupcust,jdbcType=NVARCHAR}");
        }
        
        if (record.getMainSupcust() != null) {
            sql.SET("main_supcust = #{mainSupcust,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSupFlag() != null) {
            sql.SET("item_sup_flag = #{itemSupFlag,jdbcType=CHAR}");
        }
        
        if (record.getSupRate() != null) {
            sql.SET("sup_rate = #{supRate,jdbcType=NUMERIC}");
        }
        
        if (record.getItemStock() != null) {
            sql.SET("item_stock = #{itemStock,jdbcType=CHAR}");
        }
        
        if (record.getBuildDate() != null) {
            sql.SET("build_date = #{buildDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyDate() != null) {
            sql.SET("modify_date = #{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStopDate() != null) {
            sql.SET("stop_date = #{stopDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAbc() != null) {
            sql.SET("abc = #{abc,jdbcType=CHAR}");
        }
        
        if (record.getItemRem() != null) {
            sql.SET("item_rem = #{itemRem,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleMinPrice() != null) {
            sql.SET("sale_min_price = #{saleMinPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getVipAccFlag() != null) {
            sql.SET("vip_acc_flag = #{vipAccFlag,jdbcType=CHAR}");
        }
        
        if (record.getVipAccNum() != null) {
            sql.SET("vip_acc_num = #{vipAccNum,jdbcType=NUMERIC}");
        }
        
        if (record.getDpfmType() != null) {
            sql.SET("dpfm_type = #{dpfmType,jdbcType=CHAR}");
        }
        
        if (record.getReturnRate() != null) {
            sql.SET("return_rate = #{returnRate,jdbcType=NUMERIC}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.SET("update_date = #{updateDate,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode1() != null) {
            sql.SET("pro_code1 = #{proCode1,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode2() != null) {
            sql.SET("pro_code2 = #{proCode2,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode3() != null) {
            sql.SET("pro_code3 = #{proCode3,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode4() != null) {
            sql.SET("pro_code4 = #{proCode4,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode5() != null) {
            sql.SET("pro_code5 = #{proCode5,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode6() != null) {
            sql.SET("pro_code6 = #{proCode6,jdbcType=VARCHAR}");
        }
        
        if (record.getSchemePrice() != null) {
            sql.SET("scheme_price = #{schemePrice,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice2() != null) {
            sql.SET("vip_price2 = #{vipPrice2,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice3() != null) {
            sql.SET("vip_price3 = #{vipPrice3,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice4() != null) {
            sql.SET("vip_price4 = #{vipPrice4,jdbcType=NUMERIC}");
        }
        
        if (record.getVipPrice5() != null) {
            sql.SET("vip_price5 = #{vipPrice5,jdbcType=NUMERIC}");
        }
        
        if (record.getValidDays() != null) {
            sql.SET("valid_days = #{validDays,jdbcType=NUMERIC}");
        }
        
        if (record.getProductArea() != null) {
            sql.SET("product_area = #{productArea,jdbcType=VARCHAR}");
        }
        
        if (record.getMemo() != null) {
            sql.SET("memo = #{memo,jdbcType=VARCHAR}");
        }
        
        if (record.getItemPicture() != null) {
            sql.SET("item_picture = #{itemPicture,jdbcType=VARCHAR}");
        }
        
        if (record.getPictureType() != null) {
            sql.SET("picture_type = #{pictureType,jdbcType=VARCHAR}");
        }
        
        if (record.getBasePrice1() != null) {
            sql.SET("base_price1 = #{basePrice1,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice2() != null) {
            sql.SET("base_price2 = #{basePrice2,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice3() != null) {
            sql.SET("base_price3 = #{basePrice3,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice4() != null) {
            sql.SET("base_price4 = #{basePrice4,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice5() != null) {
            sql.SET("base_price5 = #{basePrice5,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice6() != null) {
            sql.SET("base_price6 = #{basePrice6,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice7() != null) {
            sql.SET("base_price7 = #{basePrice7,jdbcType=NUMERIC}");
        }
        
        if (record.getBasePrice8() != null) {
            sql.SET("base_price8 = #{basePrice8,jdbcType=NUMERIC}");
        }
        
        if (record.getNewOperId() != null) {
            sql.SET("new_oper_id = #{newOperId,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyOperId() != null) {
            sql.SET("modify_oper_id = #{modifyOperId,jdbcType=VARCHAR}");
        }
        
        if (record.getBaseSnFlag() != null) {
            sql.SET("base_sn_flag = #{baseSnFlag,jdbcType=CHAR}");
        }
        
        if (record.getComFlag() != null) {
            sql.SET("com_flag = #{comFlag,jdbcType=CHAR}");
        }
        
        if (record.getUsedDays() != null) {
            sql.SET("used_days = #{usedDays,jdbcType=SMALLINT}");
        }
        
        if (record.getPackageRatio() != null) {
            sql.SET("package_ratio = #{packageRatio,jdbcType=INTEGER}");
        }
        
        if (record.getTryFlag() != null) {
            sql.SET("try_flag = #{tryFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getStockType() != null) {
            sql.SET("stock_type = #{stockType,jdbcType=VARCHAR}");
        }
        
        if (record.getNotSaleDays() != null) {
            sql.SET("not_sale_days = #{notSaleDays,jdbcType=SMALLINT}");
        }
        
        if (record.getItemEnglishname() != null) {
            sql.SET("item_englishname = #{itemEnglishname,jdbcType=VARCHAR}");
        }
        
        if (record.getFirstRemind() != null) {
            sql.SET("first_remind = #{firstRemind,jdbcType=NUMERIC}");
        }
        
        if (record.getSecondRemind() != null) {
            sql.SET("second_remind = #{secondRemind,jdbcType=NUMERIC}");
        }
        
        if (record.getThirdRemind() != null) {
            sql.SET("third_remind = #{thirdRemind,jdbcType=NUMERIC}");
        }
        
        if (record.getItemDayClear() != null) {
            sql.SET("item_day_clear = #{itemDayClear,jdbcType=CHAR}");
        }
        
        if (record.getVipMarkPercentage() != null) {
            sql.SET("vip_mark_percentage = #{vipMarkPercentage,jdbcType=CHAR}");
        }
        
        if (record.getProCode7() != null) {
            sql.SET("pro_code7 = #{proCode7,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode8() != null) {
            sql.SET("pro_code8 = #{proCode8,jdbcType=VARCHAR}");
        }
        
        if (record.getProCode9() != null) {
            sql.SET("pro_code9 = #{proCode9,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeStamp() != null) {
            sql.SET("time_stamp = #{timeStamp,jdbcType=BINARY}");
        }
        
        sql.WHERE("item_no = #{itemNo,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}