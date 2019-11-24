package demo01InnerClass;

/*
 * 成员内部类
 */
class Outer {
	private int num = 10;

//	private class Inner {
	class Inner {
		public void show() {
			System.out.println(num);
		}
	}

	// 一般内部类不让外界访问，为了数据的安全性
	private class Inner2 {
		public void show() {
			System.out.println("私有内部类2");
		}
	}

	// 内部类用静态修饰是因为内部类可以看成为外部类的成员
	// 为了方便访问数据
	public static class Inner3 {
		public void show() {
			System.out.println("公共静态内部类3");
		}

		public static void show2() {
			System.out.println("公共静态内部类3的公共静态方法");
		}
	}

	public void show() {
		if (num == 10) { // 访问判断
			Inner2 i2 = new Inner2();
			i2.show();
		}
	}
}

public class InnerClassDemo3 {

	public static void main(String[] args) {
		//成员内部类de访问方试是
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
		
		Outer o = new Outer();
		o.show();
		
		//成员内部类被静态修饰后访问方试是
		Outer.Inner3 oi3 = new Outer.Inner3();
		oi3.show();
		oi3.show2();
		
		// show2的另一种调用方式
		Outer.Inner3.show2();
	}

}
