package com.supermarket.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.supermarket.model.dao.OrderdetailDAO;
import com.supermarket.model.entity.Orderdetails;

@WebServlet("/removefromcart")
public class RemoveFromCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OrderdetailDAO orderdetailDAO = new OrderdetailDAO();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {				
		if (!isLogin(request, response)) {
			response.sendRedirect("login.jsp");		
		}
		else {		
			int detailId = Integer.parseInt(request.getParameter("detailId"));
			
			HttpSession session = request.getSession();
			
			List<Orderdetails> orderList = new ArrayList<Orderdetails>();
			orderList = (List<Orderdetails>)session.getAttribute("orderlist");
			
			for(Orderdetails item : orderList) {
				if (item.getDetailId() == detailId) {
					orderList.remove(item);
					break;
				}
			}
						
			session.setAttribute("orderlist", orderList);
			session.setAttribute("totalAmount", caculateTotalAmount(orderList));
			session.setAttribute("totalProduct", orderList.size());			
			response.sendRedirect("checkout.jsp");
		}
	}
	
	 private boolean isLogin(HttpServletRequest request, HttpServletResponse response) {
	        HttpSession session = request.getSession();
	        if (session.getAttribute("userid") != null) {
	            return true;
	        }
	        return false;
	 }
	 private int caculateTotalAmount(List<Orderdetails> orderList) {
	    	int temp = 0;
	    	for(Orderdetails item : orderList) {
	    		temp = temp + item.getProducts().getPrice();
	    	}
	    	return temp;
	 }
}
