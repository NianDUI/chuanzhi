package demo01InnerClass;

/*
 * 局部内部类
 * 	可以直接访问外部类的成员
 * 	在局部位置，可以创建内部类对象，通过对象调用内部类方法 ，来使用内部类功能
 * 
 * 面试题：
 * 	局部内部类访问局部变量的注意事项？
 * 		局部内部类访问局部变量必须使用fianl修饰
 * 			因为局部变量会随着调用完毕而消失，对象不会立即消失，
 * 			所以加final修饰变量变成常量，你栈中消失了，我在堆中
 * 			用的是数据20而不是引用，所以我还是有数据在使用
 */
class Outer3 {
	public int num = 10;
	
	public void method() {
		final int num2 = 20;
		class Inner {
			public void show() {
				System.out.println(num);
				// 从内部类中访问本地变量num2；需要被声明为最终类型
				System.out.println(num2);
			}
		}
		
		Inner i = new Inner();
		i.show();
	}
}
public class InnerClassDemo4 {

	public static void main(String[] args) {
		Outer3 o = new Outer3();
		o.method();
	}

}
