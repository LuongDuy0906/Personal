package com.example.dao.impl;

import java.util.List;

import com.example.dao.IUserDAO;
import com.example.mapper.UserMapper;
import com.example.model.User;

public class UserDAO extends AbstractDAO<User> implements IUserDAO {

    @Override
    public User findByUserNameAndPassword(String username, String password) {
        String sql = "SELECT * FROM NguoiDung u, VaiTro r WHERE u.IDVT = r.ID AND TenND = ? AND MatKhau = ?";

        List<User> user = query(sql, new UserMapper(), username, password);
        return user.isEmpty() ? null : user.get(0);
    }

}
