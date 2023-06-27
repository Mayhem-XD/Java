package ch08.sec4;

public interface DataAccessObject {
	void select();			//	실제로는 DTO type
	void insert();
	void update();
	void delete();

}
