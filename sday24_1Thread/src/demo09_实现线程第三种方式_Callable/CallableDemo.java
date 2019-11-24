package demo09_实现线程第三种方式_Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 	如果你想要线程执行完毕后带有返回值用第三种方法：
 * 		Callable 他必须依赖线程池（ExecutorService）来存在的，
 * 		里提供返回值（带泛型的）
 * 
 * 多线程的第三种方式？ (ExecutorService线程池)
 * 		a:创建一个线程池对象，控制要创建几个线程对象。
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		b:这种线程池的线程可以执行。
 * 			可以执行Runnable对象或者Callable对象答代表的线程。
 * 			做一个类实现Runnable接口
 * 		c:调用如下方法即可：（ExecutorService类中）
 * 			Future<?> submit(Runnable task)
 * 				提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。该 Future 的 get 方法在成功 完成时将会返回 null。 
 * 			<T> Future<T> submit(Callable<T> task)
 * 				提交一个返回值的任务用于执行，返回一个表示任务的未决结果的 Future。该 Future 的 get 方法在成功完成时将会返回该任务的结果。 
 * 		d:我就要结束，可以么？
 * 			可以（ExecutorService类中）
 * 			void shutdown()
 * 				启动一次顺序关闭，执行以前提交的任务，但不接受新任务。如果已经关闭，则调用没有其他作用。 
 * 
 * 好处：
 * 		可以有返回值
 * 		可以抛出异常
 * 弊端：
 * 		代码比较复杂，所以一般人不用
 * 
 */
public class CallableDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// 创建线程池对象。
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		// 可以执行Runnable对象或者Callable对象答代表的线程
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		
		// 结束
		pool.shutdown();
	}

}
