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
        
//        Categories category = dao.select(1);
        
        List<Products> product = dao.selectByCategoryName("Groceries");
        // List<Products> product = dao.selectByCategory(3);
//        // Lỗi dòng Where và setParameter, phải dùng phép join
//        String HQL = "select p from Products p inner join p.categories c where c.categoryId= :id";
//        Session session = HibernateUtils.getSessionFactory().openSession();
//        try {
//        	product = session.createQuery(HQL).setParameter("id", 1 ).list();
//        } catch (Exception e) {
//        	e.printStackTrace();
//        } finally {
//        	session.close();
//        }
		
        for (Products p:product)
        {
        	System.out.println(p.getProductId());
        }
        
    }

}
