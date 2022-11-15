package com.supermarket.model.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.supermarket.model.entity.*;
import com.supermarket.util.HibernateUtils;
import com.supermarket.model.dao.*;


public class testApp {

	public static void main(String[] args) {
		Date date = new Date(2002-12-12);
		UserDAO udao = new UserDAO();
		ProductDAO pdao = new ProductDAO();
		
//		System.out.println(udao.selectByEmail("hoa@gmail.com").getUserAddress());
//		System.out.println(pdao.select(2).getProductName());
		List<Products> list = pdao.selectByCategory(1);
		
//		System.out.println(list.isEmpty());
		
		System.out.println();
		System.out.println("Finally");
	}
}
