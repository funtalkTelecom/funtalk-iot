package com.funtalk.pojo;

import java.util.Date;

public class TbSAcct {
    private Integer acctId;

    private Integer custId;

    private String ifValid;

    private Date createDate;

    private Date invalidDate;

    private String createWorkno;

    public Integer getAcctId() {
        return acctId;
    }

    public void setAcctId(Integer acctId) {
        this.acctId = acctId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getIfValid() {
        return ifValid;
    }

    public void setIfValid(String ifValid) {
        this.ifValid = ifValid == null ? null : ifValid.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getCreateWorkno() {
        return createWorkno;
    }

    public void setCreateWorkno(String createWorkno) {
        this.createWorkno = createWorkno == null ? null : createWorkno.trim();
    }
}