package demo10_û���������Ʊ;

public class SellTicket implements Runnable {

	// ����100��Ʊ
	private int tickets = 100;

	// ����ͬһ����
	private Object o = new Object();

	@Override
	public void run() {
		while (true) {
			// t1,t2,t3�����ߵ�����
			// ����t1����CPU��ִ��Ȩ��t1��Ҫ����
			// ����t2����CPU��ִ��Ȩ��t2Ҫ�������������ǹ��ŵģ�����ȥ�����Ծ͵��š�
			// ��(������)
			synchronized (o) { // ��������Ĵ��뽫���ǻᱻ���ϵģ�����t1�����󣬾����ˡ�(��)
				if (tickets > 0) {
					try {
						Thread.sleep(100); // t1��˯����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
					// ����һ���ڳ��۵�100��Ʊ��
				} else {
					break;
				}
			} // t1�ͳ����ˣ�Ȼ��Ϳ��Ŷ���(��)
		}
	}

}
