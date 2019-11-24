package Demo03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo03BufferedReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file08.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
//		int ch;
//		while ((ch = br.read()) !=-1) {
//			System.out.print((char) ch);
//		}
		
		char[] buf = new char[2];
		int len;
		int i = 0;
		while ((len = br.read(buf)) !=-1) {
			String str = new String(buf, 0, len);
			System.out.print(str);
			i++;
		}
		System.out.println(i);
		
		br.close();
		
	}
	
}
