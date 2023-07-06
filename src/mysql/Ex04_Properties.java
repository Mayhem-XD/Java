package mysql;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Ex04_Properties {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
//		상대경로
		prop.load(Ex04_Properties.class.getResourceAsStream("mysql.properties"));
//		절대경로
		Properties props = new Properties();
		InputStream is = new FileInputStream("D:/JavaWorkspace/JavaLecture/src/mysql/mysql.properties");
		props.load(is);
		is.close();
		
		String host = props.getProperty("host");
//		String user = props.getProperty("user");
//		String password = props.getProperty("password");
		String database = props.getProperty("database");
		String port = props.getProperty("port", "3306");
		String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
		System.out.println(connStr);
		System.out.println("DriverManager.getConnection(connStr, user, password)");
		
	}

}
