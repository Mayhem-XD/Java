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
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, uid);
			
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				c.setUid(rs.getString(1));
				c.setName(rs.getString(2));
				c.setRegDate(LocalDate.parse(rs.getString(3)));
				c.setIsDeleted(rs.getInt(4));
			}
			rs.close();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	
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
