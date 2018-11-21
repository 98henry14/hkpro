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

import cn.qdama.siss.bean.Branch_stock;
import cn.qdama.siss.bean.Branch_stockExample.Criteria;
import cn.qdama.siss.bean.Branch_stockExample.Criterion;
import cn.qdama.siss.bean.Branch_stockExample;
import java.util.List;

public class Branch_stockSqlProvider {

    public String insertSelective(Branch_stock record) {
        BEGIN();
        INSERT_INTO("t_im_branch_stock");
        
        if (record.getItemNo() != null) {
            VALUES("item_no", "#{itemNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchNo() != null) {
            VALUES("branch_no", "#{branchNo,jdbcType=VARCHAR}");
        }
        
        if (record.getStockQty() != null) {
            VALUES("stock_qty", "#{stockQty,jdbcType=NUMERIC}");
        }
        
        if (record.getRouteQty() != null) {
            VALUES("route_qty", "#{routeQty,jdbcType=NUMERIC}");
        }
        
        if (record.getAvgCost() != null) {
            VALUES("avg_cost", "#{avgCost,jdbcType=NUMERIC}");
        }
        
        if (record.getCostAmt() != null) {
            VALUES("cost_amt", "#{costAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getLastInprice() != null) {
            VALUES("last_inprice", "#{lastInprice,jdbcType=NUMERIC}");
        }
        
        if (record.getLastBaseprice() != null) {
            VALUES("last_baseprice", "#{lastBaseprice,jdbcType=NUMERIC}");
        }
        
        if (record.getMinQty() != null) {
            VALUES("min_qty", "#{minQty,jdbcType=NUMERIC}");
        }
        
        if (record.getMaxQty() != null) {
            VALUES("max_qty", "#{maxQty,jdbcType=NUMERIC}");
        }
        
        if (record.getAccQty() != null) {
            VALUES("acc_qty", "#{accQty,jdbcType=DECIMAL}");
        }
        
        if (record.getOperDate() != null) {
            VALUES("oper_date", "#{operDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getComFlag() != null) {
            VALUES("com_flag", "#{comFlag,jdbcType=CHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(Branch_stockExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("item_no");
        } else {
            SELECT("item_no");
        }
        SELECT("branch_no");
        SELECT("stock_qty");
        SELECT("route_qty");
        SELECT("avg_cost");
        SELECT("cost_amt");
        SELECT("last_inprice");
        SELECT("last_baseprice");
        SELECT("min_qty");
        SELECT("max_qty");
        SELECT("acc_qty");
        SELECT("oper_date");
        SELECT("com_flag");
        FROM("t_im_branch_stock");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Branch_stock record) {
        BEGIN();
        UPDATE("t_im_branch_stock");
        
        if (record.getStockQty() != null) {
            SET("stock_qty = #{stockQty,jdbcType=NUMERIC}");
        }
        
        if (record.getRouteQty() != null) {
            SET("route_qty = #{routeQty,jdbcType=NUMERIC}");
        }
        
        if (record.getAvgCost() != null) {
            SET("avg_cost = #{avgCost,jdbcType=NUMERIC}");
        }
        
        if (record.getCostAmt() != null) {
            SET("cost_amt = #{costAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getLastInprice() != null) {
            SET("last_inprice = #{lastInprice,jdbcType=NUMERIC}");
        }
        
        if (record.getLastBaseprice() != null) {
            SET("last_baseprice = #{lastBaseprice,jdbcType=NUMERIC}");
        }
        
        if (record.getMinQty() != null) {
            SET("min_qty = #{minQty,jdbcType=NUMERIC}");
        }
        
        if (record.getMaxQty() != null) {
            SET("max_qty = #{maxQty,jdbcType=NUMERIC}");
        }
        
        if (record.getAccQty() != null) {
            SET("acc_qty = #{accQty,jdbcType=DECIMAL}");
        }
        
        if (record.getOperDate() != null) {
            SET("oper_date = #{operDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getComFlag() != null) {
            SET("com_flag = #{comFlag,jdbcType=CHAR}");
        }
        
        WHERE("item_no = #{itemNo,jdbcType=VARCHAR}");
        WHERE("branch_no = #{branchNo,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(Branch_stockExample example, boolean includeExamplePhrase) {
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