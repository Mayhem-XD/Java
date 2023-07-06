package mysql.Ex06_Customer;
/**
 * CREATE TABLE if NOT EXISTS customer(
	uid VARCHAR(12) PRIMARY KEY,
	uname VARCHAR(12) NOT NULL,
	regDate DATE DEFAULT(CURRENT_DATE),
	isDeleted INT DEFAULT 0
	);
 */
import java.time.LocalDate;

public class Customer {

	private String uid;
	private String name;
	private LocalDate regDate;
	private int isDeleted;		// 0 -> 가입상태 , 1 -> 탈퇴상태
	
	public Customer() {}
	
	public Customer(String uid, String name) {
		this.uid = uid;
		this.name = name;
	}

	public Customer(String uid, String name, LocalDate regDate, int isDeleted) {
		this.uid = uid;
		this.name = name;
		this.regDate = regDate;
		this.isDeleted = isDeleted;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Customer [uid=" + uid + ", name=" + name + ", regDate=" + regDate + ", isDeleted=" + isDeleted + "]";
	}
	
	
	
	
	
	
}
