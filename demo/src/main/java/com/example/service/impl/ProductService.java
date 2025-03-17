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

    @Override
    public Product update(Product updProduct) {
        Product oldProc = productDAO.findOne(updProduct.getSPID());
        updProduct.setCreated_at(oldProc.getCreated_at());
        productDAO.update(updProduct);
        return productDAO.findOne(updProduct.getSPID());
    }

}
