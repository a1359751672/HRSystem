package com.example.HRSystem.controller;
import com.example.HRSystem.entity.Ask;
import com.example.HRSystem.entity.JsonResult;
import com.example.HRSystem.entity.User;
import com.example.HRSystem.service.IAskService;
import com.example.HRSystem.entity.Ask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController

@RequestMapping("/ask")
public class AskController {
    @Autowired(required = false)
    IAskService service;
//    添加收货地址
@RequestMapping("/createAsk")

    public JsonResult<Void>createAsk(Ask ask, HttpSession session){
        User user=(User)session.getAttribute("user");
        ask.setUserId(user.getId());
        ask.setModifiedUser(user.getName());
        ask.setModifiedTime(new Date());
        service.createAsk(user.getUsername(),user.getId(),ask);
        return JsonResult.getSuccessJR();
    }

/*@RequestMapping("/list")
    public JsonResult<List<Ask>>askList(HttpSession session){
    User user=(User)session.getAttribute("user");
    List<Ask>list=service.askList(user.getId());
    return JsonResult.getSuccessJR(list);
}*/

}
