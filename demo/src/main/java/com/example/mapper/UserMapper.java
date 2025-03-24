package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Role;
import com.example.model.User;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs) {
        try {
            User user = new User();
            user.setUserID(rs.getLong("UserID"));
            user.setTenND(rs.getString("TenND"));
            user.setMatKhau(rs.getString("MatKhau"));
            user.setVaiTro(rs.getInt("VaiTro"));
            user.setTen(rs.getString("Ten"));
            user.setDiaChi(rs.getString("DiaChi"));
            user.setSDT(rs.getString("SDT"));
            user.setCreated_at(rs.getTimestamp("created_at"));
            if (rs.getTimestamp("updated_at") != null) {
                user.setUpdated_at(rs.getTimestamp("updated_at"));
            }
            Role role = new Role();
            role.setVaiTro(rs.getString("VaiTro"));
            user.setRole(role);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
