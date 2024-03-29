package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbPSystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPSystemExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNull() {
            addCriterion("key_id is null");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNotNull() {
            addCriterion("key_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeyIdEqualTo(String value) {
            addCriterion("key_id =", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotEqualTo(String value) {
            addCriterion("key_id <>", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThan(String value) {
            addCriterion("key_id >", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThanOrEqualTo(String value) {
            addCriterion("key_id >=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThan(String value) {
            addCriterion("key_id <", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThanOrEqualTo(String value) {
            addCriterion("key_id <=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLike(String value) {
            addCriterion("key_id like", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotLike(String value) {
            addCriterion("key_id not like", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdIn(List<String> values) {
            addCriterion("key_id in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotIn(List<String> values) {
            addCriterion("key_id not in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdBetween(String value1, String value2) {
            addCriterion("key_id between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotBetween(String value1, String value2) {
            addCriterion("key_id not between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyValueIsNull() {
            addCriterion("key_value is null");
            return (Criteria) this;
        }

        public Criteria andKeyValueIsNotNull() {
            addCriterion("key_value is not null");
            return (Criteria) this;
        }

        public Criteria andKeyValueEqualTo(String value) {
            addCriterion("key_value =", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueNotEqualTo(String value) {
            addCriterion("key_value <>", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueGreaterThan(String value) {
            addCriterion("key_value >", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueGreaterThanOrEqualTo(String value) {
            addCriterion("key_value >=", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueLessThan(String value) {
            addCriterion("key_value <", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueLessThanOrEqualTo(String value) {
            addCriterion("key_value <=", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueLike(String value) {
            addCriterion("key_value like", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueNotLike(String value) {
            addCriterion("key_value not like", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueIn(List<String> values) {
            addCriterion("key_value in", values, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueNotIn(List<String> values) {
            addCriterion("key_value not in", values, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueBetween(String value1, String value2) {
            addCriterion("key_value between", value1, value2, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueNotBetween(String value1, String value2) {
            addCriterion("key_value not between", value1, value2, "keyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueIsNull() {
            addCriterion("temp_key_value is null");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueIsNotNull() {
            addCriterion("temp_key_value is not null");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueEqualTo(String value) {
            addCriterion("temp_key_value =", value, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueNotEqualTo(String value) {
            addCriterion("temp_key_value <>", value, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueGreaterThan(String value) {
            addCriterion("temp_key_value >", value, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueGreaterThanOrEqualTo(String value) {
            addCriterion("temp_key_value >=", value, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueLessThan(String value) {
            addCriterion("temp_key_value <", value, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueLessThanOrEqualTo(String value) {
            addCriterion("temp_key_value <=", value, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueLike(String value) {
            addCriterion("temp_key_value like", value, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueNotLike(String value) {
            addCriterion("temp_key_value not like", value, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueIn(List<String> values) {
            addCriterion("temp_key_value in", values, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueNotIn(List<String> values) {
            addCriterion("temp_key_value not in", values, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueBetween(String value1, String value2) {
            addCriterion("temp_key_value between", value1, value2, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andTempKeyValueNotBetween(String value1, String value2) {
            addCriterion("temp_key_value not between", value1, value2, "tempKeyValue");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNull() {
            addCriterion("is_audit is null");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNotNull() {
            addCriterion("is_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuditEqualTo(String value) {
            addCriterion("is_audit =", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotEqualTo(String value) {
            addCriterion("is_audit <>", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThan(String value) {
            addCriterion("is_audit >", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThanOrEqualTo(String value) {
            addCriterion("is_audit >=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThan(String value) {
            addCriterion("is_audit <", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThanOrEqualTo(String value) {
            addCriterion("is_audit <=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLike(String value) {
            addCriterion("is_audit like", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotLike(String value) {
            addCriterion("is_audit not like", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditIn(List<String> values) {
            addCriterion("is_audit in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotIn(List<String> values) {
            addCriterion("is_audit not in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditBetween(String value1, String value2) {
            addCriterion("is_audit between", value1, value2, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotBetween(String value1, String value2) {
            addCriterion("is_audit not between", value1, value2, "isAudit");
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