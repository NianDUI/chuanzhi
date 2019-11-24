package demo11_ͬ������鼰ͬ������Ӧ�ú���������;

public class SellTicket implements Runnable {

	// ����100��Ʊ
	private static int tickets = 100;

	// ����ͬһ����
//	private Object o = new Object();
//	private Demo d = new Demo();

	private int x = 0;

	// ͬ���������o����
//	@Override
//	public void run() {
//		while (true) {
//			synchronized (o) { 
//				if (tickets > 0) {
//					try {
//						Thread.sleep(100); 
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
//				} else {
//					break;
//				}
//			}
//		}
//	}

	// ͬ��������������������
//	@Override
//	public void run() {
//		while (true) {
//			synchronized (d) { 
//				if (tickets > 0) {
//					try {
//						Thread.sleep(100); 
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
//				} else {
//					break;
//				}
//			}
//		}
//	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (SellTicket.class) {
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
			} else {
//				synchronized (d) {
//					if (tickets > 0) {
//						try {
//							Thread.sleep(100);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//						System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
//					} else {
//						break;
//					}
//				}

				sellTicket();
			}
			x++;
		}
	}

//	private void sellTicket() {
//		synchronized (d) {
//			if (tickets > 0) {
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
//			}
//		}
//	}

//	// ���һ������һ��ȥ�Ϳ����˴��뱻ͬ���ˣ���ô�Ҿ������ܲ��ܰ����ͬ�����ط������أ�
//	private synchronized void sellTicket() {
//		if (tickets > 0) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
//		}
//	}

	private static synchronized void sellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
		}
	}
	
}

class Demo {

}
