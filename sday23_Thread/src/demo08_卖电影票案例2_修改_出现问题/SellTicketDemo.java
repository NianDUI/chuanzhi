package demo08_����ӰƱ����2_�޸�_��������;

/*
 * ʵ��Runnable�ӿڵķ�ʽʵ��
 * 
 * ͨ�������ӳٺ�Ͳ������������⡣
 * a:��ͬ��Ʊ����
 * 		CPU��ÿһ��ִ�б�����һ��ԭ���ԣ���򵥻����ģ��Ĳ���
 * b:���ֵĸ���Ʊ
 * 		����Ժ��ӳٵ��µ�
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// ������Դ����
		SellTicket st = new SellTicket();
		
		// ���������̶߳���
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");
		
		// �����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}
