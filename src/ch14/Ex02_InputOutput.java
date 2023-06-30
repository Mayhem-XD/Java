package ch14;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;


public class Ex02_InputOutput {

	public static void main(String[] args) throws Exception {
		InputStream iS = new FileInputStream("c:/Temp/test.db");
//		방법 1
//		while(true) {
//			int data = iS.read();		// 1byte 읽기
//			if(data==-1) break;
//			System.out.print(data+" ");
//		}
//		System.out.println();
//		방법 2
		byte[] arr =new byte[20];
		while(true) {
			int num = iS.read(arr);
			if(num==-1) break;
		}
		System.out.println(Arrays.toString(arr));
		
		iS.close();
		

	}

}
