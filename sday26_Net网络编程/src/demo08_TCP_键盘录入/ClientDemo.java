package demo08_TCP_键盘录入;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 *  客户端键盘录入，服务器输出到控制台
 * 
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket对象
		Socket s = new Socket("127.0.0.1", 22222);

		// 键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 把通道里面的流给包装一下,字节流-->字符流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // 文件读到末尾是null
			// 键盘录入数据要自定义结束标记
			if ("886".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
//		bw.close(); // s关闭了,s.getOutputStream()也就关闭了，就不用bw关闭了
		// br.close(); // 你都不录入了，关他就没有意义了
		s.close();
	}
}
