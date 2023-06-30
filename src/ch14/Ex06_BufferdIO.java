package ch14;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * 	FileXXXStream VS BufferedXXXStream
 */
import java.io.InputStream;
import java.io.OutputStream;

public class Ex06_BufferdIO {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/Temp/testImg.png");
		FileOutputStream fos = new FileOutputStream("c:/Temp/target1.png");
		
		FileInputStream fis2 = new FileInputStream("c:Temp/testImg.png");
		FileOutputStream fos2 = new FileOutputStream("c:/Temp/target2.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
//		성능비교
		long noBufferTime = copy(fis, fos);
		System.out.println("미사용 "+noBufferTime);	// 13초
		long bufferTime = copy(bis, bos);
		System.out.println("사용 "+bufferTime);		// 0.7초
		bis.close();bos.close();fis2.close();fos2.close();fis.close();fos.close();
		
	}
	
	static long copy(InputStream iS, OutputStream oS) throws Exception{
//		1byte 단위로 읽고 쓰기
		long startTime = System.nanoTime();
		while(true) {
			int data = iS.read();
			if(data==-1)break;
			oS.write(data);
		}
		oS.flush();
		
		long endTime = System.nanoTime();
		
		
		return endTime-startTime;
	}
	
	
}
