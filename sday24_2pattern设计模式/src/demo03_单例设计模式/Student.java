package demo03_单例设计模式;

public class Student {

	// 构造私有
	private Student() {
	}
	
	// 自己造一个
	// 静态方法，只能访问静态成员变量，加静态
	// 为了不让外界直接访问修改这个值，加private。
	private  static Student s = new Student();
	
	// 提供公共的访问方式
	// 为了保证外界能够直接使用方法，加静态
	public static Student getStudent() {
		return s;
	}

}
