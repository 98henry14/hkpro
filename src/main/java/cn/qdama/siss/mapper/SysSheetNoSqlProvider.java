package cn.qdama.siss.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.qdama.siss.bean.SysSheetNo;
import cn.qdama.siss.bean.SysSheetNoExample.Criteria;
import cn.qdama.siss.bean.SysSheetNoExample.Criterion;
import cn.qdama.siss.bean.SysSheetNoExample;
import java.util.List;
import java.util.Map;

public class SysSheetNoSqlProvider {

    public String insertSelective(SysSheetNo record) {
        BEGIN();
        INSERT_INTO("t_sys_sheetno_flow");
        
        if (record.getSheetId() != null) {
            VALUES("sheet_id", "#{sheetId,jdbcType=CHAR}");
        }
        
        if (record.getBranchNo() != null) {
            VALUES("branch_no", "#{branchNo,jdbcType=CHAR}");
        }
        
        if (record.getSheetValue() != null) {
            VALUES("sheet_value", "#{sheetValue,jdbcType=NUMERIC}");
        }
        
        if (record.getTempValue() != null) {
            VALUES("temp_value", "#{tempValue,jdbcType=NUMERIC}");
        }
        
        if (record.getLastTime() != null) {
            VALUES("last_time", "#{lastTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOther1() != null) {
            VALUES("other1", "#{other1,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(SysSheetNoExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("sheet_id");
        } else {
            SELECT("sheet_id");
        }
        SELECT("branch_no");
        SELECT("sheet_value");
        SELECT("temp_value");
        SELECT("last_time");
        SELECT("other1");
        FROM("t_sys_sheetno_flow");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SysSheetNo record = (SysSheetNo) parameter.get("record");
        SysSheetNoExample example = (SysSheetNoExample) parameter.get("example");
        
        BEGIN();
        UPDATE("t_sys_sheetno_flow");
        
        if (record.getSheetId() != null) {
            SET("sheet_id = #{record.sheetId,jdbcType=CHAR}");
        }
        
        if (record.getBranchNo() != null) {
            SET("branch_no = #{record.branchNo,jdbcType=CHAR}");
        }
        
        if (record.getSheetValue() != null) {
            SET("sheet_value = #{record.sheetValue,jdbcType=NUMERIC}");
        }
        
        if (record.getTempValue() != null) {
            SET("temp_value = #{record.tempValue,jdbcType=NUMERIC}");
        }
        
        if (record.getLastTime() != null) {
            SET("last_time = #{record.lastTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOther1() != null) {
            SET("other1 = #{record.other1,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("t_sys_sheetno_flow");
        
        SET("sheet_id = #{record.sheetId,jdbcType=CHAR}");
        SET("branch_no = #{record.branchNo,jdbcType=CHAR}");
        SET("sheet_value = #{record.sheetValue,jdbcType=NUMERIC}");
        SET("temp_value = #{record.tempValue,jdbcType=NUMERIC}");
        SET("last_time = #{record.lastTime,jdbcType=TIMESTAMP}");
        SET("other1 = #{record.other1,jdbcType=VARCHAR}");
        
        SysSheetNoExample example = (SysSheetNoExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(SysSheetNo record) {
        BEGIN();
        UPDATE("t_sys_sheetno_flow");
        
        if (record.getSheetValue() != null) {
            SET("sheet_value = #{sheetValue,jdbcType=NUMERIC}");
        }
        
        if (record.getTempValue() != null) {
            SET("temp_value = #{tempValue,jdbcType=NUMERIC}");
        }
        
        if (record.getLastTime() != null) {
            SET("last_time = #{lastTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOther1() != null) {
            SET("other1 = #{other1,jdbcType=VARCHAR}");
        }
        
        WHERE("sheet_id = #{sheetId,jdbcType=CHAR}");
        WHERE("branch_no = #{branchNo,jdbcType=CHAR}");
        
        return SQL();
    }

    protected void applyWhere(SysSheetNoExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}