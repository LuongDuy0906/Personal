package com.example.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.example.dao.ISupplierDAO;
import com.example.model.Supplier;
import com.example.paging.Pageble;
import com.example.service.ISupplierService;

public class SupplierService implements ISupplierService {

    @Inject
    private ISupplierDAO supplierDAO;

    @Override
    public Supplier save(Supplier suppliers) {
        suppliers.setCreated_at(new Timestamp(System.currentTimeMillis()));
        Long LoaiSP = supplierDAO.save(suppliers);

        return supplierDAO.findOne(LoaiSP);
    }

    @Override
    public Supplier update(Supplier updsupplier) {
        Supplier oldSup = supplierDAO.findOne(updsupplier.getID());
        updsupplier.setCreated_at(oldSup.getCreated_at());
        updsupplier.setUpdated_at(new Timestamp(System.currentTimeMillis()));
        supplierDAO.update(updsupplier);
        return supplierDAO.findOne(updsupplier.getID());
    }

    @Override
    public void delete(long[] ids) {
        for (long id : ids) {
            supplierDAO.delete(id);
        }
    }

    @Override
    public List<Supplier> findAll(Pageble pageble) {
        return supplierDAO.findAll(pageble);
    }

    @Override
    public int getTotalItem() {
        return supplierDAO.getTotalItem();
    }

}
