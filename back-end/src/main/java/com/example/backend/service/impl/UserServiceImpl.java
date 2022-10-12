package com.example.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.backend.domain.User;
import com.example.backend.mapper.UserMapper;
import com.example.backend.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author lenovo
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2022-10-12 16:44:27
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserByName(String userName) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("userName",userName);
        User user = userMapper.selectOne(userQueryWrapper);
        return user;
    }
}




