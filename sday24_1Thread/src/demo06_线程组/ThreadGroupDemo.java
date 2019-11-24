package demo06_�߳���;

/*
 * �߳��飺�Ѷ���߳���ϵ�һ��
 * �����Զ�һ���߳̽��з������Java��������ֱ�Ӷ��ֳ�����п��ơ�
 * 
 * �߳��ࣺ
 * public final ThreadGroup getThreadGroup()
 * 		���ظ��߳��������߳��顣
 * 		 ������߳��Ѿ���ֹ��ֹͣ���У����÷����򷵻� null��
 * 
 * �߳��飺
 * public class ThreadGroupe
 * 		�߳����ʾһ���̵߳ļ��ϡ�
 * public final String getName()
 * 		���ش��߳�������ơ� 
 * 
 * ��������޸��߳����ڵ����أ�
 * ����һ���߳���
 * ���������̵߳�ʱ�򣬰������̵߳���ָ��Ϊ�����Լ����½����߳���
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {
		method1(); // Ĭ�����

		// ��������޸��߳����ڵ����أ�
		// ����һ���߳���
		// ���������̵߳�ʱ�򣬰������̵߳���ָ��Ϊ�����Լ����½����߳���
		method2();

//		t1.start();
//		t2.start();
	}

	private static void method2() {
		ThreadGroup tg = new ThreadGroup("����һ���µ���");
		
		MyRunnable my = new MyRunnable();
		// public Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg, my, "����ϼ");
		Thread t2 = new Thread(tg, my, "����");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());

		// ͨ�������ú�̨�̣߳���ʾ������̶߳��Ǻ�̨�̡߳�
		tg.setDaemon(true);
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();

		Thread t1 = new Thread(my, "����ϼ");
		Thread t2 = new Thread(my, "����");
		// �Ҳ�֪�����������ĸ��߳��飬����֪������ô�졣
		// public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1); // main
		System.out.println(name2); // main
		// ͨ���������֪���ˣ��߳�Ĭ�����������main�߳��顣
		// ͨ������Ĳ��ԣ���Ӧ���ܹ�������Ĭ������£����е��̶߳�����ͬһ���顣
		System.out.println(Thread.currentThread().getThreadGroup().getName()); // main
	}
}
