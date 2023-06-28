package ch11.sec7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex02_LocalDateTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.toString().substring(0,19).replace("T", " "));
		
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime.toString().substring(0,8));

	}

}
