package ch11.sec8;

import java.util.Arrays;

public class Ex02_ObjectSort {

	public static void main(String[] args) {
		Member m1 = new Member(123, "James");
		Member m2 = new Member(45, "Maria");
		Member m3 = new Member(234, "Brian");
		Member[] members = {m1,m2,m3};
		for (Member m:members)
			System.out.println(m);
		Arrays.sort(members);
		for (Member m:members)
			System.out.println(m);

	}

}
