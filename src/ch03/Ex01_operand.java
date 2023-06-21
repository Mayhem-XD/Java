package ch03;

public class Ex01_operand {

	public static void main(String[] args) {
		int i = 20;
		System.out.printf("%d, %d\n",i++,++i);
		
		int x = -100;
		System.out.println(x);

		int sum = 0;
		for (int k=0;k <= 100;k++) {
			sum += k;
		}
		System.out.println(sum);
		
		char capitalA='A', capitalB='B';
		if (capitalA < capitalB) {
			System.out.println("A가 B보다 작다");
		}
		boolean m = false, n = true;
		System.out.println(m||n);
		System.out.println(m&&n);
		System.out.println(!(m&&n));
		
		int score = 80 + (int)(20 * Math.random());
		char grade = (score >=90)?'A':'B';
		System.out.printf("%d, %c\n",score, grade);
		
		
		
	}

}
