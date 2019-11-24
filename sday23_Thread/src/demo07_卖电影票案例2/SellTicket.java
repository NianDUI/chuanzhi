package demo07_卖电影票案例2;

public class SellTicket implements Runnable {
	// 定义100张票。
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
			} else {
				break;
			}
		}
	}

}
