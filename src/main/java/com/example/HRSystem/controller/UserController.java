package com.example.HRSystem.controller;

import com.example.HRSystem.common.Constant;
import com.example.HRSystem.entity.JsonResult;
import com.example.HRSystem.entity.User;
import com.example.HRSystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    IUserService service;


    //注册用户信息
    @RequestMapping("/regist")
    public JsonResult<Void> regist(User user){
        service.regist(user);
        return new JsonResult<>(1000,"OK");
    }

    //    用户登录
    @RequestMapping("/login")
    public JsonResult<String> login(String username, String password, HttpServletRequest req){
        User user = service.login(username, password);
        HttpSession session = req.getSession();
        session.setAttribute("user",user);
        if (user.getRole()==0){
            return JsonResult.getSuccessJR("用户登录");
        }else {
            return JsonResult.getSuccessJR("管理员登录");
        }
    }

    //        修改个人信息
    @RequestMapping("/changeUserInfo")
    public JsonResult<User> changeUserInfo(User user,HttpSession session){
        User u = (User) session.getAttribute("user");
        if (u==null){
            return new JsonResult<>(2005,"登录已失效");
        }
        user.setId(u.getId());
        user.setModifiedUser(u.getModifiedUser());
        service.changeUserInfo(u.getUsername(),user);
        return JsonResult.getSuccessJR(u);
    }
    @RequestMapping("/findUserInfo")
    public JsonResult<User> findUserInfo(HttpServletRequest req){
//        获取用户对应的session对象，如果不存在则不创建新的session对象
        HttpSession session = req.getSession(false);
//        未登录
        if (session == null||session.getAttribute("user")==null){
            return Constant.JR_NOT_LOGGEDIN;
        }
        User user = (User) session.getAttribute("user");
        return JsonResult.getSuccessJR(user);
    }
}
