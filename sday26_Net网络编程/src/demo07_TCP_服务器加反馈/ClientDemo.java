package demo07_TCP_�������ӷ���;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ˵�Socket����
		Socket s = new Socket("127.0.0.1", 9999);

		// ��ȡ�������д����
		OutputStream os = s.getOutputStream();
		os.write("���������ܺã��ʺ�˯��".getBytes());

		// ��ȡ������
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String client = new String(bys, 0, len);
		System.out.println("Client:" + client);

		// �ͷ���Դ
		s.close();

	}
}
