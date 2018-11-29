package cn.qdama.siss.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.qdama.siss.bean.BaseCode;

public class BaseCodeSqlProvider {

    public String insertSelective(BaseCode record) {
        BEGIN();
        INSERT_INTO("t_bd_base_code");
        
        if (record.getTypeNo() != null) {
            VALUES("type_no", "#{typeNo,jdbcType=CHAR}");
        }
        
        if (record.getCodeId() != null) {
            VALUES("code_id", "#{codeId,jdbcType=CHAR}");
        }
        
        if (record.getCodeName() != null) {
            VALUES("code_name", "#{codeName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnglishName() != null) {
            VALUES("english_name", "#{englishName,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeType() != null) {
            VALUES("code_type", "#{codeType,jdbcType=VARCHAR}");
        }
        
        if (record.getMemo() != null) {
            VALUES("memo", "#{memo,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(BaseCode record) {
        BEGIN();
        UPDATE("t_bd_base_code");
        
        if (record.getCodeName() != null) {
            SET("code_name = #{codeName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnglishName() != null) {
            SET("english_name = #{englishName,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeType() != null) {
            SET("code_type = #{codeType,jdbcType=VARCHAR}");
        }
        
        if (record.getMemo() != null) {
            SET("memo = #{memo,jdbcType=VARCHAR}");
        }
        
        WHERE("type_no = #{typeNo,jdbcType=CHAR}");
        WHERE("code_id = #{codeId,jdbcType=CHAR}");
        
        return SQL();
    }
}