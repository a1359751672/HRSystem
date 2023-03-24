package com.example.HRSystem.controller;

import com.example.HRSystem.entity.JsonResult;
import com.example.HRSystem.service.ex.InsertException;
import com.example.HRSystem.service.ex.LoginException;
import com.example.HRSystem.service.ex.UpdateException;
import com.example.HRSystem.service.ex.UserExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.rmi.server.ServerCloneException;

@ControllerAdvice
public class GlobalExceptionHandler {
    //    统一处理业务层抛出的异常
    @ExceptionHandler(ServerCloneException.class)
    @ResponseBody
    public JsonResult<Void> handeCustomException(Throwable e){
        JsonResult<Void> jr = new JsonResult<>();
//        添加异常提示信息
        jr.setMsg(e.getMessage());
//        添加异常状态码
        if (e instanceof UpdateException){
            jr.setState(2001);
        }else if (e instanceof UserExistException){
            jr.setState(2002);
        }else if (e instanceof InsertException){
            jr.setState(3000);
        }else if (e instanceof LoginException){
            jr.setState(3001);
        }
        else if (e instanceof UpdateException){
            jr.setState(4000);
        }else {
            jr.setState(2000);
        }
        return jr;
    }


}
