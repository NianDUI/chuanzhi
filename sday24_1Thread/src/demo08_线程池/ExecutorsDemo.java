package demo08_�̳߳�;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳صĺô���
 * 		�̳߳������ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
 * 
 * ���ʵ���̳߳صĴ����أ� (ExecutorService�̳߳�)
 * 		a:����һ���̳߳ض��󣬿���Ҫ���������̶߳���
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		b:�����̳߳ص��߳̿���ִ�С�
 * 			����ִ��Runnable�������Callable����������̡߳�
 * 			��һ����ʵ��Runnable�ӿ�
 * 		c:�������·������ɣ���ExecutorService���У�
 * 			Future<?> submit(Runnable task)
 * 				�ύһ�� Runnable ��������ִ�У�������һ����ʾ������� Future���� Future �� get �����ڳɹ� ���ʱ���᷵�� null�� 
 * 			<T> Future<T> submit(Callable<T> task)
 * 				�ύһ������ֵ����������ִ�У�����һ����ʾ�����δ������� Future���� Future �� get �����ڳɹ����ʱ���᷵�ظ�����Ľ���� 
 * 		d:�Ҿ�Ҫ����������ô��
 * 			���ԣ�ExecutorService���У�
 * 			void shutdown()
 * 				����һ��˳��رգ�ִ����ǰ�ύ�����񣬵�����������������Ѿ��رգ������û���������á� 
 * 
 * java.util.concurrent �� Executors��
 * 		�˰���������� Executor��ExecutorService��
 * 	ScheduledExecutorService��ThreadFactory�� Callable ��Ĺ�����ʵ�÷���
 * 
 * public static ExecutorService newCachedThreadPool()
 * 		����һ���ɸ�����Ҫ�������̵߳��̳߳أ�
 * 		��������ǰ������߳̿���ʱ����������
 * public static ExecutorService newFixedThreadPool(int nThreads)
 * 		����һ�������ù̶��߳������̳߳أ�
 * 		�Թ�����޽���з�ʽ��������Щ�̡߳�
 * public static ExecutorService newSingleThreadExecutor()
 * 		����һ��ʹ�õ��� worker �̵߳� Executor��
 *		 ���޽���з�ʽ�����и��̡߳���
 * 
 * 
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		// a:����һ���̳߳ض��󣬿���Ҫ���������̶߳���
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		// ����ִ��Runnable�������Callable���������߳�
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		// �����̳߳�
		pool.shutdown();
		
	}
}
