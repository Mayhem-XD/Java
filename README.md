# Java

<h1>자바 강좌</h1>

<p>
빅데이터 머신러닝을 활용한 분석 및 UI 전문가 과정

연세it미래교육관에서 2023년 부터 2023년8월2일까지 진행됩니다.
</p>

<h3>개발 도구</h3>

>  ![img_61 (2)](https://github.com/Mayhem-XD/PyCo/assets/116787370/9945e567-f717-4da7-9db7-f4147960d7d9) ![img_61](https://github.com/Mayhem-XD/PyCo/assets/116787370/315f7972-a2df-4f8d-aeba-b889b50d0c5d)
> 
<hr>
<h2>수정중</h2>

> ext jar 3개
>
> 
<hr>
<br><br><br><br>
<h5>src/mysql/Ex06_Customer</h5>
<hr>

~~~ java
   
public class CustomerDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

// Properties 객체생성후 mysql.properties 파일에서 호스트, 사용자 이름, 비밀번호,
//		데이터베이스 이름, 포트 번호를 읽어옴
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


// myConnection() 메소드는 DriverManager.getConnection() 메소드를 호출해서 DB연결 설정 , Connection 객체 반환 
// 생성된 Connection 객체 conn은 DB와의 상호작용에 사용
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
~~~

<br>

~~~ java

// PreparedStatement은 SQL 구문을 실행시키는 기능을 가진 객체, 객체 생성시 지정된 SQL문만 사용가능, 재사용 불가
// 동일한 SQL문을 반복하면 PreparedStatement 가 성능면에서 빠름

public Customer getCustomer(String uid) {
		Connection conn = myConnection();
		String sql = "SELECT * FROM customer WHERE uid=?;";
		Customer c = new Customer();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, uid);																				
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
/* execute() 메소드는 모든 유형의 SQL 문장과 함께 사용 가능
 * boolean 값을 반환, 쿼리가 하나 이상의 ResultSet 객체를 반환할 수 있는 경우에 사용
 * 
 * executeQuery() 메소드는 SQL 쿼리를 실행하고, 쿼리에 의해 생성된 ResultSet 객체를 반환 
 * 데이터베이스에서 데이터를 검색하는 SELECT 문을 실행하는데 사용
 * 
 * executeUpdate() 메소드는 데이터베이스에서 데이터를 추가(INSERT), 삭제(DELETE), 수정(UPDATE)하는 SQL 문을 실행
 * INSERT, UPDATE 또는 DELETE 문과 같은 SQL 데이터 조작 언어(DML) 문장 
 * 또는 아무것도 반환하지 않는 SQL 문장(예: DDL 문장)을 실행하는데 사용
 */		
~~~

