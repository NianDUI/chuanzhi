package demo04_进制转换;

/*
 * 基本进制转换
 * public static String toBinaryString(int i)
 * public static String toOctalString(int i)
 * public static String toHexString(int i)
 * 
 * 十进制到其他进制
 * public static String toString(int i, int radix)
 * 进制的范围：2-36
 * 为什么呢？0,...9,a...z共有36个
 * 
 * 其他进制到十进制
 * public static int parseInt(String s, int radix)

 */
public class IntegerDemo {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("-----------------");

		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, -7)); // 100
		System.out.println(Integer.toString(100, 70)); // 100
		System.out.println(Integer.toString(100, 1)); // 100
		System.out.println("-----------------");

		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("4f", 16));
		System.out.println(Integer.parseInt("100", 23));
		// NumberFormatException
//		System.out.println(Integer.parseInt("123", 2));

	}

}
