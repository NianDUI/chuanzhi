package Demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file01.txt");

		int ch;
		
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}
		
		fr.close();
		
		
	}
	
}
