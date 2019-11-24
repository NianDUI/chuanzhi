package demo09_ʵ���̵߳����ַ�ʽ_Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 	�������Ҫ�߳�ִ����Ϻ���з���ֵ�õ����ַ�����
 * 		Callable �����������̳߳أ�ExecutorService�������ڵģ�
 * 		���ṩ����ֵ�������͵ģ�
 * 
 * ���̵߳ĵ����ַ�ʽ�� (ExecutorService�̳߳�)
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
 * �ô���
 * 		�����з���ֵ
 * 		�����׳��쳣
 * �׶ˣ�
 * 		����Ƚϸ��ӣ�����һ���˲���
 * 
 */
public class CallableDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// �����̳߳ض���
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		// ����ִ��Runnable�������Callable����������߳�
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		
		// ����
		pool.shutdown();
	}

}
