package com.example.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Supplier;
import com.example.service.ISupplierService;
import com.example.utils.HttpUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(urlPatterns = { "/api-admin-supplier" })
public class SupplierAPI extends HttpServlet {

    @Inject
    private ISupplierService supplierService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        Supplier suppliers = HttpUtil.of(request.getReader()).toModel(Supplier.class);
        suppliers = supplierService.save(suppliers);
        mapper.writeValue(response.getOutputStream(), suppliers);
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        Supplier updSupplier = HttpUtil.of(request.getReader()).toModel(Supplier.class);
        updSupplier = supplierService.update(updSupplier);
        mapper.writeValue(response.getOutputStream(), updSupplier);
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        Supplier uSupplier = HttpUtil.of(request.getReader()).toModel(Supplier.class);
        supplierService.delete(uSupplier.getSPIDs());
        mapper.writeValue(response.getOutputStream(), "{}");
    }
}
