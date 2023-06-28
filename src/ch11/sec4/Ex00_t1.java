package ch11.sec4;

public class Ex00_t1 {

	public static void main(String[] args) {
//		System.out.println(2/10); -> 0
//		System.out.println(138%10);->8
//		System.out.println(13%10); ->3
		
//		int[] countNum = new int[10];
//		for(int i=1;i<=1000;i++) {
//			int number = i;
//			while(number != 0) {	// 조건 수정해야함 일단 true
//				countNum[number%10]++;
//				number /= 10;
//			}
//		}
//		for(int i=0;i<countNum.length;i++) 
//			System.out.printf("%d : %d\n",i,countNum[i]);
		
		
		String numString = "";
		for(int i=1;i<=1000;i++) numString +=i;
		for(int i=0;i<=9;i++) {
			int count = Strings.count(numString, ""+i);
			System.out.println(i+" : "+count);
		}
		
		
		
		
		
	}

}
