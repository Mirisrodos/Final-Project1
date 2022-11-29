package com.supermarket.controller;

import com.sun.net.httpserver.HttpPrincipal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (isLogin(request, response)) {
            response.sendRedirect("checkout.jsp");
        }
        else
            response.sendRedirect("login.jsp");
    }

    private boolean isLogin(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        if (session.getAttribute("userid") != null) {
            return true;
        }
        return false;
    }
}
