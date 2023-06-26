package ch07.sec5;

public class Main {

	public static void main(String[] args) {
//		Phone phone = new Phone()					추상 클래스는 객체화할 수 없음
		SmartPhone sp = new SmartPhone();		//	추상클래스를 상속받은 클래스만 객체화 가능
		sp.turnOn();
		sp.turnOff();
		sp.call("010-2345-6789");
	}

}
