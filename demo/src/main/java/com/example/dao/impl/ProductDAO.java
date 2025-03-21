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
        String sql = "INSERT INTO SanPham (TenSP, MoTa, SoLuong, LoaiSP, KMID, Gia, GiaKM, created_at) values (?, ?, ?, ?, ?, ?, ?, ?)";

        return insert(sql, products.getTenSP(), products.getMoTa(), products.getSoLuong(), products.getLoaiSP(),
                products.getKMID(), products.getGia(),
                products.getGiaKM(), products.getCreated_at());
    }

    @Override
    public Product findOne(Long id) {
        String sql = "SELECT * FROM SanPham WHERE SPID = ?";

        List<Product> products = query(sql, new ProductMapper(), id);
        return products.isEmpty() ? null : products.get(0);
    }

    @Override
    public void update(Product updProduct) {
        String sql = "UPDATE SanPham SET TenSP = ?, MoTa = ?, SoLuong = ?, LoaiSP = ?, KMID = ?, Gia = ?, GiaKM = ?, created_at = ? WHERE SPID = ?";

        update(sql, updProduct.getTenSP(), updProduct.getMoTa(), updProduct.getSoLuong(),
                updProduct.getLoaiSP(), updProduct.getKMID(), updProduct.getGia(),
                updProduct.getGiaKM(), updProduct.getCreated_at(), updProduct.getSPID());
    }

    @Override
    public void delete(long ids) {
        String sql = "DELETE FROM SanPham WHERE SPID = ?";
        update(sql, ids);
    }

    @Override
    public List<Product> findAll() {
        String sql = "SELECT * FROM SanPham";

        return query(sql, new ProductMapper());
    }
}
