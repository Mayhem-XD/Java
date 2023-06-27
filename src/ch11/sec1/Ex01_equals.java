package ch11.sec1;

public class Ex01_equals {

	public static void main(String[] args) {
		Member m1 = new Member("james", "제임스");
		Member m2 = new Member("james", "제임수");
		Member m3 = new Member("james", "James");
		Member m4 = new Member("james", "제임스");
		
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(m4));
		
		Member2 mm1 = new Member2("james", "제임스");
		Member2 mm2 = new Member2("james", "제임수");
		Member2 mm3 = new Member2("james", "제임스");
		Member2 mm4 = new Member2("James", "제임스");

		System.out.println(mm1.equals(mm2));
		System.out.println(mm1.equals(mm3));
		System.out.println(mm1.equals(mm4));
		
		
	}

}
