package demo04_�߳̿���;

/*
 * ���ǵ��߳�û���������ȼ��϶���Ĭ�����ȼ���
 * ��ô��Ĭ�����ȼ��Ƕ����أ�
 * 
 * ��λ�ȡ�̵߳����ȼ��أ�
 *  int getPriority() 
          �����̵߳����ȼ��� 
 * 
 * ��������̵߳����ȼ��أ�
 *  void setPriority(int newPriority) 
          �����̵߳����ȼ��� 
 * 
 * ע�⣺
 * 		�߳�Ĭ�����ȼ�Ϊ5
 * 		�߳����ȼ���Χ�ǣ�1-10
 * 		�߳����ȼ�������ʾ�̻߳�ȡCPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�ڴ����Ƚ϶࣬���߶�����е�ʱ����ܿ����ȽϺõ�Ч����
 *
 *public class IllegalArgumentExceptionextends RuntimeException
 *�׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ����� 
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		tp1.setName("��������");
		tp2.setName("����Ⱥ");
		tp3.setName("��ƽ֮");
		
		// ��λ�ȡ�̵߳����ȼ�
//		System.out.println(tp1.getPriority());
//		System.out.println(tp2.getPriority());
//		System.out.println(tp3.getPriority());

		// �����̵߳����ȼ�
//		// IllegalArgumentException���Ƿ������쳣
//		// IllegalArgumentException - ������ȼ����� MIN_PRIORITY �� MAX_PRIORITY ��Χ�ڡ� 
//		tp1.setPriority(100000);
		
		// ������ȷ���̵߳����ȼ�
		tp1.setPriority(10);
		tp2.setPriority(1);
		
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
