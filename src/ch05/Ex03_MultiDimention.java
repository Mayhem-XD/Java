package ch05;

import java.util.Arrays;

public class Ex03_MultiDimention {

	public static void main(String[] args) {
		int[][] matrix = new int[2][3];
		int score[][] = {{80,90,85},{92,76,84}};
		
		System.out.printf("%d, %d\n",score[0][0],score[1][2]);
		System.out.printf("%d, %d\n",matrix.length,matrix[0].length);
		
		System.out.println(Arrays.toString(score[0]));
		System.out.println(Arrays.toString(score[1]));

	}

}
