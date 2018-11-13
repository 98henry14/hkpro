package cn.qdama.siss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Hello {
    @Autowired
    private JdbcTemplate template;

    @RequestMapping("/hello")
    public List<Map<String,Object>> getFirst(){
        List<Map<String, Object>> list = template.queryForList("select * from t_im_sheet_detail where sheet_no='OO00001808210019  ' ");
        return  list;
    }
}
