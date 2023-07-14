package ch00.sec01.Q2;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Student> hashSet = new HashSet<>();
		hashSet.add(new Student("1", "가가가"));
		hashSet.add(new Student("2", "나나나"));
		hashSet.add(new Student("1", "다다다")); 
		
		System.out.println(hashSet.toString());


	}

}
