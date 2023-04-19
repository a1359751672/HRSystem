package com.example.HRSystem.service;

import com.example.HRSystem.entity.Merits;
import com.example.HRSystem.entity.User;

import java.util.List;

public interface IUserService {
    //    用户注册
    void regist(User user);

    //    用户登录
    User login(String username, String password);
    //     修改个人信息
    Integer changeUserInfo(String username,User user);
    List<User> findUserList(String username);
    //    修改密码
    Integer modifyPassword(String username, String oldPassword, String newPassword);
}
