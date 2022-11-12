package com.supermarket.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.supermarket.util.HibernateUtils;

public class HibernateDAO<E> {
	protected static SessionFactory factory = null;
	
	//Chạy khi lớp được khởi tạo (tương tự constructor)
	static {
		factory = HibernateUtils.getSessionFactory();
	}

	public HibernateDAO() {
	}
	
	public E create(E entity) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			session.persist(entity);
			//Đồng bộ cơ sở dữ liệu với Database (tải hết dữ liệu hiện tại xuống database)
			session.flush();
			//Tải lại tất cả dữ liệu dưới Database
			session.refresh(entity);
			//Khi transaction.commit thì lệnh session.flush() cũng được chạy
			transaction.commit();
			session.close();
			return entity;
		} catch (Exception e)
		{
			if (transaction != null) {
				transaction.rollback();
            }
            e.printStackTrace();
		}
		return entity;
	}
	
	public void close() {
		if(factory != null) {
			factory.close();
		}
	}
}
