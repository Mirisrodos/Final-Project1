package com.supermarket.controller;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

@WebServlet(name = "OrderServlet", value = "/OrderServlet")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (isLogin(request, response)) {
            String orderaddress = request.getParameter("Address") + " " + request.getParameter("Wards") +
                    " " + request.getParameter("District") + " " + request.getParameter("Province");
            Date date = null;
        } else {
            response.sendRedirect("login.jsp");
        }


    }

    private boolean isLogin(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        if (session.getAttribute("userid") != null) {
            return true;
        }
        return false;
    }
}
