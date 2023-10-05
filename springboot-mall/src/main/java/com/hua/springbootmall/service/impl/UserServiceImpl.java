package com.hua.springbootmall.service.impl;

import com.hua.springbootmall.dao.UserDao;
import com.hua.springbootmall.dto.UserRegisterRequest;
import com.hua.springbootmall.model.User;
import com.hua.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
