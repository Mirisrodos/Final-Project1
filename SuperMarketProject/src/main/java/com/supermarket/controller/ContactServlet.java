package com.supermarket.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supermarket.util.SendEmailUtil;

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
