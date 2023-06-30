package ch13.sec91;

import java.util.Objects;

public class Student {
	private int num;
	private String name;
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.num);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student stu = (Student)obj;
		return this.num==stu.getNum();
	}
}
