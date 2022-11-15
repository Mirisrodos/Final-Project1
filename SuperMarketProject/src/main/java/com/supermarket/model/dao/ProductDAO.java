package com.supermarket.model.dao;

import com.supermarket.model.entity.Products;

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
}
