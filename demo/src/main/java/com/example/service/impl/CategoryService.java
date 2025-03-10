package com.example.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.example.dao.ICategoryDAO;
import com.example.model.Category;
import com.example.service.ICategoryService;

public class CategoryService implements ICategoryService {
    @Inject
    private ICategoryDAO categoryDAO;

    /*
     * public CategoryService() {
     * categoryDAO = new CategoryDAO();
     * }
     */

    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

}
