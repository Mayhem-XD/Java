package ch11.sec7;

import java.util.Calendar;

public class Ex03_Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year =now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int date = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.printf("%04d-%02d-%02d : %s\n%d %02d:%02d:%02d\n",year,month,day,date,amPm,hour,minute,second);
		System.out.println(hour24);

	}

}
