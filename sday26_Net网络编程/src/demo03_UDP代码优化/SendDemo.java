package demo03_UDP�����Ż�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ�Socket����
		DatagramSocket ds = new DatagramSocket();

		// �������ݲ����
		byte[] bys = "helloworld".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("127.0.0.1"), 12345);
		
		// ��������
		ds.send(dp);
		
		// �ͷ���Դ
		ds.close();
		
	}
}
