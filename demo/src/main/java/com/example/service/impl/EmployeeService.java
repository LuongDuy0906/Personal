package com.example.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.example.dao.IEmployeeDAO;
import com.example.model.Employee;
import com.example.paging.Pageble;
import com.example.service.IEmployeeService;

public class EmployeeService implements IEmployeeService {

    @Inject
    private IEmployeeDAO employeeDAO;

    @Override
    public Employee save(Employee Employees) {
        Employees.setCreated_at(new Timestamp(System.currentTimeMillis()));
        Long LoaiSP = employeeDAO.save(Employees);

        return employeeDAO.findOne(LoaiSP);
    }

    @Override
    public Employee update(Employee updEmployee) {
        Employee oldEm = employeeDAO.findOne(updEmployee.getID());
        updEmployee.setCreated_at(oldEm.getCreated_at());
        updEmployee.setUpdated_at(new Timestamp(System.currentTimeMillis()));
        employeeDAO.update(updEmployee);
        return employeeDAO.findOne(updEmployee.getID());
    }

    @Override
    public void delete(long[] ids) {
        for (long id : ids) {
            employeeDAO.delete(id);
        }
    }

    @Override
    public List<Employee> findAll(Pageble pageble) {
        return employeeDAO.findAll(pageble);
    }

    @Override
    public int getTotalItem() {
        return employeeDAO.getTotalItem();
    }

    @Override
    public Employee findOne(Long id) {
        return employeeDAO.findOne(id);
    }

}
