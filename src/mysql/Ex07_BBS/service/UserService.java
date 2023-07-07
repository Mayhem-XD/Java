package mysql.Ex07_BBS.service;

import org.mindrot.bcrypt.BCrypt;

import mysql.Ex07_BBS.dao.UserDao;
import mysql.Ex07_BBS.entity.User;

public class UserService {

	public static final int CORRECT_LOGIN = 0;
	public static final int WORNG_PASSWORD = 1;
	public static final int UID_NOT_EXIST = 2;
	
	
	
	public int login(String uid, String pwd) {
		
		UserDao uDao = new UserDao();
		User user = uDao.getUsers(uid);
		if(user == null)	//uDao 가 없으면 null을 반환하게 작성되어있음
			return UID_NOT_EXIST;
		if(BCrypt.checkpw(pwd, user.getPassword()))		// 같으면
			return CORRECT_LOGIN;
		else
			return WORNG_PASSWORD;
	}
	
	
	
	
}
