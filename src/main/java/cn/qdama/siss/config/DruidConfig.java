package cn.qdama.siss.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Filter;

@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        DruidDataSource source = new DruidDataSource();
       /* source.setValidationQuery("SELECT 1;");
        source.setValidationQueryTimeout(500);
        String query = source.getValidationQuery();
        System.out.println(query);*/
//        source.setValidationQuery();
        return source;

    }

    //配置druid 的管理servlet
    //配置 管理后台的servlet
    @Bean
    public ServletRegistrationBean statViewServlet(){

        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> unitParams = new HashMap<String, String>();
        unitParams.put("loginUsername","admin");
        unitParams.put("loginPassword","admin");

        bean.setInitParameters(unitParams);
        return bean;
    }

    //配置 web监控的 filter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParam = new HashMap<String, String>();
        initParam.put("exclusions","*.js,*.css,/druid/*,*.png,*.json,*.scss");
        bean.setInitParameters(initParam);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;

    }

}
