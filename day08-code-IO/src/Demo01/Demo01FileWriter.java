package Demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Demo01FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file01.txt");
		
		fw.write("Hello World!");
		
		fw.close();
//		String savePath = "temp";
//		File file = new File(savePath);
//		if (!file.exists() && !file.isDirectory()) {
//			System.out.println(file.getAbsolutePath() + "目录不存在！");
//			file.mkdirs();
//		}
		File file1 = new File("temp\\" + "file01.txt");
		System.out.println(file1.getAbsolutePath());
		OutputStream out = new FileOutputStream(file1); // Exception in thread "main" java.io.FileNotFoundException: temp\file01.txt (系统找不到指定的路径。)
		out.write(50);;
		out.close();
		
	}
	
}
