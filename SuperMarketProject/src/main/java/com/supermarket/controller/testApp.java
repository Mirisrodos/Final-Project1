package com.supermarket.controller;

import java.util.List;

import com.supermarket.model.dao.OrderDAO;
import com.supermarket.model.dao.OrderdetailDAO;
import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.dao.UserDAO;
import com.supermarket.model.entity.Orderdetails;
import com.supermarket.model.entity.Orders;
import com.supermarket.model.entity.Products;
import org.hibernate.criterion.Order;

public class testApp {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        OrderDAO orderDAO = new OrderDAO();
        OrderdetailDAO orderdetailDAO = new OrderdetailDAO();
        ProductDAO productDAO = new ProductDAO();

        Orders order = orderDAO.select(1);
        Products products = productDAO.select(1);
        Orderdetails orderdetails = new Orderdetails();
//        orderdetails.setProducts(products);
//        orderdetails.setDetailQuantity(1);
//        orderdetails.setOrders(order);
//        orderdetailDAO.insert(orderdetails);
        orderdetails = orderdetailDAO.select(5);
        System.out.println(orderdetails.getOrders().getOrderId());
    }

}
