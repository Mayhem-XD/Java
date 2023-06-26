package ch07.sec3;



public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentInt = 1000;
		parent.parentMethod();
		Child child = new Child();
		child.childInt = 300;
		child.parentInt = 600;
		child.childMethod();
		child.parentMethod(); 
		
		
		
	}

}
