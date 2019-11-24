package demo08_线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池的好处：
 * 		线程池里面的每一个线程代码结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一个对象来使用。
 * 
 * 如何实现线程池的代码呢？ (ExecutorService线程池)
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
 * java.util.concurrent 类 Executors：
 * 		此包中所定义的 Executor、ExecutorService、
 * 	ScheduledExecutorService、ThreadFactory和 Callable 类的工厂和实用方法
 * 
 * public static ExecutorService newCachedThreadPool()
 * 		创建一个可根据需要创建新线程的线程池，
 * 		但是在以前构造的线程可用时将重用它们
 * public static ExecutorService newFixedThreadPool(int nThreads)
 * 		创建一个可重用固定线程数的线程池，
 * 		以共享的无界队列方式来运行这些线程。
 * public static ExecutorService newSingleThreadExecutor()
 * 		创建一个使用单个 worker 线程的 Executor，
 *		 以无界队列方式来运行该线程。（
 * 
 * 
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		// a:创建一个线程池对象，控制要创建几个线程对象。
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		// 可以执行Runnable对象或者Callable对象代表的线程
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		// 结束线程池
		pool.shutdown();
		
	}
}
