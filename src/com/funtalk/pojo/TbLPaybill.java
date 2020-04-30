package com.funtalk.pojo;

import java.util.Date;

public class TbLPaybill {
    private Integer payId;

    private Integer billId;

    private Integer billDate;

    private String billItem;

    private Integer depositId;

    private String deCode;

    private Integer payAmount;

    private String payMode;

    private Integer chargeId;

    private Date createTime;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getBillDate() {
        return billDate;
    }

    public void setBillDate(Integer billDate) {
        this.billDate = billDate;
    }

    public String getBillItem() {
        return billItem;
    }

    public void setBillItem(String billItem) {
        this.billItem = billItem == null ? null : billItem.trim();
    }

    public Integer getDepositId() {
        return depositId;
    }

    public void setDepositId(Integer depositId) {
        this.depositId = depositId;
    }

    public String getDeCode() {
        return deCode;
    }

    public void setDeCode(String deCode) {
        this.deCode = deCode == null ? null : deCode.trim();
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}