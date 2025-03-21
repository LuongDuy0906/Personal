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
import com.example.model.Product;
import com.example.service.IProductService;

@WebServlet(urlPatterns = { "/admin-product" })
public class ProductController extends HttpServlet {

    @Inject
    private IProductService productService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Product product = new Product();
        product.setListResult(productService.findAll());
        request.setAttribute(SystemConstant.MODEL, product);
        RequestDispatcher rd = request.getRequestDispatcher("/views/admin/product/list.jsp");
        rd.forward(request, response);
    }
}
