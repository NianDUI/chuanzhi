package demo04_�߳̿���;

import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("��ʼִ�У�" + new Date());
		
		// ��Ҫ��Ϣ10���ӡ��벻Ҫ������
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("�̱߳���ֹ��");
		}
		
		System.out.println("����ִ�У�" + new Date());
	}
}
