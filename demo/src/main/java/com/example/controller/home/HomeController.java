package com.example.controller.home;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.service.ICategoryService;
import com.example.service.IProductService;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

    @Inject
    private ICategoryService categoryService;

    @Inject
    private IProductService productService;

    public HomeController() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int code = 1;

        request.setAttribute("product", productService.findByCategoryId(code));
        request.setAttribute("category", categoryService.findAll());
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
        rd.forward(request, response);
    }
}
