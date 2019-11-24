package demo02_线程创建的第一种方法;

/*
 * 	该类类里面重run()方法？
 *  	为什么是run()方法？
 *  不是类中的所有代码都需要被线程执行。
 *  而这个时候，为了区分那些代码能够被线程执行，java提供了Thread类中的run()用来包含哪些被线程执行的代码。
 */
public class MyThread extends Thread {
	
	@Override
	public void run() {
		// 自己写代码
		// System.out.println("好好学习，天天向上");
		// 一般来说，被线程执行的代码肯定是比较耗时的。所以我们要用循环改进。
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}
