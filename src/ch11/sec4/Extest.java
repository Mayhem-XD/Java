package ch11.sec4;

public class Extest {

	public static void main(String[] args) {
		int[] counts = new int[10];

        for (int i = 1; i <= 1000; i++) {
            int num = i;
            while (num > 0) {
                counts[num % 10]++;
                num /= 10;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }

	}

}
