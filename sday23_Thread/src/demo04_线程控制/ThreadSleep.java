package demo04_�߳̿���;

import java.util.Date;

public class ThreadSleep extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i +",���ڣ�"+ new Date());
			// ˯��
			// ���ˣ�����΢��Ϣ1����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
