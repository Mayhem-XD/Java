package ch06;

import java.time.LocalDate;

public class Ex03_CustomerMethod {

	public static void main(String[] args) {
		
		Customer customer = genCustomer();
		printCustomer(customer);
//		method와 field는 instance type으로 만듬
//		예외는 main() method가 있는 class에서 method를 만들어서 사용하려고 할 때 static으로 만듬
//		상수는 static public static field CONSTANT = 1;
		
	}
	static Customer genCustomer() {
		int cid = 1001;
		String name = "";
		int age = 23;
		LocalDate today = LocalDate.now();
		boolean adult = true;
		Customer customer = new Customer(cid,name,age,today);
		customer.setAdult(adult);
		return customer;
	}
	static void printCustomer(Customer c) {
		System.out.println(c);
	}
}
