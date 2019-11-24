package demo14_TCP_多客户端_一个服务器;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 通过外循环可以改进一个服务器，接收多个客户端。
 * 但是这个是有问题的。
 * 如果是这种情况，假设我有张三，李四，王五三个人分别执行客户端
 * 张三：好好学习.avi	(100M)	256k
 * 李四：天天向上.mp3(3M)		1M
 * 王五：ILoveJava.txt(1k)		100M
 */
public class UploadServer {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(11111);
		
		while(true) {
			// 监听客户端
			Socket s = ss.accept(); // 阻塞
	
			// 封住文本文件
			BufferedWriter bw = new BufferedWriter(new FileWriter("12.txt"));
			// 封住通道内的流
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	
			String line = null;
			while ((line = br.readLine()) != null) { // 阻塞
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
			s.close();
		}
	}
	
}
