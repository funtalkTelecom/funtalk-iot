package com.funtalk.pojo;

import java.util.Date;

public class TbLCharge {
    private Integer chargeId;

    private Integer chargeType;

    private Integer acctId;

    private String deCode;

    private String phoneNum;

    private Float payAmount;

    private Float amount;

    private Date createTime;

    private Date modifyTime;

    private Date cancelTime;

    private Integer payStatus;

    private Integer chargeStatus;

    private Integer dealerId;

    private Integer chargeFor;

    private String forId;

    private String workNo;

    private String transId;

    private String serNum;

    private String qrCode;

    private String openId;

    private String transRes;

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getAcctId() {
        return acctId;
    }

    public void setAcctId(Integer acctId) {
        this.acctId = acctId;
    }

    public String getDeCode() {
        return deCode;
    }

    public void setDeCode(String deCode) {
        this.deCode = deCode == null ? null : deCode.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Float payAmount) {
        this.payAmount = payAmount;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(Integer chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public Integer getChargeFor() {
        return chargeFor;
    }

    public void setChargeFor(Integer chargeFor) {
        this.chargeFor = chargeFor;
    }

    public String getForId() {
        return forId;
    }

    public void setForId(String forId) {
        this.forId = forId == null ? null : forId.trim();
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo == null ? null : workNo.trim();
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum == null ? null : serNum.trim();
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getTransRes() {
        return transRes;
    }

    public void setTransRes(String transRes) {
        this.transRes = transRes == null ? null : transRes.trim();
    }
}