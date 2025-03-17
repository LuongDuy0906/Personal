package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Product;

public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs) {
        try {
            Product product = new Product();
            product.setSPID(rs.getLong("SPID"));
            product.setTenSP(rs.getString("TenSP"));
            product.setMoTa(rs.getString("MoTa"));
            product.setSoLuong(rs.getInt("SoLuong"));
            product.setLoaiSP(rs.getInt("LoaiSP"));
            product.setGia(rs.getInt("Gia"));
            product.setGiaKM(rs.getInt("GiaKM"));
            return product;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
