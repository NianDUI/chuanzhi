package demo10_TCP_�ͻ����ı��ļ�_���������������̨;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * �ͻ����ı��ļ�,���������������̨
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// ����Socket����
		Socket s = new Socket("127.0.0.1", 34567);

		// ��ס�ı��ļ�
		BufferedReader br = new BufferedReader(new FileReader("InetAddressDemo.java"));
		// ��סͨ���ڵ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// �ͷ���Դ
//		bw.close();
		br.close();
		s.close();

	}
}
