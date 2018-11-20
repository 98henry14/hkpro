package cn.qdama.siss.controller;

import cn.qdama.siss.bean.Detail4im;
import cn.qdama.siss.bean.Master4im;
import cn.qdama.siss.bean.SysSheetNo;
import cn.qdama.siss.bean.SysSheetNoKey;
import cn.qdama.siss.mapper.Detail4imMapper;
import cn.qdama.siss.mapper.Master4imMapper;
import cn.qdama.siss.mapper.SysSheetNoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class Hello {
    @Autowired
    private JdbcTemplate template;
    @Autowired
    private Detail4imMapper detail4imMapper;
    @Autowired
    private SysSheetNoMapper sysSheetNoMapper;
    @Autowired
    private Master4imMapper master4imMapper;

    /*@RequestMapping("/hello")
    public List<Map<String,Object>> getFirst(){
        List<Map<String, Object>> list = template.queryForList("select * from t_im_sheet_detail where sheet_no='OO00001808210019  ' ");
        return  list;

    }*/
    @RequestMapping("/index")
    public BigDecimal getIndex(){
        BigDecimal sub_amt = detail4imMapper.getSub_amt("DC00001811140061");
        long l = sub_amt.longValue();
        return sub_amt;
        //1.先获取目前的值再更新
        /*SysSheetNoKey key = new SysSheetNoKey();
        key.setBranchNo("0000");
        key.setSheetId("DC");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);
        sysSheetNo.setSheetValue(sysSheetNo.getSheetValue()+1);
        sysSheetNo.setLastTime(new Date());
        sysSheetNoMapper.updateByPrimaryKey(sysSheetNo);
        return sysSheetNo.getSheetValue();*/
    }


    @RequestMapping("/hello")
    public List<Detail4im> get() {
        //1.先获取目前的值再更新
        SysSheetNoKey key = new SysSheetNoKey();
        key.setBranchNo("0000");
        key.setSheetId("DC");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);

        sysSheetNo.setSheetValue(sysSheetNo.getSheetValue()+1);
        sysSheetNo.setLastTime(new Date());
        sysSheetNoMapper.updateByPrimaryKey(sysSheetNo);


        String sql = "SELECT  " +
                "        [flow_id]=null ,  " +
                "        [order_qty]=null,  " +
                "        [large_qty] =  case when '9996' <> '1001' then  " +
                "                        case '0'  " +
                "                        when '1'    " +
                "                        then  " +
                "                        case '1'  when '1' then  (CASE WHEN i.purchase_spec = 1 or i.purchase_spec <= 0 THEN s.stock_qty ELSE CONVERT(NUMERIC(16,4),s.stock_qty / i.purchase_spec) END)  " +
                "                                                when '0' then 0 end   " +
                "                        when '0' " +
                "                        then     " +
                "                                case when left(s.branch_no,4) = '0000'  " +
                "                                then  case '1'  when '1' then  (CASE WHEN i.purchase_spec = 1 or i.purchase_spec <= 0 THEN s.stock_qty ELSE CONVERT(NUMERIC(16,4),s.stock_qty / i.purchase_spec) END)   " +
                "                                                when '0' then 0 end   " +
                "                                else   case '1' when '1' then  (CASE WHEN i.purchase_spec = 1 or i.purchase_spec <= 0 THEN s.stock_qty ELSE CONVERT(NUMERIC(16,4),s.stock_qty / i.purchase_spec) END)   " +
                "                                                when '0' then 0 end   " +
                "                                end  " +
                "                        end  " +
                "                    else  (CASE WHEN i.purchase_spec = 1 or i.purchase_spec <= 0 THEN s.stock_qty ELSE CONVERT(NUMERIC(16,4),s.stock_qty / i.purchase_spec) END)  " +
                "                    end,  " +
                "     [orgi_price]=null,  " +
                "     [valid_price] = (case when '0' = '8' and '0' = '1' and info.trade_type <> '8'    " +
                "         then CONVERT(NUMERIC(16,4),0) else s.avg_cost end),  " +
                "     [sale_price]=bp.sale_price,  " +
                "     [tax]=0,   " +
                "     [valid_date]=null,   " +
                "     [other1]=null,   " +
                "     [other2]=null,   " +
                "     [other3]=null,   " +
                "     [num1]=null,   " +
                "     [num2]=null,   " +
                "     [num3]=null,   " +
                "     [memo]='来自系统的自动插入',   " +
                "     [item_barcode]=null,   " +
                "     [produce_date]=null,      " +
                "                    [item_no] = s.item_no,  " +
                "                    [real_qty] = s.stock_qty, " +
                "                    [sub_amt] = s.stock_qty*(case when '0' = '8'   " +
                "                                                        and '0' = '1' and info.trade_type <> '8'  then CONVERT(NUMERIC(16,4),0) else s.avg_cost end),  " +
                "                    [row_id]=ROW_NUMBER() over (order by s.item_no) ,   " +
                "     [sheet_no]=(select sheet_id+left(branch_no,4)+CONVERT(nvarchar(50),last_time,12)+RIGHT('0000'+CAST(sheet_value as nvarchar(50)),4) as sheet_no   " +
                "        from [t_sys_sheetno_flow]   " +
                "        WHERE ([sheet_id] = 'DC') AND ('DC' IS NOT NULL) AND ([branch_no] = '0000')   " +
                "        AND ('0000' IS NOT NULL))  " +
                "                    FROM t_im_branch_stock s with(nolock)" +
                "                    LEFT JOIN  " +
                "      (  " +
                "       SELECT t.branch_no, t.item_no, convert(numeric(16,4),sum(jcqty)) as jcstock_qty FROM  " +
                "       (  " +
                "       SELECT a.branch_no, a.item_no, limit_qty - isnull(real_qty,0) as jcqty  " +
                "       FROM t_rm_tend_luggage_info a WHERE NOT EXISTS(SELECT 1 FROM t_bd_item_combsplit b WHERE a.item_no = b.item_no)  " +
                "        and stock_flag='1' and sell_way='A'  " +
                "       UNION ALL  " +
                "       SELECT a.branch_no, a.item_no, limit_qty - isnull(real_qty,0) as jcqty  " +
                "       FROM t_rm_tend_luggage_info a INNER JOIN t_bd_item_info b ON b.item_no = a.item_no   " +
                "               LEFT JOIN t_bd_item_combsplit c ON b.item_no = c.item_no  " +
                "               INNER JOIN t_bd_item_info d ON d.item_no = c.comb_item_no AND d.combine_sta = '1' where sell_way='A'  " +
                "      UNION ALL  " +
                "       SELECT a.branch_no, c.comb_item_no as item_no, (limit_qty - isnull(real_qty,0)) / (case when c.item_qty > 0 then c.item_qty ELSE 1 END) as jcqty  " +
                "       FROM t_rm_tend_luggage_info a INNER JOIN t_bd_item_info b ON b.item_no = a.item_no   " +
                "               LEFT JOIN t_bd_item_combsplit c ON b.item_no = c.item_no  " +
                "               INNER JOIN t_bd_item_info d ON d.item_no = c.comb_item_no AND d.combine_sta = '4' where sell_way='A'  " +
                "      UNION ALL  " +
                "      SELECT a.branch_no, c.item_no as item_no, (limit_qty - isnull(real_qty,0)) * (case when c.item_qty > 0 then c.item_qty ELSE 1 END) as jcqty  " +
                "       FROM t_rm_tend_luggage_info a INNER JOIN t_bd_item_element c ON c.comb_item_no = a.item_no AND c.branch_no = LEFT(a.branch_no,4) where sell_way='A'  " +
                "      ) t  " +
                "       GROUP by branch_no, item_no  " +
                "     ) jc ON s.item_no = jc.item_no AND s.branch_no = jc.branch_no AND jc.jcstock_qty <> 0  " +
                "                    INNER JOIN t_bd_item_info i ON s.item_no = i.item_no  " +
                "     INNER JOIN t_bd_branch_info info ON info.branch_no=left(s.branch_no,4)   " +
                "     left join t_pc_branch_price bp on bp.branch_no=left(s.branch_no,4) and bp.item_no =s.item_no  " +
                "                    LEFT JOIN t_bd_item_cls c ON  c.item_clsno = i.item_clsno   " +
                "                    LEFT JOIN t_bd_item_brand b ON b.item_brand = i.item_brand  " +
                "                    LEFT JOIN t_bd_supcust_info sup ON sup.supcust_no = i.main_supcust AND sup.supcust_flag = 'S'  " +
                "                     WHERE i.item_stock = '1'  AND s.branch_no LIKE '100101%' AND s.stock_qty > 0 " +//--查询条件在此
                "                     AND s.item_no not in ('40232','41059')  " +
                "                     AND (s.stock_qty <> 0 or jc.jcstock_qty <> 0)    " +
                "                     AND i.sale_flag <> '2'   and info.branch_header='0000' and info.trade_type!='1'" +
                "                     AND (left(c.item_clsno,2) IN('01','02','03','04','05','07','LB')   " +
                "                     OR left(c.item_clsno,1) IN('01','02','03','04','05','07','LB'))   " +
                "                     order by s.item_no ";
//        List<Detail4im> list1 = template.queryForList(sql, Detail4im.class);
        List<Detail4im> list1 =  template.query(sql,new BeanPropertyRowMapper<Detail4im>(Detail4im.class));
        for (Detail4im detail4im : list1) {
            detail4imMapper.insertAuto(detail4im);
        }
        //第三步
        //计算单据总额
        BigDecimal sub_amt = detail4imMapper.getSub_amt(list1.get(0).getSheetNo());

        Master4im master4im = new Master4im();
        master4im.setSheetNo(list1.get(0).getSheetNo());
        master4im.setDbNo("-");
        master4im.setCoinNo("RMB");
        master4im.setComFlag("0");
        master4im.setOrderMan("9999");
        master4im.setReasonNo("");
        master4im.setAuditStatus("0");
        master4im.setCheckFlag("2");
        master4im.setOrderStatus("0");
        master4im.setApproveFlag("0");
        master4im.setSheetAmt(sub_amt);
        master4im.setBranchNo("100101");
        master4im.setOperDate(new Date());/**/
        master4im.setOperId("9999");
        master4im.setBranchFlag("0000");
        master4im.setMemo("来自系统自动插入");
        master4im.setTransNo("DC");
        master4im.setPrintNum(0);
        master4imMapper.insert(master4im);


        return list1;
    }
}
