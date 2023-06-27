package ch11.sec3;

public class Main {

	public static void main(String[] args) throws Exception {
		Car car = new Car("Model 3","Tesla");
		Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		System.out.println();

		clazz = Class.forName("ch11.sec3.Car");
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		System.out.println();
		
		clazz = Car.class;
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		System.out.println();
	}

}
