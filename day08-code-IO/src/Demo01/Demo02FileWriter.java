package Demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 文件不存在会自动创建文件
 * 文件存在将会替盖写入
 * 第二个参数为true值为追加写入
 */
public class Demo02FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file02.txt", true);

		fw.write("Hellow");

		fw.close();
	}

}
