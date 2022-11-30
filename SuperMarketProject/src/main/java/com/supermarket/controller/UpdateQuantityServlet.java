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

import com.supermarket.model.entity.Orderdetails;

@WebServlet("/UpdateQuantity")
public class UpdateQuantityServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String action = request.getParameter("action");
		int productId = Integer.parseInt(request.getParameter("productId"));
		List<Orderdetails> orderDetails = new ArrayList<Orderdetails>();
		HttpSession session = request.getSession();
		orderDetails = (List<Orderdetails>)session.getAttribute("orderlist");
		
		if (action.equals("increase")) {
			for(Orderdetails item : orderDetails) {
				if(item.getProducts().getProductId() == productId) {
					item.setDetailQuantity(item.getDetailQuantity() + 1);
					break;
				}
			}
		} else if (action.equals("decrease")) {
			for(Orderdetails item : orderDetails) {
				if(item.getProducts().getProductId() == productId) {
					int temp = item.getDetailQuantity() - 1;
					if(temp == 0) {
						orderDetails.remove(item);
					}
					else {
						item.setDetailQuantity(temp);
					}
					break;
				}
			}
		} else {
			response.sendRedirect("index.jsp");
		}
		
		session.setAttribute("totalProduct", orderDetails.size());
		session.setAttribute("totalAmount", caculateTotalAmount(orderDetails));
		session.setAttribute("orderlist", orderDetails);
		response.sendRedirect("checkout.jsp");
	}
	private int caculateTotalAmount(List<Orderdetails> orderList) {
    	int temp = 0;
    	for(Orderdetails item : orderList) {
    		temp = temp + item.getProducts().getPrice() * item.getDetailQuantity();
    	}
    	return temp;
    }
}
