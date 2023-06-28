package ch11.sec7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01_Date {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(simpleDateFormat.format(now));
		simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(simpleDateFormat.format(now));
	}

}
