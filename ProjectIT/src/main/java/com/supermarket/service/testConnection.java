package com.supermarket.service;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.supermarket.model.Category;
import com.supermarket.model.Order;
import com.supermarket.model.OrderDetail;
import com.supermarket.model.Product;
import com.supermarket.model.Supplier;
import com.supermarket.model.User;
import com.supermarket.util.HibernateUtils;

public class testConnection {

	public static void main(String[] args) {
		Date date = new Date(2002-12-12);
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Category a = session.load(Category.class, 1);
		
		
		
		transaction.commit();
		System.out.println(a.getDecription());
		System.out.println("Finally");
	}

}
