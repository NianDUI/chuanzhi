package demo04_�߳̿���;

/*
 * 	�̼߳��룺
 * Ϊ����ĳЩ�߳�ִ����ϣ����ñ�����ִ��
 * public final void join()
                throws InterruptedException�ȴ����߳���ֹ�� 
 */
public class ThreadJoinDemo {

	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		
		tj1.setName("��Ԩ");
		tj2.setName("������");
		tj3.setName("��Ԫ��");
		
		tj1.start();
		try {
			tj1.join(); // ֻ��tj1ִ���꣬����Ĵ����ִ�У����̵߳ȴ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
	}

}
