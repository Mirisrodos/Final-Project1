package com.supermarket.controller;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Query;

import com.supermarket.model.dao.CategoryDAO;
import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.dao.UserDAO;
import com.supermarket.model.entity.Categories;
import com.supermarket.model.entity.Products;
import com.supermarket.model.entity.Users;
import com.supermarket.util.HibernateUtils;

public class testApp {

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        List<Products> products = dao.searchProduct("to");

        for (Products p : products)
        System.out.println(p.getProductName());
    }

}
