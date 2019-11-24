package demo04_线程控制;

/*
 * 停止线程：
 * public final void stop()：强迫线程停止执行。 
 * 		过时了，但是还可以使用
 * 
 * 中断线程：
 * public void interrupt()：中断线程。 
 * 		把线程的状态终止，并抛出一个InterruptedException。 
 */
public class ThreadStopDemo {
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		ts.start();
		
		// 你超过三秒不醒过来，就把你干死
		try {
			Thread.sleep(3000);
//			ts.stop(); // 不建议使用
			ts.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
