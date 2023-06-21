package ch04;

public class Ex00_test03 {

	public static void main(String[] args) {

		int score = 50 + (int)(50 * Math.random());		
		System.out.println("성적은 "+score+" 학점은 "+calculateGrade(score)+addBonus(score));
	}
	private static String addBonus(int score) {
		if (score<60) return "";
		if (score%10>=7) return "+";
		else if (score%10>=3) return "0";
		return "-";
		
	}
	private static String calculateGrade(int score) {
		if (score >= 90) return "A";
		else if (score>=80) return "B";
		else if (score>=70) return "C";
		else if (score>=60) return "D";
		else return "F";
	}
}
