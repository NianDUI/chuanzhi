package demo04_线程控制;

import java.util.Date;

public class ThreadSleep extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i +",日期："+ new Date());
			// 睡眠
			// 困了，我稍微休息1秒钟
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
