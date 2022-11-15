package com.supermarket.controller;

import com.supermarket.model.dao.UserDAO;
import com.supermarket.model.entity.Users;

public class testApp {

    public static void main(String[] args) {
        UserDAO dao = new UserDAO();

        Users user = dao.selectByEmail("hoa12312@gmail.com");
        if (user != null) {
            System.out.println(user.getUserId());
        } else
            System.out.println("NULL");
    }

}
