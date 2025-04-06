package com.example.dao.impl;

import java.util.List;

import com.example.dao.ISupplierDAO;
import com.example.mapper.SupplierMapper;
import com.example.model.Supplier;
import com.example.paging.Pageble;

public class SupplierDAO extends AbstractDAO<Supplier> implements ISupplierDAO {

    @Override
    public Supplier findOne(Long id) {
        String sql = "SELECT * FROM NhaCungCap WHERE ID = ?";

        List<Supplier> suppliers = query(sql, new SupplierMapper(), id);
        return suppliers.isEmpty() ? null : suppliers.get(0);
    }

    @Override
    public Long save(Supplier suppliers) {
        String sql = "INSERT INTO NhaCungCap (TenNCC, DiaChi, TenLH, SDT, Email, created_at) values (?, ?, ?, ?, ?, ?)";

        return insert(sql, suppliers.getTenNCC(), suppliers.getDiaChi(), suppliers.getTenLH(), suppliers.getSdt(),
                suppliers.getEmail(), suppliers.getCreated_at());
    }

    @Override
    public void update(Supplier updsupplier) {
        String sql = "UPDATE NhaCungCap SET TenNCC = ?, DiaChi = ?, TenLH = ?, SDT = ?, Email = ?, created_at = ? WHERE ID = ?";

        update(sql, updsupplier.getTenNCC(), updsupplier.getDiaChi(), updsupplier.getTenLH(),
                updsupplier.getSdt(), updsupplier.getEmail(), updsupplier.getCreated_at(), updsupplier.getID());
    }

    @Override
    public void delete(long ids) {
        String sql = "DELETE FROM NhaCungCap WHERE ID = ?";
        update(sql, ids);
    }

    @Override
    public List<Supplier> findAll(Pageble pageble) {
        StringBuilder sql = new StringBuilder("SELECT * FROM NhaCungCap");
        if (pageble.getSorter() != null) {
            sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
        }

        if (pageble.getOffset() != null && pageble.getLimit() != null) {
            sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
        }
        return query(sql.toString(), new SupplierMapper());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT COUNT(*) FROM NhaCungCap";
        return count(sql);
    }

}
