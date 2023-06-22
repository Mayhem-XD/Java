package ch05;

public class Ex01_Reference {

	public static void main(String[] args) {
		int a = 10, b = 10;
		System.out.println(a == b);
		String ref1 = "자바";
		String ref2 = "자바";
		System.out.println(ref1==ref2);
		System.out.println(System.identityHashCode(ref1));
		System.out.println(System.identityHashCode(ref2));
		String ref3 = new String("자바");
		System.out.println(ref3);
		System.out.println(ref1==ref3);			//false
		System.out.println(ref1.equals(ref3));	//true
		System.out.println(System.identityHashCode(ref3));
//		참조 타입 변수는 객체를 참조하지 않는다는 뜻으로 null 값을 가질 수 있음
		String s = null;
		String[] strArr = null;
		System.out.println(s==null);
		System.out.println(strArr==null);
	}

}
