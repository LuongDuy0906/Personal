package com.example.service;

import com.example.model.User;

public interface IUserService {
    User findByUserNameAndPassword(String username, String password);
}
