package ch07.sec2;

public class Child extends Parent {
	int childInt;

	public Child() {}
	public Child(int childInt) {
		super(childInt * 2);	// 부모의 생성자 호출
		this.childInt = childInt;
	}
	void childMethod() {
		System.out.println(this.childInt);
	}
	
}
