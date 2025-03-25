package com.example.dao;

import com.example.model.User;

public interface IUserDAO extends GenericDAO<User> {
    User findByUserNameAndPassword(String username, String password);
}
