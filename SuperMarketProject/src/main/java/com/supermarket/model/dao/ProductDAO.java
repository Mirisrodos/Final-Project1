package com.supermarket.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.supermarket.model.entity.Products;
import com.supermarket.model.entity.Users;

public class ProductDAO extends HibernateDAO<Products> implements GenericDAO<Products>  {

	@Override
	public Products insert(Products entity) {
		return super.insert(entity);
	}

	@Override
	public Products update(Products entity) {
		return super.update(entity);
	}

	@Override
	public Products delete(Products entity) {
		return super.delete(entity);
	}

	@Override
	public Products select(int id) {
		return super.select(Products.class, id);
	}	
	
	public List<Products> selectByCategory(Integer categoryid){
		Transaction transaction = null;
		List<Products> list;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
//			Bug xem lai createQuery
			list = (List<Products>) session.createQuery("FROM Products P WHERE P.categoryID = :id")
					.setParameter("id", categoryid).getResultList();
			transaction.commit();
			return list;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		return null;
	}
	
}
