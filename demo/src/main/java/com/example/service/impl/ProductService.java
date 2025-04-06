package com.example.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.example.dao.ICategoryDAO;
import com.example.dao.IProductDAO;
import com.example.model.Category;
import com.example.model.Product;
import com.example.paging.Pageble;
import com.example.service.IProductService;

public class ProductService implements IProductService {

    @Inject
    private IProductDAO productDAO;

    @Inject
    private ICategoryDAO categoryDAO;

    @Override
    public List<Product> findByCategoryId(Long categoryId, Pageble pageble) {
        // TODO Auto-generated method stub
        return productDAO.findByCategoryId(categoryId, pageble);
    }

    @Override
    public Product save(Product products) {
        products.setCreated_at(new Timestamp(System.currentTimeMillis()));
        Category category = categoryDAO.findOneByCode(products.getCode());
        products.setIDLSP(category.getID());
        Long LoaiSP = productDAO.save(products);

        return productDAO.findOne(LoaiSP);
    }

    @Override
    public Product update(Product updProduct) {
        Product oldProc = productDAO.findOne(updProduct.getID());
        updProduct.setCreated_at(oldProc.getCreated_at());
        updProduct.setUpdated_at(new Timestamp(System.currentTimeMillis()));
        Category category = categoryDAO.findOneByCode(updProduct.getCode());
        updProduct.setIDLSP(category.getID());
        productDAO.update(updProduct);
        return productDAO.findOne(updProduct.getID());
    }

    @Override
    public void delete(long[] ids) {
        for (long id : ids) {
            productDAO.delete(id);
        }
    }

    @Override
    public List<Product> findAll(Pageble pageble) {
        return productDAO.findAll(pageble);
    }

    @Override
    public int getTotalItem() {
        return productDAO.getTotalItem();
    }

    @Override
    public Product findOne(Long id) {
        Product product = productDAO.findOne(id);
        Category category = categoryDAO.findOne(product.getIDLSP());
        product.setCode(category.getCode());
        return product;
    }
}
