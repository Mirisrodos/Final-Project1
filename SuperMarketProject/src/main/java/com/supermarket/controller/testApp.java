package com.supermarket.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;

import com.supermarket.model.dao.UserDAO;
import com.supermarket.model.entity.Products;
import com.supermarket.model.entity.Users;
import com.supermarket.util.HibernateUtils;

public class testApp {

    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Transaction transaction = null;
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("SELECT P Product");
			List<Products> list = query.list();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
    }

}
