package demo03_单例设计模式;


/*
 * 单例模式:
 * 		保证类在内存中只有一个对象
 *  
 *  如何保证类在内存中只有一个对象？
 *  	a:把构造方法私有
 *  	b:在成员位置自己创建一个对象
 *  	c:通过一个公共的方法提供访问
 *  
 *  两种：
 *  	饿汉式：类一加载就创建对象，例如Student
 *  	懒汉式：第一次使用时才创建对象，例如Teacher
 *  
 *  面试题：
 *  	单例模式的思想是什么？
 *  		保证类在内存中只有一个对象
 *  	请写一个代码体现。
 *  		写懒汉式：
 *  	开发：饿汉式(是不会出问题的单例模式)
 *  	面试：懒汉式(可能会出问题的单例模式)
 *  		a:懒加载（延迟加载）
 *  		b:线程安全问题
 *  			a:是否多线程环境。 是
 *  			b:是否有共享数据。 是
 *  			c:是否有多条语句操作共享数据。 是
 *  		加：synchronized
 *  
 *  
 */
public class TeacherDemo {
	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1 == t2); // true
		System.out.println(t1); // demo03_单例设计模式.Teacher@136432db
		System.out.println(t2); // demo03_单例设计模式.Teacher@136432db
	}
}
