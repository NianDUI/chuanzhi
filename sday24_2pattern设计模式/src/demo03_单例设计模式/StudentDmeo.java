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
 *  
 */
public class StudentDmeo {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student();
//		System.out.println(s1 == s2); // false

		// 通过单例如何的到对象呢？
//		Student.s = null;
		
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2); // true
		
		System.out.println(s1); // null，demo03_单例设计模式.Student@136432db
		System.out.println(s2); // null，demo03_单例设计模式.Student@136432db
	}
}
