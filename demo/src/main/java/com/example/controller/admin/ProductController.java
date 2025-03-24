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
import com.example.paging.PageRequest;
import com.example.paging.Pageble;
import com.example.service.IProductService;
import com.example.sort.Sorter;
import com.example.utils.FormUtil;

@WebServlet(urlPatterns = { "/admin-product" })
public class ProductController extends HttpServlet {

    @Inject
    private IProductService productService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Product product = FormUtil.toModel(Product.class, request);
        Pageble pageble = new PageRequest(product.getPage(), product.getMaxPageItem(),
                new Sorter(product.getSortName(), product.getSortBy()));
        product.setListResult(productService.findAll(pageble));
        product.setTotalItem(productService.getTotalItem());
        product.setTotalPage((int) Math.ceil((double) product.getTotalItem() / product.getMaxPageItem()));
        request.setAttribute(SystemConstant.MODEL, product);
        RequestDispatcher rd = request.getRequestDispatcher("/views/admin/product/list.jsp");
        rd.forward(request, response);
    }
}
