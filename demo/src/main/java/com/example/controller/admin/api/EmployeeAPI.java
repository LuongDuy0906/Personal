package com.example.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.model.Employee;
import com.example.service.IEmployeeService;
import com.example.utils.HttpUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(urlPatterns = { "/api-admin-employee" })
public class EmployeeAPI extends HttpServlet {

    @Inject
    private IEmployeeService employeeService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        Employee Employees = HttpUtil.of(request.getReader()).toModel(Employee.class);
        Employees = employeeService.save(Employees);
        mapper.writeValue(response.getOutputStream(), Employees);
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        Employee updEmployee = HttpUtil.of(request.getReader()).toModel(Employee.class);
        updEmployee = employeeService.update(updEmployee);
        mapper.writeValue(response.getOutputStream(), updEmployee);
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        Employee uEmployee = HttpUtil.of(request.getReader()).toModel(Employee.class);
        employeeService.delete(uEmployee.getIDs());
        mapper.writeValue(response.getOutputStream(), "{}");
    }
}
