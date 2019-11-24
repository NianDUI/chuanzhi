package demo08_TCP_����¼��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 *  �ͻ��˼���¼�룬���������������̨
 * 
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �����ͻ���Socket����
		Socket s = new Socket("127.0.0.1", 22222);

		// ����¼������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ��ͨ�������������װһ��,�ֽ���-->�ַ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // �ļ�����ĩβ��null
			// ����¼������Ҫ�Զ���������
			if ("886".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// �ͷ���Դ
//		bw.close(); // s�ر���,s.getOutputStream()Ҳ�͹ر��ˣ��Ͳ���bw�ر���
		// br.close(); // �㶼��¼���ˣ�������û��������
		s.close();
	}
}
