package demo07_TCP_服务器加反馈;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端的Socket对象
		Socket s = new Socket("127.0.0.1", 9999);

		// 获取输出流，写数据
		OutputStream os = s.getOutputStream();
		os.write("今天天气很好，适合睡觉".getBytes());

		// 获取输入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String client = new String(bys, 0, len);
		System.out.println("Client:" + client);

		// 释放资源
		s.close();

	}
}
