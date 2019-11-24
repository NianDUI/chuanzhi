package demo02_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP协议发送数据：
 *  	a:创建接受端Socket对象
 *  	b:创建一个数据包（接収容器）
 *  	c:调用Socket对象的接収方法接受数据
 *  	d:解析数据包，并显示在控制台
 *  	e:释放资源
 *  
 *  DatagramSocket类:
 *  	此类表示用来发送和接收数据报包的套接字。
 *  	在 DatagramSocket 上总是启用 UDP 广播发送 
 *  public DatagramSocket(int port) throws SocketException
 *  	创建数据报套接字并将其绑定到本地主机上的指定端口。
 *  public void receive(DatagramPacket p) throws IOException
 *  	从此套接字接收数据报包。
 *  	当此方法返回时，DatagramPacket 的缓冲区填充了接收的数据。数据报包也包含发送方的 IP 地址和发送方机器上的端口号。 
 *    此方法在接收到数据报前一直阻塞。
 *  
 *  DatagramPacket类：
 * 		此类表示数据报包。  数据报包用来实现无连接包投递服务。
 *  public DatagramPacket(byte[] buf, int length)
 *  	构造 DatagramPacket，用来接收长度为 length 的数据包。 
 *  public byte[] getData()
 *  	返回数据缓冲区。
 *  public int getLength()
 *  	返回将要发送或接收到的数据的长度。
 *  public InetAddress getAddress()
 *  	返回某台机器的 IP 地址，
 *  	此数据报将要发往该机器或者是从该机器接收到的。 
 *  public int getPort()
 *  	返回某台远程主机的端口号，
 *  	此数据报将要发往该主机或者是从该主机接收到的。 
 *  
 *  
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// 创建接受端Socket对象
		// DatagramSocket(int port)
		DatagramSocket ds = new DatagramSocket(10086);

		// 创建一个数据包（接収容器）
		// DatagramPacket(byte[] buf, int length)
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, length);

		// 调用Socket对象的接収方法接受数据
		ds.receive(dp); // 阻塞

		// 解析数据包，并显示在控制台
		// 获取对方的IP
		// public InetAddress getAddress()
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();
		// 获取对方的端口号
		// public int getPort()
		int port = dp.getPort();
		// public byte[] getData()：
		// public int getLength()：
		byte[] bys2 = dp.getData();
		int len = dp.getLength();
		String s = new String(bys2, 0, len);
		System.out.println(ip + ":" + port + ":" + s);

		// 释放资源
		ds.close();
	}
}
