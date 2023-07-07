package mysql.Ex07_BBS;

import java.util.List;

import mysql.Ex07_BBS.dao.UserDao;
import mysql.Ex07_BBS.entity.User;

public class User_Test {

	public static void main(String[] args) {
		UserDao uDao = new UserDao();
		uDao.insertUser(new User("james","james","제임스","james.@gmail.com"));
		uDao.insertUser(new User("maria","maria","마리아","maria.@gmail.com"));
		List<User> list = uDao.getUserList(10, 0);
		for(User u: list)
			System.out.println(u);
	}

}
