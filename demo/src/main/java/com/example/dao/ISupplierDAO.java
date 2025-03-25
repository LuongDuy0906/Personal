package com.example.dao;

import java.util.List;

import com.example.model.Supplier;
import com.example.paging.Pageble;

public interface ISupplierDAO extends GenericDAO<Supplier> {
    Supplier findOne(Long id);

    Long save(Supplier suppliers);

    void update(Supplier updsupplier);

    void delete(long ids);

    List<Supplier> findAll(Pageble pageble);

    int getTotalItem();
}
