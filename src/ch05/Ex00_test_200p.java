package ch05;

import java.util.Scanner;

public class Ex00_test_200p {

	public static void main(String[] args) {
		{
			int max=0;
			int[] array = {1,5,3,8,2};
			for(int arr:array) {
				if(arr>max) max=arr;
			}
			System.out.println("Max : "+max);
		}
		//
		{
			int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
			int sum=0;
			double avg =0.;
			int count=0;
			for(int[] arr:array) {
				for(int a:arr) {sum += a;count++;}
			}
			avg = (double) sum/count;
			System.out.printf("sum : %d\navg : %.2f\n",sum,avg);
		}
		//
		
			boolean run = true;
			int studentNum = 0;
			int[] scores =null;
			Scanner scan = new Scanner(System.in);
			while(run) {
				System.out.println("------------------------------------------");
				System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
				System.out.println("------------------------------------------");
				System.out.print("선택> ");
				
				int selectNo = Integer.parseInt(scan.nextLine());
				
				if(selectNo==1) {
					System.out.print("학생수> ");
					studentNum = Integer.parseInt(scan.nextLine());
					scores = new int[studentNum];
				}
				else if (selectNo==2) {
					System.out.println("점수입력");					
					for(int i=0;i<scores.length;i++) {
						System.out.printf("scores[%d]> ",i);
						scores[i] = Integer.parseInt(scan.nextLine());
					}
				}
				else if (selectNo==3) {
					for(int i=0;i<scores.length;i++) System.out.printf("scores[%d]> %d\n",i,scores[i]);
				}
				else if (selectNo==4) {
					int sum =0, count = 0, max=0;
					for(int score:scores) {
						sum+=score;
						count++;
						if(max<score) max=score;
					}
					System.out.println("최고점수 : "+max);
					System.out.printf("평균점수 : %.2f\n",(double)sum/count);
				}
				else if (selectNo==5) {
					run = false;
					System.out.println("프로그램 종료");
				}
				
			}
			scan.close();
			
		
		//
	}



}
