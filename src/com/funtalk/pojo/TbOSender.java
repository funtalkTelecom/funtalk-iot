package com.funtalk.pojo;

import java.util.Date;

public class TbOSender {
    private Integer id;

    private String cardId;

    private String phoneA;

    private String phoneB;

    private String msg;

    private Date createTime;

    private String orderno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getPhoneA() {
        return phoneA;
    }

    public void setPhoneA(String phoneA) {
        this.phoneA = phoneA == null ? null : phoneA.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }
}