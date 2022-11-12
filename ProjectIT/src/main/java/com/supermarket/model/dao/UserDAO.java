package com.supermarket.model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.supermarket.model.entity.Users;

public class UserDAO extends HibernateDAO<Users> implements GenericDAO<Users> {

	@Override
	public Users create(Users user) {
		return super.create(user);
	}

	public boolean validate(String userEmail, String userPassword) {
		Session session = null;
		Transaction transaction = null;
		Users user = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			user = (Users) session.createQuery("FROM Users U WHERE U.userEmail = :userEmail")
					.setParameter("userEmail", userEmail).uniqueResult();

			if (user != null && user.getUserPassword().equals(userPassword)) {
				return true;
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return false;
	}
}
