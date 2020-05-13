package com.sample.ssm.action;

import com.sample.ssm.model.UserInfo;
import com.sample.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: SpringMVC_Mybatis_ssm
 * @Package: com.sample.ssm.action
 * @ClassName: UserController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/5/11/011 15:50
 * @Version: 1.0
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/user")
    private String toUser(Model model, Integer userId){
        UserInfo userInfo = userService.getUserInfoByUserId(userId);
        model.addAttribute("user",userInfo);
        return "user";
    }
}