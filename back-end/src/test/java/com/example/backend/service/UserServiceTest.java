package com.example.backend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backend.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Resource
    UserService userService;
    @Test
    public void testAddUser(){
        User user = new User();
        user.setUserName("小明");
        user.setUserAccount("xiaoming");
        user.setUserPassword("123456");
        userService.save(user);
        System.out.println(user.getId());
    }
    @Test
    public void userSearch(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("userName", "小明");
        User user = userService.getOne(userQueryWrapper);
        System.out.println(user.getUserAccount());
    }
}