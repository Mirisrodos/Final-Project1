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

import com.supermarket.model.dao.OrderDAO;
import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.entity.Orderdetails;
import com.supermarket.model.entity.Products;

@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDAO productDAO = null;
    private OrderDAO orderDAO = null;

    @Override
    public void init() throws ServletException {
        productDAO = new ProductDAO();
        orderDAO = new OrderDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (!isLogin(request, response)) {
            response.sendRedirect("login.jsp");
        } else {
            int quality = 1;
            int id;

//            Thay the giua getParameter vs getAttribute
            if (request.getParameter("productId") != null) {
                id = Integer.parseInt(request.getParameter("productId"));
                Products product = productDAO.select(id);
                HttpSession session = request.getSession();
                if (product != null) {                   
                    if (session.getAttribute("orderlist") == null) {
                        List<Orderdetails> orderlist = new ArrayList<>();
                        Orderdetails order = new Orderdetails();
                        order.setProducts(product);
                        order.setDetailQuantity(quality);
                        orderlist.add(order);
                        session.setAttribute("totalProduct", orderlist.size());
                        session.setAttribute("orderlist", orderlist);
                    } else {
                        List<Orderdetails> orderlist = (List<Orderdetails>) session.getAttribute("orderlist");
                        boolean check = false;
                        for (Orderdetails order : orderlist) {
                            if (order.getProducts().getProductId() == product.getProductId()) {
                                order.setDetailQuantity(order.getDetailQuantity() + quality);
                                check = true;
                            }
                        }
                        if (!check) {
                            Orderdetails order = new Orderdetails();
                            order.setProducts(product);
                            order.setDetailQuantity(quality);
                            orderlist.add(order);
                        }
                        session.setAttribute("totalProduct", orderlist.size());
                        session.setAttribute("totalAmount", caculateTotalAmount(orderlist));
                        session.setAttribute("orderlist", orderlist);
                    }
                }
                System.out.println("true");
//                Test              
                List<Orderdetails> orderlist = (List<Orderdetails>) session.getAttribute("orderlist");
                for (Orderdetails order : orderlist) {
                    System.out.println(order.getProducts().getProductName());
                    System.out.println(order.getDetailQuantity());
                }
                System.out.println(request.getContextPath());
                if (request.getParameter("categoryName") != null)
                    response.sendRedirect("renderdata?categoryName=" + request.getParameter("categoryName"));
                else
                    response.sendRedirect("index.jsp");
            } else {
                System.out.println("false");
                System.out.println(request.getAttribute("productId"));
                response.sendRedirect("checkout");
            }

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

    @Override
    public void destroy() {
        productDAO.close();
        orderDAO.close();
    }
}
