package demo04_线程控制;

/*
 *  礼让线程：
 * public static void yield()
 * 		暂停当前正在执行的线程对象，并执行其他线程。 
 * 
 *  让线程的执行更和谐，但是不能靠它保证一人一次
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("林青霞");
		ty2.setName("刘意");
		
		ty1.start();
		ty2.start();
	}
}
