package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.Merits;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface MeritsMapper {
    //添加考勤信息
    Integer insertMerits(Merits merits);
//    查找绩效信息
    Merits getByUidAndDid(Integer arg0 ,Integer arg1);
//    查找部门
    Dept deptByid(Integer Did);
    //    基于用户id更新绩效情况
    Integer UpdateById(Merits merits);
}
