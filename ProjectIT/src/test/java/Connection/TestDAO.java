package Connection;

import com.supermarket.model.dao.UserDAO;

public class TestDAO {
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
