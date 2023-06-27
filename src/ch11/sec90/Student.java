package ch11.sec90;

import java.util.Objects;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if (studentNum == student.studentNum)
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + "]";
	}
	
	

}
