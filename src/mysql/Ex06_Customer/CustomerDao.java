package mysql.Ex06_Customer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class CustomerDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public CustomerDao() {
		try {
			Properties props = new Properties();
			InputStream is = new FileInputStream("D:/JavaWorkspace/JavaLecture/src/mysql/mysql.properties");
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection myConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr,user,password);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public Customer getCustomer(String uid) {
		Connection conn = myConnection();
		String sql = "SELECT * FROM customer WHERE uid=?;";
		Customer c = new Customer();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);	//	SQL 구문을 실행시키는 기능을 가진 객체, 
			pstmt.setString(1, uid);								//	객체 생성시에 지정된 SQL문만 사용가능, 재사용 불가
																	//	동일한 SQL문을 반복하면 pstmt가 성능면에서 빠름, LIKE 키워드 사용불가
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				c.setUid(rs.getString(1));
				c.setName(rs.getString(2));
				c.setRegDate(LocalDate.parse(rs.getString(3)));
				c.setIsDeleted(rs.getInt(4));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
/*	execute() 메소드는 모든 유형의 SQL 문장과 함께 사용 가능
 * 	boolean 값을 반환, 쿼리가 하나 이상의 ResultSet 객체를 반환할 수 있는 경우에 사용
 * 
 * executeQuery() 메소드는 SQL 쿼리를 실행하고, 쿼리에 의해 생성된 ResultSet 객체를 반환 
 * 데이터베이스에서 데이터를 검색하는 SELECT 문을 실행하는데 사용
 * 
 * executeUpdate() 메소드는 데이터베이스에서 데이터를 추가(INSERT), 삭제(DELETE), 수정(UPDATE)하는 SQL 문을 실행
 * INSERT, UPDATE 또는 DELETE 문과 같은 SQL 데이터 조작 언어(DML) 문장 또는 아무것도 반환하지 않는 SQL 문장(예: DDL 문장)을 실행하는데 사용
 * 
 */
	
	
	public List<Customer> getCustomersList(){
		List<Customer> list = new ArrayList<Customer>();
		Connection conn = myConnection();
		String sql = "select * from customer where isDeleted=0;";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String uid = rs.getString(1);
				String uname = rs.getString(2);
				LocalDate regDate = LocalDate.parse(rs.getDate(3).toString());
				int isDeleted = rs.getInt(4);
				Customer c = new Customer(uid,uname,regDate,isDeleted);
				list.add(c);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	public void insertCustomer(Customer c) {
		Connection conn = myConnection();
		String sql = "INSERT INTO customer VALUES(?, ?, default, default);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getUid());
			pstmt.setString(2, c.getName());
			pstmt.executeUpdate();pstmt.close();conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void updateCustomer(Customer c) {
		Connection conn = myConnection();
		String sql = "UPDATE customer SET uname=?, regDate=?, isDeleted=? WHERE uid=?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getRegDate().toString());
			pstmt.setInt(3, c.getIsDeleted());
			pstmt.setString(4, c.getUid());
			pstmt.executeUpdate();pstmt.close();conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCustomer(String uid) {
		Connection conn = myConnection();
		String sql = "UPDATE customer SET isDeleted=? WHERE uid=?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, uid);
			pstmt.executeUpdate();pstmt.close();conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
