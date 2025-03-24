package com.example.dao.impl;

import java.util.List;

import com.example.dao.IUserDAO;
import com.example.mapper.UserMapper;
import com.example.model.User;

public class UserDAO extends AbstractDAO<User> implements IUserDAO {

    @Override
    public User findByUserNameAndPasswordAndStatus(String username, String password) {
        StringBuilder sql = new StringBuilder("SELECT * FROM NguoiDung AS u");
        sql.append(" INNER JOIN VaiTro r ON r.VTID = u.VaiTro");
        sql.append(" WHERE TenND = ? AND MatKhau = ?");

        List<User> user = query(sql.toString(), new UserMapper(), username, password);
        return user.isEmpty() ? null : user.get(0);
    }

}
