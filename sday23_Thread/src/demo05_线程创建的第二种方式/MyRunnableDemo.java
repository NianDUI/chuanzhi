package demo05_线程创建的第二种方式;

/*
 * 方式二：实现Runnable借口
 * 
 * 步骤：
 * 		A:自定义了实现Runnable借口
 * 		b:重写run()方法
 * 		c:创建类的对象
 * 		d:创建Thread类的对象，将c步骤的对象作为构造参数传递
 * Thread(Runnable target) 
          分配新的 Thread 对象。 
   Thread(Runnable target, String name) 
          分配新的 Thread 对象。 
 *
 */
public class MyRunnableDemo {

	public static void main(String[] args) {
		// 创建MyRunnable类的对象。
		MyRunnable my = new MyRunnable();

		// 创建Thread类的对象，并把c步骤的对象作为构造参数传递。
//		// Thread(Runnable target) 
//		Thread t1 = new Thread(my);
//		Thread t2 = new Thread(my);
//		t1.setName("林青霞");
//		t2.setName("刘意");

		// Thread(Runnable target, String name)
		Thread t1 = new Thread(my, "林青霞");
		Thread t2 = new Thread(my, "刘意");

		t1.start();
		t2.start();

	}

}
