package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface IProductService {
    List<Product> findByCategoryId(int categoryId);

    Product save(Product products);

    Product update(Product updProduct);
}
