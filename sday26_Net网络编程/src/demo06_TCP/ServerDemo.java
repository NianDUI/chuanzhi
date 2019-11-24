package demo06_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import jdk.jshell.SourceCodeAnalysis;

/*
 * TCPЭ���������
 *  	a:�������ն˵�Socket����
 *  	b:�����ͻ������ӣ�����һ����Ӧ��Socket����
 *  	c:��ȡ����������ȡ������ʾ�ڿ���̨
 *  	d:�ͷ���Դ
 *  
 *  ServerSocket�ࣺ
 *  	ʵ�ַ������׽��֡��������׽��ֵȴ�����ͨ�����紫�롣�����ڸ�����ִ��ĳЩ������Ȼ������������߷��ؽ���� 
 *  	public ServerSocket(int port) throws IOException
 *  		�����󶨵��ض��˿ڵķ������׽��֡��˿� 0 �����п��ж˿��ϴ����׽��֡� 
 *  	
 *  	public Socket accept() throws IOException
 *  		���������ܵ����׽��ֵ����ӡ��˷��������Ӵ���֮ǰһֱ������
 *  
 *  Socket��:
 *  	public InputStream getInputStream() throws IOException
 *  		���ش��׽��ֵ���������
 *  
 */
public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// �������ն˵�Socket����
		// ServerSocket(int port)
		ServerSocket ss = new ServerSocket(8888);

		// �����ͻ������ӣ�����һ����Ӧ��Socket����
		// public Socket accept()
		Socket s = ss.accept(); // ���������մ��׽��ֵ����ӣ��˷��������Ӵ���֮ǰһֱ������

		// ��ȡ����������ȡ������ʾ�ڿ���̨
		InputStream is = s.getInputStream();

		byte[] bys = new byte[1024];
		int len = is.read(bys); // ����ʽ����
		String str = new String(bys, 0, len);

		String ip = s.getInetAddress().getHostAddress();

		System.out.println(ip + ":" + str);

		// �ͷ���Դ
		s.close();
		// ss.close(); // �����Ӧ�رգ����񲻹�

	}
}
