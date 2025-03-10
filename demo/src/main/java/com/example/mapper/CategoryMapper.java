package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Category;

public class CategoryMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs) {
        try {
            Category category = new Category();
            category.setLSPID(rs.getInt("LSPID"));
            category.setLoaiSP(rs.getString("LoaiSP"));
            return category;
        } catch (SQLException e) {
            return null;
        }
    }
}
