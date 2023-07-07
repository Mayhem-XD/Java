package mysql.Ex07_BBS.entity;

import java.time.LocalDate;

public class User {

	private String uid;
	private String password;
	private String unameString;
	private String email;
	private LocalDate regDate;
	private int isDeleted;
	
	public User() {}
	public User(String uid, String password, String uname, String email) {
		this.uid = uid;
		this.password = password;
		this.unameString = uname;
		this.email = email;
	}
	
	public User(String uid, String password, String unameString, String email, LocalDate regDate, int isDeleted) {
		super();
		this.uid = uid;
		this.password = password;
		this.unameString = unameString;
		this.email = email;
		this.regDate = regDate;
		this.isDeleted = isDeleted;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUnameString() {
		return unameString;
	}
	public void setUnameString(String unameString) {
		this.unameString = unameString;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", password=" + password + ", unameString=" + unameString + ", email=" + email
				+ ", regDate=" + regDate + ", isDeleted=" + isDeleted + "]";
	}
	
	
	
}
