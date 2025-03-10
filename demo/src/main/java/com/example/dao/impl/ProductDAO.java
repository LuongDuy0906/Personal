package com.example.dao.impl;

import java.util.List;

import com.example.dao.IProductDAO;
import com.example.mapper.ProductMapper;
import com.example.model.Product;

public class ProductDAO extends AbstractDAO<Product> implements IProductDAO {

    @Override
    public List<Product> findByCategoryId(int categoryId) {
        String sql = "SELECT * FROM SanPham WHERE LoaiSP = ?";

        return query(sql, new ProductMapper(), categoryId);
    }

    @Override
    public Integer save(Product products) {
        String sql = "INSERT INTO SanPham (TenSP, MoTa, LoaiSP, Gia, GiaKM) values (?, ?, ?, ?, ?)";

        return insert(sql, products.getTenSP(), products.getMoTa(), products.getLoaiSP(), products.getGia(),
                products.getGiaKM());
    }
}
