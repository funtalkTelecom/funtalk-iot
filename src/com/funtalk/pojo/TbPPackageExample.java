package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPPackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPPackageExample() {
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

        public Criteria andPackageIdIsNull() {
            addCriterion("package_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageIdIsNotNull() {
            addCriterion("package_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageIdEqualTo(Integer value) {
            addCriterion("package_id =", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotEqualTo(Integer value) {
            addCriterion("package_id <>", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThan(Integer value) {
            addCriterion("package_id >", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_id >=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThan(Integer value) {
            addCriterion("package_id <", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_id <=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdIn(List<Integer> values) {
            addCriterion("package_id in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotIn(List<Integer> values) {
            addCriterion("package_id not in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdBetween(Integer value1, Integer value2) {
            addCriterion("package_id between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_id not between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNull() {
            addCriterion("package_type is null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNotNull() {
            addCriterion("package_type is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeEqualTo(String value) {
            addCriterion("package_type =", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotEqualTo(String value) {
            addCriterion("package_type <>", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThan(String value) {
            addCriterion("package_type >", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("package_type >=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThan(String value) {
            addCriterion("package_type <", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThanOrEqualTo(String value) {
            addCriterion("package_type <=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLike(String value) {
            addCriterion("package_type like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotLike(String value) {
            addCriterion("package_type not like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIn(List<String> values) {
            addCriterion("package_type in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotIn(List<String> values) {
            addCriterion("package_type not in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeBetween(String value1, String value2) {
            addCriterion("package_type between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotBetween(String value1, String value2) {
            addCriterion("package_type not between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNull() {
            addCriterion("package_price is null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNotNull() {
            addCriterion("package_price is not null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceEqualTo(String value) {
            addCriterion("package_price =", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotEqualTo(String value) {
            addCriterion("package_price <>", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThan(String value) {
            addCriterion("package_price >", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThanOrEqualTo(String value) {
            addCriterion("package_price >=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThan(String value) {
            addCriterion("package_price <", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThanOrEqualTo(String value) {
            addCriterion("package_price <=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLike(String value) {
            addCriterion("package_price like", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotLike(String value) {
            addCriterion("package_price not like", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIn(List<String> values) {
            addCriterion("package_price in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotIn(List<String> values) {
            addCriterion("package_price not in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceBetween(String value1, String value2) {
            addCriterion("package_price between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotBetween(String value1, String value2) {
            addCriterion("package_price not between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackageCountIsNull() {
            addCriterion("package_count is null");
            return (Criteria) this;
        }

        public Criteria andPackageCountIsNotNull() {
            addCriterion("package_count is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCountEqualTo(Integer value) {
            addCriterion("package_count =", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountNotEqualTo(Integer value) {
            addCriterion("package_count <>", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountGreaterThan(Integer value) {
            addCriterion("package_count >", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_count >=", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountLessThan(Integer value) {
            addCriterion("package_count <", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountLessThanOrEqualTo(Integer value) {
            addCriterion("package_count <=", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountIn(List<Integer> values) {
            addCriterion("package_count in", values, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountNotIn(List<Integer> values) {
            addCriterion("package_count not in", values, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountBetween(Integer value1, Integer value2) {
            addCriterion("package_count between", value1, value2, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("package_count not between", value1, value2, "packageCount");
            return (Criteria) this;
        }

        public Criteria andBossPackIdIsNull() {
            addCriterion("boss_pack_id is null");
            return (Criteria) this;
        }

        public Criteria andBossPackIdIsNotNull() {
            addCriterion("boss_pack_id is not null");
            return (Criteria) this;
        }

        public Criteria andBossPackIdEqualTo(String value) {
            addCriterion("boss_pack_id =", value, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdNotEqualTo(String value) {
            addCriterion("boss_pack_id <>", value, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdGreaterThan(String value) {
            addCriterion("boss_pack_id >", value, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdGreaterThanOrEqualTo(String value) {
            addCriterion("boss_pack_id >=", value, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdLessThan(String value) {
            addCriterion("boss_pack_id <", value, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdLessThanOrEqualTo(String value) {
            addCriterion("boss_pack_id <=", value, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdLike(String value) {
            addCriterion("boss_pack_id like", value, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdNotLike(String value) {
            addCriterion("boss_pack_id not like", value, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdIn(List<String> values) {
            addCriterion("boss_pack_id in", values, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdNotIn(List<String> values) {
            addCriterion("boss_pack_id not in", values, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdBetween(String value1, String value2) {
            addCriterion("boss_pack_id between", value1, value2, "bossPackId");
            return (Criteria) this;
        }

        public Criteria andBossPackIdNotBetween(String value1, String value2) {
            addCriterion("boss_pack_id not between", value1, value2, "bossPackId");
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