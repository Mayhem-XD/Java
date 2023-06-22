package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ex06_MinMax {

	public static void main(String[] args) {
		int[] scores = new int[30];
		Random random = new Random();
		for(int i=0;i<scores.length;i++) scores[i] = random.nextInt(100);
		System.out.println(Arrays.toString(scores));
//		Max
		int max=0;
		for(int score:scores) if(score>max) max = score;
		System.out.println("최대값: "+max);
//		Min
		int min=1000;
		for(int score:scores) if(score<min) min=score;
		System.out.println("최소값: "+min);
		

	}

}
