package com.supermarket.model.dao;

import com.supermarket.model.entity.Suppliers;

public class SupplierDAO extends HibernateDAO<Suppliers> implements GenericDAO<Suppliers> {

	@Override
	public Suppliers insert(Suppliers entity) {
		// TODO Auto-generated method stub
		return super.insert(entity);
	}

	@Override
	public Suppliers update(Suppliers entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}

	@Override
	public Suppliers delete(Suppliers entity) {
		// TODO Auto-generated method stub
		return super.delete(entity);
	}

	@Override
	public Suppliers select(int id) {
		// TODO Auto-generated method stub
		return super.select(Suppliers.class, id);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.close();
	}

}
