package Connection;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.supermarket.model.dao.UserDAO;
import com.supermarket.model.entity.Categories;
import com.supermarket.model.entity.Orders;
import com.supermarket.model.entity.Orderdetails;
import com.supermarket.model.entity.Products;
import com.supermarket.model.entity.Suppliers;
import com.supermarket.model.entity.Users;
import com.supermarket.util.HibernateUtils;

public class testConnection {

	public static void main(String[] args) {
//		Date date = new Date(2002-12-12);
//		
//		Users user = new Users(3, "hoa@gmail.com", "123123", "Truong Thuan Hoa", "HCM", 123123,
//				date);
		UserDAO userDao = new UserDAO();
//		userDao.create(user);
//		userDao.close();
		System.out.println(userDao.validate("hoa@gmail.com", "123123"));
		
	}

}
