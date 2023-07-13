package ch00.sec01;

public class DaoExample {

	public static void main(String[] args) {
		dbWork(new MySqlDaoImpl());
		dbWork(new OracleDaoImpl());
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		
	}

}
