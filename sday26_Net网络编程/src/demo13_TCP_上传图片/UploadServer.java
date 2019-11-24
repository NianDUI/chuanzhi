package demo13_TCP_�ϴ�ͼƬ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// ����������Socket����
		ServerSocket ss = new ServerSocket(19191);

		// �����ͻ�������
		Socket s = ss.accept();

		// ��װͨ���ڵ���
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		// ��װͼƬ�ļ�
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("13.jpg"));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		
		// ��һ������
		OutputStream os = s.getOutputStream();
		os.write("ͼƬ�ϴ��ɹ�".getBytes());
		
		// �ͷ���Դ
		bos.close();
		s.close();
		
	}
}
