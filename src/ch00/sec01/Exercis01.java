package ch00.sec01;

import java.util.Scanner;

public class Exercis01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("생년월일(yyyy-mm-dd)> ");
		String[] birth = scan.nextLine().split("-");		
		scan.close();
		System.out.println(Utils.getAge(Integer.parseInt(birth[0]), Integer.parseInt(birth[1]), Integer.parseInt(birth[2])));
		System.out.println();
		System.out.println(Utils.getAgePP(Integer.parseInt(birth[0]), Integer.parseInt(birth[1]), Integer.parseInt(birth[2])));

	}

}
