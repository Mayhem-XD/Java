package ch00.sec01;
/**
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반복횟수> ");
		int count = Integer.parseInt(scan.nextLine());
		int sumAdd=0;
		for(int i=0;i<count;i++) {
			System.out.print("입력> ");
			if(checker(scan.nextLine())==true)
				sumAdd ++;
		}
		scan.close();
		System.out.print("\n"+sumAdd+"개");

	}
	
	public static boolean checker(String word) {
		boolean[] duplicateCheck = new boolean[26];
		int prev = 0;
		for(int i=0;i<word.length();i++) {
			int now = word.charAt(i);
//			바로전 문자가 지금 문자와 일치 하지 않을때
			if(prev != now) {
//				'a' = 97, now가 'b'라면 98 - 97 로 duplicateCheck 배열의 1번 인덱스 자리 표시
				if(duplicateCheck[now - 'a' ]==false) {		// 해당 문자가 처음 나왔으면 true로 바꿔서 등장했음을 알려줌
					duplicateCheck[now - 'a'] = true;
					prev = now;
				}
				else										// 그룹 단어가 아니면 false 반환
					return false;
			}
			else
				continue;
		}
		return true;
	}

}
