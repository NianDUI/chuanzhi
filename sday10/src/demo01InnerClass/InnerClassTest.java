package demo01InnerClass;

/*
 * 要去输出 30,20,10填空
 * 
 * 注意：
 * 	1：内部类和外部类没有继承关系
 * 	2：通过外部类名限定this对象
 * 		Outer.this
 */
class Outer2 {
	public int num = 10;
	
	class Inner {
		public int num = 20;
		
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
//			System.out.println(new Outer2().num);
			System.out.println(Outer2.this.num);
		}
	}
}

public class InnerClassTest {
	
	public static void main(String[] args) {
		Outer2.Inner i = new Outer2().new Inner();
		i.show();
	}

}
