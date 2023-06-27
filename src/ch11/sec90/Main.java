package ch11.sec90;

import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
//		Student student = new Student(null);
		Map<Student, String> hashMap = new HashMap<>();
		hashMap.put(new Student("1"),"95");
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 : "+score);
	}

}
