package com.supermarket.controller;

import com.supermarket.model.dao.OrderDAO;
import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.dao.UserDAO;
import com.supermarket.model.entity.Orderdetails;
import com.supermarket.model.entity.Orders;
import com.supermarket.model.entity.Products;
import com.supermarket.model.entity.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
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
                if (product != null) {
                    HttpSession session = request.getSession();
                    if (session.getAttribute("orderlist") == null) {
                        List<Orderdetails> orderlist = new ArrayList<Orderdetails>();
                        Orderdetails order = new Orderdetails();
                        order.setProducts(product);
                        order.setDetailQuantity(quality);
                        orderlist.add(order);
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
                        if (check == false) {
                            Orderdetails order = new Orderdetails();
                            order.setProducts(product);
                            order.setDetailQuantity(quality);
                            orderlist.add(order);
                        }
                        session.setAttribute("orderlist", orderlist);
                    }
                }
                System.out.println("true");
//                Test
                HttpSession session = request.getSession();
                List<Orderdetails> orderlist = (List<Orderdetails>) session.getAttribute("orderlist");
                for (Orderdetails order : orderlist) {
                    System.out.println(order.getProducts().getProductName());
                    System.out.println(order.getDetailQuantity());
                }

                response.sendRedirect("checkout");
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

    @Override
    public void destroy() {
        productDAO.close();
        orderDAO.close();
    }
}
