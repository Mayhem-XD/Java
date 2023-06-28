package ch11.sec4;

public class Ex10_ValueOf {

	public static void main(String[] args) {
		String number = String.valueOf(100);
		String number2 = "" + 100;
		System.out.println(number.equals(number2));

	}

}
