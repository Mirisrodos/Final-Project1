package com.supermarket.model.dao;

import com.supermarket.model.entity.Orders;

public class OrderDAO extends HibernateDAO<Orders> implements GenericDAO<Orders> {

	@Override
	public Orders insert(Orders entity) {
		// TODO Auto-generated method stub
		return super.insert(entity);
	}

	@Override
	public Orders update(Orders entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public Orders delete(Orders entity) {
		// TODO Auto-generated method stub
		return super.delete(entity);
	}

	@Override
	public Orders select(int id) {
		// TODO Auto-generated method stub
		return super.select(Orders.class, id);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.close();
	}

}
