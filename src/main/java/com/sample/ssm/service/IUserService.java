package com.sample.ssm.service;

import com.sample.ssm.model.UserInfo;

/**
 * @ProjectName: SpringMVC_Mybatis_ssm
 * @Package: com.sample.ssm.service.impl
 * @ClassName: IUserService
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/5/11/011 16:09
 * @Version: 1.0
 */
public interface IUserService {

    /**
     * 根据userId获取用户
     * @param userId
     * @return
     */
    UserInfo getUserInfoByUserId(Integer userId);
}
