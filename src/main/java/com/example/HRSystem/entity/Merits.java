package com.example.HRSystem.entity;

import java.util.Date;

public class Merits {
    private Integer id;
    private String name;
    private Integer jnum;
    private Integer deptId;
    private Integer att;
    private Integer manner;
    private Integer abi;
    private Date mdate;

    public Merits() {
    }

    public Merits(Integer id, String name, Integer jnum, Integer deptId, Integer att, Integer manner, Integer abi, Date mdate, String deptName, Integer score, String assess) {
        this.id = id;
        this.name = name;
        this.jnum = jnum;
        this.deptId = deptId;
        this.att = att;
        this.manner = manner;
        this.abi = abi;
        this.mdate = mdate;

    }

    @Override
    public String toString() {
        return "Merits{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jnum=" + jnum +
                ", deptId=" + deptId +
                ", att=" + att +
                ", manner=" + manner +
                ", abi=" + abi +
                ", mdate=" + mdate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJnum() {
        return jnum;
    }

    public void setJnum(Integer jnum) {
        this.jnum = jnum;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getAtt() {
        return att;
    }

    public void setAtt(Integer att) {
        this.att = att;
    }

    public Integer getManner() {
        return manner;
    }

    public void setManner(Integer manner) {
        this.manner = manner;
    }

    public Integer getAbi() {
        return abi;
    }

    public void setAbi(Integer abi) {
        this.abi = abi;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

}
