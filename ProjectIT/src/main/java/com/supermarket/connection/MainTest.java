package com.supermarket.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.supermarket.util.HibernateUtils;


public class MainTest {

	static final SessionFactory factory = HibernateUtils.getSessionFactory();
	
	public static void main(String[] args) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		

	}

}
