package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02_SelectParameter {

	public static void main(String[] args) {
		select("KOR", 10);

	}
	static void select(String countryCode, int num) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world",
					"ysuser",
					"yspass");
			String sqlString = "select * from city where countrycode=? limit ?;";
//			SQL에 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sqlString);
			pstmt.setString(1, countryCode);
			pstmt.setInt(2, num);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String countrycode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);
				System.out.printf("%d, %s, %s, %s, %d\n",id,name,countrycode,district,population);
			}
			rs.close();
			pstmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
