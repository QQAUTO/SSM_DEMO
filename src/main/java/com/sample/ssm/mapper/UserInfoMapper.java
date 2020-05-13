package com.sample.ssm.mapper;

import com.sample.ssm.model.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {

    /**
     *
     * @param userId
     * @return
     */
    UserInfo selectOne(@Param("userId") Integer userId);
}
