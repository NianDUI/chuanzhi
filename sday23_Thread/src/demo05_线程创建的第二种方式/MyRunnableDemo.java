package demo05_�̴߳����ĵڶ��ַ�ʽ;

/*
 * ��ʽ����ʵ��Runnable���
 * 
 * ���裺
 * 		A:�Զ�����ʵ��Runnable���
 * 		b:��дrun()����
 * 		c:������Ķ���
 * 		d:����Thread��Ķ��󣬽�c����Ķ�����Ϊ�����������
 * Thread(Runnable target) 
          �����µ� Thread ���� 
   Thread(Runnable target, String name) 
          �����µ� Thread ���� 
 *
 */
public class MyRunnableDemo {

	public static void main(String[] args) {
		// ����MyRunnable��Ķ���
		MyRunnable my = new MyRunnable();

		// ����Thread��Ķ��󣬲���c����Ķ�����Ϊ����������ݡ�
//		// Thread(Runnable target) 
//		Thread t1 = new Thread(my);
//		Thread t2 = new Thread(my);
//		t1.setName("����ϼ");
//		t2.setName("����");

		// Thread(Runnable target, String name)
		Thread t1 = new Thread(my, "����ϼ");
		Thread t2 = new Thread(my, "����");

		t1.start();
		t2.start();

	}

}
