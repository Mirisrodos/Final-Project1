package com.supermarket.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.supermarket.model.dao.UserDAO;

@WebServlet("/login")
public class LoginUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO loginDAO = null;

    @Override
    public void init() {
        loginDAO = new UserDAO();      
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("utf-8");
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("utf-8");
    	request.setCharacterEncoding("utf-8");
        try {
        	checkAccount(request, response);    	     	     	
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkAccount(HttpServletRequest request, HttpServletResponse response)
    throws Exception {
        String email = request.getParameter("userEmail");
        String password = request.getParameter("userPassword");

        if (loginDAO.isValidate(email, password)) {
//        	Thêm session và các tính năng Attribute khi đăng nhập thành công
            HttpSession session = request.getSession();
            session.setAttribute("userid", loginDAO.selectByEmail(email).getUserId());
            session.setAttribute("username", loginDAO.selectByEmail(email).getUserName());         
            response.sendRedirect("index.jsp");         
        } else {
//        	Thêm các Attribute khi đăng nhập thất bại để hiện ra thông báo xác nhận là
//        	tài khoản và mật khẩu        	      	
            response.sendRedirect("login.jsp");       	
        }
    }
    
    @Override
    public void destroy() {
    	loginDAO.close();
    }
}