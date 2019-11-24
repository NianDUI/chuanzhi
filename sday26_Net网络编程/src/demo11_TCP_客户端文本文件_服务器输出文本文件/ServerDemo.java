package demo11_TCP_客户端文本文件_服务器输出文本文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(11111);
		
		// 监听客户端
		Socket s = ss.accept();
		
		// 封住文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("11.txt"));
		// 封住通道内的流
		BufferedReader br= new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		// 释放资源
		bw.close();
//		br.close();
		s.close();
//		ss.close();
	}
}
