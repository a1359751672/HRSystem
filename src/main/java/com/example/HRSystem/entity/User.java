package com.example.HRSystem.entity;

import java.math.BigInteger;
import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String salt;
    private Integer isDelete;
    private String phone;
    private String email;
    private Integer gender;
    private String avatar;
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;
    private Integer role;
    private String name;
    private Integer age;
    private String nation;
    private BigInteger card;
    private String education;
    private Integer jnum;
    private Integer deptId;
    private String deptName;

    public User() {
    }

    public User(Integer id, String username, String password, String salt, Integer isDelete, String phone, String email, Integer gender, String avatar, String createdUser, Date createdTime, String modifiedUser, Date modifiedTime, Integer role, String name, Integer age, String nation, BigInteger card, String education, Integer jnum, Integer deptId, String deptName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.isDelete = isDelete;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.avatar = avatar;
        this.createdUser = createdUser;
        this.createdTime = createdTime;
        this.modifiedUser = modifiedUser;
        this.modifiedTime = modifiedTime;
        this.role = role;
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.card = card;
        this.education = education;
        this.jnum = jnum;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", isDelete=" + isDelete +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", avatar='" + avatar + '\'' +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                ", role=" + role +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                ", card=" + card +
                ", education='" + education + '\'' +
                ", jnum=" + jnum +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public BigInteger getCard() {
        return card;
    }

    public void setCard(BigInteger card) {
        this.card = card;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
