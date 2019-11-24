package demo09_TCP_����¼��_����������ı����ļ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// ����������Socket����
		ServerSocket ss = new ServerSocket(23456);

		// �����ͻ�������
		Socket s = ss.accept();

		// ��סͨ���ڵ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		// ��ס�ı��ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("09.txt"));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		// �ͷ���Դ
		bw.close();
//		br.close();
		s.close();
//		ss.close();
	}
}
