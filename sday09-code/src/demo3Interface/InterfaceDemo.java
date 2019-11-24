package demo3Interface;

/*
 * 接口的主要功能是扩展功能。
 * 抽象类主要功能是共性功能。
 * 接口中的变量默认为常量
 * 	成员变量：只能是常量，并且是静态的
 * 		默认修饰符：public static final
 * 		建议：自己手动给出
 * 	构造方法：接口没有构造方法
 * 	成员方法：只能是抽象方法
 * 		默认修饰符：public abstract
 * 		建议：自己手动给出
 * 
 * 所有得类都默认继承自一个雷：Object。
 * 类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
 * 所有对象（包括数组）都实现这个类的方法。
 */
interface Inter {
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;

//	public Inter() {
//	}

//	public void show() {
//		
//	}
	abstract void show();
	
	public void show2() ;

}

class InterImpl implements Inter {

	@Override
	public void show() {

	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
//		i.num = 1;  // The final field Inter.num cannot be assigned
//		i.num2 = 5; // The final field Inter.num2 cannot be assigned

		System.out.println(Inter.num);
		System.out.println(Inter.num2);
		
	}

}
