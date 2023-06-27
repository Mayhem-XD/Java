package ch10;

public class Ex02_Arrayindex {

	public static void main(String[] args) {
		if(args.length<1) {
			System.out.println("사용법 매개변수를 입력하세요");
		}
		else {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}

	}

}
