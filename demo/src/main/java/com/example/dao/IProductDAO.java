package com.example.dao;

import java.util.List;

import com.example.model.Product;

public interface IProductDAO extends GenericDAO<Product> {
    List<Product> findByCategoryId(int categoryId);

    Integer save(Product products);
}
