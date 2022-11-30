package com.supermarket.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.supermarket.model.dao.ProductDAO;

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
