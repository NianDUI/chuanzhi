package demo01_Lock������;

/*
 * ��Ȼ���ǿ������ͬ��������ͬ��������ˮ�������⣬
 * 	�������ǲ�û��ֱ�ӿ�����������ϵ������������ͷ�������
 * Ϊ�˸������ر����μ������ͷ���jdk5�Ժ��ṩ��һ���µ�������Lock��
 * 
 * Lock:
 * 		void lock():��ȡ���� 
 * 		void unlock():�ͷ����� 
 * ReentrantLock��Lock��һ��ʵ����
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// ������Դ����
		SellTicket st = new SellTicket();
		
		// ������������
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");
		
		// �����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}
