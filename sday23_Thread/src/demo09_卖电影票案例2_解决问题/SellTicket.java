package demo09_����ӰƱ����2_�������;

public class SellTicket implements Runnable {
	// ����100��Ʊ��
	private int tickets = 100;

//	@Override
//	public void run() {
//		while (true) {
//			synchronized (new Object()) {
//				if (tickets > 0) {
//					System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
//				} else {
//					break;
//				}
//			}
//		}
//	}
	
	// ����������
	private Object o = new Object();
	
	@Override
	public void run() {
		while (true) {
			synchronized (o) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
				} else {
					break;
				}
			}
		}
	}
	
}
