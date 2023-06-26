package ch07.sec1;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		parent.parentInt = 1000;
		parent.parentMethod();
		child.childInt = 300;
		child.childMethod();
//		child가 상복받은 parent의 속성/메소드 사용
		child.parentInt = 2000;
		child.parentMethod();

	}

}
