package ch09.sec1;

public class Main {

	public static void main(String[] args) {
		A a = new A();
//		Create a instance member class
		A.B b = a.new B();
		b.field1 = 5;
		b.method1();
//		Create a static member class
		A.C c = new A.C();
		c.field1 = 7;
		A.C.field2 = 9;
		c.method1();
		A.C.method2();
		a.method();
	}

}
