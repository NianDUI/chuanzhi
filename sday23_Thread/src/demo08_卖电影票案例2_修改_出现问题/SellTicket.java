package demo08_����ӰƱ����2_�޸�_��������;

public class SellTicket implements Runnable {
	// ����100��Ʊ��
	private int tickets = 100;

//	@Override
//	public void run() {
//		while (true) {
//			// t1,t2,t3�����߳�
//			// ��һ�ε�tickets = 100;
//			if (tickets > 0) {
//				// Ϊ��ģ�����ʵ�ĳ���������������Ϣ
//				try {
//					Thread.sleep(100); // t1������Ϣ,t2������Ϣ
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
//				// ����״̬
//				// ����1���ڳ��۵�100��Ʊ
//				// ����2���ڳ��۵�99��Ʊ
//				// �����أ�
//				// CPU��ÿһ��ִ�б�����һ��ԭ���ԣ���򵥻����ģ��Ĳ���
//				// �ȼ�¼��ǰ��ֵ
//				// ���Ű�ticket--
//				// Ȼ�������ǰ��ֵ��t2���ˣ�
//				// ticket��ֵ�ͱ����99
//				// ����1���ڳ��۵�100��Ʊ
//				// ����2���ڳ��۵�100��Ʊ
//			} else {
//				break;
//			}
//		}
//	}

	@Override
	public void run() {
		while (true) {
			// t1,t2,t3�����߳�
			// ��һ�ε�tickets = 1;
			if (tickets > 0) {
				// Ϊ��ģ�����ʵ�ĳ���������������Ϣ
				try {
					Thread.sleep(100); // t1�����˲���Ϣ,t2�����˲���Ϣ,t3�����˲���Ϣ
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
				// ����״̬
				// ����1���ڳ��۵�1��Ʊ��tickets=0
				// ����2���ڳ��۵�0��Ʊ��tickets=-1
				// ����3���ڳ��۵�-1��Ʊ��tickets=-2
			} else {
				break;
			}
		}
	}

}
