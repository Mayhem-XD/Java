package ch06;

import java.util.Scanner;

public class Ex06_TmoneyEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이> ");
		int age = scan.nextInt();
		System.out.print("금액> ");
		int cash = scan.nextInt();
		scan.close();
		Tmoney tm = new Tmoney(age, cash);
		System.out.println(tm);
		int count=0;
		while (true) {
			if (tm.ride()) {
				System.out.print(count + "회 탑승후 ");
				System.out.println(tm);
			} else
				break;
			count++;
		}		

	}
}
