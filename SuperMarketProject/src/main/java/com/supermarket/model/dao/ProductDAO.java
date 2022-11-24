package com.supermarket.model.dao;

import java.util.List;

import org.hibernate.Session;

import com.supermarket.model.entity.Categories;
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
	
	public List<Products> selectByCategoryName(String categoryName) {
		String HQL = "select c from Categories c where c.categoryName= :name";
		try (Session session = factory.openSession()) {
			Categories category = (Categories)session.createQuery(HQL).setParameter("name", categoryName).getSingleResult();
			Integer id = (Integer)category.getCategoryId();
			System.out.println(category.getCategoryName());
			List<Products> products = selectByCategory(id);
			return products;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Products> searchProduct(String string) {
		List<Products> products = null;
		String name = "%" + string + "%";
		String HQL = "select p from  Products p where p.productName like :name";

		try (Session session = factory.openSession()){
			products = session.createQuery(HQL).setParameter("name", name).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
}
