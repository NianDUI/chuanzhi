package demo01InnerClass;

/*
 * 匿名内部类面试题：
 * 	interface Inter { void show();}
 * 	class Outer { // 不齐代码}
 * 	public class OuterDemo {
		public static void main(String[] args) {
			Outer.method().show();
		}
	}
	要求在控制台输出“HelloWorld”
 */

interface Inter2 {
	void show();
	// public abstract
}

class Outer5 {
	// 不齐代码
	public static Inter2 method() {
		return new Inter2() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

public class InnerClassTest3 {

	public static void main(String[] args) {
		Outer5.method().show();
	}

}
