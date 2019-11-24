package demo04_生产者消费者_改进版;

/*
 * 分析：
 * 		资源类：Student
 * 		设置学生数据：SetStudent（生产者）
 * 		获取学生数据：GetStudent（消费者）
 * 		测试类：StudentDemo
 * 
 * 问题1：按照思路写代码，发现数据每次都是：null---0
 * 原因：我们在每个线程中都创建了新的资源，而我们要求的时候设置和获取的资源应该是同一个
 * 
 * 如何实现呢？
 * 		思路1：在外界把这个数据创建出来，通过构造方法传递给其他的类。
 *
 * 问题2：为了数据的效果好一些，我加入了循环和判断，给出不同的值，这个时候产生了新的问题
 * 		a:同一个数据出现多次
 * 		b:姓名和年龄不匹配
 * 原因：
 * 		a:同一个数据出现多次
 * 			CPU一点点时间片的执行权就做够你执行很多次
 * 		b:姓名和年龄不匹配
 * 			线程运行的随机性
 * 线程安全问题：
 * 		a:是否是多线程环境	是
 * 		b:是否有共享数据	是
 * 		c:是否有多条语句操作共享数据	是
 * 解决方案：
 * 		加锁
 * 		注意：
 * 			a:不同种类的线程都要加锁。
 * 			b:不同种类的线程加的锁，必须是同一把
 *
 */
public class StudentDemo {

	public static void main(String[] args) {
		// 创建资源
		Student s = new Student();
		
		// 设置和获取的类
		SetStudent st = new SetStudent(s);
		GetStudent gt = new GetStudent(s);
		
		// 线程类
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		// 启动线程
		t1.start();
		t2.start();
	}

}
