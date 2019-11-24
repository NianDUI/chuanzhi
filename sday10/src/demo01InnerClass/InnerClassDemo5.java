package demo01InnerClass;

/*
 * 匿名内部类
 * 	就是内部类的简化写法
 * 
 * 前提：存在一个雷或者接口
 * 
 * 格式：
 * 		new 类名或接口名() {
 * 			重写方法;
 * 		};
 * 本质是什么呢？
 * 	是一个继承了该类或者实现了该接口的子类匿名对象。
 */
interface Inter {
	public abstract void show();

	public abstract void show2();
}

class Outer4 {
	public void method() {
		// 一个方法的时候
		/*
		 * new Inter() { public void show() { System.out.println("show"); } }.show();
		 */

		// 两个方法的时候
		/*
		 * new Inter() { public void show() { System.out.println("show"); } public void
		 * show2() { System.out.println("show2"); } }.show();
		 * 
		 * new Inter() { public void show() { System.out.println("show"); } public void
		 * show2() { System.out.println("show2"); } }.show2();
		 */

		// 多个方法很麻烦，怎么改进
		Inter i = new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		};

		i.show();
		i.show2();
	}

	public void show(Inter i) {
		i.show();
		i.show2();
	}
}

public class InnerClassDemo5 {

	public static void main(String[] args) {
		Outer4 o = new Outer4();
		o.method();

		// 匿名内部类在开发中使用
		// 使用过后被销毁，节省内存
		o.show(new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		});
	}

}
