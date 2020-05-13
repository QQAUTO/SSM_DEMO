package com.sample.ssm.service;

import com.sample.ssm.mapper.UserInfoMapper;
import com.sample.ssm.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: SpringMVC_Mybatis_ssm
 * @Package: com.sample.ssm.service.impl
 * @ClassName: UserServiceImpl
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/5/11/011 16:12
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoByUserId(Integer userId) {
        return userInfoMapper.selectOne(userId);
    }

}
