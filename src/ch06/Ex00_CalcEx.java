package ch06;

public class Ex00_CalcEx {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int x=10,y=5;
		int add = calc.add(x, y);
		int mul = calc.mul(x, y);
		int sub = calc.sub(x, y);
		double div = calc.div(x, y);
		System.out.printf("add: %d, mul: %d, sub: %d, div: %.2f\n",add,mul,sub,div);

	}

}
