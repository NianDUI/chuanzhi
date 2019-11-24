package demo06_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP协议发送数据
 *  	a:创建发送端的Socket对象
 *  		这一步如果成功，就说明链接已经建立成功了
 *  	b:获取输出流，写数据
 *  	c:释放资源
 *  
 *  链接被拒绝，TCP协议一定要先开服务器。
 *  java.net.ConnectException: Connection refused: connect
 *  
 *  Socket类:
 *  	实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点
 *  	public Socket(InetAddress address, int port) throws IOException
 *  		创建一个流套接字并将其连接到指定 IP 地址的指定端口号。
 *  	public Socket(String host, int port) throws UnknownHostException, IOException 
 *  		创建一个流套接字并将其连接到指定主机上的指定端口号。 
 *  
 *  	public OutputStream getOutputStream() throws IOException
 *  		返回此套接字的输出流。 
 *  
 *  
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端的Socket对象
		// Socket(InetAddress address, int port)
		// Socket(String host, int port) 作用一样
//		Socket s = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
		Socket s = new Socket("127.0.0.1", 8888);
		
		// 获取输出流，写数据
		// public OutputStream getOutputStream()
		OutputStream os = s.getOutputStream();
		os.write("hello,tcp,我来了".getBytes());
		
		// 释放资源
		s.close();
	}
}
