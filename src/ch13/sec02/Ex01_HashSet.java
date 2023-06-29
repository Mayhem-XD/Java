package ch13.sec02;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		객체 저장
		set.add("JAVA"); set.add("JSP"); set.add("Servlet");
		set.add("JAVA");	// 중복이라 저장X
		System.out.println(set.size());
		set.forEach(x->System.out.println(x));
		System.out.println(set.contains("JSP"));

	}

}
