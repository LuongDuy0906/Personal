package com.example.utils;

import javax.servlet.http.HttpServletRequest;

public class MessageUtil {

    public static void showMessage(HttpServletRequest request) {
        if (request.getParameter("message") != null) {
            String messageRespone = "";
            String alert = "";
            String message = request.getParameter("message");
            if (message.equals("Them_Thanh_Cong")) {
                messageRespone = "Them_Thanh_Cong";
                alert = "success";
            } else if (message.equals("Sua_Thanh_Cong")) {
                messageRespone = "Sua_Thanh_Cong";
                alert = "success";
            } else if (message.equals("Xoa_Thanh_Cong")) {
                messageRespone = "Xoa_Thanh_Cong";
                alert = "success";
            } else if (message.equals("Loi")) {
                messageRespone = "Loi";
                alert = "danger";
            }
            request.setAttribute("messageRespone", messageRespone);
            request.setAttribute("alert", alert);
        }
    }
}
