package demo08_TCP_键盘录入;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(22222);

		// 监听客户端链接
		Socket s = ss.accept();

		// 包装通道内容的流
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) { // 读到末尾是null
			System.out.println(line);
		}
		
		// 释放资源
//		br.close(); // br不需要关，s关的时候s.getInputStream()也就关了
		s.close();
//		ss.close(); // 服务器不关
		
		
	}
}
