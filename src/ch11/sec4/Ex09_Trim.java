package ch11.sec4;

public class Ex09_Trim {

	public static void main(String[] args) {
		String oldStr = "\t   자바 프로그래밍  \t \r\n";
		String newStr = oldStr.trim();
		
		System.out.println(newStr);
		System.out.println(newStr.length());
	}

}
