package ch06;

public class Tmoney {
//	field
//	age, cash
	private int age;
	private int cash;
	
//	생성자
//	Tmoney(age)
//	Tmoney(age,cash)
	public Tmoney(int age) {}
	public Tmoney(int age, int cash) {
		if(age>=0 && age<=150)
			this.age = age;
		if(cash>=0)
			this.cash = cash;
	}
//	method
//	ride(boolean) 7<=age<=12 -730/ 13~18 -1010/ 19~ -1450	/잔액부족 false, 
	public boolean ride() {
		
		return false;
	}
//	charge(int cash)
//	getCash()
//	나이,10000 몇 번 탈 수 있는지
	
}
