package demo01_Lock锁对象;

/*
 * 虽然我们可以理解同步代码块和同步方法的水对象问题，
 * 	但是我们并没有直接看到在哪里加上的锁，在哪里释放了锁。
 * 为了更清晰地表达如何加锁和释放锁jdk5以后提供了一个新的锁对象Lock。
 * 
 * Lock:
 * 		void lock():获取锁。 
 * 		void unlock():释放锁。 
 * ReentrantLock是Lock的一个实现类
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建资源对象
		SellTicket st = new SellTicket();
		
		// 创建三个窗口
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");
		
		// 启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}
