package demo05_线程创建的第二种方式;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// 由于现实接口的方式就不能直接使用Thread类的方法了，但可以间接的使用。
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
