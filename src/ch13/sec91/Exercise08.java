package ch13.sec91;

import java.util.HashSet;
import java.util.Set;

public class Exercise08 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1,"가가가"));set.add(new Student(2,"나나나"));;set.add(new Student(1,"다다다"));
		set.forEach(x->System.out.println(x.getNum()+": "+x.getName()));

	}

}
