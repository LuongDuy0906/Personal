package com.example.service;

import java.util.List;

import com.example.model.Supplier;
import com.example.paging.Pageble;

public interface ISupplierService {

    Supplier save(Supplier suppliers);

    Supplier update(Supplier updsupplier);

    void delete(long[] ids);

    List<Supplier> findAll(Pageble pageble);

    int getTotalItem();
}
