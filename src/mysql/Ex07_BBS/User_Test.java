package mysql.Ex07_BBS;

import java.util.List;

import org.mindrot.bcrypt.BCrypt;

import mysql.Ex07_BBS.dao.UserDao;
import mysql.Ex07_BBS.entity.User;

public class User_Test {

	public static void main(String[] args) {
		UserDao uDao = new UserDao();
//		uDao.insertUser(new User("james","james","제임스","james.@gmail.com"));
//		uDao.insertUser(new User("maria","maria","마리아","maria.@gmail.com"));
		
		User james = new User("james","james","제임스","james.@gmail.com");
		User maria = new User("maria","maria","마리아","maria.@gmail.com");
		uDao.insertUser(james);
		uDao.insertUser(maria);
		
		List<User> list = uDao.getUserList(10, 0);
		for(User u: list)
			System.out.println(u);
		
		james = uDao.getUsers("james");
		maria = uDao.getUsers("maria");
		
		String jamesPwd = BCrypt.hashpw(james.getPassword(), BCrypt.gensalt());
		String mariaPwd = BCrypt.hashpw(maria.getPassword(), BCrypt.gensalt());
		
		james.setPassword(jamesPwd);
		maria.setPassword(mariaPwd);
		
		uDao.updateUser(james);
		uDao.updateUser(maria);
		
		System.out.println("=====================");
		System.out.println(james);
		System.out.println(maria);
		System.out.println("=====================");
		
//		마리아 삭제
		uDao.deleteUser("maria");
		list = uDao.getUserList(10, 0);
		for(User u: list)
			System.out.println(u);
		
	}

}
