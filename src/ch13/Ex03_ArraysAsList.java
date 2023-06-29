package ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03_ArraysAsList {

	public static void main(String[] args) {
//		Array -> List
		String[] fruits = {"Apple", "Banana", "Cherry"};
		List<String> fruitList = Arrays.asList(fruits);
		fruitList.forEach(x->System.out.println(x));
//		List를 쉽게 만드는 방법
		List<Integer> scoreList = Arrays.asList(80,90,94,76);
		scoreList.forEach(x->System.out.println(x));
		
		scoreList = gerateScore(5);
		scoreList.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		

	}
	private static List<Integer> gerateScore(int count){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=count;i++) {
			int score = 60 + (int)(Math.random()*40);
			list.add(score);
		}
		return list;
	}

}
