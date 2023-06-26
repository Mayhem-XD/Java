package ch07.sec4;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
//		다형성, 자식은 부모 타입으로 자동 타입 변환이 이루어짐
		Animal animal = new Cat();
		animal.sound();
		animal = dog;
		animal.sound();
		
//		아래 4줄 사용 X
//		자식은 부모 타입으로 자동적으로는 사용할 수 없음
//		cat = new Animal();	COMPILE ERROR
//		cat = (Cat) new Animal();	// 강제 타입변환
//		cat.sound(); 				// ERROR
		
//		animal = new Animal();
//		animal =cat;
//		animal = dog;
		
		
//		animal이 어떤 타입인지 확인후 강제타입 변환할 것
		if (animal instanceof Cat) {
			cat = (Cat) animal;
			cat.sound();
		}
		else if(animal instanceof Dog){
			dog = (Dog) animal;
			dog.sound();
		}
		else {
			System.out.println("cat/dog.sound()를 사용할 수 없음");
		}
		Object obj = new Animal();
//		obj.sound()
		if (obj instanceof Animal) {
			animal = (Animal)obj;
			animal.sound();
		}
	}

}
