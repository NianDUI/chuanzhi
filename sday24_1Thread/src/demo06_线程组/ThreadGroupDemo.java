package demo06_线程组;

/*
 * 线程组：把多个线程组合到一起。
 * 它可以对一批线程进行分类管理，Java允许重启直接兑现成组进行控制。
 * 
 * 线程类：
 * public final ThreadGroup getThreadGroup()
 * 		返回该线程所属的线程组。
 * 		 如果该线程已经终止（停止运行），该方法则返回 null。
 * 
 * 线程组：
 * public class ThreadGroupe
 * 		线程组表示一个线程的集合。
 * public final String getName()
 * 		返回此线程组的名称。 
 * 
 * 我们如何修改线程所在的组呢？
 * 创建一个线程组
 * 创建其他线程的时候，把其他线程的组指定为我们自己此新建的线程组
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {
		method1(); // 默认情况

		// 我们如何修改线程所在的组呢？
		// 穿件一个线程组
		// 创建其他线程的时候，把其他线程的组指定为我们自己此新建的线程组
		method2();

//		t1.start();
//		t2.start();
	}

	private static void method2() {
		ThreadGroup tg = new ThreadGroup("这是一个新的组");
		
		MyRunnable my = new MyRunnable();
		// public Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg, my, "林青霞");
		Thread t2 = new Thread(tg, my, "刘意");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());

		// 通过组设置后台线程，表示该组的线程都是后台线程。
		tg.setDaemon(true);
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();

		Thread t1 = new Thread(my, "林青霞");
		Thread t2 = new Thread(my, "刘意");
		// 我不知道他们属于哪个线程组，我想知道，怎么办。
		// public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1); // main
		System.out.println(name2); // main
		// 通过结果我们知道了：线程默认情况下属于main线程组。
		// 通过下面的测试，你应该能够看，到默认情况下，所有的线程都属于同一个组。
		System.out.println(Thread.currentThread().getThreadGroup().getName()); // main
	}
}
