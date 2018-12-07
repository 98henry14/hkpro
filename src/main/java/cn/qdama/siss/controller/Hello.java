package cn.qdama.siss.controller;

import cn.qdama.siss.bean.*;
import cn.qdama.siss.mapper.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

@Controller
public class Hello {
    @Autowired
    private JdbcTemplate template;
    @Autowired
    private Detail4imMapper detail4imMapper;
    @Autowired
    private SysSheetNoMapper sysSheetNoMapper;
    @Autowired
    private Master4imMapper master4imMapper;
    @Autowired
    private Branch_stockMapper stockMapper;
    @Autowired
    private HKShopMapper shopMapper;
    @Autowired
    private  PMDetailMapper pmDetailMapper;

    /*@RequestMapping("/hello")
    public List<Map<String,Object>> getFirst(){
        List<Map<String, Object>> list = templates.queryForList("select * from t_im_sheet_detail where sheet_no='OO00001808210019  ' ");
        return  list;

    }*/
    @RequestMapping("/index")
//    @ResponseBody
    public String getIndex() {
/*        BigDecimal sub_amt = detail4imMapper.getSub_amt("DC00001811140061");
        long l = sub_amt.longValue();
        String s = sub_amt.toString();*/
        return "index";

    }

    @GetMapping("/predict/{num}")
    public String getPredict(@PathVariable("num") String num, Model model) {

        PageHelper.startPage(Integer.parseInt(num),20);
//        List<PMDetail> predictDeatil = shopMapper.getPredictDeatil("1001");
        List<PMDetail> pmDetails = pmDetailMapper.selectAll();
        PageInfo pageInfo = new PageInfo(pmDetails,10);
        int[] nums = pageInfo.getNavigatepageNums();
        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println("当前页面："+pageInfo.getPageNum()+"=========="+pageInfo.getPages());
        System.out.println("总页数Pages:"+pageInfo.getPages());
        System.out.println("当前页PageNum"+pageInfo.getPageNum());
        System.out.println("endRow:"+pageInfo.getEndRow());
        System.out.println(pageInfo.getNavigateFirstPage()+"=>NavigateFirstPage  显示页码的首页");
        System.out.println(pageInfo.getNavigateLastPage()+"=>NavigateLastPage     显示页码的最后一夜"  );
        System.out.println(pageInfo.getNavigatepageNums()+"=>NavigatePageNums       对象？");
        System.out.println(pageInfo.getNavigatePages()+"=>navigatePages          显示几页页码");
        System.out.println(pageInfo.getNextPage()+"=>NextPage   下一页");
        System.out.println(pageInfo.getPageNum()+"=>pageNum     当前页");
        System.out.println(pageInfo.getPages()+"=>pages         总页数");
        System.out.println(pageInfo.getPageSize()+"=>pageSize   显示条数");
        System.out.println(pageInfo.getPrePage()+"=>prePage     上一页");
        System.out.println(pageInfo.getSize()+"=>size           页数");
        System.out.println(pageInfo.getStartRow()+"=>StaratRow      ");
        System.out.println(pageInfo.getTotal()+"===="+pageInfo.getPages());

        model.addAttribute("predicts",pmDetails);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("nums",nums);
        return "predict/list";

    }

    @RequestMapping("/test")
    @ResponseBody
    public List<PMDetail>  TestOne() {
        /*BigDecimal sub_amt = detail4imMapper.getSub_amt("DC00001811140061");
        long l = sub_amt.longValue();
        String s = sub_amt.toString();*/
        List<PMDetail> predictDeatil = shopMapper.getPredictDeatil("1001");
        return predictDeatil;
    }

    @RequestMapping("/mddc")
    @ResponseBody
    public List<Detail4im> get() {
        //1.先获取目前的值再更新
        SysSheetNoKey key = new SysSheetNoKey();
        key.setBranchNo("0000");
        key.setSheetId("DC");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);

        sysSheetNo.setSheetValue(sysSheetNo.getSheetValue() + 1);
        sysSheetNo.setLastTime(new Date());
        sysSheetNoMapper.updateByPrimaryKey(sysSheetNo);


//        List<Detail4im> list1 = templates.queryForList(sql, Detail4im.class);
//        List<Detail4im> list1 = templates.query(sql, new BeanPropertyRowMapper<Detail4im>(Detail4im.class));*/
        //获得门店日清数据
        List<Detail4im> list1 = stockMapper.getMDDayClean("100101%");
        for (Detail4im detail4im : list1) {
            //判断全壳的数量，需要加半壳的数量，再减去猪肉类未做BOM的散件
            if (detail4im.getItemNo().equals("40044")) {
                BigDecimal v = new BigDecimal(stockMapper.selectMeatMinusStock()).setScale(4, RoundingMode.HALF_UP);
                System.out.println(v.toString() + "===" + detail4im.getValidPrice().multiply(v));
                detail4im.setLargeQty(v);
                detail4im.setRealQty(v);
                detail4im.setSubAmt(detail4im.getValidPrice().multiply(v));
            }
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
        master4im.setReasonNo("09");
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
