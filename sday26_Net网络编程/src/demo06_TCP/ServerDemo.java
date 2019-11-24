package demo06_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import jdk.jshell.SourceCodeAnalysis;

/*
 * TCP协议接收数据
 *  	a:创建接收端的Socket对象
 *  	b:监听客户端链接，返回一个对应的Socket对象
 *  	c:获取输入流，读取数据显示在控制台
 *  	d:释放资源
 *  
 *  ServerSocket类：
 *  	实现服务器套接字。服务器套接字等待请求通过网络传入。它基于该请求执行某些操作，然后可能向请求者返回结果。 
 *  	public ServerSocket(int port) throws IOException
 *  		创建绑定到特定端口的服务器套接字。端口 0 在所有空闲端口上创建套接字。 
 *  	
 *  	public Socket accept() throws IOException
 *  		侦听并接受到此套接字的连接。此方法在连接传入之前一直阻塞。
 *  
 *  Socket类:
 *  	public InputStream getInputStream() throws IOException
 *  		返回此套接字的输入流。
 *  
 */
public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 创建接收端的Socket对象
		// ServerSocket(int port)
		ServerSocket ss = new ServerSocket(8888);

		// 监听客户端链接，返回一个对应的Socket对象
		// public Socket accept()
		Socket s = ss.accept(); // 监听并接收此套接字的链接，此方法在链接传入之前一直阻塞。

		// 获取输入流，读取数据显示在控制台
		InputStream is = s.getInputStream();

		byte[] bys = new byte[1024];
		int len = is.read(bys); // 阻塞式方法
		String str = new String(bys, 0, len);

		String ip = s.getInetAddress().getHostAddress();

		System.out.println(ip + ":" + str);

		// 释放资源
		s.close();
		// ss.close(); // 这个不应关闭，服务不关

	}
}
