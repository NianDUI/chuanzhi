package demo04_�߳̿���;

/*
 * ֹͣ�̣߳�
 * public final void stop()��ǿ���߳�ִֹͣ�С� 
 * 		��ʱ�ˣ����ǻ�����ʹ��
 * 
 * �ж��̣߳�
 * public void interrupt()���ж��̡߳� 
 * 		���̵߳�״̬��ֹ�����׳�һ��InterruptedException�� 
 */
public class ThreadStopDemo {
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		ts.start();
		
		// �㳬�����벻�ѹ������Ͱ������
		try {
			Thread.sleep(3000);
//			ts.stop(); // ������ʹ��
			ts.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
