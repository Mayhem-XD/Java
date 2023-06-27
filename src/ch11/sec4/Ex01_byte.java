package ch11.sec4;

import java.util.Arrays;

public class Ex01_byte {

	public static void main(String[] args) throws Exception {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		String s1 = new String(bytes);
		System.out.println(s1);
		
		String s2 = new String(bytes,6,4);
		System.out.println(s2);
		
		byte[] inputBytes = new byte[10];
		System.out.print("입력: ");
		int readBytes = System.in.read(inputBytes);		//	맨끝에 \r\n이 붙음
		String s3 = new String(inputBytes,0,readBytes-2);
		System.out.printf("%d, %s\n",readBytes,s3);
		System.out.println(Arrays.toString(inputBytes));
		
	}

}
