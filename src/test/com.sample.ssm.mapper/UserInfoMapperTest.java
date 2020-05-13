package com.sample.ssm.mapper;

import com.sample.ssm.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ProjectName: SpringMVC_Mybatis_ssm
 * @Package: com.sample.ssm.mapper
 * @ClassName: UserInfoMapperTest
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/5/11/011 15:14
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void test(){
        UserInfo userInfo = userInfoMapper.selectOne(1);
        System.out.println(userInfo);
    }

}
