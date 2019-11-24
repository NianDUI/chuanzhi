package demo09_卖电影票案例2_解决问题;

public class SellTicket implements Runnable {
	// 定义100张票。
	private int tickets = 100;

//	@Override
//	public void run() {
//		while (true) {
//			synchronized (new Object()) {
//				if (tickets > 0) {
//					System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
//				} else {
//					break;
//				}
//			}
//		}
//	}
	
	// 创建锁对象
	private Object o = new Object();
	
	@Override
	public void run() {
		while (true) {
			synchronized (o) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
				} else {
					break;
				}
			}
		}
	}
	
}
