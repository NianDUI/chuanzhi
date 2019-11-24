package demo15_TCP_多客户端_一个服务器_多线程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient {
	public static void main(String[] args) throws IOException {
		// 创建Socket对象
		Socket s = new Socket("127.0.0.1", 11111);

		// 封住文本文件
		BufferedReader br = new BufferedReader(new FileReader("12.txt"));
		// 封住通道内的流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // 阻塞
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		// Socket提供了一个终止，他会通知服务器你别等了，我没有数据过来了。
		s.shutdownOutput();
		
		// 接受反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(brClient.readLine());

		// 释放资源
//		bw.close();
//		brClient.close();
		br.close();
		s.close();

	}
}
