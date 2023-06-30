package ch14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03_Copy {

	public static void main(String[] args) throws Exception {
		String srcFile = "c:/Temp/jot.jpg";
		String dstFile = "c:/Temp/cat.jpg";
		
		InputStream is = new FileInputStream(srcFile);
		OutputStream os = new FileOutputStream(dstFile);
		byte[] data = new byte[1024];		// 1024 = 1KB
		while(true) {
			int num = is.read(data);
			System.out.println("읽은 바이트 수: "+num);
			if(num==-1) break;
			os.write(data,0,num);
			
		}
		os.flush();
		is.close();
		os.close();

	}

}
