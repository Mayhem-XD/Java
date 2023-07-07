package mysql.Ex07_BBS;

import org.mindrot.bcrypt.BCrypt;

public class BcryptExample {

	public static void main(String[] args) {
		String pwd = "1234asdf";
		String cryptedPWD = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(cryptedPWD.length()+", "+cryptedPWD);
//		60, $2a$10$HJMCx31qdcFGDzPNrkdhbeDCMUHJ3.X6mVBourIaeR5NPbFsYo.Ny
//		동일한지 확인
		boolean result = BCrypt.checkpw(pwd, cryptedPWD);
		System.out.println(result);

	}

}
