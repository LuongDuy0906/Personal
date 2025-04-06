package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Category;

public class CategoryMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs) {
        try {
            Category category = new Category();
            category.setID(rs.getLong("ID"));
            category.setLoai(rs.getString("Loai"));
            category.setCode(rs.getString("Code"));
            return category;
        } catch (SQLException e) {
            return null;
        }
    }
}
