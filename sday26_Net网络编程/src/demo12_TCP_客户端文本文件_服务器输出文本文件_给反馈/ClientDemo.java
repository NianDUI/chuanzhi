package demo12_TCP_客户端文本文件_服务器输出文本文件_给反馈;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 客户端文本文件,服务器输出到文本文件，给反馈
 * 
 * 按照我们正常的思路加入反馈信息，结果确没有反应，为什么呢？
 * 读取文本文件可以以null作为结束信心的，但是呢，通道内是不能这样结束信息的。
 * 所以服务器根本就不知道你结束了，而你还想服务器给你反馈，所以，就相互等待了。
 * 
 * 如何解决呢？
 * 	a:大多写一条数据，告诉服务器，读取到这条数据说明我就结束了，你也结束吧。
 * 		这样做可以解决问题，但是不好。传输的文件当中正好友结束标志呢？
 *  b:Socket对象提供了一个解决方案
 *  	public void shutdownOutput() throws IOException
 *  		禁用此套接字的输出流。对于 TCP 套接字，任何以前写入的数据都将被发送，
 * 		并且后跟 TCP 的正常连接终止序列。 
 * 			如果在套接字上调用 shutdownOutput() 后写入套接字输出流，则该流将抛出 IOException。 
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建Socket对象
		Socket s = new Socket("127.0.0.1", 11111);

		// 封住文本文件
		BufferedReader br = new BufferedReader(new FileReader("InetAddressDemo.java"));
		// 封住通道内的流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // 阻塞
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
//		// 自定义一个结束标记
//		bw.write("over");
//		bw.newLine();
//		bw.flush();
		
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
