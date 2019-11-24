package demo04_线程控制;

/*
 * 	线程加入：
 * 为了让某些线程执行完毕，才让别人能执行
 * public final void join()
                throws InterruptedException等待该线程终止。 
 */
public class ThreadJoinDemo {

	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		
		tj1.setName("李渊");
		tj2.setName("李世民");
		tj3.setName("李元霸");
		
		tj1.start();
		try {
			tj1.join(); // 只有tj1执行完，下面的代码才执行（主线程等待）。
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
	}

}
