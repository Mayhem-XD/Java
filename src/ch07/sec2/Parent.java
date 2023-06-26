package ch07.sec2;

public class Parent {
	int parentInt;

	public Parent() {}
	public Parent(int parentInt) {
		super();
		this.parentInt = parentInt;
	}
	void parentMethod() {
		System.out.println(this.parentInt);
	}
	
}
