package com.funtalk.pojo;

import java.util.Date;

public class TbOPhone {
    private Integer orderId;

    private String serviceKind;

    private String cityCode;

    private String serviceId;

    private String custId;

    private Integer billDate;

    private Integer packageId;

    private Integer packageCount;

    private Integer dayLimit;

    private Integer dayUsed;

    private Integer monthUsed;

    private Date createTime;

    private String state;

    private String ifUse;

    private Integer taskId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public Integer getBillDate() {
        return billDate;
    }

    public void setBillDate(Integer billDate) {
        this.billDate = billDate;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    public Integer getDayLimit() {
        return dayLimit;
    }

    public void setDayLimit(Integer dayLimit) {
        this.dayLimit = dayLimit;
    }

    public Integer getDayUsed() {
        return dayUsed;
    }

    public void setDayUsed(Integer dayUsed) {
        this.dayUsed = dayUsed;
    }

    public Integer getMonthUsed() {
        return monthUsed;
    }

    public void setMonthUsed(Integer monthUsed) {
        this.monthUsed = monthUsed;
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

    public String getIfUse() {
        return ifUse;
    }

    public void setIfUse(String ifUse) {
        this.ifUse = ifUse == null ? null : ifUse.trim();
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}