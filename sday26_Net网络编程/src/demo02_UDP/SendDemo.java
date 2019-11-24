package demo02_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDPЭ�鷢�����ݣ�
 *  	a:�������Ͷ�Socket����
 *  	b:�������ݣ��������ݴ��
 *  	c:����Socket����ķ��ͷ�����������
 *  	d:�ͷ���Դ
 *  
 *  DatagramSocket��:
 *  	�����ʾ�������ͺͽ������ݱ������׽��֡�
 *  	�� DatagramSocket ���������� UDP �㲥���� 
 *  public DatagramSocket() throws SocketException
 *  	�������ݱ��׽��ֲ�����󶨵������������κο��õĶ˿ڡ�
 *  	�׽��ֽ����󶨵�ͨ�����ַ��IP ��ַ���ں���ѡ�� 
 *  public void send(DatagramPacket p) throws IOException
 *  	�Ӵ��׽��ַ������ݱ�����
 *  	DatagramPacket ��������Ϣָʾ����Ҫ���͵����ݡ��䳤�ȡ�Զ�������� IP ��ַ��Զ�������Ķ˿ں�
 *  
 *  DatagramPacket�ࣺ
 * 		�����ʾ���ݱ�����  ���ݱ�������ʵ�������Ӱ�Ͷ�ݷ���
 *  public DatagramPacket(byte[] buf, int length, InetAddress address, int port)
 *  	�������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�length ��������С�ڵ��� buf.length�� 
 *  
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ�Socket����
		// DatagramSocket()
		DatagramSocket ds = new DatagramSocket();

		// �������ݣ��������ݴ��
		// DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		// ��������
		byte[] bys = "hello,udp��������".getBytes();
		// ����
		int length = bys.length;
		// IP��ַ
		InetAddress address = InetAddress.getByName("127.0.0.1");
		// �˿�
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);

		// ����Socket����ķ��ͷ�����������
		// public void send(DatagramPacket p)
		ds.send(dp);

		// �ͷ���Դ
		ds.close();

	}
}
