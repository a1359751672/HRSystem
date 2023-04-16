package com.example.HRSystem.entity;

import java.util.Date;

public class Ask {
private Integer id;
private String name;
private Integer userId;
private String dept;
private Integer askid;
private String asktype;
private Integer askdate;
private String askstart;
private String askend;
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

    public String getAsktype() {
        return asktype;
    }

    public void setAsktype(String asktype) {
        this.asktype = asktype;
    }

    public Integer getAskdate() {
        return askdate;
    }

    public void setAskdate(Integer askdate) {
        this.askdate = askdate;
    }

    public String getAskstart() {
        return askstart;
    }

    public void setAskstart(String askstart) {
        this.askstart = askstart;
    }

    public String getAskend() {
        return askend;
    }

    public void setAskend(String askend) {
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
        return "Ask{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", dept='" + dept + '\'' +
                ", askid=" + askid +
                ", asktype='" + asktype + '\'' +
                ", askdate=" + askdate +
                ", askstart='" + askstart + '\'' +
                ", askend='" + askend + '\'' +
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
