package com.supermarket.controller;

import com.supermarket.model.dao.OrderDAO;
import com.supermarket.model.dao.OrderdetailDAO;
import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.dao.UserDAO;
import com.supermarket.model.entity.Orderdetails;
import com.supermarket.model.entity.Orders;
import com.supermarket.model.entity.Products;
import com.supermarket.model.entity.Users;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testApp {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        OrderDAO orderDAO = new OrderDAO();
        OrderdetailDAO orderdetailDAO = new OrderdetailDAO();
        ProductDAO productDAO = new ProductDAO();

        Date date = new Date();
        date.setDate(date.getDate() + 3);

        Users user = userDAO.select(1);
        user.setRegistrationDate(date);
        userDAO.update(user);
    }
}
