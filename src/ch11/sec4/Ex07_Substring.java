package ch11.sec4;

public class Ex07_Substring {

	public static void main(String[] args) {
		String ssn = "880823-1234567";
		
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart);
		
		String secondPart = ssn.substring(7);
		System.out.println(secondPart);

		String year = ssn.substring(0,2);
		String month = ssn.substring(2,4);
		String day = ssn.substring(4,6);
		
		char gender = ssn.charAt(7);
		
		if(gender == '1' || gender == '2') {
			year = "19"+year;
		}
		else {
			year = "20"+year;
		}
		
		System.out.printf("%s-%s-%s\n",year,month,day);
		
	
	}
	
}
