package com.supermarket.model.dao;

import com.supermarket.model.entity.Orderdetails;

public class OrderdetailDAO extends HibernateDAO<Orderdetails> implements GenericDAO<Orderdetails> {

	@Override
	public Orderdetails insert(Orderdetails entity) {
		// TODO Auto-generated method stub
		return super.insert(entity);
	}

	@Override
	public Orderdetails update(Orderdetails entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public Orderdetails delete(Orderdetails entity) {
		// TODO Auto-generated method stub
		return super.delete(entity);
	}

	@Override
	public Orderdetails select(int id) {
		// TODO Auto-generated method stub
		return super.select(Orderdetails.class, id);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.close();
	}

}
