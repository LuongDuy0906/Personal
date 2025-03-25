package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Supplier;

public class SupplierMapper implements RowMapper<Supplier> {

    @Override
    public Supplier mapRow(ResultSet rs) {
        try {
            Supplier supplier = new Supplier();
            supplier.setID(rs.getLong("ID"));
            supplier.setTenNCC(rs.getString("TenNCC"));
            supplier.setDiaChi(rs.getString("DiaChi"));
            supplier.setTenLH(rs.getString("TenLH"));
            supplier.setSdt(rs.getString("SDT"));
            supplier.setEmail(rs.getString("Email"));
            supplier.setCreated_at(rs.getTimestamp("created_at"));
            if (rs.getTimestamp("updated_at") != null) {
                supplier.setUpdated_at(rs.getTimestamp("updated_at"));
            }
            return supplier;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
