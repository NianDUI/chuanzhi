package demo11_�����ķ�ʽʹ�ö��߳�;

/*
 * �����ڲ���ĸ�ʽ��
 * 		new �������߽ӿ���() {
 * 			��д����;
 * 		};
 * 		���ʣ��Ǹ�����߽ӿڵ��������
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// �̳�Thread����ʵ�ֶ��߳�
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "---" + i);
				}
			};
		}.start();

		// ʵ��Runnable�ӿ���ʵ�ֶ��̣߳�
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "---" + i);
				}
			}
		}) {
		}.start();

		// �����Ѷȵ�
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("hello" + "---" + i);
				}
			}
		}) {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("world" + "---" + i);
				}
			}
		}.start();
		// �ͷ�Χ�йأ����ұ���ģ����Ҹ���ġ�

	}

}
