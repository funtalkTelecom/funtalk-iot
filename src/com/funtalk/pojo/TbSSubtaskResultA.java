package com.funtalk.pojo;

import java.util.Date;

public class TbSSubtaskResultA {
    private Integer resultId;

    private Integer taskId;

    private String custId;

    private String orderNo;

    private String phoneA;

    private String iccidA;

    private String serviceKind;

    private String cityCode;

    private String phoneB;

    private String msg;

    private String cardId;

    private Date createTime;

    private String state;

    private Date sendTime;

    private String errorInfo;

    private String workNo;

    private Integer employeeId;

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getPhoneA() {
        return phoneA;
    }

    public void setPhoneA(String phoneA) {
        this.phoneA = phoneA == null ? null : phoneA.trim();
    }

    public String getIccidA() {
        return iccidA;
    }

    public void setIccidA(String iccidA) {
        this.iccidA = iccidA == null ? null : iccidA.trim();
    }

    public String getServiceKind() {
        return serviceKind;
    }

    public void setServiceKind(String serviceKind) {
        this.serviceKind = serviceKind == null ? null : serviceKind.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getPhoneB() {
        return phoneB;
    }

    public void setPhoneB(String phoneB) {
        this.phoneB = phoneB == null ? null : phoneB.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo == null ? null : errorInfo.trim();
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo == null ? null : workNo.trim();
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}