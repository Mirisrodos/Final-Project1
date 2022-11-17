package com.supermarket.model.dao;

import java.util.List;

import org.hibernate.Session;
import com.supermarket.model.entity.Products;

public class ProductDAO extends HibernateDAO<Products> implements GenericDAO<Products> {

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

	public List<Products> selectByCategory(Integer categoryid) {
		List<Products> product = null;
		String HQL = "select p from Products p inner join p.categories c where c.categoryId= :id";
		try (Session session = factory.openSession()) {
			product = session.createQuery(HQL).setParameter("id", categoryid).list();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
