package demo05_�̴߳����ĵڶ��ַ�ʽ;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// ������ʵ�ӿڵķ�ʽ�Ͳ���ֱ��ʹ��Thread��ķ����ˣ������Լ�ӵ�ʹ�á�
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
