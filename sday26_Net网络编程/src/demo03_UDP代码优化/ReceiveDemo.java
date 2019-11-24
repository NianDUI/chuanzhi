package demo03_UDP�����Ż�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


/*
 *  ����������նˣ�
 *  	java.net.BindException: Address already in use: Cannot bind
 *  	�˿ڱ�ռ��
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// ���ܶ˵�Socket����
		DatagramSocket ds = new DatagramSocket(12345);

		// ����һ������
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);

		// ��������
		ds.receive(dp);

		// ��������
		String ip = dp.getAddress().getHostAddress();
		String s = new String(dp.getData(), 0, dp.getLength());
		System.out.println(ip + ":" + s);
		
		// �ͷ���Դ
		ds.close(); 
	}
}
