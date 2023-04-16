package com.example.HRSystem.service;

import com.example.HRSystem.entity.Ask;
import com.example.HRSystem.entity.Ask;

import java.util.List;

public interface IAskService {
//    添加请假信息
    void createAsk(String name,Integer userId,Ask ask);

    List<Ask>addressList(Integer userId);
}
