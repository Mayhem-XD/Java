package ch07.sec6;

public class Cow extends Animal {
	public Cow() {
		this.kind = "소";
	}
	@Override
	public void sound() {
		System.out.println("음머ㅓ");
		
	}

}
