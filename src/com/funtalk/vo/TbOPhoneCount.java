package com.funtalk.vo;

public class TbOPhoneCount {

    private Integer orderId;
    private String  serviceId;
    private Integer preValue;
    private Integer curValue;
    private Integer nextValue;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getPreValue() {
        return preValue;
    }

    public void setPreValue(Integer preValue) {
        this.preValue = preValue;
    }

    public Integer getCurValue() {
        return curValue;
    }

    public void setCurValue(Integer curValue) {
        this.curValue = curValue;
    }

    public Integer getNextValue() {
        return nextValue;
    }

    public void setNextValue(Integer nextValue) {
        this.nextValue = nextValue;
    }



}