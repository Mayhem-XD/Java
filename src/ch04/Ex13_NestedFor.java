package ch04;

public class Ex13_NestedFor {

	public static void main(String[] args) {
//		행 i, 열 k
		/*for(int i=0;i<5;i++) {
			for(int k=0;k<i+1;k++) {
				System.out.print('*');
			}
			System.out.println();
		}
//		2사분면
		for(int i=0;i<5;i++) {
			for(int k=0;k<4-i;k++) {
				System.out.print(' ');
			}
			for(int k=0;k<i+1;k++) {
				System.out.print('*');
			}
			System.out.println();
		}
//		3사분면
		for(int i=5;i>0;i--) {
			for(int k=0;k<5-i;k++) {
				System.out.print(' ');
			}
			for(int k=0;k<i;k++) {
				System.out.print('*');
			}
			System.out.println();
		}
//		4사분면
		for(int i=5;i>0;i--) {
			for(int k=0;k<i;k++) {
				System.out.print('*');
			}
			for(int k=0;k<5-i;k++) {
				System.out.print(' ');
			}
		}
			System.out.println();*/
//			전부
		/*
		 * int n = 5; for (int i = 0; i < n; i++) { for (int k = 0; k < n - i - 1; k++)
		 * { System.out.print(' '); } for (int k = 0; k < i + 1; k++) {
		 * System.out.print('*'); } for (int k = 0; k < i + 1; k++) {
		 * System.out.print('*'); } for (int k = 0; k < n - i - 1; k++) {
		 * System.out.print(' '); } System.out.println(); }
		 * 
		 * for (int i = n - 1; i >= 0; i--) { for (int k = 0; k < n - i - 1; k++) {
		 * System.out.print(' '); } for (int k = 0; k < i + 1; k++) {
		 * System.out.print('*'); } for (int k = 0; k < i + 1; k++) {
		 * System.out.print('*'); } for (int k = 0; k < n - i - 1; k++) {
		 * System.out.print(' '); } System.out.println(); }
		 */
//			
			int n = 5;
			for (int i = 0; i < n; i++) {
			    for (int k = 0; k < n - i - 1; k++) {
			        System.out.print(' ');
			    }
			    for (int k = 0; k < 2 * i + 1; k++) {
			        System.out.print('*');
			    }
			    System.out.println();
			}

			for (int i = 3; i >= 0; i--) {
			    for (int k = 0; k < n - i - 1; k++) {
			        System.out.print(' ');
			    }
			    for (int k = 0; k < 2 * i + 1; k++) {
			        System.out.print('*');
			    }
			    System.out.println();
			}


			
			
			
		

	}

}
