package demo08_TCP_����¼��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// ����������Socket����
		ServerSocket ss = new ServerSocket(22222);

		// �����ͻ�������
		Socket s = ss.accept();

		// ��װͨ�����ݵ���
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) { // ����ĩβ��null
			System.out.println(line);
		}
		
		// �ͷ���Դ
//		br.close(); // br����Ҫ�أ�s�ص�ʱ��s.getInputStream()Ҳ�͹���
		s.close();
//		ss.close(); // ����������
		
		
	}
}
