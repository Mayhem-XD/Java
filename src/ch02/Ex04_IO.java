package ch02;

import java.util.Scanner;

public class Ex04_IO {

	public static void main(String[] args) throws Exception{
		/*
		 * int keyCode = System.in.read(); // single character 읽을 때 쓰지만 잘 안씀
		 * System.out.println(keyCode);
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력하세요> ");
		String inputText = scan.nextLine();		//	Enter 칠 때 까지의 문자열을 읽음
		System.out.println(inputText);

		System.out.print("타입을 입력하세요> ");
		String type = scan.nextLine();
		System.out.print(type+"를 입력하세요> ");	//	정수, 실수
		String numStr = scan.nextLine();
		if(type.equals("정수")) {
			int num = Integer.parseInt(numStr);
			System.out.println(num);
			
		}
		else if (type.equals("실수")) {
			double num = Double.parseDouble(numStr);
			System.out.println(num);
		}
		else {
			System.out.print("정수나 실수를 입력하세요");
		}
		
		
		
		
	}

}
