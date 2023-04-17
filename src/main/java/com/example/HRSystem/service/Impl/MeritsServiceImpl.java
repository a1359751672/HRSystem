package com.example.HRSystem.service.Impl;

import com.example.HRSystem.Mapper.MeritsMapper;
import com.example.HRSystem.Mapper.UserMapper;
import com.example.HRSystem.entity.Dept;
import com.example.HRSystem.entity.Merits;
import com.example.HRSystem.entity.User;
import com.example.HRSystem.service.IMeritsService;
import com.example.HRSystem.service.ex.EmptyArgumentException;
import com.example.HRSystem.service.ex.InsertException;
import com.example.HRSystem.service.ex.UpdateException;
import com.example.HRSystem.service.ex.UserExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MeritsServiceImpl implements IMeritsService {
    @Autowired
    UserMapper usermapper;

    @Autowired
    MeritsMapper meritsmapper;

    //    添加一条绩效记录
    @Override
    public void createdMerits(String username,Merits merits){
//        查询用户是否登录
        User u = usermapper.getByName(username);
        Integer did = meritsmapper.getByUid(u.getId()).getDeptId();
        if (u==null){
            throw new InsertException("添加数据失败：未登录，请先登录");
        }
        String name = u.getName();
        if (u.getRole()==0){
            throw new UpdateException("该用户此没有权限");
        }else {
            if (merits.getId() == null){
                merits.setId(null);
                merits.setUserId(u.getId());
                merits.setName(name);
                merits.setDeptName(meritsmapper.deptByid(did).getName());
                Integer row = meritsmapper.insertMerits(merits);
                if (row!=1){
                    throw new InsertException("添加数据失败");
                }
            }else {
                Integer row = meritsmapper.UpdateById(merits);
                if (row!=1){
                    throw new InsertException("更新数据失败");
                }
            }
        }
    }

    @Override
    public List<Merits> findMeritsList(String username) {
        //        查询用户是否登录
        User u = usermapper.getByName(username);
        if (u==null){
            throw new InsertException("添加数据失败：未登录，请先登录");
        }
        Integer role = u.getRole();
        if (role==0){
            List<Merits> m = meritsmapper.getMeritsUserId(u.getId());
            return m;
        }else {
            List<Merits> m = meritsmapper.getMeritsByUserId();
            return m;
        }
    }
}
