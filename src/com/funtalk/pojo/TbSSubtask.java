package com.funtalk.pojo;

import java.util.Date;

public class TbSSubtask {
    private Integer taskId;

    private String taskType;

    private Integer subId;

    private String custId;

    private String phoneB;

    private String msg;

    private Integer state;

    private String reqSeq;

    private Date createTime;

    private String workNo;

    private String auditor;

    private Integer employeeId;

    private String noticeUrl;

    private String noticeSeq;

    private String noticeState;

    private Date noticeTime;

    private String noticeBack;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getReqSeq() {
        return reqSeq;
    }

    public void setReqSeq(String reqSeq) {
        this.reqSeq = reqSeq == null ? null : reqSeq.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo == null ? null : workNo.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getNoticeUrl() {
        return noticeUrl;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl == null ? null : noticeUrl.trim();
    }

    public String getNoticeSeq() {
        return noticeSeq;
    }

    public void setNoticeSeq(String noticeSeq) {
        this.noticeSeq = noticeSeq == null ? null : noticeSeq.trim();
    }

    public String getNoticeState() {
        return noticeState;
    }

    public void setNoticeState(String noticeState) {
        this.noticeState = noticeState == null ? null : noticeState.trim();
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNoticeBack() {
        return noticeBack;
    }

    public void setNoticeBack(String noticeBack) {
        this.noticeBack = noticeBack == null ? null : noticeBack.trim();
    }
}