package demo07_����ӰƱ����2;

public class SellTicket implements Runnable {
	// ����100��Ʊ��
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
			} else {
				break;
			}
		}
	}

}
