package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Ask;

import java.util.List;

public interface AskMapper {
    //   查询用户已有请假的条数；
    Integer countByUserId(Integer userId);
    //    新增请假
    Integer saveAsk(Ask ask);
    //    根据用户工号ID查询对应的请假信息
    List<Ask> getAskByUserId(Integer userID);
}
