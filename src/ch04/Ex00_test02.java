package ch04;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 만 나이 계산
 */
public class Ex00_test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * int bYear,bMonth,bDay,age,month,day; System.out.println("생년> "); bYear =
		 * scan.nextInt(); System.out.println("생월> "); bMonth = scan.nextInt();
		 * System.out.println("생일> "); bDay = scan.nextInt();
		 */
		System.out.println("생년월일(yyyy-mm-dd)> ");
		String[] birth = scan.nextLine().split("-");		
		int bYear,bMonth,bDay,age,month,day;
		scan.close();
		bYear = Integer.parseInt(birth[0]);
		bMonth = Integer.parseInt(birth[1]);
		bDay = Integer.parseInt(birth[2]);
		
		
		LocalDate today = LocalDate.now();
//		System.out.printf("%d-%02d-%02d\n",today.getYear(),today.getMonthValue(),today.getDayOfMonth());
		age = today.getYear() - bYear;
		month = bMonth - today.getMonthValue();
		day = today.getDayOfMonth() - bDay;
		if (month > 0 || (month == 0 && day >= 0)) {
		    age--;
		}
		System.out.println("만 "+age+" 세");
		
		
		
	}

}
