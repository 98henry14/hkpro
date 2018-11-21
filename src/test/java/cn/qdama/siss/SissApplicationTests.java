package cn.qdama.siss;

import cn.qdama.siss.bean.*;
import cn.qdama.siss.mapper.Branch_stockMapper;
import cn.qdama.siss.mapper.Detail4imMapper;
import cn.qdama.siss.mapper.SysSheetNoMapper;
import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import javax.xml.transform.Source;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SissApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    private SysSheetNoMapper sysSheetNoMapper;
    @Autowired
    private Detail4imMapper detail4imMapper;
    @Autowired
    private Branch_stockMapper stockMapper;

    @Test
    public void contextLoads() throws SQLException {
        /*System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();*/
        //1.先获取目前的值再更新 OO库存调整单
        SysSheetNoKey key = new SysSheetNoKey();
        key.setBranchNo("0000");
        key.setSheetId("OO");
        SysSheetNo sysSheetNo = sysSheetNoMapper.selectByPrimaryKey(key);
       // Long num=173l;
        String s = String.format("%04d", sysSheetNo.getSheetValue());
        System.out.println(s);


/*        List<Detail4im> list = detail4imMapper.selectListLikeSheetNo("DI0000181119%");
        System.out.println(list.size()+"------"+list.get(0).getSheetNo());

        BigDecimal result = detail4imMapper.getSub_amt("DI00001811190085");
        System.out.println(result);*/


        /*Branch_stockExample ex = new Branch_stockExample();
        ex.createCriteria().andBranchNoEqualTo("100101").andStockQtyLessThan(new BigDecimal(0));//andStockQtyGreaterThan(new BigDecimal(0));
        List<Branch_stock> list = stockMapper.selectByExample(ex);
        System.out.println(list.get(0).getItemNo()+"----"+list.get(0).getStockQty()+"_____"+list.size());
        List<Detail4im> ims = stockMapper.selectMinusStock();
        int i=0;
        for (Detail4im im : ims) {
            System.out.println(im.getItemNo()+"+++++"+im.getLargeQty()+"++++"+im.getSubAmt()+"+++++"+im.getRealQty()+"=======");

        }
        System.out.println(ims.size());*/

    }

}
