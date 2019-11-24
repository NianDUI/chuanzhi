package demo08_卖电影票案例2_修改_出现问题;

/*
 * 实现Runnable接口的方式实现
 * 
 * 通过加入延迟后就产生了两个问题。
 * a:相同的票买多次
 * 		CPU的每一次执行必须是一个原子性（最简单基本的）的操作
 * b:出现的负数票
 * 		随机性和延迟导致的
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
