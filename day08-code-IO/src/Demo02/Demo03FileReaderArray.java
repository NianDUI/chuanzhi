package Demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo03FileReaderArray {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file04.txt");
		
//		char[] buf = new char[2];
//		
//		int len = fr.read(buf);
//		System.out.println(len);
//		String str = new String(buf, 0,len ); // 只要有效部分
//		System.out.println(str);
		
		char[] buf = new char[10];
		int len;
		while ((len = fr.read(buf)) != -1) {
			String str = new String(buf, 0, len);
			System.out.print(str);
		}
		
		
		fr.close();
		
	}
	
}
