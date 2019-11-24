package Demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01BufferedWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file08.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i = 0; i < 100; i++) {
			bw.write((int) (Math.random()*127+1));
			if (i % 10 == 0) {
				bw.newLine();
			}
		}
		
		bw.close();
		
	}
	
}
