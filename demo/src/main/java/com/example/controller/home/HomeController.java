package com.example.controller.home;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.User;
import com.example.service.ICategoryService;
import com.example.service.IUserService;
import com.example.utils.FormUtil;

@WebServlet(urlPatterns = { "/trang-chu", "/dang-nhap" })
public class HomeController extends HttpServlet {

    @Inject
    private ICategoryService categoryService;

    @Inject
    private IUserService userService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("login")) {
            RequestDispatcher rd = request.getRequestDispatcher("views/login.jsp");
            rd.forward(request, response);
        } else if (action != null && action.equals("logout")) {
        } else {
            request.setAttribute("category", categoryService.findAll());
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("login")) {
            User user = FormUtil.toModel(User.class, request);
            user = userService.findByUserNameAndPasswordAndStatus(user.getTenND(), user.getMatKhau());
            if (user != null) {
                if (user.getRole().getVaiTro().equals("User")) {
                    response.sendRedirect(request.getContextPath() + "/trang-chu");
                } else if (user.getRole().getVaiTro().equals("Admin")) {
                    response.sendRedirect(request.getContextPath() + "/admin");
                }
            } else {
                response.sendRedirect(request.getContextPath() + "/dang-nhap?action=login");
            }
        }
    }
}
