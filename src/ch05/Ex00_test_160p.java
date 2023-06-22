package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex00_test_160p {

	public static void main(String[] args) {
//		02
		int tsum=0;
		for(int i=3;i<101;i+=3) tsum+=i;
		System.out.println(tsum);
//		03
		int dice[] = new int[2];
		while(true) {
			for(int i=0;i<dice.length;i++) dice[i]=1+(int)(Math.random()*6);
			System.out.println(Arrays.toString(dice));
			if(dice[0]+dice[1]==5) break;
		}
//		04
		for(int i=0;i<11;i++) {
			for(int j=0;j<11;j++) {
				if ((4*i)+(5*j)==60) {
					System.out.printf("x = %d, y = %d\n",i,j);
				}
			}
		}
//		07
		boolean run = true;
		int balance = 0;
		int money=0;
		Scanner scan = new Scanner(System.in);
		int options=0;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			options = Integer.parseInt(scan.nextLine());
			if (options==1) {
				System.out.print("예금액> ");
				money = Integer.parseInt(scan.nextLine());
				if(money>0) balance+=money;
				else System.out.println("잘못된 입력");
			}
			else if (options==2) {
				System.out.print("출금액> ");
				money = Integer.parseInt(scan.nextLine());
				if(money<=balance) balance-=money;
				else System.out.println("잘못된 입력");
			}
			else if (options==3) {
				System.out.println("잔고> "+balance);
			}
			else if (options==4) break;
		}
		scan.close();
		
		

	}

}
