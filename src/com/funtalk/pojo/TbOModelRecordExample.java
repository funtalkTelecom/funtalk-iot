package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOModelRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOModelRecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andTopicIsNull() {
            addCriterion("topic is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("topic is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("topic =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("topic <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("topic >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("topic >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("topic <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("topic <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("topic like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("topic not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("topic in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("topic not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("topic between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("topic not between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageQosIsNull() {
            addCriterion("message_qos is null");
            return (Criteria) this;
        }

        public Criteria andMessageQosIsNotNull() {
            addCriterion("message_qos is not null");
            return (Criteria) this;
        }

        public Criteria andMessageQosEqualTo(Integer value) {
            addCriterion("message_qos =", value, "messageQos");
            return (Criteria) this;
        }

        public Criteria andMessageQosNotEqualTo(Integer value) {
            addCriterion("message_qos <>", value, "messageQos");
            return (Criteria) this;
        }

        public Criteria andMessageQosGreaterThan(Integer value) {
            addCriterion("message_qos >", value, "messageQos");
            return (Criteria) this;
        }

        public Criteria andMessageQosGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_qos >=", value, "messageQos");
            return (Criteria) this;
        }

        public Criteria andMessageQosLessThan(Integer value) {
            addCriterion("message_qos <", value, "messageQos");
            return (Criteria) this;
        }

        public Criteria andMessageQosLessThanOrEqualTo(Integer value) {
            addCriterion("message_qos <=", value, "messageQos");
            return (Criteria) this;
        }

        public Criteria andMessageQosIn(List<Integer> values) {
            addCriterion("message_qos in", values, "messageQos");
            return (Criteria) this;
        }

        public Criteria andMessageQosNotIn(List<Integer> values) {
            addCriterion("message_qos not in", values, "messageQos");
            return (Criteria) this;
        }

        public Criteria andMessageQosBetween(Integer value1, Integer value2) {
            addCriterion("message_qos between", value1, value2, "messageQos");
            return (Criteria) this;
        }

        public Criteria andMessageQosNotBetween(Integer value1, Integer value2) {
            addCriterion("message_qos not between", value1, value2, "messageQos");
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

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Integer value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Integer value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Integer value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Integer value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Integer> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Integer> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCommandIsNull() {
            addCriterion("command is null");
            return (Criteria) this;
        }

        public Criteria andCommandIsNotNull() {
            addCriterion("command is not null");
            return (Criteria) this;
        }

        public Criteria andCommandEqualTo(String value) {
            addCriterion("command =", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotEqualTo(String value) {
            addCriterion("command <>", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThan(String value) {
            addCriterion("command >", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThanOrEqualTo(String value) {
            addCriterion("command >=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThan(String value) {
            addCriterion("command <", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThanOrEqualTo(String value) {
            addCriterion("command <=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLike(String value) {
            addCriterion("command like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotLike(String value) {
            addCriterion("command not like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandIn(List<String> values) {
            addCriterion("command in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotIn(List<String> values) {
            addCriterion("command not in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandBetween(String value1, String value2) {
            addCriterion("command between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotBetween(String value1, String value2) {
            addCriterion("command not between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andSmsMsgIsNull() {
            addCriterion("sms_msg is null");
            return (Criteria) this;
        }

        public Criteria andSmsMsgIsNotNull() {
            addCriterion("sms_msg is not null");
            return (Criteria) this;
        }

        public Criteria andSmsMsgEqualTo(String value) {
            addCriterion("sms_msg =", value, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgNotEqualTo(String value) {
            addCriterion("sms_msg <>", value, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgGreaterThan(String value) {
            addCriterion("sms_msg >", value, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgGreaterThanOrEqualTo(String value) {
            addCriterion("sms_msg >=", value, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgLessThan(String value) {
            addCriterion("sms_msg <", value, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgLessThanOrEqualTo(String value) {
            addCriterion("sms_msg <=", value, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgLike(String value) {
            addCriterion("sms_msg like", value, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgNotLike(String value) {
            addCriterion("sms_msg not like", value, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgIn(List<String> values) {
            addCriterion("sms_msg in", values, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgNotIn(List<String> values) {
            addCriterion("sms_msg not in", values, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgBetween(String value1, String value2) {
            addCriterion("sms_msg between", value1, value2, "smsMsg");
            return (Criteria) this;
        }

        public Criteria andSmsMsgNotBetween(String value1, String value2) {
            addCriterion("sms_msg not between", value1, value2, "smsMsg");
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

        public Criteria andIccid1IsNull() {
            addCriterion("iccid1 is null");
            return (Criteria) this;
        }

        public Criteria andIccid1IsNotNull() {
            addCriterion("iccid1 is not null");
            return (Criteria) this;
        }

        public Criteria andIccid1EqualTo(String value) {
            addCriterion("iccid1 =", value, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1NotEqualTo(String value) {
            addCriterion("iccid1 <>", value, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1GreaterThan(String value) {
            addCriterion("iccid1 >", value, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1GreaterThanOrEqualTo(String value) {
            addCriterion("iccid1 >=", value, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1LessThan(String value) {
            addCriterion("iccid1 <", value, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1LessThanOrEqualTo(String value) {
            addCriterion("iccid1 <=", value, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1Like(String value) {
            addCriterion("iccid1 like", value, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1NotLike(String value) {
            addCriterion("iccid1 not like", value, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1In(List<String> values) {
            addCriterion("iccid1 in", values, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1NotIn(List<String> values) {
            addCriterion("iccid1 not in", values, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1Between(String value1, String value2) {
            addCriterion("iccid1 between", value1, value2, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid1NotBetween(String value1, String value2) {
            addCriterion("iccid1 not between", value1, value2, "iccid1");
            return (Criteria) this;
        }

        public Criteria andIccid5IsNull() {
            addCriterion("iccid5 is null");
            return (Criteria) this;
        }

        public Criteria andIccid5IsNotNull() {
            addCriterion("iccid5 is not null");
            return (Criteria) this;
        }

        public Criteria andIccid5EqualTo(String value) {
            addCriterion("iccid5 =", value, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5NotEqualTo(String value) {
            addCriterion("iccid5 <>", value, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5GreaterThan(String value) {
            addCriterion("iccid5 >", value, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5GreaterThanOrEqualTo(String value) {
            addCriterion("iccid5 >=", value, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5LessThan(String value) {
            addCriterion("iccid5 <", value, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5LessThanOrEqualTo(String value) {
            addCriterion("iccid5 <=", value, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5Like(String value) {
            addCriterion("iccid5 like", value, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5NotLike(String value) {
            addCriterion("iccid5 not like", value, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5In(List<String> values) {
            addCriterion("iccid5 in", values, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5NotIn(List<String> values) {
            addCriterion("iccid5 not in", values, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5Between(String value1, String value2) {
            addCriterion("iccid5 between", value1, value2, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid5NotBetween(String value1, String value2) {
            addCriterion("iccid5 not between", value1, value2, "iccid5");
            return (Criteria) this;
        }

        public Criteria andIccid6IsNull() {
            addCriterion("iccid6 is null");
            return (Criteria) this;
        }

        public Criteria andIccid6IsNotNull() {
            addCriterion("iccid6 is not null");
            return (Criteria) this;
        }

        public Criteria andIccid6EqualTo(String value) {
            addCriterion("iccid6 =", value, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6NotEqualTo(String value) {
            addCriterion("iccid6 <>", value, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6GreaterThan(String value) {
            addCriterion("iccid6 >", value, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6GreaterThanOrEqualTo(String value) {
            addCriterion("iccid6 >=", value, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6LessThan(String value) {
            addCriterion("iccid6 <", value, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6LessThanOrEqualTo(String value) {
            addCriterion("iccid6 <=", value, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6Like(String value) {
            addCriterion("iccid6 like", value, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6NotLike(String value) {
            addCriterion("iccid6 not like", value, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6In(List<String> values) {
            addCriterion("iccid6 in", values, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6NotIn(List<String> values) {
            addCriterion("iccid6 not in", values, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6Between(String value1, String value2) {
            addCriterion("iccid6 between", value1, value2, "iccid6");
            return (Criteria) this;
        }

        public Criteria andIccid6NotBetween(String value1, String value2) {
            addCriterion("iccid6 not between", value1, value2, "iccid6");
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

        public Criteria andSignalLevelIsNull() {
            addCriterion("signal_level is null");
            return (Criteria) this;
        }

        public Criteria andSignalLevelIsNotNull() {
            addCriterion("signal_level is not null");
            return (Criteria) this;
        }

        public Criteria andSignalLevelEqualTo(Integer value) {
            addCriterion("signal_level =", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelNotEqualTo(Integer value) {
            addCriterion("signal_level <>", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelGreaterThan(Integer value) {
            addCriterion("signal_level >", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("signal_level >=", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelLessThan(Integer value) {
            addCriterion("signal_level <", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelLessThanOrEqualTo(Integer value) {
            addCriterion("signal_level <=", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelIn(List<Integer> values) {
            addCriterion("signal_level in", values, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelNotIn(List<Integer> values) {
            addCriterion("signal_level not in", values, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelBetween(Integer value1, Integer value2) {
            addCriterion("signal_level between", value1, value2, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("signal_level not between", value1, value2, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNull() {
            addCriterion("message_content is null");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNotNull() {
            addCriterion("message_content is not null");
            return (Criteria) this;
        }

        public Criteria andMessageContentEqualTo(String value) {
            addCriterion("message_content =", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotEqualTo(String value) {
            addCriterion("message_content <>", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThan(String value) {
            addCriterion("message_content >", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("message_content >=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThan(String value) {
            addCriterion("message_content <", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThanOrEqualTo(String value) {
            addCriterion("message_content <=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLike(String value) {
            addCriterion("message_content like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotLike(String value) {
            addCriterion("message_content not like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentIn(List<String> values) {
            addCriterion("message_content in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotIn(List<String> values) {
            addCriterion("message_content not in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentBetween(String value1, String value2) {
            addCriterion("message_content between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotBetween(String value1, String value2) {
            addCriterion("message_content not between", value1, value2, "messageContent");
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