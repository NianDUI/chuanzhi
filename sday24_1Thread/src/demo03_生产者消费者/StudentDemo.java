package demo03_生产者消费者;

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
		t2.start();
		t1.start();
		
		// null---27
	}

}
