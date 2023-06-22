package ch05;

public class Ex00_FizzBuzz {

	public static void main(String[] args) {
//		1~100 fizz buzz
		int count=0;
		int[] fizzbuzz = new int[100];
		for(int i=0;i<100;i++) fizzbuzz[i]=i;
		for(int fb:fizzbuzz) {
			System.out.printf("%2d ",fb);
			if(fb==0) System.out.print("");
			else if(fb%15==0) System.out.print("FIZZ&BUZZ ");
			else if(fb%3==0) System.out.print("FIZZ ");
			else if(fb%5==0) System.out.print("BUZZ ");
			count++;
			if(count%5==0) System.out.println();
		}
		
	}

}
