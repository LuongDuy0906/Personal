package com.example.service;

import com.example.model.User;

public interface IUserService {
    User findByUserNameAndPasswordAndStatus(String username, String password);
}
