package com.example.dao.impl;

import java.util.List;

import com.example.dao.IEmployeeDAO;
import com.example.mapper.EmployeeMapper;
import com.example.model.Employee;
import com.example.paging.Pageble;

public class EmployeeDAO extends AbstractDAO<Employee> implements IEmployeeDAO {

    @Override
    public Employee findOne(Long id) {
        String sql = "SELECT * FROM NhanVien WHERE ID = ?";

        List<Employee> Employees = query(sql, new EmployeeMapper(), id);
        return Employees.isEmpty() ? null : Employees.get(0);
    }

    @Override
    public List<Employee> findByCategoryId(int categoryId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCategoryId'");
    }

    @Override
    public Long save(Employee Employees) {
        String sql = "INSERT INTO NhanVien (HoTen, DiaChi, SDT, created_at) values (?, ?, ?, ?)";

        return insert(sql, Employees.getHoTen(), Employees.getDiaChi(), Employees.getSdt(), Employees.getCreated_at());
    }

    @Override
    public void update(Employee updEmployee) {
        String sql = "UPDATE NhanVien SET HoTen = ?, DiaChi = ?, SDT = ?, created_at = ? WHERE ID = ?";

        update(sql, updEmployee.getHoTen(), updEmployee.getDiaChi(),
                updEmployee.getSdt(), updEmployee.getCreated_at(), updEmployee.getID());
    }

    @Override
    public void delete(long ids) {
        String sql = "DELETE FROM NhanVien WHERE ID = ?";
        update(sql, ids);
    }

    @Override
    public List<Employee> findAll(Pageble pageble) {
        StringBuilder sql = new StringBuilder("SELECT * FROM NhanVien");
        if (pageble.getSorter() != null) {
            sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
        }

        if (pageble.getOffset() != null && pageble.getLimit() != null) {
            sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
        }
        return query(sql.toString(), new EmployeeMapper());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT COUNT(*) FROM NhanVien";
        return count(sql);
    }

}
