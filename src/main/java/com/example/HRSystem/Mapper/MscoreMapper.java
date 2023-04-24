package com.example.HRSystem.Mapper;

import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.Merits;
import com.example.HRSystem.entity.Mscore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MscoreMapper {
    //添加考勤信息
    Integer insertMscore(Mscore mscore);

    List<Mscore> getByMid(Integer mid);
    //    根据管理员查询绩效信息
    List<Mscore> getAdminByMid();
}
