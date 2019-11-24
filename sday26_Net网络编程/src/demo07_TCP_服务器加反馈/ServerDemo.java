package demo07_TCP_服务器加反馈;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 创建接收端的Socket对象
		ServerSocket ss = new ServerSocket(9999);

		// 监听客户端链接，返回一个对应的Socket对象
		Socket s = ss.accept(); // 阻塞式

		// 获取输入流，读取数据显示在控制台
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String server = new String(bys, 0, len);
		System.out.println("Server:" + server);

		// 获取输出流
		OutputStream os = s.getOutputStream();
		os.write("数据已收到".getBytes());

		// 释放资源
		s.close();
		// ss.close();

	}
}
