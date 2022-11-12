package Connection;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.supermarket.model.entity.Categories;
import com.supermarket.model.entity.Orders;
import com.supermarket.model.entity.Orderdetails;
import com.supermarket.model.entity.Products;
import com.supermarket.model.entity.Suppliers;
import com.supermarket.model.entity.Users;
import com.supermarket.util.HibernateUtils;

public class testConnection {

	public static void main(String[] args) {
		Date date = new Date(2002-12-12);
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Categories a = session.load(Categories.class, 1);
		
		
		transaction.commit();
		System.out.println(a.getDecription());
		System.out.println("Finally");
	}

}
