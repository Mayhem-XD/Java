package ch00.sec01;

import java.util.Objects;

public class Student {
	private String sid;
    private String name;

    public Student(String sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return this.sid.equals(student.sid);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid);
    }

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
    
    
    
}
