package com.im.controller;

import com.im.pojo.Result;
import com.im.pojo.User;
import com.im.service.GroupService;
import com.im.service.UserService;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ApiModel("测试接口")
//允许跨域
@CrossOrigin
public class firstController {
    @Autowired
    UserService userService;
    @Autowired
    GroupService groupService;
    @RequestMapping("/test")
    public Result test(){
        Result result = new Result();
        User user = userService.getById(1);
        result.setData(user);
        return result;
    }
}
