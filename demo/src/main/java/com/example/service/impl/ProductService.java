package com.example.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.example.dao.IProductDAO;
import com.example.model.Product;
import com.example.service.IProductService;

public class ProductService implements IProductService {

    @Inject
    private IProductDAO productDAO;

    @Override
    public List<Product> findByCategoryId(int categoryId) {
        // TODO Auto-generated method stub
        return productDAO.findByCategoryId(categoryId);
    }

    @Override
    public Product save(Product products) {
        Long LoaiSP = productDAO.save(products);

        return productDAO.findOne(LoaiSP);
    }

}
