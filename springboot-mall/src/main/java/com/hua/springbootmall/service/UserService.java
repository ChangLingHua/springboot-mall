package com.hua.springbootmall.service;

import com.hua.springbootmall.dto.UserLoginRequest;
import com.hua.springbootmall.dto.UserRegisterRequest;
import com.hua.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
