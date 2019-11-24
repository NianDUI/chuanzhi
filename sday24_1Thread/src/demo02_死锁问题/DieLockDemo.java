package demo02_死锁问题;

/*
 * 同步的弊端:
 * 		a:效率低。
 * 		b:容易产生死锁。
 * 
 * 死锁：
 * 		连个或者两个以上的线程在争夺资源的过程中发生了，一种相互等待的现象。
 * 
 * 举例：
 * 		中国人，美国人吃饭的案例。
 * 		正常情况：
 * 			中国人：筷子两只
 * 			美国人：刀和叉
 * 		现在：
 * 			中国人：筷子一只，刀一把
 * 			美国人：筷子一只，叉一把
 * 
 */
public class DieLockDemo {
	
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);
		
		dl1.start();
		dl2.start();
	}

}
