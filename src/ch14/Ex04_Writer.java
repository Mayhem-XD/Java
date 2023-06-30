package ch14;

import java.io.FileWriter;
import java.io.Writer;

public class Ex04_Writer {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/Temp/test.txt");
//		1 문자씩 출력
		char a='A',b='B';
		
//		char 배열 출력
		char[] arr = {'C','D','E'};
		writer.write(arr);
//		문자열 출력
		writer.write("FG\n");
		writer.write("한글도 가능.\n");		
		

		writer.write(a);writer.write(b);
		writer.flush();writer.close();
	}

}
