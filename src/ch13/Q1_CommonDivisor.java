package ch13;
/**
 * 두 개의 정수를 입력으로 받아서, 두 수의 공약수를 찾으세요
 * 단, 두 수의 공약수를 리스트로 반환하는 메소드 getCommonDivisors()를 만들어 해결
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1_CommonDivisor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력> ");
		String[] numStrings = scan.nextLine().split(" ");
		int num1 = Integer.parseInt(numStrings[0]);
		int num2 = Integer.parseInt(numStrings[1]);
		scan.close();
		
		List<Integer> cDV = getCommonDivisors(num1, num2);
		cDV.forEach(x->System.out.print(x+" "));
		System.out.println();

	}
	
	public static List<Integer> getCommonDivisors(int num1,int num2){
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                list.add(i);
		}
		return list;
	}

}
