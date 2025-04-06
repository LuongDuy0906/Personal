package com.example.dao;

import java.util.List;

import com.example.model.Product;
import com.example.paging.Pageble;

public interface IProductDAO extends GenericDAO<Product> {
    Product findOne(Long id);

    List<Product> findByCategoryId(Long categoryId, Pageble pageble);

    Long save(Product products);

    void update(Product updProduct);

    void delete(long ids);

    List<Product> findAll(Pageble pageble);

    int getTotalItem();
}
