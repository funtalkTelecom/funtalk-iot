package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSTaskExample() {
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

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskCountIsNull() {
            addCriterion("task_count is null");
            return (Criteria) this;
        }

        public Criteria andTaskCountIsNotNull() {
            addCriterion("task_count is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCountEqualTo(Integer value) {
            addCriterion("task_count =", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountNotEqualTo(Integer value) {
            addCriterion("task_count <>", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountGreaterThan(Integer value) {
            addCriterion("task_count >", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_count >=", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountLessThan(Integer value) {
            addCriterion("task_count <", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountLessThanOrEqualTo(Integer value) {
            addCriterion("task_count <=", value, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountIn(List<Integer> values) {
            addCriterion("task_count in", values, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountNotIn(List<Integer> values) {
            addCriterion("task_count not in", values, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountBetween(Integer value1, Integer value2) {
            addCriterion("task_count between", value1, value2, "taskCount");
            return (Criteria) this;
        }

        public Criteria andTaskCountNotBetween(Integer value1, Integer value2) {
            addCriterion("task_count not between", value1, value2, "taskCount");
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

        public Criteria andSucCountIsNull() {
            addCriterion("suc_count is null");
            return (Criteria) this;
        }

        public Criteria andSucCountIsNotNull() {
            addCriterion("suc_count is not null");
            return (Criteria) this;
        }

        public Criteria andSucCountEqualTo(Integer value) {
            addCriterion("suc_count =", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountNotEqualTo(Integer value) {
            addCriterion("suc_count <>", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountGreaterThan(Integer value) {
            addCriterion("suc_count >", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("suc_count >=", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountLessThan(Integer value) {
            addCriterion("suc_count <", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountLessThanOrEqualTo(Integer value) {
            addCriterion("suc_count <=", value, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountIn(List<Integer> values) {
            addCriterion("suc_count in", values, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountNotIn(List<Integer> values) {
            addCriterion("suc_count not in", values, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountBetween(Integer value1, Integer value2) {
            addCriterion("suc_count between", value1, value2, "sucCount");
            return (Criteria) this;
        }

        public Criteria andSucCountNotBetween(Integer value1, Integer value2) {
            addCriterion("suc_count not between", value1, value2, "sucCount");
            return (Criteria) this;
        }

        public Criteria andFailCountIsNull() {
            addCriterion("fail_count is null");
            return (Criteria) this;
        }

        public Criteria andFailCountIsNotNull() {
            addCriterion("fail_count is not null");
            return (Criteria) this;
        }

        public Criteria andFailCountEqualTo(Integer value) {
            addCriterion("fail_count =", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotEqualTo(Integer value) {
            addCriterion("fail_count <>", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountGreaterThan(Integer value) {
            addCriterion("fail_count >", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fail_count >=", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountLessThan(Integer value) {
            addCriterion("fail_count <", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountLessThanOrEqualTo(Integer value) {
            addCriterion("fail_count <=", value, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountIn(List<Integer> values) {
            addCriterion("fail_count in", values, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotIn(List<Integer> values) {
            addCriterion("fail_count not in", values, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountBetween(Integer value1, Integer value2) {
            addCriterion("fail_count between", value1, value2, "failCount");
            return (Criteria) this;
        }

        public Criteria andFailCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fail_count not between", value1, value2, "failCount");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgIsNull() {
            addCriterion("success_msg is null");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgIsNotNull() {
            addCriterion("success_msg is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgEqualTo(String value) {
            addCriterion("success_msg =", value, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgNotEqualTo(String value) {
            addCriterion("success_msg <>", value, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgGreaterThan(String value) {
            addCriterion("success_msg >", value, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgGreaterThanOrEqualTo(String value) {
            addCriterion("success_msg >=", value, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgLessThan(String value) {
            addCriterion("success_msg <", value, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgLessThanOrEqualTo(String value) {
            addCriterion("success_msg <=", value, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgLike(String value) {
            addCriterion("success_msg like", value, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgNotLike(String value) {
            addCriterion("success_msg not like", value, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgIn(List<String> values) {
            addCriterion("success_msg in", values, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgNotIn(List<String> values) {
            addCriterion("success_msg not in", values, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgBetween(String value1, String value2) {
            addCriterion("success_msg between", value1, value2, "successMsg");
            return (Criteria) this;
        }

        public Criteria andSuccessMsgNotBetween(String value1, String value2) {
            addCriterion("success_msg not between", value1, value2, "successMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgIsNull() {
            addCriterion("fail_msg is null");
            return (Criteria) this;
        }

        public Criteria andFailMsgIsNotNull() {
            addCriterion("fail_msg is not null");
            return (Criteria) this;
        }

        public Criteria andFailMsgEqualTo(String value) {
            addCriterion("fail_msg =", value, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgNotEqualTo(String value) {
            addCriterion("fail_msg <>", value, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgGreaterThan(String value) {
            addCriterion("fail_msg >", value, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgGreaterThanOrEqualTo(String value) {
            addCriterion("fail_msg >=", value, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgLessThan(String value) {
            addCriterion("fail_msg <", value, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgLessThanOrEqualTo(String value) {
            addCriterion("fail_msg <=", value, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgLike(String value) {
            addCriterion("fail_msg like", value, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgNotLike(String value) {
            addCriterion("fail_msg not like", value, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgIn(List<String> values) {
            addCriterion("fail_msg in", values, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgNotIn(List<String> values) {
            addCriterion("fail_msg not in", values, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgBetween(String value1, String value2) {
            addCriterion("fail_msg between", value1, value2, "failMsg");
            return (Criteria) this;
        }

        public Criteria andFailMsgNotBetween(String value1, String value2) {
            addCriterion("fail_msg not between", value1, value2, "failMsg");
            return (Criteria) this;
        }

        public Criteria andReqSeqIsNull() {
            addCriterion("req_seq is null");
            return (Criteria) this;
        }

        public Criteria andReqSeqIsNotNull() {
            addCriterion("req_seq is not null");
            return (Criteria) this;
        }

        public Criteria andReqSeqEqualTo(String value) {
            addCriterion("req_seq =", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqNotEqualTo(String value) {
            addCriterion("req_seq <>", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqGreaterThan(String value) {
            addCriterion("req_seq >", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqGreaterThanOrEqualTo(String value) {
            addCriterion("req_seq >=", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqLessThan(String value) {
            addCriterion("req_seq <", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqLessThanOrEqualTo(String value) {
            addCriterion("req_seq <=", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqLike(String value) {
            addCriterion("req_seq like", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqNotLike(String value) {
            addCriterion("req_seq not like", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqIn(List<String> values) {
            addCriterion("req_seq in", values, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqNotIn(List<String> values) {
            addCriterion("req_seq not in", values, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqBetween(String value1, String value2) {
            addCriterion("req_seq between", value1, value2, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqNotBetween(String value1, String value2) {
            addCriterion("req_seq not between", value1, value2, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
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

        public Criteria andIfSendIsNull() {
            addCriterion("if_send is null");
            return (Criteria) this;
        }

        public Criteria andIfSendIsNotNull() {
            addCriterion("if_send is not null");
            return (Criteria) this;
        }

        public Criteria andIfSendEqualTo(String value) {
            addCriterion("if_send =", value, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendNotEqualTo(String value) {
            addCriterion("if_send <>", value, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendGreaterThan(String value) {
            addCriterion("if_send >", value, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendGreaterThanOrEqualTo(String value) {
            addCriterion("if_send >=", value, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendLessThan(String value) {
            addCriterion("if_send <", value, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendLessThanOrEqualTo(String value) {
            addCriterion("if_send <=", value, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendLike(String value) {
            addCriterion("if_send like", value, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendNotLike(String value) {
            addCriterion("if_send not like", value, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendIn(List<String> values) {
            addCriterion("if_send in", values, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendNotIn(List<String> values) {
            addCriterion("if_send not in", values, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendBetween(String value1, String value2) {
            addCriterion("if_send between", value1, value2, "ifSend");
            return (Criteria) this;
        }

        public Criteria andIfSendNotBetween(String value1, String value2) {
            addCriterion("if_send not between", value1, value2, "ifSend");
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