package ch00.sec01;
/**
 * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 
 * 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 */
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력> ");
		System.out.println(wordCount(scan.nextLine()));
		scan.close();

	}
	
	public static int wordCount(String words) {
		
		int numWord = words.split("\\s").length;
		
		return numWord;
	}

}
