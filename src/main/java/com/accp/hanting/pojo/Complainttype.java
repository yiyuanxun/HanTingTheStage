package com.accp.hanting.pojo;

public class Complainttype {
    private Integer ctid;

    private String ctname;

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public String getCtname() {
        return ctname;
    }

    public void setCtname(String ctname) {
        this.ctname = ctname == null ? null : ctname.trim();
    }
}