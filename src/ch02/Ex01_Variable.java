package ch02;

public class Ex01_Variable {
	private int value=20;
	public static void main(String[] args) {
		int age = 21;
		int score = 80;
		int value = 80;
		System.out.println("age: "+age+", score: "+score);
		int x = 10, y = 20;
//		x와 y의 값을 바꾸고 싶을때
		int temp = x;
		x = y;
		y = temp;
		if(score>100) {
			int localVar = 10;
			System.out.println(localVar);
		}
//		로컬 변수가 우선
		System.out.println(value);
	}	

}
