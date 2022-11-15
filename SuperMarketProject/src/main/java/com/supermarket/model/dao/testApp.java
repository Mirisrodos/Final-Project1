package com.supermarket.model.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.supermarket.model.entity.Users;
import com.supermarket.util.HibernateUtils;
import com.supermarket.model.dao.*;


public class testApp {

	public static void main(String[] args) {
		Date date = new Date(2002-12-12);
		Users user = new Users("truong@gmail.com", "1231231", "jacob", "Japan", "12312321",
				date);
		UserDAO dao = new UserDAO();
	
		Users a = dao.select(3);
		
		dao.delete(a);
		
		
		System.out.println(a.getUserAddress());
		System.out.println("Finally");
	}
}
