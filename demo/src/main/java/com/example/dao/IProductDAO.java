package com.example.dao;

import java.util.List;

import com.example.model.Product;

public interface IProductDAO extends GenericDAO<Product> {
    Product findOne(Long id);

    List<Product> findByCategoryId(int categoryId);

    Long save(Product products);
}
