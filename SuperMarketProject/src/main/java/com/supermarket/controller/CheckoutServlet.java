package com.supermarket.controller;

import com.sun.net.httpserver.HttpPrincipal;
import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.entity.Orderdetails;
import com.supermarket.model.entity.Products;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {
    private ProductDAO productDAO = null;

    @Override
    public void init() throws ServletException {
        productDAO = new ProductDAO();
    }

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
//            List<Products> productlist = new ArrayList<Products>();
//            List<Orderdetails> orderdetails = (List<Orderdetails>) session.getAttribute("orderlist");
//            Products product = new Products();
//
//            for (Orderdetails order:orderdetails) {
//                product = productDAO.select(order.getProducts().getProductId());
//                productlist.add(product);
//            }
//
//            session.setAttribute("productlist", productlist);
            return true;
        }
        return false;
    }

    @Override
    public void destroy() {
        productDAO.close();
    }
}
