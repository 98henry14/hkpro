package cn.qdama.siss.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysSheetNoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSheetNoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSheetIdIsNull() {
            addCriterion("sheet_id is null");
            return (Criteria) this;
        }

        public Criteria andSheetIdIsNotNull() {
            addCriterion("sheet_id is not null");
            return (Criteria) this;
        }

        public Criteria andSheetIdEqualTo(String value) {
            addCriterion("sheet_id =", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotEqualTo(String value) {
            addCriterion("sheet_id <>", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdGreaterThan(String value) {
            addCriterion("sheet_id >", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_id >=", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdLessThan(String value) {
            addCriterion("sheet_id <", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdLessThanOrEqualTo(String value) {
            addCriterion("sheet_id <=", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdLike(String value) {
            addCriterion("sheet_id like", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotLike(String value) {
            addCriterion("sheet_id not like", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdIn(List<String> values) {
            addCriterion("sheet_id in", values, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotIn(List<String> values) {
            addCriterion("sheet_id not in", values, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdBetween(String value1, String value2) {
            addCriterion("sheet_id between", value1, value2, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotBetween(String value1, String value2) {
            addCriterion("sheet_id not between", value1, value2, "sheetId");
            return (Criteria) this;
        }

        public Criteria andBranchNoIsNull() {
            addCriterion("branch_no is null");
            return (Criteria) this;
        }

        public Criteria andBranchNoIsNotNull() {
            addCriterion("branch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNoEqualTo(String value) {
            addCriterion("branch_no =", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotEqualTo(String value) {
            addCriterion("branch_no <>", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoGreaterThan(String value) {
            addCriterion("branch_no >", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoGreaterThanOrEqualTo(String value) {
            addCriterion("branch_no >=", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoLessThan(String value) {
            addCriterion("branch_no <", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoLessThanOrEqualTo(String value) {
            addCriterion("branch_no <=", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoLike(String value) {
            addCriterion("branch_no like", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotLike(String value) {
            addCriterion("branch_no not like", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoIn(List<String> values) {
            addCriterion("branch_no in", values, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotIn(List<String> values) {
            addCriterion("branch_no not in", values, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoBetween(String value1, String value2) {
            addCriterion("branch_no between", value1, value2, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotBetween(String value1, String value2) {
            addCriterion("branch_no not between", value1, value2, "branchNo");
            return (Criteria) this;
        }

        public Criteria andSheetValueIsNull() {
            addCriterion("sheet_value is null");
            return (Criteria) this;
        }

        public Criteria andSheetValueIsNotNull() {
            addCriterion("sheet_value is not null");
            return (Criteria) this;
        }

        public Criteria andSheetValueEqualTo(Short value) {
            addCriterion("sheet_value =", value, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andSheetValueNotEqualTo(Short value) {
            addCriterion("sheet_value <>", value, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andSheetValueGreaterThan(Short value) {
            addCriterion("sheet_value >", value, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andSheetValueGreaterThanOrEqualTo(Short value) {
            addCriterion("sheet_value >=", value, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andSheetValueLessThan(Short value) {
            addCriterion("sheet_value <", value, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andSheetValueLessThanOrEqualTo(Short value) {
            addCriterion("sheet_value <=", value, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andSheetValueIn(List<Short> values) {
            addCriterion("sheet_value in", values, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andSheetValueNotIn(List<Short> values) {
            addCriterion("sheet_value not in", values, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andSheetValueBetween(Short value1, Short value2) {
            addCriterion("sheet_value between", value1, value2, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andSheetValueNotBetween(Short value1, Short value2) {
            addCriterion("sheet_value not between", value1, value2, "sheetValue");
            return (Criteria) this;
        }

        public Criteria andTempValueIsNull() {
            addCriterion("temp_value is null");
            return (Criteria) this;
        }

        public Criteria andTempValueIsNotNull() {
            addCriterion("temp_value is not null");
            return (Criteria) this;
        }

        public Criteria andTempValueEqualTo(Short value) {
            addCriterion("temp_value =", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueNotEqualTo(Short value) {
            addCriterion("temp_value <>", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueGreaterThan(Short value) {
            addCriterion("temp_value >", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueGreaterThanOrEqualTo(Short value) {
            addCriterion("temp_value >=", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueLessThan(Short value) {
            addCriterion("temp_value <", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueLessThanOrEqualTo(Short value) {
            addCriterion("temp_value <=", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueIn(List<Short> values) {
            addCriterion("temp_value in", values, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueNotIn(List<Short> values) {
            addCriterion("temp_value not in", values, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueBetween(Short value1, Short value2) {
            addCriterion("temp_value between", value1, value2, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueNotBetween(Short value1, Short value2) {
            addCriterion("temp_value not between", value1, value2, "tempValue");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andOther1IsNull() {
            addCriterion("other1 is null");
            return (Criteria) this;
        }

        public Criteria andOther1IsNotNull() {
            addCriterion("other1 is not null");
            return (Criteria) this;
        }

        public Criteria andOther1EqualTo(String value) {
            addCriterion("other1 =", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotEqualTo(String value) {
            addCriterion("other1 <>", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThan(String value) {
            addCriterion("other1 >", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThanOrEqualTo(String value) {
            addCriterion("other1 >=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThan(String value) {
            addCriterion("other1 <", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThanOrEqualTo(String value) {
            addCriterion("other1 <=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Like(String value) {
            addCriterion("other1 like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotLike(String value) {
            addCriterion("other1 not like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1In(List<String> values) {
            addCriterion("other1 in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotIn(List<String> values) {
            addCriterion("other1 not in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Between(String value1, String value2) {
            addCriterion("other1 between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotBetween(String value1, String value2) {
            addCriterion("other1 not between", value1, value2, "other1");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}