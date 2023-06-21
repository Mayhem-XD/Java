package ch04;

import java.util.Scanner;

public class Ex00_test04 {

	public static void main(String[] args) {
		int hour, minute;
		Scanner scan = new Scanner(System.in);
		System.out.println("시간> ");
		hour = scan.nextInt();
		System.out.println("분> ");
		minute = scan.nextInt();
		scan.close();
		if (minute<45) {
			hour = (hour + 24 - 1) % 24;
			minute += 15;
		}
	    else {
	    	minute -= 45;	    	
	    }
	    System.out.println("hour: "+hour+" minute: "+minute);

	}

}
