package Demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �����û��з�
 * win���з�Ϊ��\n��\r
 * macOSΪ������\r��������\n
 * Linux��:\n
 */
public class Demo03FileWriterLine {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file03.txt", true);

		fw.write("Hellow\n");

		fw.close();
	}
	
}
