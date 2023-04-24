package com.example.HRSystem.service.Impl;

import com.example.HRSystem.Mapper.MeritsMapper;
import com.example.HRSystem.Mapper.MscoreMapper;
import com.example.HRSystem.Mapper.UserMapper;
import com.example.HRSystem.entity.Merits;
import com.example.HRSystem.entity.Mscore;
import com.example.HRSystem.entity.User;
import com.example.HRSystem.service.IMscoreService;
import com.example.HRSystem.service.ex.InsertException;
import com.example.HRSystem.service.ex.LoginException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMscoreServiceImpl implements IMscoreService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    MscoreMapper mscoreMapper;
    @Autowired
    MeritsMapper meritsMapper;

    @Override
    public void createdMscore(String username, Mscore mscore) {
        User u = userMapper.getByName(username);
        if(u==null){
            throw new InsertException("获取数据失败：未登录，请先登录");
        }
        List merits = meritsMapper.getMeritsUserId(u.getId());
        System.out.println(merits);
        if (merits.get(0)==mscore.getMid()){
            mscore.setMid((Integer) merits.get(0));
            mscore.setScore((Integer)merits.get(4)+(Integer)merits.get(5)+(Integer)merits.get(6));
            if (mscore.getScore()<60&&mscore.getScore()>0){
                mscore.setEvaluate("不合格");
                Integer row = mscoreMapper.insertMscore(mscore);
                if (row!=1){
                    throw new InsertException("评价异常：评价分数获取失败");
                }
            }else if (mscore.getScore()==60){
                mscore.setEvaluate("合格");
                Integer row = mscoreMapper.insertMscore(mscore);
                if (row!=1){
                    throw new InsertException("评价异常：评价分数获取失败");
                }
            }else if (mscore.getScore()>60&&mscore.getScore()<100){
                mscore.setEvaluate("优秀");
                Integer row = mscoreMapper.insertMscore(mscore);
                if (row!=1){
                    throw new InsertException("评价异常：评价分数获取失败");
                }
            }else {
                throw new InsertException("评价异常：评价分数异常");
            }
        }
    }

    @Override
    public List<Mscore> findMscoreList(String username) {
        //        查询用户是否登录
        User u = userMapper.getByName(username);
        if (u==null){
            throw new InsertException("添加数据失败：未登录，请先登录");
        }
        Integer role = u.getRole();
        if (role==0){
            List<Mscore> m = mscoreMapper.getByMid(u.getId());
            return m;
        }else {
            List<Mscore> m = mscoreMapper.getAdminByMid();
            return m;
        }
    }
}
