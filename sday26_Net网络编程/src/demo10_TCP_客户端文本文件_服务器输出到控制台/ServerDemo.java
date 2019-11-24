package demo10_TCP_客户端文本文件_服务器输出到控制台;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(34567);
		
		// 监听客户端
		Socket s = ss.accept();
		
		// 封住通道内的流
		BufferedReader br= new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		// 释放资源
//		br.close();
		s.close();
//		ss.close();
	}
}
