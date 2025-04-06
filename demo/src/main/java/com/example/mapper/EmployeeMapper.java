package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs) {
        try {
            Employee Employee = new Employee();
            Employee.setID(rs.getLong("ID"));
            Employee.setHoTen(rs.getString("HoTen"));
            Employee.setDiaChi(rs.getString("DiaChi"));
            Employee.setSdt(rs.getString("SDT"));
            Employee.setCreated_at(rs.getTimestamp("created_at"));
            if (rs.getTimestamp("updated_at") != null) {
                Employee.setUpdated_at(rs.getTimestamp("updated_at"));
            }
            return Employee;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
