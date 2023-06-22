package ch05;

import java.util.Arrays;

public class Ex04_ArrayCopy {

	public static void main(String[] args) {
		/*int src[] = {1,3,4,8};
		int[] dst = new int[4];
		for(int i=0;i<src.length;i++) dst[i]=src[i];
		System.out.println(Arrays.toString(dst));
		dst[0] = 11;
		System.out.println(Arrays.toString(src));*/
		
		int[] realSrc = {3,4,7,9};
		int[] realDst= new int[realSrc.length];
		System.arraycopy(realSrc, 0, realDst, 0, realSrc.length);
		System.out.println(Arrays.toString(realDst));
		
		int[][] src = {{1, 2, 3, 4}, {6, 7, 8, 9}};
		int[][] dst = new int[src.length][];

		for (int i = 0; i < src.length; i++) {
		    dst[i] = Arrays.copyOf(src[i], src[i].length);
		}
		System.out.println(Arrays.toString(dst[0]));
		System.out.println(Arrays.toString(dst[1]));
		

	}

}
