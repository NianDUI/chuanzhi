package demo12_TCP_�ͻ����ı��ļ�_����������ı��ļ�_������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * �ͻ����ı��ļ�,������������ı��ļ���������
 * 
 * ��������������˼·���뷴����Ϣ�����ȷû�з�Ӧ��Ϊʲô�أ�
 * ��ȡ�ı��ļ�������null��Ϊ�������ĵģ������أ�ͨ�����ǲ�������������Ϣ�ġ�
 * ���Է����������Ͳ�֪��������ˣ����㻹����������㷴�������ԣ����໥�ȴ��ˡ�
 * 
 * ��ν���أ�
 * 	a:���дһ�����ݣ����߷���������ȡ����������˵���Ҿͽ����ˣ���Ҳ�����ɡ�
 * 		���������Խ�����⣬���ǲ��á�������ļ����������ѽ�����־�أ�
 *  b:Socket�����ṩ��һ���������
 *  	public void shutdownOutput() throws IOException
 *  		���ô��׽��ֵ������������ TCP �׽��֣��κ���ǰд������ݶ��������ͣ�
 * 		���Һ�� TCP ������������ֹ���С� 
 * 			������׽����ϵ��� shutdownOutput() ��д���׽������������������׳� IOException�� 
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// ����Socket����
		Socket s = new Socket("127.0.0.1", 11111);

		// ��ס�ı��ļ�
		BufferedReader br = new BufferedReader(new FileReader("InetAddressDemo.java"));
		// ��סͨ���ڵ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // ����
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
//		// �Զ���һ���������
//		bw.write("over");
//		bw.newLine();
//		bw.flush();
		
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
