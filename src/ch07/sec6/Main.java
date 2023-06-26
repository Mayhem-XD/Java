package ch07.sec6;

public class Main {

	public static void main(String[] args) {
		Cow cow = new Cow();
		cow.breathe();
		cow.sound();
		System.out.println(cow.kind);
		
		Pig pig = new Pig();
		System.out.println(pig.kind);
		pig.breathe();
		pig.sound();
		
//		자동 타입변환
		Animal animal = cow;
		animal.sound();
		animal = pig;
		animal.sound();
		
		animalSound(cow);
		animalSound(pig);
		
		Bird bird = new Sparrow();
		bird.fly();
		bird.sound();
		System.out.println(bird.kind);
		animalSound(new Sparrow());
		
	}
	static void animalSound(Animal animal) {
		animal.sound();
	}

}
