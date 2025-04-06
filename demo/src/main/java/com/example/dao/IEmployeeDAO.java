package com.example.dao;

import java.util.List;

import com.example.model.Employee;
import com.example.paging.Pageble;

public interface IEmployeeDAO extends GenericDAO<Employee> {
    Employee findOne(Long id);

    List<Employee> findByCategoryId(int categoryId);

    Long save(Employee Employees);

    void update(Employee updEmployee);

    void delete(long ids);

    List<Employee> findAll(Pageble pageble);

    int getTotalItem();
}
