package com.example.dao.impl;

import java.util.List;

import com.example.dao.ICategoryDAO;
import com.example.mapper.CategoryMapper;
import com.example.model.Category;

public class CategoryDAO extends AbstractDAO<Category> implements ICategoryDAO {

    @Override
    public List<Category> findAll() {
        String sql = "SELECT * FROM LoaiSP";
        return query(sql, new CategoryMapper());
    }

    @Override
    public Category findOne(Long id) {
        String sql = "SELECT * FROM LoaiSP WHERE ID = ?";

        List<Category> categories = query(sql, new CategoryMapper(), id);
        return categories.isEmpty() ? null : categories.get(0);
    }

    @Override
    public Category findOneByCode(String code) {
        String sql = "SELECT * FROM LoaiSP WHERE Code = ?";

        List<Category> categories = query(sql, new CategoryMapper(), code);
        return categories.isEmpty() ? null : categories.get(0);
    }
}
