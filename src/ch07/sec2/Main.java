package ch07.sec2;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child(300);
		parent.parentMethod();
		child.childMethod();
		child.parentMethod();

	}

}
