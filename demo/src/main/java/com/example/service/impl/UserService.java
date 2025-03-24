package com.example.service.impl;

import javax.inject.Inject;

import com.example.dao.IUserDAO;
import com.example.model.User;
import com.example.service.IUserService;

public class UserService implements IUserService {

    @Inject
    private IUserDAO userDAO;

    @Override
    public User findByUserNameAndPasswordAndStatus(String username, String password) {
        return userDAO.findByUserNameAndPasswordAndStatus(username, password);
    }

}
