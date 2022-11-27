package com.supermarket.controller;

import java.util.List;

import com.supermarket.model.dao.ProductDAO;
import com.supermarket.model.entity.Products;

public class testApp {

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        List<Products> products = dao.searchProduct("to");

        for (Products p : products)
        System.out.println(p.getProductName());
    }

}
