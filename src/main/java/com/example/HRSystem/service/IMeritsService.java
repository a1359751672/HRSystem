package com.example.HRSystem.service;

import com.example.HRSystem.entity.Merits;

public interface IMeritsService {
    //    添加一条考勤记录
//    void createdMerits(Integer id,Integer dept_id, Integer jnum, Integer att, Integer manner,Integer abi,String username);

    //    添加一条购物车记录
    void createdMerits(String username, Merits merits);
}
