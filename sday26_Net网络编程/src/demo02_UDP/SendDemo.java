package demo02_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP协议发送数据：
 *  	a:创建发送端Socket对象
 *  	b:创建数据，并把数据打包
 *  	c:调用Socket对象的发送方法发送数据
 *  	d:释放资源
 *  
 *  DatagramSocket类:
 *  	此类表示用来发送和接收数据报包的套接字。
 *  	在 DatagramSocket 上总是启用 UDP 广播发送 
 *  public DatagramSocket() throws SocketException
 *  	构造数据报套接字并将其绑定到本地主机上任何可用的端口。
 *  	套接字将被绑定到通配符地址，IP 地址由内核来选择。 
 *  public void send(DatagramPacket p) throws IOException
 *  	从此套接字发送数据报包。
 *  	DatagramPacket 包含的信息指示：将要发送的数据、其长度、远程主机的 IP 地址和远程主机的端口号
 *  
 *  DatagramPacket类：
 * 		此类表示数据报包。  数据报包用来实现无连接包投递服务。
 *  public DatagramPacket(byte[] buf, int length, InetAddress address, int port)
 *  	构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。length 参数必须小于等于 buf.length。 
 *  
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端Socket对象
		// DatagramSocket()
		DatagramSocket ds = new DatagramSocket();

		// 创建数据，并把数据打包
		// DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		// 创建数据
		byte[] bys = "hello,udp，我来了".getBytes();
		// 长度
		int length = bys.length;
		// IP地址
		InetAddress address = InetAddress.getByName("127.0.0.1");
		// 端口
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);

		// 调用Socket对象的发送方法发送数据
		// public void send(DatagramPacket p)
		ds.send(dp);

		// 释放资源
		ds.close();

	}
}
