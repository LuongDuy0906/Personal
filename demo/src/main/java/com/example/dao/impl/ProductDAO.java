package com.example.dao.impl;

import java.util.List;

import com.example.dao.IProductDAO;
import com.example.mapper.ProductMapper;
import com.example.model.Product;
import com.example.paging.Pageble;

public class ProductDAO extends AbstractDAO<Product> implements IProductDAO {

    @Override
    public List<Product> findByCategoryId(int categoryId) {
        String sql = "SELECT * FROM SanPham WHERE IDLSP = ?";

        return query(sql, new ProductMapper(), categoryId);
    }

    @Override
    public Long save(Product products) {
        String sql = "INSERT INTO SanPham (TenSP, MoTa, SoLuong, IDLSP, IDKM, Gia, GiaKM, created_at) values (?, ?, ?, ?, ?, ?, ?, ?)";

        return insert(sql, products.getTenSP(), products.getMoTa(), products.getSoLuong(), products.getIDLSP(),
                products.getIDKM(), products.getGia(),
                products.getGiaKM(), products.getCreated_at());
    }

    @Override
    public Product findOne(Long id) {
        String sql = "SELECT * FROM SanPham WHERE ID = ?";

        List<Product> products = query(sql, new ProductMapper(), id);
        return products.isEmpty() ? null : products.get(0);
    }

    @Override
    public void update(Product updProduct) {
        String sql = "UPDATE SanPham SET TenSP = ?, MoTa = ?, SoLuong = ?, LoaiSP = ?, KMID = ?, Gia = ?, GiaKM = ?, created_at = ? WHERE SPID = ?";

        update(sql, updProduct.getTenSP(), updProduct.getMoTa(), updProduct.getSoLuong(),
                updProduct.getIDLSP(), updProduct.getIDKM(), updProduct.getGia(),
                updProduct.getGiaKM(), updProduct.getCreated_at(), updProduct.getID());
    }

    @Override
    public void delete(long ids) {
        String sql = "DELETE FROM SanPham WHERE ID = ?";
        update(sql, ids);
    }

    @Override
    public List<Product> findAll(Pageble pageble) {
        StringBuilder sql = new StringBuilder("SELECT * FROM SanPham");
        if (pageble.getSorter() != null) {
            sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
        }

        if (pageble.getOffset() != null && pageble.getLimit() != null) {
            sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
        }
        return query(sql.toString(), new ProductMapper());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT COUNT(*) FROM SanPham";
        return count(sql);
    }
}
