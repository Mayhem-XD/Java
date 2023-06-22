package ch04;

public class Ex12_While {

	public static void main(String[] args) {
		
		int diceSum=0;
		
		while(diceSum<=21) {
			int dice = 1+(int)(Math.random()*6);
			System.out.print(dice+" ");
			diceSum+=dice;
		}
		System.out.println();System.out.println(diceSum);
		
		diceSum=0;
		while(true) {
			int dice = 1+(int)(Math.random()*6);
			System.out.print(dice+" ");
			diceSum+=dice;
			if(diceSum>21)break;
		}
		System.out.println();System.out.println(diceSum);
		
		diceSum=0;
		do {
			int dice = 1+(int)(Math.random()*6);
			System.out.print(dice+" ");
			diceSum+=dice;
		}
		while(diceSum<=21);
		System.out.println();System.out.println(diceSum);
	}

}
