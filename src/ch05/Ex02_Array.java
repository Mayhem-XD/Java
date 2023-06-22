package ch05;

import java.util.Arrays;

public class Ex02_Array {

	public static void main(String[] args) {
		int[] score = {80,70,78,92,96};
		System.out.printf("%d, %d\n",score[0],score[4]);
//		평균
		int sum=0;
		for(int i=0;i<score.length;i++)sum+=score[i];
		System.out.printf("합 : %d 평균 %.1f\n",sum,(double)sum/score.length);
		
//		배열 생성
		int[] intArray = {4,67,8,91,23};
		double[] dblArray = {3.,4.6,2.4};
		String[] fruits = {"사과","배","딸기","수박"};
		System.out.printf("%d %f %s\n",intArray[0],dblArray[1],fruits[2]);
//		크기를 주고 배열을 생성만 하는 경우
		int dice[] = new int[5];
		for(int i=0;i<dice.length;i++) dice[i] = 1 + (int)(Math.random()*6);
		System.out.println(Arrays.toString(dice));
		System.out.println(Arrays.toString(fruits));
		
		System.out.println(args.length);
		for(int i=0;i<args.length;i++) System.out.println(args[i]);
		String myArgs[] = "10 20 30".split(" ");
		System.out.println(Arrays.toString(myArgs));

	}

}
