package cn.qdama.siss.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Branch_stockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Branch_stockExample() {
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

        public Criteria andItemNoIsNull() {
            addCriterion("item_no is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("item_no is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(String value) {
            addCriterion("item_no =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(String value) {
            addCriterion("item_no <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(String value) {
            addCriterion("item_no >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("item_no >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(String value) {
            addCriterion("item_no <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(String value) {
            addCriterion("item_no <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLike(String value) {
            addCriterion("item_no like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotLike(String value) {
            addCriterion("item_no not like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<String> values) {
            addCriterion("item_no in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<String> values) {
            addCriterion("item_no not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(String value1, String value2) {
            addCriterion("item_no between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(String value1, String value2) {
            addCriterion("item_no not between", value1, value2, "itemNo");
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

        public Criteria andStockQtyIsNull() {
            addCriterion("stock_qty is null");
            return (Criteria) this;
        }

        public Criteria andStockQtyIsNotNull() {
            addCriterion("stock_qty is not null");
            return (Criteria) this;
        }

        public Criteria andStockQtyEqualTo(BigDecimal value) {
            addCriterion("stock_qty =", value, "stockQty");
            return (Criteria) this;
        }

        public Criteria andStockQtyNotEqualTo(BigDecimal value) {
            addCriterion("stock_qty <>", value, "stockQty");
            return (Criteria) this;
        }

        public Criteria andStockQtyGreaterThan(BigDecimal value) {
            addCriterion("stock_qty >", value, "stockQty");
            return (Criteria) this;
        }

        public Criteria andStockQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_qty >=", value, "stockQty");
            return (Criteria) this;
        }

        public Criteria andStockQtyLessThan(BigDecimal value) {
            addCriterion("stock_qty <", value, "stockQty");
            return (Criteria) this;
        }

        public Criteria andStockQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_qty <=", value, "stockQty");
            return (Criteria) this;
        }

        public Criteria andStockQtyIn(List<BigDecimal> values) {
            addCriterion("stock_qty in", values, "stockQty");
            return (Criteria) this;
        }

        public Criteria andStockQtyNotIn(List<BigDecimal> values) {
            addCriterion("stock_qty not in", values, "stockQty");
            return (Criteria) this;
        }

        public Criteria andStockQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_qty between", value1, value2, "stockQty");
            return (Criteria) this;
        }

        public Criteria andStockQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_qty not between", value1, value2, "stockQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyIsNull() {
            addCriterion("route_qty is null");
            return (Criteria) this;
        }

        public Criteria andRouteQtyIsNotNull() {
            addCriterion("route_qty is not null");
            return (Criteria) this;
        }

        public Criteria andRouteQtyEqualTo(BigDecimal value) {
            addCriterion("route_qty =", value, "routeQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyNotEqualTo(BigDecimal value) {
            addCriterion("route_qty <>", value, "routeQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyGreaterThan(BigDecimal value) {
            addCriterion("route_qty >", value, "routeQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("route_qty >=", value, "routeQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyLessThan(BigDecimal value) {
            addCriterion("route_qty <", value, "routeQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("route_qty <=", value, "routeQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyIn(List<BigDecimal> values) {
            addCriterion("route_qty in", values, "routeQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyNotIn(List<BigDecimal> values) {
            addCriterion("route_qty not in", values, "routeQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("route_qty between", value1, value2, "routeQty");
            return (Criteria) this;
        }

        public Criteria andRouteQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("route_qty not between", value1, value2, "routeQty");
            return (Criteria) this;
        }

        public Criteria andAvgCostIsNull() {
            addCriterion("avg_cost is null");
            return (Criteria) this;
        }

        public Criteria andAvgCostIsNotNull() {
            addCriterion("avg_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAvgCostEqualTo(BigDecimal value) {
            addCriterion("avg_cost =", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostNotEqualTo(BigDecimal value) {
            addCriterion("avg_cost <>", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostGreaterThan(BigDecimal value) {
            addCriterion("avg_cost >", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_cost >=", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostLessThan(BigDecimal value) {
            addCriterion("avg_cost <", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_cost <=", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostIn(List<BigDecimal> values) {
            addCriterion("avg_cost in", values, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostNotIn(List<BigDecimal> values) {
            addCriterion("avg_cost not in", values, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_cost between", value1, value2, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_cost not between", value1, value2, "avgCost");
            return (Criteria) this;
        }

        public Criteria andCostAmtIsNull() {
            addCriterion("cost_amt is null");
            return (Criteria) this;
        }

        public Criteria andCostAmtIsNotNull() {
            addCriterion("cost_amt is not null");
            return (Criteria) this;
        }

        public Criteria andCostAmtEqualTo(BigDecimal value) {
            addCriterion("cost_amt =", value, "costAmt");
            return (Criteria) this;
        }

        public Criteria andCostAmtNotEqualTo(BigDecimal value) {
            addCriterion("cost_amt <>", value, "costAmt");
            return (Criteria) this;
        }

        public Criteria andCostAmtGreaterThan(BigDecimal value) {
            addCriterion("cost_amt >", value, "costAmt");
            return (Criteria) this;
        }

        public Criteria andCostAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_amt >=", value, "costAmt");
            return (Criteria) this;
        }

        public Criteria andCostAmtLessThan(BigDecimal value) {
            addCriterion("cost_amt <", value, "costAmt");
            return (Criteria) this;
        }

        public Criteria andCostAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_amt <=", value, "costAmt");
            return (Criteria) this;
        }

        public Criteria andCostAmtIn(List<BigDecimal> values) {
            addCriterion("cost_amt in", values, "costAmt");
            return (Criteria) this;
        }

        public Criteria andCostAmtNotIn(List<BigDecimal> values) {
            addCriterion("cost_amt not in", values, "costAmt");
            return (Criteria) this;
        }

        public Criteria andCostAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_amt between", value1, value2, "costAmt");
            return (Criteria) this;
        }

        public Criteria andCostAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_amt not between", value1, value2, "costAmt");
            return (Criteria) this;
        }

        public Criteria andLastInpriceIsNull() {
            addCriterion("last_inprice is null");
            return (Criteria) this;
        }

        public Criteria andLastInpriceIsNotNull() {
            addCriterion("last_inprice is not null");
            return (Criteria) this;
        }

        public Criteria andLastInpriceEqualTo(BigDecimal value) {
            addCriterion("last_inprice =", value, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastInpriceNotEqualTo(BigDecimal value) {
            addCriterion("last_inprice <>", value, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastInpriceGreaterThan(BigDecimal value) {
            addCriterion("last_inprice >", value, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastInpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_inprice >=", value, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastInpriceLessThan(BigDecimal value) {
            addCriterion("last_inprice <", value, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastInpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_inprice <=", value, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastInpriceIn(List<BigDecimal> values) {
            addCriterion("last_inprice in", values, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastInpriceNotIn(List<BigDecimal> values) {
            addCriterion("last_inprice not in", values, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastInpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_inprice between", value1, value2, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastInpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_inprice not between", value1, value2, "lastInprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceIsNull() {
            addCriterion("last_baseprice is null");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceIsNotNull() {
            addCriterion("last_baseprice is not null");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceEqualTo(BigDecimal value) {
            addCriterion("last_baseprice =", value, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceNotEqualTo(BigDecimal value) {
            addCriterion("last_baseprice <>", value, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceGreaterThan(BigDecimal value) {
            addCriterion("last_baseprice >", value, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_baseprice >=", value, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceLessThan(BigDecimal value) {
            addCriterion("last_baseprice <", value, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_baseprice <=", value, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceIn(List<BigDecimal> values) {
            addCriterion("last_baseprice in", values, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceNotIn(List<BigDecimal> values) {
            addCriterion("last_baseprice not in", values, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_baseprice between", value1, value2, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andLastBasepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_baseprice not between", value1, value2, "lastBaseprice");
            return (Criteria) this;
        }

        public Criteria andMinQtyIsNull() {
            addCriterion("min_qty is null");
            return (Criteria) this;
        }

        public Criteria andMinQtyIsNotNull() {
            addCriterion("min_qty is not null");
            return (Criteria) this;
        }

        public Criteria andMinQtyEqualTo(BigDecimal value) {
            addCriterion("min_qty =", value, "minQty");
            return (Criteria) this;
        }

        public Criteria andMinQtyNotEqualTo(BigDecimal value) {
            addCriterion("min_qty <>", value, "minQty");
            return (Criteria) this;
        }

        public Criteria andMinQtyGreaterThan(BigDecimal value) {
            addCriterion("min_qty >", value, "minQty");
            return (Criteria) this;
        }

        public Criteria andMinQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_qty >=", value, "minQty");
            return (Criteria) this;
        }

        public Criteria andMinQtyLessThan(BigDecimal value) {
            addCriterion("min_qty <", value, "minQty");
            return (Criteria) this;
        }

        public Criteria andMinQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_qty <=", value, "minQty");
            return (Criteria) this;
        }

        public Criteria andMinQtyIn(List<BigDecimal> values) {
            addCriterion("min_qty in", values, "minQty");
            return (Criteria) this;
        }

        public Criteria andMinQtyNotIn(List<BigDecimal> values) {
            addCriterion("min_qty not in", values, "minQty");
            return (Criteria) this;
        }

        public Criteria andMinQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_qty between", value1, value2, "minQty");
            return (Criteria) this;
        }

        public Criteria andMinQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_qty not between", value1, value2, "minQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyIsNull() {
            addCriterion("max_qty is null");
            return (Criteria) this;
        }

        public Criteria andMaxQtyIsNotNull() {
            addCriterion("max_qty is not null");
            return (Criteria) this;
        }

        public Criteria andMaxQtyEqualTo(BigDecimal value) {
            addCriterion("max_qty =", value, "maxQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyNotEqualTo(BigDecimal value) {
            addCriterion("max_qty <>", value, "maxQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyGreaterThan(BigDecimal value) {
            addCriterion("max_qty >", value, "maxQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_qty >=", value, "maxQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyLessThan(BigDecimal value) {
            addCriterion("max_qty <", value, "maxQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_qty <=", value, "maxQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyIn(List<BigDecimal> values) {
            addCriterion("max_qty in", values, "maxQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyNotIn(List<BigDecimal> values) {
            addCriterion("max_qty not in", values, "maxQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_qty between", value1, value2, "maxQty");
            return (Criteria) this;
        }

        public Criteria andMaxQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_qty not between", value1, value2, "maxQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyIsNull() {
            addCriterion("acc_qty is null");
            return (Criteria) this;
        }

        public Criteria andAccQtyIsNotNull() {
            addCriterion("acc_qty is not null");
            return (Criteria) this;
        }

        public Criteria andAccQtyEqualTo(BigDecimal value) {
            addCriterion("acc_qty =", value, "accQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyNotEqualTo(BigDecimal value) {
            addCriterion("acc_qty <>", value, "accQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyGreaterThan(BigDecimal value) {
            addCriterion("acc_qty >", value, "accQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("acc_qty >=", value, "accQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyLessThan(BigDecimal value) {
            addCriterion("acc_qty <", value, "accQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("acc_qty <=", value, "accQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyIn(List<BigDecimal> values) {
            addCriterion("acc_qty in", values, "accQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyNotIn(List<BigDecimal> values) {
            addCriterion("acc_qty not in", values, "accQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acc_qty between", value1, value2, "accQty");
            return (Criteria) this;
        }

        public Criteria andAccQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acc_qty not between", value1, value2, "accQty");
            return (Criteria) this;
        }

        public Criteria andOperDateIsNull() {
            addCriterion("oper_date is null");
            return (Criteria) this;
        }

        public Criteria andOperDateIsNotNull() {
            addCriterion("oper_date is not null");
            return (Criteria) this;
        }

        public Criteria andOperDateEqualTo(Date value) {
            addCriterion("oper_date =", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateNotEqualTo(Date value) {
            addCriterion("oper_date <>", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateGreaterThan(Date value) {
            addCriterion("oper_date >", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateGreaterThanOrEqualTo(Date value) {
            addCriterion("oper_date >=", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateLessThan(Date value) {
            addCriterion("oper_date <", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateLessThanOrEqualTo(Date value) {
            addCriterion("oper_date <=", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateIn(List<Date> values) {
            addCriterion("oper_date in", values, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateNotIn(List<Date> values) {
            addCriterion("oper_date not in", values, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateBetween(Date value1, Date value2) {
            addCriterion("oper_date between", value1, value2, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateNotBetween(Date value1, Date value2) {
            addCriterion("oper_date not between", value1, value2, "operDate");
            return (Criteria) this;
        }

        public Criteria andComFlagIsNull() {
            addCriterion("com_flag is null");
            return (Criteria) this;
        }

        public Criteria andComFlagIsNotNull() {
            addCriterion("com_flag is not null");
            return (Criteria) this;
        }

        public Criteria andComFlagEqualTo(String value) {
            addCriterion("com_flag =", value, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagNotEqualTo(String value) {
            addCriterion("com_flag <>", value, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagGreaterThan(String value) {
            addCriterion("com_flag >", value, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagGreaterThanOrEqualTo(String value) {
            addCriterion("com_flag >=", value, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagLessThan(String value) {
            addCriterion("com_flag <", value, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagLessThanOrEqualTo(String value) {
            addCriterion("com_flag <=", value, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagLike(String value) {
            addCriterion("com_flag like", value, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagNotLike(String value) {
            addCriterion("com_flag not like", value, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagIn(List<String> values) {
            addCriterion("com_flag in", values, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagNotIn(List<String> values) {
            addCriterion("com_flag not in", values, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagBetween(String value1, String value2) {
            addCriterion("com_flag between", value1, value2, "comFlag");
            return (Criteria) this;
        }

        public Criteria andComFlagNotBetween(String value1, String value2) {
            addCriterion("com_flag not between", value1, value2, "comFlag");
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