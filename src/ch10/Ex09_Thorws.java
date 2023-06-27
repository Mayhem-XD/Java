package ch10;

public class Ex09_Thorws {

	public static void main(String[] args) throws Exception {
		findClass();
		
	}
	static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");
		System.out.println(clazz.getCanonicalName());
		
	}

}
