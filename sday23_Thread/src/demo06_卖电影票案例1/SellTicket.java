package demo06_����ӰƱ����1;

public class SellTicket extends Thread {
//	// ����100��Ʊ��
//	private int tickets = 100;
	// Ϊ���ø�����̶߳�������100��Ʊ������Ӧ��Ӧ�þ�̬���Ρ�
	private static int tickets = 100;
	
	@Override
	public void run() {
		// ����100��Ʊ��
		// ÿ���߳̽�����������������Ļ�ÿ���̶߳����൱���������Լ�����100��Ʊ���ⲻ��������Ӧ�ö��嵽���档
//		int tickets = 100;

		// Ϊ��ģ��һֱ��Ʊ��
		while (true) {
			if (tickets > 0) {
				System.out.println(getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
			} else {
				break;
			}
		}
	}
}
