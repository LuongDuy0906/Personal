package com.example.dao;

import com.example.model.User;

public interface IUserDAO extends GenericDAO<User> {
    User findByUserNameAndPasswordAndStatus(String username, String password);
}
