package com.funtalk.pojo;

public class TbRMenuEmployee {
    private String employeeId;

    private String menuId;

    private String ifValid;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getIfValid() {
        return ifValid;
    }

    public void setIfValid(String ifValid) {
        this.ifValid = ifValid == null ? null : ifValid.trim();
    }
}