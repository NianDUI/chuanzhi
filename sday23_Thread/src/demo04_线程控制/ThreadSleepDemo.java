package demo04_线程控制;

/*
 * 线程休眠：
 * 	public static void sleep(long millis)
 * 		在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），
 * 		此操作受到系统计时器和调度程序精度和准确性的影响。
 * 		该线程不丢失任何监视器的所属权。 
 * 
 */
public class ThreadSleepDemo {

	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();
		
		ts1.setName("林青霞");
		ts2.setName("林志玲");
		ts3.setName("林志颖");
		
		ts1.start();
		ts2.start();
		ts3.start();
	}

}
