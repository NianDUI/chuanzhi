package demo10_Callable_����;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 	�������Ҫ�߳�ִ����Ϻ���з���ֵ�õ����ַ�����
 * 		Callable �����������̳߳أ�ExecutorService�������ڵģ�
 * 		���ṩ����ֵ�������͵ģ�
 * 
 * ���̵߳ĵ����ַ�ʽ��
 * 		a:����һ���̳߳ض��󣬿���Ҫ���������̶߳��� (Executors)
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		b:�����̳߳ص��߳̿���ִ�С�
 * 			����ִ��Runnable�������Callable���������̡߳�
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
 * Future<V>:
 * 		Future ��ʾ�첽����Ľ����
 * 		���Ͳ�����
 * 			V - �� Future �� get ���������صĽ������
 * 		V get()
 			���б�Ҫ���ȴ�������ɣ�Ȼ���ȡ������ 
 * 		boolean cancel(boolean mayInterruptIfRunning)
 * 			��ͼȡ���Դ������ִ�С� 
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
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// �����̳߳ض���
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		// ����ִ��Runnable�������Callable����������߳�
		Future<Integer> f1 = pool.submit(new MyCallable(100));
		Future<Integer> f2 = pool.submit(new MyCallable(200));
		
		// V get()
		Integer i1 = f1.get();
		Integer i2 = f2.get();
		
		System.out.println(i1);
		System.out.println(i2);
		
		// ����
		pool.shutdown();
	}

}
