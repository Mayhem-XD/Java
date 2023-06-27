package ch10;

public class Ex01_NullPointer {

	public static void main(String[] args) {
		String str = null;
		str = "Java";
		if(str!=null)
			System.out.println(str.length());

	}

}
