package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSPhoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSPhoneExample() {
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

        public Criteria andIccidIsNull() {
            addCriterion("iccid is null");
            return (Criteria) this;
        }

        public Criteria andIccidIsNotNull() {
            addCriterion("iccid is not null");
            return (Criteria) this;
        }

        public Criteria andIccidEqualTo(String value) {
            addCriterion("iccid =", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotEqualTo(String value) {
            addCriterion("iccid <>", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThan(String value) {
            addCriterion("iccid >", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThanOrEqualTo(String value) {
            addCriterion("iccid >=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThan(String value) {
            addCriterion("iccid <", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThanOrEqualTo(String value) {
            addCriterion("iccid <=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLike(String value) {
            addCriterion("iccid like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotLike(String value) {
            addCriterion("iccid not like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidIn(List<String> values) {
            addCriterion("iccid in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotIn(List<String> values) {
            addCriterion("iccid not in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidBetween(String value1, String value2) {
            addCriterion("iccid between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotBetween(String value1, String value2) {
            addCriterion("iccid not between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccid2IsNull() {
            addCriterion("iccid_2 is null");
            return (Criteria) this;
        }

        public Criteria andIccid2IsNotNull() {
            addCriterion("iccid_2 is not null");
            return (Criteria) this;
        }

        public Criteria andIccid2EqualTo(String value) {
            addCriterion("iccid_2 =", value, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2NotEqualTo(String value) {
            addCriterion("iccid_2 <>", value, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2GreaterThan(String value) {
            addCriterion("iccid_2 >", value, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2GreaterThanOrEqualTo(String value) {
            addCriterion("iccid_2 >=", value, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2LessThan(String value) {
            addCriterion("iccid_2 <", value, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2LessThanOrEqualTo(String value) {
            addCriterion("iccid_2 <=", value, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2Like(String value) {
            addCriterion("iccid_2 like", value, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2NotLike(String value) {
            addCriterion("iccid_2 not like", value, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2In(List<String> values) {
            addCriterion("iccid_2 in", values, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2NotIn(List<String> values) {
            addCriterion("iccid_2 not in", values, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2Between(String value1, String value2) {
            addCriterion("iccid_2 between", value1, value2, "iccid2");
            return (Criteria) this;
        }

        public Criteria andIccid2NotBetween(String value1, String value2) {
            addCriterion("iccid_2 not between", value1, value2, "iccid2");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andIfSeedIsNull() {
            addCriterion("if_seed is null");
            return (Criteria) this;
        }

        public Criteria andIfSeedIsNotNull() {
            addCriterion("if_seed is not null");
            return (Criteria) this;
        }

        public Criteria andIfSeedEqualTo(Integer value) {
            addCriterion("if_seed =", value, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andIfSeedNotEqualTo(Integer value) {
            addCriterion("if_seed <>", value, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andIfSeedGreaterThan(Integer value) {
            addCriterion("if_seed >", value, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andIfSeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_seed >=", value, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andIfSeedLessThan(Integer value) {
            addCriterion("if_seed <", value, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andIfSeedLessThanOrEqualTo(Integer value) {
            addCriterion("if_seed <=", value, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andIfSeedIn(List<Integer> values) {
            addCriterion("if_seed in", values, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andIfSeedNotIn(List<Integer> values) {
            addCriterion("if_seed not in", values, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andIfSeedBetween(Integer value1, Integer value2) {
            addCriterion("if_seed between", value1, value2, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andIfSeedNotBetween(Integer value1, Integer value2) {
            addCriterion("if_seed not between", value1, value2, "ifSeed");
            return (Criteria) this;
        }

        public Criteria andSeedIccidIsNull() {
            addCriterion("seed_iccid is null");
            return (Criteria) this;
        }

        public Criteria andSeedIccidIsNotNull() {
            addCriterion("seed_iccid is not null");
            return (Criteria) this;
        }

        public Criteria andSeedIccidEqualTo(String value) {
            addCriterion("seed_iccid =", value, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidNotEqualTo(String value) {
            addCriterion("seed_iccid <>", value, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidGreaterThan(String value) {
            addCriterion("seed_iccid >", value, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidGreaterThanOrEqualTo(String value) {
            addCriterion("seed_iccid >=", value, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidLessThan(String value) {
            addCriterion("seed_iccid <", value, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidLessThanOrEqualTo(String value) {
            addCriterion("seed_iccid <=", value, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidLike(String value) {
            addCriterion("seed_iccid like", value, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidNotLike(String value) {
            addCriterion("seed_iccid not like", value, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidIn(List<String> values) {
            addCriterion("seed_iccid in", values, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidNotIn(List<String> values) {
            addCriterion("seed_iccid not in", values, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidBetween(String value1, String value2) {
            addCriterion("seed_iccid between", value1, value2, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedIccidNotBetween(String value1, String value2) {
            addCriterion("seed_iccid not between", value1, value2, "seedIccid");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataIsNull() {
            addCriterion("seedCardData is null");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataIsNotNull() {
            addCriterion("seedCardData is not null");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataEqualTo(String value) {
            addCriterion("seedCardData =", value, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataNotEqualTo(String value) {
            addCriterion("seedCardData <>", value, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataGreaterThan(String value) {
            addCriterion("seedCardData >", value, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataGreaterThanOrEqualTo(String value) {
            addCriterion("seedCardData >=", value, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataLessThan(String value) {
            addCriterion("seedCardData <", value, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataLessThanOrEqualTo(String value) {
            addCriterion("seedCardData <=", value, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataLike(String value) {
            addCriterion("seedCardData like", value, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataNotLike(String value) {
            addCriterion("seedCardData not like", value, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataIn(List<String> values) {
            addCriterion("seedCardData in", values, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataNotIn(List<String> values) {
            addCriterion("seedCardData not in", values, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataBetween(String value1, String value2) {
            addCriterion("seedCardData between", value1, value2, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andSeedcarddataNotBetween(String value1, String value2) {
            addCriterion("seedCardData not between", value1, value2, "seedcarddata");
            return (Criteria) this;
        }

        public Criteria andData1IsNull() {
            addCriterion("data1 is null");
            return (Criteria) this;
        }

        public Criteria andData1IsNotNull() {
            addCriterion("data1 is not null");
            return (Criteria) this;
        }

        public Criteria andData1EqualTo(String value) {
            addCriterion("data1 =", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotEqualTo(String value) {
            addCriterion("data1 <>", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1GreaterThan(String value) {
            addCriterion("data1 >", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1GreaterThanOrEqualTo(String value) {
            addCriterion("data1 >=", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1LessThan(String value) {
            addCriterion("data1 <", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1LessThanOrEqualTo(String value) {
            addCriterion("data1 <=", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1Like(String value) {
            addCriterion("data1 like", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotLike(String value) {
            addCriterion("data1 not like", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1In(List<String> values) {
            addCriterion("data1 in", values, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotIn(List<String> values) {
            addCriterion("data1 not in", values, "data1");
            return (Criteria) this;
        }

        public Criteria andData1Between(String value1, String value2) {
            addCriterion("data1 between", value1, value2, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotBetween(String value1, String value2) {
            addCriterion("data1 not between", value1, value2, "data1");
            return (Criteria) this;
        }

        public Criteria andData2IsNull() {
            addCriterion("data2 is null");
            return (Criteria) this;
        }

        public Criteria andData2IsNotNull() {
            addCriterion("data2 is not null");
            return (Criteria) this;
        }

        public Criteria andData2EqualTo(String value) {
            addCriterion("data2 =", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotEqualTo(String value) {
            addCriterion("data2 <>", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2GreaterThan(String value) {
            addCriterion("data2 >", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2GreaterThanOrEqualTo(String value) {
            addCriterion("data2 >=", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2LessThan(String value) {
            addCriterion("data2 <", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2LessThanOrEqualTo(String value) {
            addCriterion("data2 <=", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2Like(String value) {
            addCriterion("data2 like", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotLike(String value) {
            addCriterion("data2 not like", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2In(List<String> values) {
            addCriterion("data2 in", values, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotIn(List<String> values) {
            addCriterion("data2 not in", values, "data2");
            return (Criteria) this;
        }

        public Criteria andData2Between(String value1, String value2) {
            addCriterion("data2 between", value1, value2, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotBetween(String value1, String value2) {
            addCriterion("data2 not between", value1, value2, "data2");
            return (Criteria) this;
        }

        public Criteria andData3IsNull() {
            addCriterion("data3 is null");
            return (Criteria) this;
        }

        public Criteria andData3IsNotNull() {
            addCriterion("data3 is not null");
            return (Criteria) this;
        }

        public Criteria andData3EqualTo(String value) {
            addCriterion("data3 =", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotEqualTo(String value) {
            addCriterion("data3 <>", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3GreaterThan(String value) {
            addCriterion("data3 >", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3GreaterThanOrEqualTo(String value) {
            addCriterion("data3 >=", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3LessThan(String value) {
            addCriterion("data3 <", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3LessThanOrEqualTo(String value) {
            addCriterion("data3 <=", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3Like(String value) {
            addCriterion("data3 like", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotLike(String value) {
            addCriterion("data3 not like", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3In(List<String> values) {
            addCriterion("data3 in", values, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotIn(List<String> values) {
            addCriterion("data3 not in", values, "data3");
            return (Criteria) this;
        }

        public Criteria andData3Between(String value1, String value2) {
            addCriterion("data3 between", value1, value2, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotBetween(String value1, String value2) {
            addCriterion("data3 not between", value1, value2, "data3");
            return (Criteria) this;
        }

        public Criteria andData4IsNull() {
            addCriterion("data4 is null");
            return (Criteria) this;
        }

        public Criteria andData4IsNotNull() {
            addCriterion("data4 is not null");
            return (Criteria) this;
        }

        public Criteria andData4EqualTo(String value) {
            addCriterion("data4 =", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4NotEqualTo(String value) {
            addCriterion("data4 <>", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4GreaterThan(String value) {
            addCriterion("data4 >", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4GreaterThanOrEqualTo(String value) {
            addCriterion("data4 >=", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4LessThan(String value) {
            addCriterion("data4 <", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4LessThanOrEqualTo(String value) {
            addCriterion("data4 <=", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4Like(String value) {
            addCriterion("data4 like", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4NotLike(String value) {
            addCriterion("data4 not like", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4In(List<String> values) {
            addCriterion("data4 in", values, "data4");
            return (Criteria) this;
        }

        public Criteria andData4NotIn(List<String> values) {
            addCriterion("data4 not in", values, "data4");
            return (Criteria) this;
        }

        public Criteria andData4Between(String value1, String value2) {
            addCriterion("data4 between", value1, value2, "data4");
            return (Criteria) this;
        }

        public Criteria andData4NotBetween(String value1, String value2) {
            addCriterion("data4 not between", value1, value2, "data4");
            return (Criteria) this;
        }

        public Criteria andData5IsNull() {
            addCriterion("data5 is null");
            return (Criteria) this;
        }

        public Criteria andData5IsNotNull() {
            addCriterion("data5 is not null");
            return (Criteria) this;
        }

        public Criteria andData5EqualTo(String value) {
            addCriterion("data5 =", value, "data5");
            return (Criteria) this;
        }

        public Criteria andData5NotEqualTo(String value) {
            addCriterion("data5 <>", value, "data5");
            return (Criteria) this;
        }

        public Criteria andData5GreaterThan(String value) {
            addCriterion("data5 >", value, "data5");
            return (Criteria) this;
        }

        public Criteria andData5GreaterThanOrEqualTo(String value) {
            addCriterion("data5 >=", value, "data5");
            return (Criteria) this;
        }

        public Criteria andData5LessThan(String value) {
            addCriterion("data5 <", value, "data5");
            return (Criteria) this;
        }

        public Criteria andData5LessThanOrEqualTo(String value) {
            addCriterion("data5 <=", value, "data5");
            return (Criteria) this;
        }

        public Criteria andData5Like(String value) {
            addCriterion("data5 like", value, "data5");
            return (Criteria) this;
        }

        public Criteria andData5NotLike(String value) {
            addCriterion("data5 not like", value, "data5");
            return (Criteria) this;
        }

        public Criteria andData5In(List<String> values) {
            addCriterion("data5 in", values, "data5");
            return (Criteria) this;
        }

        public Criteria andData5NotIn(List<String> values) {
            addCriterion("data5 not in", values, "data5");
            return (Criteria) this;
        }

        public Criteria andData5Between(String value1, String value2) {
            addCriterion("data5 between", value1, value2, "data5");
            return (Criteria) this;
        }

        public Criteria andData5NotBetween(String value1, String value2) {
            addCriterion("data5 not between", value1, value2, "data5");
            return (Criteria) this;
        }

        public Criteria andData6IsNull() {
            addCriterion("data6 is null");
            return (Criteria) this;
        }

        public Criteria andData6IsNotNull() {
            addCriterion("data6 is not null");
            return (Criteria) this;
        }

        public Criteria andData6EqualTo(String value) {
            addCriterion("data6 =", value, "data6");
            return (Criteria) this;
        }

        public Criteria andData6NotEqualTo(String value) {
            addCriterion("data6 <>", value, "data6");
            return (Criteria) this;
        }

        public Criteria andData6GreaterThan(String value) {
            addCriterion("data6 >", value, "data6");
            return (Criteria) this;
        }

        public Criteria andData6GreaterThanOrEqualTo(String value) {
            addCriterion("data6 >=", value, "data6");
            return (Criteria) this;
        }

        public Criteria andData6LessThan(String value) {
            addCriterion("data6 <", value, "data6");
            return (Criteria) this;
        }

        public Criteria andData6LessThanOrEqualTo(String value) {
            addCriterion("data6 <=", value, "data6");
            return (Criteria) this;
        }

        public Criteria andData6Like(String value) {
            addCriterion("data6 like", value, "data6");
            return (Criteria) this;
        }

        public Criteria andData6NotLike(String value) {
            addCriterion("data6 not like", value, "data6");
            return (Criteria) this;
        }

        public Criteria andData6In(List<String> values) {
            addCriterion("data6 in", values, "data6");
            return (Criteria) this;
        }

        public Criteria andData6NotIn(List<String> values) {
            addCriterion("data6 not in", values, "data6");
            return (Criteria) this;
        }

        public Criteria andData6Between(String value1, String value2) {
            addCriterion("data6 between", value1, value2, "data6");
            return (Criteria) this;
        }

        public Criteria andData6NotBetween(String value1, String value2) {
            addCriterion("data6 not between", value1, value2, "data6");
            return (Criteria) this;
        }

        public Criteria andData7IsNull() {
            addCriterion("data7 is null");
            return (Criteria) this;
        }

        public Criteria andData7IsNotNull() {
            addCriterion("data7 is not null");
            return (Criteria) this;
        }

        public Criteria andData7EqualTo(String value) {
            addCriterion("data7 =", value, "data7");
            return (Criteria) this;
        }

        public Criteria andData7NotEqualTo(String value) {
            addCriterion("data7 <>", value, "data7");
            return (Criteria) this;
        }

        public Criteria andData7GreaterThan(String value) {
            addCriterion("data7 >", value, "data7");
            return (Criteria) this;
        }

        public Criteria andData7GreaterThanOrEqualTo(String value) {
            addCriterion("data7 >=", value, "data7");
            return (Criteria) this;
        }

        public Criteria andData7LessThan(String value) {
            addCriterion("data7 <", value, "data7");
            return (Criteria) this;
        }

        public Criteria andData7LessThanOrEqualTo(String value) {
            addCriterion("data7 <=", value, "data7");
            return (Criteria) this;
        }

        public Criteria andData7Like(String value) {
            addCriterion("data7 like", value, "data7");
            return (Criteria) this;
        }

        public Criteria andData7NotLike(String value) {
            addCriterion("data7 not like", value, "data7");
            return (Criteria) this;
        }

        public Criteria andData7In(List<String> values) {
            addCriterion("data7 in", values, "data7");
            return (Criteria) this;
        }

        public Criteria andData7NotIn(List<String> values) {
            addCriterion("data7 not in", values, "data7");
            return (Criteria) this;
        }

        public Criteria andData7Between(String value1, String value2) {
            addCriterion("data7 between", value1, value2, "data7");
            return (Criteria) this;
        }

        public Criteria andData7NotBetween(String value1, String value2) {
            addCriterion("data7 not between", value1, value2, "data7");
            return (Criteria) this;
        }

        public Criteria andData8IsNull() {
            addCriterion("data8 is null");
            return (Criteria) this;
        }

        public Criteria andData8IsNotNull() {
            addCriterion("data8 is not null");
            return (Criteria) this;
        }

        public Criteria andData8EqualTo(String value) {
            addCriterion("data8 =", value, "data8");
            return (Criteria) this;
        }

        public Criteria andData8NotEqualTo(String value) {
            addCriterion("data8 <>", value, "data8");
            return (Criteria) this;
        }

        public Criteria andData8GreaterThan(String value) {
            addCriterion("data8 >", value, "data8");
            return (Criteria) this;
        }

        public Criteria andData8GreaterThanOrEqualTo(String value) {
            addCriterion("data8 >=", value, "data8");
            return (Criteria) this;
        }

        public Criteria andData8LessThan(String value) {
            addCriterion("data8 <", value, "data8");
            return (Criteria) this;
        }

        public Criteria andData8LessThanOrEqualTo(String value) {
            addCriterion("data8 <=", value, "data8");
            return (Criteria) this;
        }

        public Criteria andData8Like(String value) {
            addCriterion("data8 like", value, "data8");
            return (Criteria) this;
        }

        public Criteria andData8NotLike(String value) {
            addCriterion("data8 not like", value, "data8");
            return (Criteria) this;
        }

        public Criteria andData8In(List<String> values) {
            addCriterion("data8 in", values, "data8");
            return (Criteria) this;
        }

        public Criteria andData8NotIn(List<String> values) {
            addCriterion("data8 not in", values, "data8");
            return (Criteria) this;
        }

        public Criteria andData8Between(String value1, String value2) {
            addCriterion("data8 between", value1, value2, "data8");
            return (Criteria) this;
        }

        public Criteria andData8NotBetween(String value1, String value2) {
            addCriterion("data8 not between", value1, value2, "data8");
            return (Criteria) this;
        }

        public Criteria andData9IsNull() {
            addCriterion("data9 is null");
            return (Criteria) this;
        }

        public Criteria andData9IsNotNull() {
            addCriterion("data9 is not null");
            return (Criteria) this;
        }

        public Criteria andData9EqualTo(String value) {
            addCriterion("data9 =", value, "data9");
            return (Criteria) this;
        }

        public Criteria andData9NotEqualTo(String value) {
            addCriterion("data9 <>", value, "data9");
            return (Criteria) this;
        }

        public Criteria andData9GreaterThan(String value) {
            addCriterion("data9 >", value, "data9");
            return (Criteria) this;
        }

        public Criteria andData9GreaterThanOrEqualTo(String value) {
            addCriterion("data9 >=", value, "data9");
            return (Criteria) this;
        }

        public Criteria andData9LessThan(String value) {
            addCriterion("data9 <", value, "data9");
            return (Criteria) this;
        }

        public Criteria andData9LessThanOrEqualTo(String value) {
            addCriterion("data9 <=", value, "data9");
            return (Criteria) this;
        }

        public Criteria andData9Like(String value) {
            addCriterion("data9 like", value, "data9");
            return (Criteria) this;
        }

        public Criteria andData9NotLike(String value) {
            addCriterion("data9 not like", value, "data9");
            return (Criteria) this;
        }

        public Criteria andData9In(List<String> values) {
            addCriterion("data9 in", values, "data9");
            return (Criteria) this;
        }

        public Criteria andData9NotIn(List<String> values) {
            addCriterion("data9 not in", values, "data9");
            return (Criteria) this;
        }

        public Criteria andData9Between(String value1, String value2) {
            addCriterion("data9 between", value1, value2, "data9");
            return (Criteria) this;
        }

        public Criteria andData9NotBetween(String value1, String value2) {
            addCriterion("data9 not between", value1, value2, "data9");
            return (Criteria) this;
        }

        public Criteria andData10IsNull() {
            addCriterion("data10 is null");
            return (Criteria) this;
        }

        public Criteria andData10IsNotNull() {
            addCriterion("data10 is not null");
            return (Criteria) this;
        }

        public Criteria andData10EqualTo(String value) {
            addCriterion("data10 =", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotEqualTo(String value) {
            addCriterion("data10 <>", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10GreaterThan(String value) {
            addCriterion("data10 >", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10GreaterThanOrEqualTo(String value) {
            addCriterion("data10 >=", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10LessThan(String value) {
            addCriterion("data10 <", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10LessThanOrEqualTo(String value) {
            addCriterion("data10 <=", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10Like(String value) {
            addCriterion("data10 like", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotLike(String value) {
            addCriterion("data10 not like", value, "data10");
            return (Criteria) this;
        }

        public Criteria andData10In(List<String> values) {
            addCriterion("data10 in", values, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotIn(List<String> values) {
            addCriterion("data10 not in", values, "data10");
            return (Criteria) this;
        }

        public Criteria andData10Between(String value1, String value2) {
            addCriterion("data10 between", value1, value2, "data10");
            return (Criteria) this;
        }

        public Criteria andData10NotBetween(String value1, String value2) {
            addCriterion("data10 not between", value1, value2, "data10");
            return (Criteria) this;
        }

        public Criteria andChangedataIsNull() {
            addCriterion("changeData is null");
            return (Criteria) this;
        }

        public Criteria andChangedataIsNotNull() {
            addCriterion("changeData is not null");
            return (Criteria) this;
        }

        public Criteria andChangedataEqualTo(String value) {
            addCriterion("changeData =", value, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataNotEqualTo(String value) {
            addCriterion("changeData <>", value, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataGreaterThan(String value) {
            addCriterion("changeData >", value, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataGreaterThanOrEqualTo(String value) {
            addCriterion("changeData >=", value, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataLessThan(String value) {
            addCriterion("changeData <", value, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataLessThanOrEqualTo(String value) {
            addCriterion("changeData <=", value, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataLike(String value) {
            addCriterion("changeData like", value, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataNotLike(String value) {
            addCriterion("changeData not like", value, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataIn(List<String> values) {
            addCriterion("changeData in", values, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataNotIn(List<String> values) {
            addCriterion("changeData not in", values, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataBetween(String value1, String value2) {
            addCriterion("changeData between", value1, value2, "changedata");
            return (Criteria) this;
        }

        public Criteria andChangedataNotBetween(String value1, String value2) {
            addCriterion("changeData not between", value1, value2, "changedata");
            return (Criteria) this;
        }

        public Criteria andDeldataIsNull() {
            addCriterion("delData is null");
            return (Criteria) this;
        }

        public Criteria andDeldataIsNotNull() {
            addCriterion("delData is not null");
            return (Criteria) this;
        }

        public Criteria andDeldataEqualTo(String value) {
            addCriterion("delData =", value, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataNotEqualTo(String value) {
            addCriterion("delData <>", value, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataGreaterThan(String value) {
            addCriterion("delData >", value, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataGreaterThanOrEqualTo(String value) {
            addCriterion("delData >=", value, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataLessThan(String value) {
            addCriterion("delData <", value, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataLessThanOrEqualTo(String value) {
            addCriterion("delData <=", value, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataLike(String value) {
            addCriterion("delData like", value, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataNotLike(String value) {
            addCriterion("delData not like", value, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataIn(List<String> values) {
            addCriterion("delData in", values, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataNotIn(List<String> values) {
            addCriterion("delData not in", values, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataBetween(String value1, String value2) {
            addCriterion("delData between", value1, value2, "deldata");
            return (Criteria) this;
        }

        public Criteria andDeldataNotBetween(String value1, String value2) {
            addCriterion("delData not between", value1, value2, "deldata");
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

        public Criteria andStateTimeIsNull() {
            addCriterion("state_time is null");
            return (Criteria) this;
        }

        public Criteria andStateTimeIsNotNull() {
            addCriterion("state_time is not null");
            return (Criteria) this;
        }

        public Criteria andStateTimeEqualTo(Date value) {
            addCriterion("state_time =", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotEqualTo(Date value) {
            addCriterion("state_time <>", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThan(Date value) {
            addCriterion("state_time >", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("state_time >=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThan(Date value) {
            addCriterion("state_time <", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThanOrEqualTo(Date value) {
            addCriterion("state_time <=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeIn(List<Date> values) {
            addCriterion("state_time in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotIn(List<Date> values) {
            addCriterion("state_time not in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeBetween(Date value1, Date value2) {
            addCriterion("state_time between", value1, value2, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotBetween(Date value1, Date value2) {
            addCriterion("state_time not between", value1, value2, "stateTime");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelIsNull() {
            addCriterion("phone_channel is null");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelIsNotNull() {
            addCriterion("phone_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelEqualTo(String value) {
            addCriterion("phone_channel =", value, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelNotEqualTo(String value) {
            addCriterion("phone_channel <>", value, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelGreaterThan(String value) {
            addCriterion("phone_channel >", value, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelGreaterThanOrEqualTo(String value) {
            addCriterion("phone_channel >=", value, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelLessThan(String value) {
            addCriterion("phone_channel <", value, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelLessThanOrEqualTo(String value) {
            addCriterion("phone_channel <=", value, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelLike(String value) {
            addCriterion("phone_channel like", value, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelNotLike(String value) {
            addCriterion("phone_channel not like", value, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelIn(List<String> values) {
            addCriterion("phone_channel in", values, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelNotIn(List<String> values) {
            addCriterion("phone_channel not in", values, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelBetween(String value1, String value2) {
            addCriterion("phone_channel between", value1, value2, "phoneChannel");
            return (Criteria) this;
        }

        public Criteria andPhoneChannelNotBetween(String value1, String value2) {
            addCriterion("phone_channel not between", value1, value2, "phoneChannel");
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

        public Criteria andNowUseIsNull() {
            addCriterion("now_use is null");
            return (Criteria) this;
        }

        public Criteria andNowUseIsNotNull() {
            addCriterion("now_use is not null");
            return (Criteria) this;
        }

        public Criteria andNowUseEqualTo(String value) {
            addCriterion("now_use =", value, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseNotEqualTo(String value) {
            addCriterion("now_use <>", value, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseGreaterThan(String value) {
            addCriterion("now_use >", value, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseGreaterThanOrEqualTo(String value) {
            addCriterion("now_use >=", value, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseLessThan(String value) {
            addCriterion("now_use <", value, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseLessThanOrEqualTo(String value) {
            addCriterion("now_use <=", value, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseLike(String value) {
            addCriterion("now_use like", value, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseNotLike(String value) {
            addCriterion("now_use not like", value, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseIn(List<String> values) {
            addCriterion("now_use in", values, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseNotIn(List<String> values) {
            addCriterion("now_use not in", values, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseBetween(String value1, String value2) {
            addCriterion("now_use between", value1, value2, "nowUse");
            return (Criteria) this;
        }

        public Criteria andNowUseNotBetween(String value1, String value2) {
            addCriterion("now_use not between", value1, value2, "nowUse");
            return (Criteria) this;
        }

        public Criteria andRssilevelIsNull() {
            addCriterion("rssilevel is null");
            return (Criteria) this;
        }

        public Criteria andRssilevelIsNotNull() {
            addCriterion("rssilevel is not null");
            return (Criteria) this;
        }

        public Criteria andRssilevelEqualTo(String value) {
            addCriterion("rssilevel =", value, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelNotEqualTo(String value) {
            addCriterion("rssilevel <>", value, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelGreaterThan(String value) {
            addCriterion("rssilevel >", value, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelGreaterThanOrEqualTo(String value) {
            addCriterion("rssilevel >=", value, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelLessThan(String value) {
            addCriterion("rssilevel <", value, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelLessThanOrEqualTo(String value) {
            addCriterion("rssilevel <=", value, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelLike(String value) {
            addCriterion("rssilevel like", value, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelNotLike(String value) {
            addCriterion("rssilevel not like", value, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelIn(List<String> values) {
            addCriterion("rssilevel in", values, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelNotIn(List<String> values) {
            addCriterion("rssilevel not in", values, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelBetween(String value1, String value2) {
            addCriterion("rssilevel between", value1, value2, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andRssilevelNotBetween(String value1, String value2) {
            addCriterion("rssilevel not between", value1, value2, "rssilevel");
            return (Criteria) this;
        }

        public Criteria andDelayIsNull() {
            addCriterion("delay is null");
            return (Criteria) this;
        }

        public Criteria andDelayIsNotNull() {
            addCriterion("delay is not null");
            return (Criteria) this;
        }

        public Criteria andDelayEqualTo(String value) {
            addCriterion("delay =", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotEqualTo(String value) {
            addCriterion("delay <>", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayGreaterThan(String value) {
            addCriterion("delay >", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayGreaterThanOrEqualTo(String value) {
            addCriterion("delay >=", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayLessThan(String value) {
            addCriterion("delay <", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayLessThanOrEqualTo(String value) {
            addCriterion("delay <=", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayLike(String value) {
            addCriterion("delay like", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotLike(String value) {
            addCriterion("delay not like", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayIn(List<String> values) {
            addCriterion("delay in", values, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotIn(List<String> values) {
            addCriterion("delay not in", values, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayBetween(String value1, String value2) {
            addCriterion("delay between", value1, value2, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotBetween(String value1, String value2) {
            addCriterion("delay not between", value1, value2, "delay");
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