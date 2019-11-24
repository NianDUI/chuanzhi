package Demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 换行用换行符
 * win换行符为：\n或\r
 * macOS为：早期\r，现在是\n
 * Linux是:\n
 */
public class Demo03FileWriterLine {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file03.txt", true);

		fw.write("Hellow\n");

		fw.close();
	}
	
}
