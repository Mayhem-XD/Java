package ch11.sec4;
/**
 * compareTo() 사전순으로 나열했을 때, 두 객체의 비교(음수 ,0, 양수)
 * 값을 보지 말고 부호 신경
 */
public class Ex11_CompareTo {

	public static void main(String[] args) {
		String str1 = "Apple", str2 = "Banana";
		String str3 = new String("Apple");
		
		System.out.println(str1.compareTo(str2));	//	-1	(A-B)
		System.out.println(str2.compareTo(str1));	//	1	(B-A)
		System.out.println(str1.compareTo(str3));	//	0	(A-A)
		
		Student st1 = new Student(1, "James");
		Student st2 = new Student(2, "Maria");
		Student st3 = new Student(3, "Brian");
		
		System.out.println(st1.compareTo(st2));		//	-3(J-M)
		System.out.println(st1.compareTo(st3));		//	8(J-B)

	}

}
