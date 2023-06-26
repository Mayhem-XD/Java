package ch08.sec1;

public class Main {

	public static void main(String[] args) {
		Televison tv = new Televison();
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();
		RemoteControllable rc = new Audio();
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();

	}

}
