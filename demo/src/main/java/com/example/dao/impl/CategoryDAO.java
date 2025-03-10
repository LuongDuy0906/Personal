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
}
