package ch11.sec9.BeepThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new BeepThread();
		
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
		}

	}

}
