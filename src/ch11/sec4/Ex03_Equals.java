package ch11.sec4;

public class Ex03_Equals {

	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = new String("홍길동");
		
		System.out.println((s1==s2) +" , " +(s2==s3)+" , "+(s1==s3));
		System.out.println((s1.equals(s2))+" , "+(s2.equals(s3)));

	}

}
