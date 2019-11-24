package demo05_UDP_���̸߳Ľ�;

import java.io.IOException;
import java.net.DatagramSocket;

public class ChatRoom {
	public static void main(String[] args) throws IOException {
		DatagramSocket dsSend = new DatagramSocket();
		DatagramSocket dsReceive = new DatagramSocket(12306);
		
		SendThread st = new SendThread(dsSend);
		ReceiveThread rt = new ReceiveThread(dsReceive);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		
		// ����t2Ϊ��̨�߳�
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
	}
}
