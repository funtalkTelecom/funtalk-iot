package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbLPaybillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLPaybillExample() {
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

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNull() {
            addCriterion("bill_date is null");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNotNull() {
            addCriterion("bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andBillDateEqualTo(Integer value) {
            addCriterion("bill_date =", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotEqualTo(Integer value) {
            addCriterion("bill_date <>", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThan(Integer value) {
            addCriterion("bill_date >", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_date >=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThan(Integer value) {
            addCriterion("bill_date <", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThanOrEqualTo(Integer value) {
            addCriterion("bill_date <=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIn(List<Integer> values) {
            addCriterion("bill_date in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotIn(List<Integer> values) {
            addCriterion("bill_date not in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateBetween(Integer value1, Integer value2) {
            addCriterion("bill_date between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_date not between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillItemIsNull() {
            addCriterion("bill_item is null");
            return (Criteria) this;
        }

        public Criteria andBillItemIsNotNull() {
            addCriterion("bill_item is not null");
            return (Criteria) this;
        }

        public Criteria andBillItemEqualTo(String value) {
            addCriterion("bill_item =", value, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemNotEqualTo(String value) {
            addCriterion("bill_item <>", value, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemGreaterThan(String value) {
            addCriterion("bill_item >", value, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemGreaterThanOrEqualTo(String value) {
            addCriterion("bill_item >=", value, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemLessThan(String value) {
            addCriterion("bill_item <", value, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemLessThanOrEqualTo(String value) {
            addCriterion("bill_item <=", value, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemLike(String value) {
            addCriterion("bill_item like", value, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemNotLike(String value) {
            addCriterion("bill_item not like", value, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemIn(List<String> values) {
            addCriterion("bill_item in", values, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemNotIn(List<String> values) {
            addCriterion("bill_item not in", values, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemBetween(String value1, String value2) {
            addCriterion("bill_item between", value1, value2, "billItem");
            return (Criteria) this;
        }

        public Criteria andBillItemNotBetween(String value1, String value2) {
            addCriterion("bill_item not between", value1, value2, "billItem");
            return (Criteria) this;
        }

        public Criteria andDepositIdIsNull() {
            addCriterion("deposit_id is null");
            return (Criteria) this;
        }

        public Criteria andDepositIdIsNotNull() {
            addCriterion("deposit_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepositIdEqualTo(Integer value) {
            addCriterion("deposit_id =", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotEqualTo(Integer value) {
            addCriterion("deposit_id <>", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdGreaterThan(Integer value) {
            addCriterion("deposit_id >", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_id >=", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLessThan(Integer value) {
            addCriterion("deposit_id <", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_id <=", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdIn(List<Integer> values) {
            addCriterion("deposit_id in", values, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotIn(List<Integer> values) {
            addCriterion("deposit_id not in", values, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdBetween(Integer value1, Integer value2) {
            addCriterion("deposit_id between", value1, value2, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_id not between", value1, value2, "depositId");
            return (Criteria) this;
        }

        public Criteria andDeCodeIsNull() {
            addCriterion("de_code is null");
            return (Criteria) this;
        }

        public Criteria andDeCodeIsNotNull() {
            addCriterion("de_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeCodeEqualTo(String value) {
            addCriterion("de_code =", value, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeNotEqualTo(String value) {
            addCriterion("de_code <>", value, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeGreaterThan(String value) {
            addCriterion("de_code >", value, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("de_code >=", value, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeLessThan(String value) {
            addCriterion("de_code <", value, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeLessThanOrEqualTo(String value) {
            addCriterion("de_code <=", value, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeLike(String value) {
            addCriterion("de_code like", value, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeNotLike(String value) {
            addCriterion("de_code not like", value, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeIn(List<String> values) {
            addCriterion("de_code in", values, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeNotIn(List<String> values) {
            addCriterion("de_code not in", values, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeBetween(String value1, String value2) {
            addCriterion("de_code between", value1, value2, "deCode");
            return (Criteria) this;
        }

        public Criteria andDeCodeNotBetween(String value1, String value2) {
            addCriterion("de_code not between", value1, value2, "deCode");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(Integer value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(Integer value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(Integer value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(Integer value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<Integer> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<Integer> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(Integer value1, Integer value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNull() {
            addCriterion("pay_mode is null");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNotNull() {
            addCriterion("pay_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeEqualTo(String value) {
            addCriterion("pay_mode =", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotEqualTo(String value) {
            addCriterion("pay_mode <>", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThan(String value) {
            addCriterion("pay_mode >", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_mode >=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThan(String value) {
            addCriterion("pay_mode <", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThanOrEqualTo(String value) {
            addCriterion("pay_mode <=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLike(String value) {
            addCriterion("pay_mode like", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotLike(String value) {
            addCriterion("pay_mode not like", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeIn(List<String> values) {
            addCriterion("pay_mode in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotIn(List<String> values) {
            addCriterion("pay_mode not in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeBetween(String value1, String value2) {
            addCriterion("pay_mode between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotBetween(String value1, String value2) {
            addCriterion("pay_mode not between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("charge_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(Integer value) {
            addCriterion("charge_id =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(Integer value) {
            addCriterion("charge_id <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(Integer value) {
            addCriterion("charge_id >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_id >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(Integer value) {
            addCriterion("charge_id <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_id <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<Integer> values) {
            addCriterion("charge_id in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<Integer> values) {
            addCriterion("charge_id not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_id between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_id not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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