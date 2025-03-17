package com.example.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.model.Product;
import com.example.service.IProductService;
import com.example.utils.HttpUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(urlPatterns = { "/api-admin-product" })
public class ProductAPI extends HttpServlet {

        @Inject
        private IProductService productService;

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
                ObjectMapper mapper = new ObjectMapper();
                request.setCharacterEncoding("UTF-8");
                response.setContentType("application/json");
                Product products = HttpUtil.of(request.getReader()).toModel(Product.class);
                products = productService.save(products);
                mapper.writeValue(response.getOutputStream(), products);
        }

        protected void doPut(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
                ObjectMapper mapper = new ObjectMapper();
                request.setCharacterEncoding("UTF-8");
                response.setContentType("application/json");
                Product updProduct = HttpUtil.of(request.getReader()).toModel(Product.class);
                updProduct = productService.update(updProduct);
                mapper.writeValue(response.getOutputStream(), updProduct);
        }

        /*
         * protected void doDelete(HttpServletRequest request, HttpServletResponse
         * response)
         * throws ServletException, IOException {
         * 
         * }
         */
}
