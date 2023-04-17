package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.Merits;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MeritsMapper {
    //添加考勤信息
    Integer insertMerits(Merits merits);
//    查找绩效信息
    Merits getByUid(Integer uid);
//    查找部门
    Dept deptByid(Integer Did);
    //    基于用户id更新绩效情况
    Integer UpdateById(Merits merits);
//    根据管理员查询绩效信息
    List<Merits> getMeritsByUserId();
//    根据用户id查询绩效信息
    List<Merits> getMeritsUserId(Integer uid);

}
