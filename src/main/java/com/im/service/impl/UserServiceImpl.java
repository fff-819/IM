package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.pojo.User;
import com.im.service.UserService;
import com.im.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author feng-shu-sheng
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-03-13 19:31:21
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




