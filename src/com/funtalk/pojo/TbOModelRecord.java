package com.funtalk.pojo;

import java.util.Date;

public class TbOModelRecord {
    private Integer recordId;

    private String topic;

    private Integer messageId;

    private Integer messageQos;

    private Date createTime;

    private String cardId;

    private Integer cardType;

    private String command;

    private String smsMsg;

    private String iccid;

    private String iccid1;

    private String iccid5;

    private String iccid6;

    private String seedIccid;

    private Integer signalLevel;

    private String version;

    private String messageContent;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getMessageQos() {
        return messageQos;
    }

    public void setMessageQos(Integer messageQos) {
        this.messageQos = messageQos;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public String getSmsMsg() {
        return smsMsg;
    }

    public void setSmsMsg(String smsMsg) {
        this.smsMsg = smsMsg == null ? null : smsMsg.trim();
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid == null ? null : iccid.trim();
    }

    public String getIccid1() {
        return iccid1;
    }

    public void setIccid1(String iccid1) {
        this.iccid1 = iccid1 == null ? null : iccid1.trim();
    }

    public String getIccid5() {
        return iccid5;
    }

    public void setIccid5(String iccid5) {
        this.iccid5 = iccid5 == null ? null : iccid5.trim();
    }

    public String getIccid6() {
        return iccid6;
    }

    public void setIccid6(String iccid6) {
        this.iccid6 = iccid6 == null ? null : iccid6.trim();
    }

    public String getSeedIccid() {
        return seedIccid;
    }

    public void setSeedIccid(String seedIccid) {
        this.seedIccid = seedIccid == null ? null : seedIccid.trim();
    }

    public Integer getSignalLevel() {
        return signalLevel;
    }

    public void setSignalLevel(Integer signalLevel) {
        this.signalLevel = signalLevel;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }
}