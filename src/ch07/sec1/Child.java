package ch07.sec1;

public class Child extends Parent {
	int childInt;

	public Child() {}
	public Child(int childInt) {
		super();
		this.childInt = childInt;
	}
	void childMethod() {
		System.out.println(this.childInt);
	}
	
}
