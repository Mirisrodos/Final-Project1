package com.supermarket.model.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.supermarket.model.entity.*;
import com.supermarket.util.HibernateUtils;
import com.supermarket.model.dao.*;


public class testApp {

	public static void main(String[] args) {
		Date date = new Date(2002-12-12);
		Users user = new Users("truong@gmail.com", "1231231", "jacob", "Japan", "12312321",
				date);
		ProductDAO dao = new ProductDAO();
	
		Products a = dao.select(3);			
		
		System.out.println(a.getProductName());
		System.out.println("Finally");
	}
}
