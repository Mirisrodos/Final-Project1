package com.supermarket.controller;

import com.supermarket.util.SendEmailUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customername = request.getParameter("Name");
        String customeremail = request.getParameter("Email");
        String subject = "Contact with customer";
        String customermessage = request.getParameter("Message");
        String text = "Tin nhan gui tu khach hang: " + customername +
                "\nNoi dung: " + customermessage +
                "\nDia chi email lien lac: " + customeremail;

        SendEmailUtil.sendEmail("20110485@student.hcmute.edu.vn", subject, text);
        response.sendRedirect("contact.jsp");
    }
}
