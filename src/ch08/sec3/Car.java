package ch08.sec3;

public class Car {
	Rollable frontLeftTire = new HkTire();
	Rollable frontRightTire = new HkTire();
	Rollable backLeftTire = new GhTire();
	Rollable backRightTire = new GhTire();
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	void changeFrontTire(Rollable tire) {
		this.frontLeftTire = tire;
		this.frontRightTire = tire;
	}
	void changeLeftTire(Rollable tire) {
		this.frontLeftTire = tire;
		this.backLeftTire = tire;
	}
}
