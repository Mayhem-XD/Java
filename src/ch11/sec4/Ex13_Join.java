package ch11.sec4;

public class Ex13_Join {

	public static void main(String[] args) {
//		String paths = System.getenv("PATH");
//		System.out.println(paths);
//		String[] pathArr = paths.split(";");
//		String pathStr = String.join("\n", pathArr);
//		System.out.println(pathStr);
		String fruits = "감, 배, 귤, 밤";
		String[] fruitArr = fruits.split(", ");
		String fruitStr = String.join("-:-", fruitArr);
		System.out.println(fruitStr);

	}

}
