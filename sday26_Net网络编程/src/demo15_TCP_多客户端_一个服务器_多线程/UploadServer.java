package demo15_TCP_��ͻ���_һ��������_���߳�;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ͨ����ѭ�����ԸĽ�һ�������������ն���ͻ��ˡ�
 * ���������������ġ�
 * �������������������������������ģ����������˷ֱ�ִ�пͻ���
 * �������ú�ѧϰ.avi	(100M)	256k
 * ���ģ���������.mp3(3M)		1M
 * ���壺ILoveJava.txt(1k)		100M
 */
public class UploadServer {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// ����������Socket����
		ServerSocket ss = new ServerSocket(11111);
		
		while(true) {
			// �����ͻ���
			Socket s = ss.accept(); // ����
			new Thread(new UserThread(s)).start();
		}
	}
	
}
