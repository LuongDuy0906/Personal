package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Product;

public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs) {
        try {
            Product product = new Product();
            product.setID(rs.getLong("ID"));
            product.setTenSP(rs.getString("TenSP"));
            product.setMoTa(rs.getString("MoTa"));
            product.setSoLuong(rs.getInt("SoLuong"));
            product.setIDLSP(rs.getLong("IDLSP"));
            product.setIDKM(rs.getInt("IDKM"));
            product.setGia(rs.getInt("Gia"));
            product.setGiaKM(rs.getInt("GiaKM"));
            product.setCreated_at(rs.getTimestamp("created_at"));
            if (rs.getTimestamp("updated_at") != null) {
                product.setUpdated_at(rs.getTimestamp("updated_at"));
            }
            return product;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
