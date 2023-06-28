package ch11.sec4;

public class Student  implements Comparable{
	int sno;
	String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			return this.name.compareTo(s.name);
		}
		return 0;
	}

}
