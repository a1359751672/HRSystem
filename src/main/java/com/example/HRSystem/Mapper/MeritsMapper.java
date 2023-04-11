package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.Merits;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MeritsMapper {
    //添加考勤信息
    Integer insertMerits(Merits merits);
//    查找绩效信息
    Merits getByUidAndDid(Integer id ,Integer id1);
//    查找部门
    String deptByid(Integer Did);

}
