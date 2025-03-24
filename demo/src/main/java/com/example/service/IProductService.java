package com.example.service;

import java.util.List;

import com.example.model.Product;
import com.example.paging.Pageble;

public interface IProductService {
    List<Product> findByCategoryId(int categoryId);

    Product save(Product products);

    Product update(Product updProduct);

    void delete(long[] ids);

    List<Product> findAll(Pageble pageble);

    int getTotalItem();
}
