package demo06_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCPЭ�鷢������
 *  	a:�������Ͷ˵�Socket����
 *  		��һ������ɹ�����˵�������Ѿ������ɹ���
 *  	b:��ȡ�������д����
 *  	c:�ͷ���Դ
 *  
 *  ���ӱ��ܾ���TCPЭ��һ��Ҫ�ȿ���������
 *  java.net.ConnectException: Connection refused: connect
 *  
 *  Socket��:
 *  	ʵ�ֿͻ����׽��֣�Ҳ���ԾͽС��׽��֡������׽�������̨������ͨ�ŵĶ˵�
 *  	public Socket(InetAddress address, int port) throws IOException
 *  		����һ�����׽��ֲ��������ӵ�ָ�� IP ��ַ��ָ���˿ںš�
 *  	public Socket(String host, int port) throws UnknownHostException, IOException 
 *  		����һ�����׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ںš� 
 *  
 *  	public OutputStream getOutputStream() throws IOException
 *  		���ش��׽��ֵ�������� 
 *  
 *  
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ˵�Socket����
		// Socket(InetAddress address, int port)
		// Socket(String host, int port) ����һ��
//		Socket s = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
		Socket s = new Socket("127.0.0.1", 8888);
		
		// ��ȡ�������д����
		// public OutputStream getOutputStream()
		OutputStream os = s.getOutputStream();
		os.write("hello,tcp,������".getBytes());
		
		// �ͷ���Դ
		s.close();
	}
}
