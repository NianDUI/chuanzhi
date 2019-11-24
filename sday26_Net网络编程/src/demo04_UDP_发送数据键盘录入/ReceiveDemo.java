package demo04_UDP_发送数据键盘录入;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 *  多次启动接收端：
 *  	java.net.BindException: Address already in use: Cannot bind
 *  	端口被占用
 */
public class ReceiveDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 接受端的Socket对象
		DatagramSocket ds = new DatagramSocket(12345);

		while (true) {
			// 创建一个包裹
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);

			// 接受数据
			ds.receive(dp);

			// 解析数据
			String ip = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(), 0, dp.getLength());
			System.out.println(ip + ":" + s);
		}

		// 释放资源
		// 接受端应该一直等待接受数据，是不需要关闭的
//		ds.close();
	}
}
