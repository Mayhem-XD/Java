package ch04;

import java.util.Scanner;

public class Ex11_For {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		int oddSum =0;
		for (int i=1;i<=100;i+=2) oddSum+=i;
		System.out.println(oddSum);
		int divSum=0,num=24;
		for(int i=1;i<=num;i++) if(num%i==0) divSum+=i;
		System.out.println(divSum);
//		사용자가 5번 입력한 문자열을 받아서 하나의 문자열로 만들기
		String temp = "";
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("입력> ");
			String inputWordString = scan.nextLine();
			temp += inputWordString;
		}
		scan.close();
		System.out.println(temp);
	}
		

}
