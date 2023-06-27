package ch10;

public class Ex04_ClassCast {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		Cat cat = (Cat)a1;	//	사용은 가능한데
		Dog dog = (Dog)a2;	//	권장하지는 않음
		
		if (a1 instanceof Cat) cat=(Cat)a1;		//	이렇게 사용9
		

	}
}
class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}
