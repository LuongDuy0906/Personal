package com.example.controller.home;

import java.io.IOException;
import java.rmi.ServerException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Product;
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

        String TenSP = "Laptop";
        String MoTa = "Don gia chi la Laptop";
        int LoaiSP = 1;
        int Gia = 100000;
        int GiaKM = 9000;

        Product products = new Product();
        products.setTenSP(TenSP);
        products.setMoTa(MoTa);
        products.setLoaiSP(LoaiSP);
        products.setGia(Gia);
        products.setGiaKM(GiaKM);

        productService.save(products);
        request.setAttribute("product", productService.findByCategoryId(code));
        request.setAttribute("category", categoryService.findAll());
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
        rd.forward(request, response);
    }
}
