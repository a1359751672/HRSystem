package com.example.HRSystem.service.Impl;
import com.example.HRSystem.Mapper.AskMapper;
import com.example.HRSystem.common.Constant;
import com.example.HRSystem.entity.Ask;
import com.example.HRSystem.service.IAskService;
import com.example.HRSystem.service.ex.AskCountLimitException;
import com.example.HRSystem.service.ex.EmptyArgumentException;
import com.example.HRSystem.service.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class AskServiceImpl implements IAskService {
    @Autowired(required = false)
AskMapper mapper;

    @Override
    public void createAsk(String username, Integer userId, Ask ask) {
        //1非空验证
        if (StringUtils.isEmpty(userId)) {
            throw new EmptyArgumentException("添加异常：用户id不能为空");
        }
        //2基于用户id查询用户地址数量
        int count = 0;
        try {
            count = mapper.countByUserId(userId);
        } catch (Exception e) {
            e.printStackTrace();
            throw new InsertException("添加异常：查询用户地址数量有误");
        }
        //3判断数量是否达到上限
        if (count >= Constant.MAX_ADDRESS) {
            throw new AskCountLimitException("添加异常：地址数量已达上限");
        }
        //4判断是否是首次添加收获地址

        //6执行添加地址操作
        ask.setCreatedUser(username);
        ask.setModifiedUser(username);
        Integer row = 0;
        try {
            row = mapper.saveAsk(ask);
        } catch (Exception e) {
            e.printStackTrace();
            throw new InsertException("添加异常:查询信息有误");
        }
        if (row != 1) {
            throw new InsertException("添加异常");
        }
    }
//查询收货地址
    @Override
    public List<Ask> addressList(Integer userId) {
        List<Ask>list=mapper.getAskByUserId(userId);
        return list;
    }
}
