package com.example.HRSystem.controller;

import com.example.HRSystem.Mapper.MeritsMapper;
import com.example.HRSystem.Mapper.UserMapper;
import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.JsonResult;
import com.example.HRSystem.entity.Merits;
import com.example.HRSystem.entity.User;
import com.example.HRSystem.service.IMeritsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/merits")
public class MeritsController {
    @Autowired
    IMeritsService service;


    @RequestMapping("/create")
    public JsonResult<Void> createMerits(Merits merits, HttpSession session){
        User user =(User) session.getAttribute("user");
        String username = user.getUsername();
        System.out.println(username);
        service.createdMerits(username,merits);
        return JsonResult.getSuccessJR();
    }
}
