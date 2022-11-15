package com.supermarket.model.dao;

import com.supermarket.model.entity.Categories;

public class CategoryDAO extends HibernateDAO<Categories> implements GenericDAO<Categories>{

	@Override
	public Categories insert(Categories entity) {
		// TODO Auto-generated method stub
		return super.insert(entity);
	}

	@Override
	public Categories update(Categories entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public Categories delete(Categories entity) {
		// TODO Auto-generated method stub
		return super.delete(entity);
	}

	@Override
	public Categories select(int id) {
		// TODO Auto-generated method stub
		return super.select(Categories.class, id);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.close();
	}

}
