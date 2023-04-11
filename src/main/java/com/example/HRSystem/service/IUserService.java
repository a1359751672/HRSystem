package com.example.HRSystem.service;

import com.example.HRSystem.entity.User;

public interface IUserService {
    //    用户注册
    void regist(User user);

    //    用户登录
    User login(String username, String password);
    //     修改个人信息
    Integer changeUserInfo(String username,User user);
}
