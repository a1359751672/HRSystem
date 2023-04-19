package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper {
    //添加用户信息
    Integer insertUser(User user);
    //    根据用户名查询用户信息
    User getByName(String username);

    //    登录账号时，修改个人信息
    Integer updataUserInfo(User user);

    Integer AupdataUserInfo(User user);
    List<User> getByAdmin();

//    基于用户id查找所有用户信息
    List<User> getById(Integer id);

    //    根据账号密码相同时，修改密码
    Integer updataPassword(User user);
}
