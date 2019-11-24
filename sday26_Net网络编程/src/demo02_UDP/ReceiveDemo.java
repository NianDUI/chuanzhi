package demo02_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDPЭ�鷢�����ݣ�
 *  	a:�������ܶ�Socket����
 *  	b:����һ�����ݰ����Ӆ�������
 *  	c:����Socket����ĽӅ�������������
 *  	d:�������ݰ�������ʾ�ڿ���̨
 *  	e:�ͷ���Դ
 *  
 *  DatagramSocket��:
 *  	�����ʾ�������ͺͽ������ݱ������׽��֡�
 *  	�� DatagramSocket ���������� UDP �㲥���� 
 *  public DatagramSocket(int port) throws SocketException
 *  	�������ݱ��׽��ֲ�����󶨵����������ϵ�ָ���˿ڡ�
 *  public void receive(DatagramPacket p) throws IOException
 *  	�Ӵ��׽��ֽ������ݱ�����
 *  	���˷�������ʱ��DatagramPacket �Ļ���������˽��յ����ݡ����ݱ���Ҳ�������ͷ��� IP ��ַ�ͷ��ͷ������ϵĶ˿ںš� 
 *    �˷����ڽ��յ����ݱ�ǰһֱ������
 *  
 *  DatagramPacket�ࣺ
 * 		�����ʾ���ݱ�����  ���ݱ�������ʵ�������Ӱ�Ͷ�ݷ���
 *  public DatagramPacket(byte[] buf, int length)
 *  	���� DatagramPacket���������ճ���Ϊ length �����ݰ��� 
 *  public byte[] getData()
 *  	�������ݻ�������
 *  public int getLength()
 *  	���ؽ�Ҫ���ͻ���յ������ݵĳ��ȡ�
 *  public InetAddress getAddress()
 *  	����ĳ̨������ IP ��ַ��
 *  	�����ݱ���Ҫ�����û��������ǴӸû������յ��ġ� 
 *  public int getPort()
 *  	����ĳ̨Զ�������Ķ˿ںţ�
 *  	�����ݱ���Ҫ���������������ǴӸ��������յ��ġ� 
 *  
 *  
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// �������ܶ�Socket����
		// DatagramSocket(int port)
		DatagramSocket ds = new DatagramSocket(10086);

		// ����һ�����ݰ����Ӆ�������
		// DatagramPacket(byte[] buf, int length)
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, length);

		// ����Socket����ĽӅ�������������
		ds.receive(dp); // ����

		// �������ݰ�������ʾ�ڿ���̨
		// ��ȡ�Է���IP
		// public InetAddress getAddress()
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();
		// ��ȡ�Է��Ķ˿ں�
		// public int getPort()
		int port = dp.getPort();
		// public byte[] getData()��
		// public int getLength()��
		byte[] bys2 = dp.getData();
		int len = dp.getLength();
		String s = new String(bys2, 0, len);
		System.out.println(ip + ":" + port + ":" + s);

		// �ͷ���Դ
		ds.close();
	}
}
