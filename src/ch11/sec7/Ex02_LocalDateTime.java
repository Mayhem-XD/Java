package ch11.sec7;

import java.time.DayOfWeek;
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

		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.printf("%d-%02d-%02d\n",year,month,day);
		
		DayOfWeek date = today.getDayOfWeek();
		System.out.println(date);
		System.out.println(date.getValue());
		String[] dateStrings = "일 월 화 수 목 금 토".split(" ");
		System.out.println(dateStrings[date.getValue()]);
		
		
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		System.out.printf("%02d-%02d-%02d\n",hour,minute,second);
	}

}
