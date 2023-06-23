package ch06;

public class Ex01_Interaction {

	public static void main(String[] args) {
		int[] scores = {67,89,87,92,72};
		MyUtil myUtil = new MyUtil();		//	객체 생성
		int min = myUtil.getMinimum(scores);	//	인스턴스 메소드 호출
		int max = myUtil.getMaximum(scores);
		double avg = MyUtil.getAverage(scores);	// 스태틱 메소드 호출
		System.out.printf("%d, %d, %.1f\n",min,max,avg);

	}

}
