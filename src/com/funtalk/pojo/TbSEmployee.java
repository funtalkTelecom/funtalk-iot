package com.funtalk.pojo;

import java.util.Date;

public class TbSEmployee {
    private Integer employeeId;

    private String employeeName;

    private String workNo;

    private String workPwd;

    private String cityCode;

    private String createWorkno;

    private Date createDate;

    private Integer dealerId;

    private String eIdCard;

    private String eIdAddr;

    private String contactPhone;

    private String ifValid;

    private Date lastLoginTime;

    private String employeeRole;

    private String custid;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo == null ? null : workNo.trim();
    }

    public String getWorkPwd() {
        return workPwd;
    }

    public void setWorkPwd(String workPwd) {
        this.workPwd = workPwd == null ? null : workPwd.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCreateWorkno() {
        return createWorkno;
    }

    public void setCreateWorkno(String createWorkno) {
        this.createWorkno = createWorkno == null ? null : createWorkno.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public String geteIdCard() {
        return eIdCard;
    }

    public void seteIdCard(String eIdCard) {
        this.eIdCard = eIdCard == null ? null : eIdCard.trim();
    }

    public String geteIdAddr() {
        return eIdAddr;
    }

    public void seteIdAddr(String eIdAddr) {
        this.eIdAddr = eIdAddr == null ? null : eIdAddr.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getIfValid() {
        return ifValid;
    }

    public void setIfValid(String ifValid) {
        this.ifValid = ifValid == null ? null : ifValid.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole == null ? null : employeeRole.trim();
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid == null ? null : custid.trim();
    }
}