package ch08.sec91;

public class Main {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		
		dbWork(new OracleDao());
		dbWork(new MySql());
		
	}

}
