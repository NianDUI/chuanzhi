package demo04_�߳̿���;

/*
 * �߳����ߣ�
 * 	public static void sleep(long millis)
 * 		��ָ���ĺ��������õ�ǰ����ִ�е��߳����ߣ���ִͣ�У���
 * 		�˲����ܵ�ϵͳ��ʱ���͵��ȳ��򾫶Ⱥ�׼ȷ�Ե�Ӱ�졣
 * 		���̲߳���ʧ�κμ�����������Ȩ�� 
 * 
 */
public class ThreadSleepDemo {

	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();
		
		ts1.setName("����ϼ");
		ts2.setName("��־��");
		ts3.setName("��־ӱ");
		
		ts1.start();
		ts2.start();
		ts3.start();
	}

}
