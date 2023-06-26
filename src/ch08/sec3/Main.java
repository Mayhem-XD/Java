package ch08.sec3;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		System.out.println();
		car.frontLeftTire = new GhTire();
		car.backRightTire = new HkTire();
		car.run();
		System.out.println();
		car.changeFrontTire(new HkTire());
		car.run();
		System.out.println();
		car.changeLeftTire(new GhTire());
		car.run();

	}

}
