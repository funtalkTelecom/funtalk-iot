package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSSubtaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSSubtaskExample() {
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

        public Criteria andSubIdIsNull() {
            addCriterion("sub_id is null");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNotNull() {
            addCriterion("sub_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubIdEqualTo(Integer value) {
            addCriterion("sub_id =", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotEqualTo(Integer value) {
            addCriterion("sub_id <>", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThan(Integer value) {
            addCriterion("sub_id >", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_id >=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThan(Integer value) {
            addCriterion("sub_id <", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_id <=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdIn(List<Integer> values) {
            addCriterion("sub_id in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotIn(List<Integer> values) {
            addCriterion("sub_id not in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_id between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_id not between", value1, value2, "subId");
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

        public Criteria andPhoneBIsNull() {
            addCriterion("phone_b is null");
            return (Criteria) this;
        }

        public Criteria andPhoneBIsNotNull() {
            addCriterion("phone_b is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneBEqualTo(String value) {
            addCriterion("phone_b =", value, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBNotEqualTo(String value) {
            addCriterion("phone_b <>", value, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBGreaterThan(String value) {
            addCriterion("phone_b >", value, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBGreaterThanOrEqualTo(String value) {
            addCriterion("phone_b >=", value, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBLessThan(String value) {
            addCriterion("phone_b <", value, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBLessThanOrEqualTo(String value) {
            addCriterion("phone_b <=", value, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBLike(String value) {
            addCriterion("phone_b like", value, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBNotLike(String value) {
            addCriterion("phone_b not like", value, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBIn(List<String> values) {
            addCriterion("phone_b in", values, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBNotIn(List<String> values) {
            addCriterion("phone_b not in", values, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBBetween(String value1, String value2) {
            addCriterion("phone_b between", value1, value2, "phoneB");
            return (Criteria) this;
        }

        public Criteria andPhoneBNotBetween(String value1, String value2) {
            addCriterion("phone_b not between", value1, value2, "phoneB");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andWorkNoIsNull() {
            addCriterion("work_no is null");
            return (Criteria) this;
        }

        public Criteria andWorkNoIsNotNull() {
            addCriterion("work_no is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNoEqualTo(String value) {
            addCriterion("work_no =", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotEqualTo(String value) {
            addCriterion("work_no <>", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoGreaterThan(String value) {
            addCriterion("work_no >", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoGreaterThanOrEqualTo(String value) {
            addCriterion("work_no >=", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoLessThan(String value) {
            addCriterion("work_no <", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoLessThanOrEqualTo(String value) {
            addCriterion("work_no <=", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoLike(String value) {
            addCriterion("work_no like", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotLike(String value) {
            addCriterion("work_no not like", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoIn(List<String> values) {
            addCriterion("work_no in", values, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotIn(List<String> values) {
            addCriterion("work_no not in", values, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoBetween(String value1, String value2) {
            addCriterion("work_no between", value1, value2, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotBetween(String value1, String value2) {
            addCriterion("work_no not between", value1, value2, "workNo");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlIsNull() {
            addCriterion("notice_url is null");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlIsNotNull() {
            addCriterion("notice_url is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlEqualTo(String value) {
            addCriterion("notice_url =", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotEqualTo(String value) {
            addCriterion("notice_url <>", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlGreaterThan(String value) {
            addCriterion("notice_url >", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notice_url >=", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlLessThan(String value) {
            addCriterion("notice_url <", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlLessThanOrEqualTo(String value) {
            addCriterion("notice_url <=", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlLike(String value) {
            addCriterion("notice_url like", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotLike(String value) {
            addCriterion("notice_url not like", value, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlIn(List<String> values) {
            addCriterion("notice_url in", values, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotIn(List<String> values) {
            addCriterion("notice_url not in", values, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlBetween(String value1, String value2) {
            addCriterion("notice_url between", value1, value2, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeUrlNotBetween(String value1, String value2) {
            addCriterion("notice_url not between", value1, value2, "noticeUrl");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqIsNull() {
            addCriterion("notice_seq is null");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqIsNotNull() {
            addCriterion("notice_seq is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqEqualTo(String value) {
            addCriterion("notice_seq =", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqNotEqualTo(String value) {
            addCriterion("notice_seq <>", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqGreaterThan(String value) {
            addCriterion("notice_seq >", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqGreaterThanOrEqualTo(String value) {
            addCriterion("notice_seq >=", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqLessThan(String value) {
            addCriterion("notice_seq <", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqLessThanOrEqualTo(String value) {
            addCriterion("notice_seq <=", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqLike(String value) {
            addCriterion("notice_seq like", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqNotLike(String value) {
            addCriterion("notice_seq not like", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqIn(List<String> values) {
            addCriterion("notice_seq in", values, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqNotIn(List<String> values) {
            addCriterion("notice_seq not in", values, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqBetween(String value1, String value2) {
            addCriterion("notice_seq between", value1, value2, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqNotBetween(String value1, String value2) {
            addCriterion("notice_seq not between", value1, value2, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeStateIsNull() {
            addCriterion("notice_state is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStateIsNotNull() {
            addCriterion("notice_state is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStateEqualTo(String value) {
            addCriterion("notice_state =", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotEqualTo(String value) {
            addCriterion("notice_state <>", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateGreaterThan(String value) {
            addCriterion("notice_state >", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateGreaterThanOrEqualTo(String value) {
            addCriterion("notice_state >=", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateLessThan(String value) {
            addCriterion("notice_state <", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateLessThanOrEqualTo(String value) {
            addCriterion("notice_state <=", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateLike(String value) {
            addCriterion("notice_state like", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotLike(String value) {
            addCriterion("notice_state not like", value, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateIn(List<String> values) {
            addCriterion("notice_state in", values, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotIn(List<String> values) {
            addCriterion("notice_state not in", values, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateBetween(String value1, String value2) {
            addCriterion("notice_state between", value1, value2, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeStateNotBetween(String value1, String value2) {
            addCriterion("notice_state not between", value1, value2, "noticeState");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("notice_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("notice_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Date value) {
            addCriterion("notice_time =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Date value) {
            addCriterion("notice_time <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Date value) {
            addCriterion("notice_time >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_time >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Date value) {
            addCriterion("notice_time <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Date value) {
            addCriterion("notice_time <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Date> values) {
            addCriterion("notice_time in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Date> values) {
            addCriterion("notice_time not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Date value1, Date value2) {
            addCriterion("notice_time between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Date value1, Date value2) {
            addCriterion("notice_time not between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeBackIsNull() {
            addCriterion("notice_back is null");
            return (Criteria) this;
        }

        public Criteria andNoticeBackIsNotNull() {
            addCriterion("notice_back is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeBackEqualTo(String value) {
            addCriterion("notice_back =", value, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackNotEqualTo(String value) {
            addCriterion("notice_back <>", value, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackGreaterThan(String value) {
            addCriterion("notice_back >", value, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackGreaterThanOrEqualTo(String value) {
            addCriterion("notice_back >=", value, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackLessThan(String value) {
            addCriterion("notice_back <", value, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackLessThanOrEqualTo(String value) {
            addCriterion("notice_back <=", value, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackLike(String value) {
            addCriterion("notice_back like", value, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackNotLike(String value) {
            addCriterion("notice_back not like", value, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackIn(List<String> values) {
            addCriterion("notice_back in", values, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackNotIn(List<String> values) {
            addCriterion("notice_back not in", values, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackBetween(String value1, String value2) {
            addCriterion("notice_back between", value1, value2, "noticeBack");
            return (Criteria) this;
        }

        public Criteria andNoticeBackNotBetween(String value1, String value2) {
            addCriterion("notice_back not between", value1, value2, "noticeBack");
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