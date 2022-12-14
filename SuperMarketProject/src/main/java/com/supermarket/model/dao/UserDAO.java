package com.supermarket.model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.supermarket.model.entity.Users;

public class UserDAO extends HibernateDAO<Users> implements GenericDAO<Users> {

	@Override
	public Users insert(Users user) {
		return super.insert(user);
	}

	@Override
	public Users update(Users entity) {
		return super.update(entity);
	}

	@Override
	public Users delete(Users entity) {
		return super.delete(entity);
	}

	@Override
	public Users select(int id) {
		// TODO Auto-generated method stub
		return super.select(Users.class, id);
	}

	public Users selectByEmail(String email) {
		Transaction transaction = null;
		Users user;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			user = (Users) session.createQuery("FROM Users U WHERE U.userEmail = :userEmail")
					.setParameter("userEmail", email).uniqueResult();
			transaction.commit();
			return user;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return null;
	}

	public boolean isExist(String userEmail) {
		Transaction transaction = null;
		Users user;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			user = (Users) session.createQuery("FROM Users U WHERE U.userEmail = :userEmail")
					.setParameter("userEmail", userEmail).uniqueResult();
			if (user != null) {
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

	public boolean isValidate(String userEmail, String userPassword) {
		Transaction transaction = null;
		Users user;
		try (Session session = factory.openSession()) {
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
