package com.funtalk.pojo;

import java.util.Date;

public class TbUBill {
    private Integer billId;

    private String belongType;

    private String belongId;

    private Integer billDate;

    private String billItem;

    private Integer billAmount;

    private Integer payAmount;

    private Integer ownAmount;

    private Date createTime;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getBelongType() {
        return belongType;
    }

    public void setBelongType(String belongType) {
        this.belongType = belongType == null ? null : belongType.trim();
    }

    public String getBelongId() {
        return belongId;
    }

    public void setBelongId(String belongId) {
        this.belongId = belongId == null ? null : belongId.trim();
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

    public Integer getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Integer billAmount) {
        this.billAmount = billAmount;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getOwnAmount() {
        return ownAmount;
    }

    public void setOwnAmount(Integer ownAmount) {
        this.ownAmount = ownAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}