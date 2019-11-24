package demo03_可变参数的概述和使用;

/*
 * 可变参数：
 *  	定义方法的时候不知道该定义多少个参数。
 *  格式。
 *  	修饰符 返回值类型 方法名(数据类型... 变量名){}
 *  	注意：
 *  		a:这里的变量其实是数组
 *  		b:如果一个方法有可变参数，并且有多个参数，
 *  		    那么可变参数肯定是最后一个。
 *  
 *  底层源码是数组实现；
 * 		先将餐要传的参数封装成一个数组。然后将数组的地址传给方法。方法当成数组来处理。
 *  
 *  Arrays工具类中的一个方法
 *    JDK1.5
 *  	public static <T> List<T> asList(T... a)
 *  		返回一个受指定数组支持的固定大小的列表。
 *    JDK1.4
 *  	public static List asList(Object[] a)
 */
public class ArgsDemo {
	public static void main(String[] args) {
		// 两个数据求和
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println("result:" + result);

		// 三个数据求和。
		int c = 30;
		result = sum(a, b, c);
		System.out.println("result:" + result);

		// 4个数据求和。
		int d = 30;
		result = sum(a, b, c, d);
		System.out.println("result:" + result);
		
		// 需求：我要写一个求和的功能，到底是几个数据要求和呢？我不太清楚。
		// 但是我知道在调用的时候我肯定就知道了。
		// 为了这个种问题，java就提供了一个东西：可变参数。
		result = sum(a, b, c, d, 40);
		System.out.println("result:" + result);

		result = sum(a, b, c, d, 40, 50);
		System.out.println("result:" + result);
		
		result = sum();
		System.out.println("result:" + result); // 0
		
	}
	
	public static int sum(int... a) { // [I@2e5c649
//		System.out.println(a);
//		return 0;
		
		int s = 0;
		
		for (int i : a) {
			s += i;
		}
		
		return s;
	}

//	private static int sum(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
//
//	private static int sum(int a, int b, int c) {
//		return a + b + c;
//	}
//
//	private static int sum(int a, int b) {
//		return a + b;
//	}

}
