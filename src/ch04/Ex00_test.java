package ch04;
import java.util.Scanner;
public class Ex00_test {

	public static void main(String[] args) {

		System.out.println("연도 입력> ");
		Scanner scan = new Scanner(System.in);
		int year = Integer.parseInt(scan.nextLine());
		scan.close();
		System.out.println(year+"년은 "+leapYear(year)+"입니다.");
			
		}
	private static String leapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 
			return "윤년";
		return "평년";
	}

}
