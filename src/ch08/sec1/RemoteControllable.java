package ch08.sec1;

public interface RemoteControllable {
//	상수(Constant)
	public int MAX_VOLUME = 10;			//	static final이 생략되어 있음
	public static final int MIN_VOLUME = 0;
//	추상 메소드(Abstract method)
	void turnOn();						//	public abstract가 생략되어 있음
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
}
