package Demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �ļ������ڻ��Զ������ļ�
 * �ļ����ڽ������д��
 * �ڶ�������ΪtrueֵΪ׷��д��
 */
public class Demo02FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file02.txt", true);

		fw.write("Hellow");

		fw.close();
	}

}
