package demo04_�߳̿���;

/*
 * �ػ��̣߳���̨�̣߳���
 * public final void setDaemon(boolean on)
 *	 	�����̱߳��Ϊ�ػ��̻߳��û��̡߳�
 * 		���������е��̶߳����ػ��߳�ʱ��Java ������˳��� 
 * 		�÷��������������߳�ǰ���á� 
 * 
 * ��Ϸ��̹�˴�ս
 */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();

		td1.setName("����");
		td2.setName("�ŷ�");
		
		// �����ػ��߳�
		td1.setDaemon(true);
		td2.setDaemon(true);

		td1.start();
		td2.start();

		Thread.currentThread().setName("����");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
