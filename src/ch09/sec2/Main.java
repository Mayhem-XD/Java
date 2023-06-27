package ch09.sec2;
import ch08.sec1.RemoteControllable;

public class Main {

	public static void main(String[] args) {
		RemoteControllable rc = new RemoteControllable() {
			
			@Override
			public void turnOn() {
				System.out.println("익명구현객체 turnOn()");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("익명구현객체 turnOff()");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("익명구현객체 setVolume("+ volume + ")");
				
			}
		};
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
