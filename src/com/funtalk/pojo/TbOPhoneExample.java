package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOPhoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOPhoneExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andServiceKindIsNull() {
            addCriterion("service_kind is null");
            return (Criteria) this;
        }

        public Criteria andServiceKindIsNotNull() {
            addCriterion("service_kind is not null");
            return (Criteria) this;
        }

        public Criteria andServiceKindEqualTo(String value) {
            addCriterion("service_kind =", value, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindNotEqualTo(String value) {
            addCriterion("service_kind <>", value, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindGreaterThan(String value) {
            addCriterion("service_kind >", value, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindGreaterThanOrEqualTo(String value) {
            addCriterion("service_kind >=", value, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindLessThan(String value) {
            addCriterion("service_kind <", value, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindLessThanOrEqualTo(String value) {
            addCriterion("service_kind <=", value, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindLike(String value) {
            addCriterion("service_kind like", value, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindNotLike(String value) {
            addCriterion("service_kind not like", value, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindIn(List<String> values) {
            addCriterion("service_kind in", values, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindNotIn(List<String> values) {
            addCriterion("service_kind not in", values, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindBetween(String value1, String value2) {
            addCriterion("service_kind between", value1, value2, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andServiceKindNotBetween(String value1, String value2) {
            addCriterion("service_kind not between", value1, value2, "serviceKind");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("service_id like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("service_id not like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("cust_id like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("cust_id not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
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

        public Criteria andDayLimitIsNull() {
            addCriterion("day_limit is null");
            return (Criteria) this;
        }

        public Criteria andDayLimitIsNotNull() {
            addCriterion("day_limit is not null");
            return (Criteria) this;
        }

        public Criteria andDayLimitEqualTo(Integer value) {
            addCriterion("day_limit =", value, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayLimitNotEqualTo(Integer value) {
            addCriterion("day_limit <>", value, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayLimitGreaterThan(Integer value) {
            addCriterion("day_limit >", value, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_limit >=", value, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayLimitLessThan(Integer value) {
            addCriterion("day_limit <", value, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayLimitLessThanOrEqualTo(Integer value) {
            addCriterion("day_limit <=", value, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayLimitIn(List<Integer> values) {
            addCriterion("day_limit in", values, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayLimitNotIn(List<Integer> values) {
            addCriterion("day_limit not in", values, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayLimitBetween(Integer value1, Integer value2) {
            addCriterion("day_limit between", value1, value2, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("day_limit not between", value1, value2, "dayLimit");
            return (Criteria) this;
        }

        public Criteria andDayUsedIsNull() {
            addCriterion("day_used is null");
            return (Criteria) this;
        }

        public Criteria andDayUsedIsNotNull() {
            addCriterion("day_used is not null");
            return (Criteria) this;
        }

        public Criteria andDayUsedEqualTo(Integer value) {
            addCriterion("day_used =", value, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andDayUsedNotEqualTo(Integer value) {
            addCriterion("day_used <>", value, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andDayUsedGreaterThan(Integer value) {
            addCriterion("day_used >", value, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andDayUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_used >=", value, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andDayUsedLessThan(Integer value) {
            addCriterion("day_used <", value, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andDayUsedLessThanOrEqualTo(Integer value) {
            addCriterion("day_used <=", value, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andDayUsedIn(List<Integer> values) {
            addCriterion("day_used in", values, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andDayUsedNotIn(List<Integer> values) {
            addCriterion("day_used not in", values, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andDayUsedBetween(Integer value1, Integer value2) {
            addCriterion("day_used between", value1, value2, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andDayUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("day_used not between", value1, value2, "dayUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedIsNull() {
            addCriterion("month_used is null");
            return (Criteria) this;
        }

        public Criteria andMonthUsedIsNotNull() {
            addCriterion("month_used is not null");
            return (Criteria) this;
        }

        public Criteria andMonthUsedEqualTo(Integer value) {
            addCriterion("month_used =", value, "monthUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedNotEqualTo(Integer value) {
            addCriterion("month_used <>", value, "monthUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedGreaterThan(Integer value) {
            addCriterion("month_used >", value, "monthUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_used >=", value, "monthUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedLessThan(Integer value) {
            addCriterion("month_used <", value, "monthUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedLessThanOrEqualTo(Integer value) {
            addCriterion("month_used <=", value, "monthUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedIn(List<Integer> values) {
            addCriterion("month_used in", values, "monthUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedNotIn(List<Integer> values) {
            addCriterion("month_used not in", values, "monthUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedBetween(Integer value1, Integer value2) {
            addCriterion("month_used between", value1, value2, "monthUsed");
            return (Criteria) this;
        }

        public Criteria andMonthUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("month_used not between", value1, value2, "monthUsed");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIfUseIsNull() {
            addCriterion("if_use is null");
            return (Criteria) this;
        }

        public Criteria andIfUseIsNotNull() {
            addCriterion("if_use is not null");
            return (Criteria) this;
        }

        public Criteria andIfUseEqualTo(String value) {
            addCriterion("if_use =", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseNotEqualTo(String value) {
            addCriterion("if_use <>", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseGreaterThan(String value) {
            addCriterion("if_use >", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseGreaterThanOrEqualTo(String value) {
            addCriterion("if_use >=", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseLessThan(String value) {
            addCriterion("if_use <", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseLessThanOrEqualTo(String value) {
            addCriterion("if_use <=", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseLike(String value) {
            addCriterion("if_use like", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseNotLike(String value) {
            addCriterion("if_use not like", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseIn(List<String> values) {
            addCriterion("if_use in", values, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseNotIn(List<String> values) {
            addCriterion("if_use not in", values, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseBetween(String value1, String value2) {
            addCriterion("if_use between", value1, value2, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseNotBetween(String value1, String value2) {
            addCriterion("if_use not between", value1, value2, "ifUse");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
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