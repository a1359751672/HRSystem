package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;

@Mapper
public interface UserMapper {
//添加用户信息
    Integer insertUser(User user);
    //    根据用户名查询用户信息
    User getByName(String username);

    //    登录账号时，修改个人信息
    Integer updataUserInfo(User user);
}
