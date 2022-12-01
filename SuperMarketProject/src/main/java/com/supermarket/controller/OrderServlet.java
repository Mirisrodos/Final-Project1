package com.supermarket.controller;

import com.supermarket.model.dao.OrderDAO;
import com.supermarket.model.dao.OrderdetailDAO;
import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.dao.UserDAO;
import com.supermarket.model.entity.Orderdetails;
import com.supermarket.model.entity.Orders;
import com.supermarket.model.entity.Products;
import com.supermarket.model.entity.Users;
import com.supermarket.util.SendEmailUtil;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
    private UserDAO userDAO = null;
    private OrderDAO orderDAO = null;
    private OrderdetailDAO orderdetailDAO = null;
    private ProductDAO productDAO = null;

    @Override
    public void init() throws ServletException {
        userDAO = new UserDAO();
        orderDAO = new OrderDAO();
        orderdetailDAO = new OrderdetailDAO();
        productDAO = new ProductDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (isLogin(request, response)) {
            HttpSession session = request.getSession();
            Users user = userDAO.select((int) session.getAttribute("userid"));
            String orderaddress = request.getParameter("address") + " " + request.getParameter("wards") +
                    " " + request.getParameter("district") + " " + request.getParameter("province");
            int phone = Integer.parseInt(request.getParameter("phoneNumber"));
            Date createdate = new Date();

//            Tao order
            Orders order = new Orders();
            order.setUsers(user);
            order.setOrderPhone(phone);
            order.setOrderAddress(orderaddress);
            order.setCreateDate(createdate);
//            Ngay order bang ngay tao + 3
            createdate.setDate(createdate.getDate() + 3);
            order.setOrderDate(createdate);
//            Them Order vao database
            orderDAO.insert(order);

//            Them orderdetail vao database
            if (session.getAttribute("orderlist") != null) {
                List<Orderdetails> orderlist = (List<Orderdetails>) session.getAttribute("orderlist");
                for (Orderdetails orderdetail : orderlist) {
                    orderdetail.setOrders(order);
                    orderdetailDAO.insert(orderdetail);
                }
                sendEmail(user, order, orderlist);
                session.removeAttribute("orderlist");
                session.removeAttribute("totalAmount");
                session.removeAttribute("totalProduct");
            }
            response.sendRedirect("checkout.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }


    }

    private boolean sendEmail(Users user, Orders orders, List<Orderdetails> orderlist){
        int total = 0;
        Products product = new Products();
        String subject = "Confirm order detail";
        String text = "Name: " + user.getUserName() +
                "\nAddress: " + orders.getOrderAddress() +
                "\nPhone: " + orders.getOrderPhone() +
                "\nReceived date: " + orders.getOrderDate() +
                "\nList product: ";
        for (Orderdetails orderdetails:orderlist) {
            product = productDAO.select(orderdetails.getProducts().getProductId());
            text += "\n  -" + product.getProductName() + ": " + orderdetails.getDetailQuantity();
            total = product.getPrice() * orderdetails.getDetailQuantity();
        }

        text += "\n Total price: " + "$" + total;

        SendEmailUtil.sendEmail(user.getUserEmail(), subject, text);
        return false;
    }

    private boolean isLogin(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        return session.getAttribute("userid") != null;
    }

    @Override
    public void destroy() {
        userDAO.close();
        orderDAO.close();
        orderdetailDAO.close();
        productDAO.close();
    }
}
