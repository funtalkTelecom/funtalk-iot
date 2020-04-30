package com.funtalk.pojo;

public class TbPKeywords {
    private String ins;

    private String outs;

    public String getIns() {
        return ins;
    }

    public void setIns(String ins) {
        this.ins = ins == null ? null : ins.trim();
    }

    public String getOuts() {
        return outs;
    }

    public void setOuts(String outs) {
        this.outs = outs == null ? null : outs.trim();
    }
}