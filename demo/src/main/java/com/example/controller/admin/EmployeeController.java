package com.example.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.constant.SystemConstant;
import com.example.model.Employee;
import com.example.paging.PageRequest;
import com.example.paging.Pageble;
import com.example.service.IEmployeeService;
import com.example.sort.Sorter;
import com.example.utils.FormUtil;
import com.example.utils.MessageUtil;

@WebServlet(urlPatterns = { "/admin-employee" })
public class EmployeeController extends HttpServlet {

    @Inject
    private IEmployeeService employeeService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Employee Employee = FormUtil.toModel(Employee.class, request);
        String view = "";
        if (Employee.getType().equals(SystemConstant.LIST)) {
            Pageble pageble = new PageRequest(Employee.getPage(), Employee.getMaxPageItem(),
                    new Sorter(Employee.getSortName(), Employee.getSortBy()));
            Employee.setListResult(employeeService.findAll(pageble));
            Employee.setTotalItem(employeeService.getTotalItem());
            Employee.setTotalPage((int) Math.ceil((double) Employee.getTotalItem() / Employee.getMaxPageItem()));
            view = "/views/admin/employee/list.jsp";
        } else if (Employee.getType().equals(SystemConstant.EDIT)) {
            if (Employee.getID() != null) {
                Employee = employeeService.findOne(Employee.getID());
            }
            view = "/views/admin/employee/edit.jsp";
        }
        MessageUtil.showMessage(request);
        request.setAttribute(SystemConstant.MODEL, Employee);
        RequestDispatcher rd = request.getRequestDispatcher(view);
        rd.forward(request, response);
    }
}
