package com.funtalk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSEmployeeExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("EMPLOYEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("EMPLOYEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("EMPLOYEE_NAME >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("EMPLOYEE_NAME <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("EMPLOYEE_NAME like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("EMPLOYEE_NAME not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andWorkNoIsNull() {
            addCriterion("WORK_NO is null");
            return (Criteria) this;
        }

        public Criteria andWorkNoIsNotNull() {
            addCriterion("WORK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNoEqualTo(String value) {
            addCriterion("WORK_NO =", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotEqualTo(String value) {
            addCriterion("WORK_NO <>", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoGreaterThan(String value) {
            addCriterion("WORK_NO >", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_NO >=", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoLessThan(String value) {
            addCriterion("WORK_NO <", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoLessThanOrEqualTo(String value) {
            addCriterion("WORK_NO <=", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoLike(String value) {
            addCriterion("WORK_NO like", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotLike(String value) {
            addCriterion("WORK_NO not like", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoIn(List<String> values) {
            addCriterion("WORK_NO in", values, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotIn(List<String> values) {
            addCriterion("WORK_NO not in", values, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoBetween(String value1, String value2) {
            addCriterion("WORK_NO between", value1, value2, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotBetween(String value1, String value2) {
            addCriterion("WORK_NO not between", value1, value2, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkPwdIsNull() {
            addCriterion("WORK_PWD is null");
            return (Criteria) this;
        }

        public Criteria andWorkPwdIsNotNull() {
            addCriterion("WORK_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPwdEqualTo(String value) {
            addCriterion("WORK_PWD =", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdNotEqualTo(String value) {
            addCriterion("WORK_PWD <>", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdGreaterThan(String value) {
            addCriterion("WORK_PWD >", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PWD >=", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdLessThan(String value) {
            addCriterion("WORK_PWD <", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdLessThanOrEqualTo(String value) {
            addCriterion("WORK_PWD <=", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdLike(String value) {
            addCriterion("WORK_PWD like", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdNotLike(String value) {
            addCriterion("WORK_PWD not like", value, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdIn(List<String> values) {
            addCriterion("WORK_PWD in", values, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdNotIn(List<String> values) {
            addCriterion("WORK_PWD not in", values, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdBetween(String value1, String value2) {
            addCriterion("WORK_PWD between", value1, value2, "workPwd");
            return (Criteria) this;
        }

        public Criteria andWorkPwdNotBetween(String value1, String value2) {
            addCriterion("WORK_PWD not between", value1, value2, "workPwd");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoIsNull() {
            addCriterion("create_workno is null");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoIsNotNull() {
            addCriterion("create_workno is not null");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoEqualTo(String value) {
            addCriterion("create_workno =", value, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoNotEqualTo(String value) {
            addCriterion("create_workno <>", value, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoGreaterThan(String value) {
            addCriterion("create_workno >", value, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoGreaterThanOrEqualTo(String value) {
            addCriterion("create_workno >=", value, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoLessThan(String value) {
            addCriterion("create_workno <", value, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoLessThanOrEqualTo(String value) {
            addCriterion("create_workno <=", value, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoLike(String value) {
            addCriterion("create_workno like", value, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoNotLike(String value) {
            addCriterion("create_workno not like", value, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoIn(List<String> values) {
            addCriterion("create_workno in", values, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoNotIn(List<String> values) {
            addCriterion("create_workno not in", values, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoBetween(String value1, String value2) {
            addCriterion("create_workno between", value1, value2, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateWorknoNotBetween(String value1, String value2) {
            addCriterion("create_workno not between", value1, value2, "createWorkno");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("DEALER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("DEALER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(Integer value) {
            addCriterion("DEALER_ID =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(Integer value) {
            addCriterion("DEALER_ID <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(Integer value) {
            addCriterion("DEALER_ID >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEALER_ID >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(Integer value) {
            addCriterion("DEALER_ID <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEALER_ID <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<Integer> values) {
            addCriterion("DEALER_ID in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<Integer> values) {
            addCriterion("DEALER_ID not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(Integer value1, Integer value2) {
            addCriterion("DEALER_ID between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEALER_ID not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andEIdCardIsNull() {
            addCriterion("E_ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andEIdCardIsNotNull() {
            addCriterion("E_ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andEIdCardEqualTo(String value) {
            addCriterion("E_ID_CARD =", value, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardNotEqualTo(String value) {
            addCriterion("E_ID_CARD <>", value, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardGreaterThan(String value) {
            addCriterion("E_ID_CARD >", value, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("E_ID_CARD >=", value, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardLessThan(String value) {
            addCriterion("E_ID_CARD <", value, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardLessThanOrEqualTo(String value) {
            addCriterion("E_ID_CARD <=", value, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardLike(String value) {
            addCriterion("E_ID_CARD like", value, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardNotLike(String value) {
            addCriterion("E_ID_CARD not like", value, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardIn(List<String> values) {
            addCriterion("E_ID_CARD in", values, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardNotIn(List<String> values) {
            addCriterion("E_ID_CARD not in", values, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardBetween(String value1, String value2) {
            addCriterion("E_ID_CARD between", value1, value2, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdCardNotBetween(String value1, String value2) {
            addCriterion("E_ID_CARD not between", value1, value2, "eIdCard");
            return (Criteria) this;
        }

        public Criteria andEIdAddrIsNull() {
            addCriterion("E_ID_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andEIdAddrIsNotNull() {
            addCriterion("E_ID_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andEIdAddrEqualTo(String value) {
            addCriterion("E_ID_ADDR =", value, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrNotEqualTo(String value) {
            addCriterion("E_ID_ADDR <>", value, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrGreaterThan(String value) {
            addCriterion("E_ID_ADDR >", value, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrGreaterThanOrEqualTo(String value) {
            addCriterion("E_ID_ADDR >=", value, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrLessThan(String value) {
            addCriterion("E_ID_ADDR <", value, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrLessThanOrEqualTo(String value) {
            addCriterion("E_ID_ADDR <=", value, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrLike(String value) {
            addCriterion("E_ID_ADDR like", value, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrNotLike(String value) {
            addCriterion("E_ID_ADDR not like", value, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrIn(List<String> values) {
            addCriterion("E_ID_ADDR in", values, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrNotIn(List<String> values) {
            addCriterion("E_ID_ADDR not in", values, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrBetween(String value1, String value2) {
            addCriterion("E_ID_ADDR between", value1, value2, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andEIdAddrNotBetween(String value1, String value2) {
            addCriterion("E_ID_ADDR not between", value1, value2, "eIdAddr");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andIfValidIsNull() {
            addCriterion("IF_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIfValidIsNotNull() {
            addCriterion("IF_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIfValidEqualTo(String value) {
            addCriterion("IF_VALID =", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidNotEqualTo(String value) {
            addCriterion("IF_VALID <>", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidGreaterThan(String value) {
            addCriterion("IF_VALID >", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidGreaterThanOrEqualTo(String value) {
            addCriterion("IF_VALID >=", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidLessThan(String value) {
            addCriterion("IF_VALID <", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidLessThanOrEqualTo(String value) {
            addCriterion("IF_VALID <=", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidLike(String value) {
            addCriterion("IF_VALID like", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidNotLike(String value) {
            addCriterion("IF_VALID not like", value, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidIn(List<String> values) {
            addCriterion("IF_VALID in", values, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidNotIn(List<String> values) {
            addCriterion("IF_VALID not in", values, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidBetween(String value1, String value2) {
            addCriterion("IF_VALID between", value1, value2, "ifValid");
            return (Criteria) this;
        }

        public Criteria andIfValidNotBetween(String value1, String value2) {
            addCriterion("IF_VALID not between", value1, value2, "ifValid");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleIsNull() {
            addCriterion("EMPLOYEE_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleIsNotNull() {
            addCriterion("EMPLOYEE_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleEqualTo(String value) {
            addCriterion("EMPLOYEE_ROLE =", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ROLE <>", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleGreaterThan(String value) {
            addCriterion("EMPLOYEE_ROLE >", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ROLE >=", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleLessThan(String value) {
            addCriterion("EMPLOYEE_ROLE <", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ROLE <=", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleLike(String value) {
            addCriterion("EMPLOYEE_ROLE like", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleNotLike(String value) {
            addCriterion("EMPLOYEE_ROLE not like", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleIn(List<String> values) {
            addCriterion("EMPLOYEE_ROLE in", values, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ROLE not in", values, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ROLE between", value1, value2, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ROLE not between", value1, value2, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andCustidIsNull() {
            addCriterion("custid is null");
            return (Criteria) this;
        }

        public Criteria andCustidIsNotNull() {
            addCriterion("custid is not null");
            return (Criteria) this;
        }

        public Criteria andCustidEqualTo(String value) {
            addCriterion("custid =", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotEqualTo(String value) {
            addCriterion("custid <>", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThan(String value) {
            addCriterion("custid >", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThanOrEqualTo(String value) {
            addCriterion("custid >=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThan(String value) {
            addCriterion("custid <", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThanOrEqualTo(String value) {
            addCriterion("custid <=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLike(String value) {
            addCriterion("custid like", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotLike(String value) {
            addCriterion("custid not like", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidIn(List<String> values) {
            addCriterion("custid in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotIn(List<String> values) {
            addCriterion("custid not in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidBetween(String value1, String value2) {
            addCriterion("custid between", value1, value2, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotBetween(String value1, String value2) {
            addCriterion("custid not between", value1, value2, "custid");
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