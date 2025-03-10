package com.example.dao;

import java.util.List;
import com.example.model.Category;

public interface ICategoryDAO extends GenericDAO<Category> {
    List<Category> findAll();
}
