package com.example.HRSystem.entity;

import java.util.Date;

public class Ask {
private Integer id;
private String name;
private Integer userId;
private String dept;
private Integer askid;
private String saktype;
private Integer sakdate;
private Date askstart;
private Date askend;
private String askreason;
private String isCheck;
private String checkBack;
private String createdUser;
private Date createdTime;
private String modifiedUser;
private Date modifiedTime;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getAskid() {
        return askid;
    }

    public void setAskid(Integer askid) {
        this.askid = askid;
    }

    public String getSaktype() {
        return saktype;
    }

    public void setSaktype(String saktype) {
        this.saktype = saktype;
    }

    public Integer getSakdate() {
        return sakdate;
    }

    public void setSakdate(Integer sakdate) {
        this.sakdate = sakdate;
    }

    public Date getAskstart() {
        return askstart;
    }

    public void setAskstart(Date askstart) {
        this.askstart = askstart;
    }

    public Date getAskend() {
        return askend;
    }

    public void setAskend(Date askend) {
        this.askend = askend;
    }

    public String getAskreason() {
        return askreason;
    }

    public void setAskreason(String askreason) {
        this.askreason = askreason;
    }

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

    public String getCheckBack() {
        return checkBack;
    }

    public void setCheckBack(String checkBack) {
        this.checkBack = checkBack;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "ask{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", dept='" + dept + '\'' +
                ", askid=" + askid +
                ", saktype='" + saktype + '\'' +
                ", sakdate=" + sakdate +
                ", askstart=" + askstart +
                ", askend=" + askend +
                ", askreason='" + askreason + '\'' +
                ", isCheck='" + isCheck + '\'' +
                ", checkBack='" + checkBack + '\'' +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
