package demo07_TCP_�������ӷ���;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// �������ն˵�Socket����
		ServerSocket ss = new ServerSocket(9999);

		// �����ͻ������ӣ�����һ����Ӧ��Socket����
		Socket s = ss.accept(); // ����ʽ

		// ��ȡ����������ȡ������ʾ�ڿ���̨
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String server = new String(bys, 0, len);
		System.out.println("Server:" + server);

		// ��ȡ�����
		OutputStream os = s.getOutputStream();
		os.write("�������յ�".getBytes());

		// �ͷ���Դ
		s.close();
		// ss.close();

	}
}
