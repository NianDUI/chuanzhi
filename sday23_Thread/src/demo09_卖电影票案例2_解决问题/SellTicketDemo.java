package demo09_卖电影票案例2_解决问题;

/*
 * 如何解决线程安全的问题呢？
 * 
 * 要想解决问题，就要知道哪些原因会导致出现问题，
 * 		而且这些原因也是以后我们判断一个程序是否会有线程安全问题的标准。
 * a:是否是多线城环境
 * b:是否有共享数据
 * c:是否有多条语句操作共享数据（多个地方操作他）
 * 
 * 我们来回想一下我们的程序有没有上面的问题呢
 * a:是否是多线城环境 	是
 * b:是否有共享数据	是
 * c:是否有多条语句操作共享数据	是
 * 
 * 由此可见我们的程序出现问题是正常的，因为他满足出现问题的条件。
 * 接下来才是我们要想想如何解决问题呢？
 * a和b的问题我们改变不了，我们只能想办法把c该变一下
 * 思想：
 * 		把多条语句的操作共享数据的代码包成一个整体，让某一个线程在执行的时候，别人不能来执行
 * 问题是我们不知道怎么包啊？其实我也不知道，但是Java给我们提供了：同步机制。
 * 
 * 方式一：同步代码块
 * 		synchronized(对象) {
 * 			需要同步的代码;
 * 		}
 * 		a:对象是什么呢？
 * 			我们可以随便创建一个对象试试
 * 		b:需要同步的代码是哪些呢？
 * 			把多条语句操作共享数据的代码部分给包起来。
 * 		
 * 		注意：
 * 			同步可以解决安全问题的根本原因就在那个对象上，该对象如同锁的功能。
 * 			多个线程必须是同一把锁。
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建资源对象。
		SellTicket st = new SellTicket();
		
		// 创建三个线程对象。
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");
		
		// 启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}
