package com.example.service;

import java.util.List;

import com.example.model.Employee;
import com.example.paging.Pageble;

public interface IEmployeeService {
    Employee save(Employee Employees);

    Employee update(Employee updEmployee);

    void delete(long[] ids);

    List<Employee> findAll(Pageble pageble);

    int getTotalItem();

    Employee findOne(Long id);
}
