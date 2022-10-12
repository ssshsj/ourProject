package com.example.backend.controller;

import com.example.backend.domain.User;
import com.example.backend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/test")
    public User Test(String userName){
        User user = userService.getUserByName(userName);
        return user;
    }

}
