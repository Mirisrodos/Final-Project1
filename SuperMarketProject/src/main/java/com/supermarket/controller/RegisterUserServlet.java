package com.supermarket.controller;

import java.io.IOException;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.supermarket.model.dao.UserDAO;
import com.supermarket.model.entity.Users;

/**
 * Servlet implementation class RegisterUserServlet
 */
@WebServlet("/registered")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO registeredDAO = null;

	@Override
	public void init() {
		registeredDAO = new UserDAO();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("registered.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			createAccount(request, response);
		} catch (Exception e) {
            e.printStackTrace();
        }
	}

	private void createAccount(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		Users user = new Users();
		user.setUserEmail(request.getParameter("userEmail"));
		user.setUserPassword(request.getParameter("userPassword"));
		user.setUserName(request.getParameter("userName")); 
		user.setUserAddress(request.getParameter("userAddress")); 
		user.setUserPhone(request.getParameter("userPhone")); 
		user.setRegistrationDate(Calendar.getInstance().getTime());
		
		if (!registeredDAO.isExist(user.getUserEmail())) {
			registeredDAO.insert(user);
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("registered.jsp");
		}
	}

	@Override
	public void destroy() {
		registeredDAO.close();
	}
}