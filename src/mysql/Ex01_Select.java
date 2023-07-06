package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01_Select {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world",
					"ysuser",
					"yspass");
			stmt = conn.createStatement();
			String sqlString = "select * from city where countrycode='KOR' limit 10;";
//			Select 실행
			ResultSet rs = stmt.executeQuery(sqlString);
//			1	2		3			4			5
//			int	string	string		string		int
//			ID	NAME	COUNTRYCODE	DISTRICT	POPULATION
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String countrycode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);
				System.out.printf("%d, %s, %s, %s, %d\n",id,name,countrycode,district,population);
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}


}
