package demo15_TCP_��ͻ���_һ��������_���߳�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UploadClient {
	public static void main(String[] args) throws IOException {
		// ����Socket����
		Socket s = new Socket("127.0.0.1", 11111);

		// ��ס�ı��ļ�
		BufferedReader br = new BufferedReader(new FileReader("12.txt"));
		// ��סͨ���ڵ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // ����
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		// Socket�ṩ��һ����ֹ������֪ͨ�����������ˣ���û�����ݹ����ˡ�
		s.shutdownOutput();
		
		// ���ܷ���
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(brClient.readLine());

		// �ͷ���Դ
//		bw.close();
//		brClient.close();
		br.close();
		s.close();

	}
}
