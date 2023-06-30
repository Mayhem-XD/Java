package ch14;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex07_ReadLine {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:/Temp/test.txt"));
		int lineNo=1;
		while(true) {
			String line = br.readLine();
			if(line==null)break;
			System.out.println(lineNo+" : "+line);
			lineNo++;
		}
		br.close();

	}

}
