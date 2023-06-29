package ch00.sec01;
/**
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
 */
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		int testCase=0,repeat=0;
		String inpuString =null;
		Scanner scan = new Scanner(System.in);
		System.out.print("테스트케이스 입력> ");
		testCase = Integer.parseInt(scan.nextLine());
		for(int i=1;i<=testCase;i++) {
			System.out.print("반복 횟수, 문자열> ");
			inpuString = scan.nextLine();
			repeat = Integer.parseInt(inpuString.split(" ")[0]); 
			inpuString = inpuString.split(" ")[1];
			System.out.println(res(repeat, inpuString));			
		}
		scan.close();
		

	}
	
	private static String res(int repeat, String inputString) {
		
		String resString = "";
		for(String s: inputString.split("")) {
			for(int i=1;i<=repeat;i++) {
				resString+=s;
			}
		}
		
		
		return resString;
	}
	

}
