package ch09.sec1;

public class A {			// 외부 클래스
	public A() {System.out.println("A객체가 생성됨");}
//	instance member class
	class B { 
		B() {System.out.println("B객체가 생성됨");}
		int field1;
		void method1() {}}
	static class C {
		C() {System.out.println("C객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void method() {
//	local class
		class D{
			D() {System.out.println("D객체가 생성됨");}
//			int field1;
			void method1() {}
		}
		D d = new D();
//		d.field1 = 3;
		d.method1();
	}

}
