package com.supermarket.model.dao;

import com.supermarket.model.entity.Orders;
import com.supermarket.model.entity.Users;
import org.hibernate.Session;

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

	public Orders selectByUser(Users users) {
		Orders order = null;
		String HQL = "from Orders o where o.users = :id order by o.orderId DESC";

		try (Session session = factory.openSession()) {
			order = (Orders) session.createQuery(HQL).setParameter("id", users).uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return order;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.close();
	}

}
