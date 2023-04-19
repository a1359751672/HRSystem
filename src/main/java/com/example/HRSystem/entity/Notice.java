package com.example.HRSystem.entity;

import java.util.Date;

public class Notice {
    private String title;
    private String cont;
    private Integer userId;
    private String createdUser;
    private Date createdTime;

    public Notice() {
    }

    public Notice(String title, String cont, Integer userId, String createdUser, Date createdTime) {
        this.title = title;
        this.cont = cont;
        this.userId = userId;
        this.createdUser = createdUser;
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "title='" + title + '\'' +
                ", cont='" + cont + '\'' +
                ", userId=" + userId +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
}
