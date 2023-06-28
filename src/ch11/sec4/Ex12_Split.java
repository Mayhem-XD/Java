package ch11.sec4;

import java.util.Arrays;

public class Ex12_Split {

	public static void main(String[] args) {
		String fruits = "감, 배, 귤, 밤";
		String[] fruitArr = fruits.split(", ");
		System.out.println(Arrays.toString(fruitArr));
		
		String fruits2 = "감, 배. 귤: 밤";
		String[] fruitArr2 = fruits2.split("[,|.|:] ");		// 정규 표현식 사용가능
		System.out.println(Arrays.toString(fruitArr2));
		
//		PATH
		String paths = System.getenv("PATH");
		System.out.println(paths);
		String[] pathArr = paths.split(";");
		String pathStr = String.join("\n", pathArr);
		System.out.println(pathStr);
		

	}

}
