package ch11.sec9.multi_Runable;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		Runnable beepTask = new Beep();
		Thread thread = new Thread(beepTask);
		
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
		}

	}

}
