package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbPKeywordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPKeywordsExample() {
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

        public Criteria andInsIsNull() {
            addCriterion("ins is null");
            return (Criteria) this;
        }

        public Criteria andInsIsNotNull() {
            addCriterion("ins is not null");
            return (Criteria) this;
        }

        public Criteria andInsEqualTo(String value) {
            addCriterion("ins =", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsNotEqualTo(String value) {
            addCriterion("ins <>", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsGreaterThan(String value) {
            addCriterion("ins >", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsGreaterThanOrEqualTo(String value) {
            addCriterion("ins >=", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsLessThan(String value) {
            addCriterion("ins <", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsLessThanOrEqualTo(String value) {
            addCriterion("ins <=", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsLike(String value) {
            addCriterion("ins like", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsNotLike(String value) {
            addCriterion("ins not like", value, "ins");
            return (Criteria) this;
        }

        public Criteria andInsIn(List<String> values) {
            addCriterion("ins in", values, "ins");
            return (Criteria) this;
        }

        public Criteria andInsNotIn(List<String> values) {
            addCriterion("ins not in", values, "ins");
            return (Criteria) this;
        }

        public Criteria andInsBetween(String value1, String value2) {
            addCriterion("ins between", value1, value2, "ins");
            return (Criteria) this;
        }

        public Criteria andInsNotBetween(String value1, String value2) {
            addCriterion("ins not between", value1, value2, "ins");
            return (Criteria) this;
        }

        public Criteria andOutsIsNull() {
            addCriterion("outs is null");
            return (Criteria) this;
        }

        public Criteria andOutsIsNotNull() {
            addCriterion("outs is not null");
            return (Criteria) this;
        }

        public Criteria andOutsEqualTo(String value) {
            addCriterion("outs =", value, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsNotEqualTo(String value) {
            addCriterion("outs <>", value, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsGreaterThan(String value) {
            addCriterion("outs >", value, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsGreaterThanOrEqualTo(String value) {
            addCriterion("outs >=", value, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsLessThan(String value) {
            addCriterion("outs <", value, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsLessThanOrEqualTo(String value) {
            addCriterion("outs <=", value, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsLike(String value) {
            addCriterion("outs like", value, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsNotLike(String value) {
            addCriterion("outs not like", value, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsIn(List<String> values) {
            addCriterion("outs in", values, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsNotIn(List<String> values) {
            addCriterion("outs not in", values, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsBetween(String value1, String value2) {
            addCriterion("outs between", value1, value2, "outs");
            return (Criteria) this;
        }

        public Criteria andOutsNotBetween(String value1, String value2) {
            addCriterion("outs not between", value1, value2, "outs");
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