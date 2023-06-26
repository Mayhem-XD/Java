package ch08.sec2;

import ch08.sec1.RemoteControllable;
public class Main {

	public static void main(String[] args) {
		RemoteControllable rc = new SmartTV();
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();
		Searchable sc = new SmartTV();
		sc.search("YouTube");
		SmartTV stv = new SmartTV();
		stv.turnOn();
		stv.search("NAVER");
		stv.setVolume(7);
		stv.turnOff();

	}

}
