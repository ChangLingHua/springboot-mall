package com.hua.springbootmall.dao;

import com.hua.springbootmall.dto.UserRegisterRequest;
import com.hua.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserByEmail(String email);

    User getUserById(Integer userId);
}
