package com.example.backend.service;

import com.example.backend.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author lenovo
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2022-10-12 16:44:27
*/
public interface UserService extends IService<User> {
    User getUserByName(String userName);
}
