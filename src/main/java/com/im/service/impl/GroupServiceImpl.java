package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.pojo.Group;
import com.im.service.GroupService;
import com.im.mapper.GroupMapper;
import org.springframework.stereotype.Service;

/**
* @author feng-shu-sheng
* @description 针对表【group】的数据库操作Service实现
* @createDate 2023-03-13 19:30:56
*/
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group>
    implements GroupService{

}




