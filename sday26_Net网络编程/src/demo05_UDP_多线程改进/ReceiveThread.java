package demo05_UDP_���̸߳Ľ�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	private DatagramSocket ds;

	public ReceiveThread(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// ����һ������
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys, bys.length);

				// ��������
				ds.receive(dp);

				// ��������
				String ip = dp.getAddress().getHostAddress();
				String s = new String(dp.getData(), 0, dp.getLength());
				System.out.println(ip + ":" + s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
