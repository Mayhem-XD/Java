package ch00.sec01;
/**
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		String numbers = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("입력> ");
		numbers = scan.nextLine();
		scan.close();
		System.out.println(addAll(numbers));
	}

	
	private static int addAll(String numbers) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(String s:numbers.split("")) 
			list.add(Integer.parseInt(s));
		int add=0;
		for(int i:list) add+=i;
		
		return add;
	}
	
	
}
