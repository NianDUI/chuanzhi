package Demo03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo04BufferedReaderreadLine {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file04.txt");

		BufferedReader br = new BufferedReader(fr);

		
//		String line = br.readLine();
//		System.out.println(line);
		
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}

}
