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
import com.example.model.Supplier;
import com.example.paging.PageRequest;
import com.example.paging.Pageble;
import com.example.service.ISupplierService;
import com.example.sort.Sorter;
import com.example.utils.FormUtil;
import com.example.utils.MessageUtil;

@WebServlet(urlPatterns = { "/admin-supplier" })
public class SupplierController extends HttpServlet {

    @Inject
    private ISupplierService supplierService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Supplier supplier = FormUtil.toModel(Supplier.class, request);
        String view = "";
        if (supplier.getType().equals(SystemConstant.LIST)) {
            Pageble pageble = new PageRequest(supplier.getPage(), supplier.getMaxPageItem(),
                    new Sorter(supplier.getSortName(), supplier.getSortBy()));
            supplier.setListResult(supplierService.findAll(pageble));
            supplier.setTotalItem(supplierService.getTotalItem());
            supplier.setTotalPage((int) Math.ceil((double) supplier.getTotalItem() / supplier.getMaxPageItem()));
            view = "/views/admin/supplier/list.jsp";
        } else if (supplier.getType().equals(SystemConstant.EDIT)) {
            if (supplier.getID() != null) {
                supplier = supplierService.findOne(supplier.getID());
            }
            view = "/views/admin/supplier/edit.jsp";
        }
        MessageUtil.showMessage(request);
        request.setAttribute(SystemConstant.MODEL, supplier);
        RequestDispatcher rd = request.getRequestDispatcher(view);
        rd.forward(request, response);
    }
}
