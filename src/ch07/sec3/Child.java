package ch07.sec3;

public class Child extends Parent {
	int childInt;
	
	void childMethod() {
		System.out.println(this.childInt);
	}
	@Override
	void parentMethod() {
		System.out.print("Parent : ");
		super.parentMethod();
		System.out.println("Child : "+this.childInt);
	}
}
