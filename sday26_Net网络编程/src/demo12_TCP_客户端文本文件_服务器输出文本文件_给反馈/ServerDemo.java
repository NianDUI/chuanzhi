package demo12_TCP_客户端文本文件_服务器输出文本文件_给反馈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(11111);

		// 监听客户端
		Socket s = ss.accept(); // 阻塞

		// 封住文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("12.txt"));
		// 封住通道内的流
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // 阻塞
//			if ("over".equals(line)) {
//				break;
//			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 给出反馈
		BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bwServer.write("文件上传成功");
		bwServer.newLine();
		bwServer.flush();
		
		// 释放资源
		bw.close();
//		br.close();
//		bwServer.close();
		s.close();
//		ss.close();
	}
}
