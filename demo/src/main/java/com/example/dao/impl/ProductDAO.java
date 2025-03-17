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
    public Long save(Product products) {
        String sql = "INSERT INTO SanPham (TenSP, MoTa, LoaiSP, Gia, GiaKM) values (?, ?, ?, ?, ?)";

        return insert(sql, products.getTenSP(), products.getMoTa(), products.getLoaiSP(), products.getGia(),
                products.getGiaKM());
    }

    @Override
    public Product findOne(Long id) {
        String sql = "SELECT * FROM SanPham WHERE SPID = ?";

        List<Product> products = query(sql, new ProductMapper(), id);
        return products.isEmpty() ? null : products.get(0);
    }

    @Override
    public void update(Product updProduct) {
        StringBuilder sql = new StringBuilder("UPDATE SanPham SET TenSP = ?, MoTa = ?,");
        sql.append(" SoLuong = ?, LoaiSP = ?,");
        sql.append(" KMID = ?, Gia = ?, GiaKM = ?,");
        sql.append(" created_at = ? WHERE SPID = ?");

        update(sql.toString(), updProduct.getTenSP(), updProduct.getMoTa(), updProduct.getSoLuong(),
                updProduct.getLoaiSP(), updProduct.getKMID(), updProduct.getGia(),
                updProduct.getGiaKM(), updProduct.getCreated_at(), updProduct.getSPID());
    }
}
