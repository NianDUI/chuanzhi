package demo01_概述;

/*
 * 看程序写结果： 结果和我们想的有一点点不一样这是因为float的类型的数据存储和整数不一样导致的。
 * 					他们大部分的时候，都是带有有效数字位。
 * 
 * 由于在运算的时候，float类型和double类型很容易丢失精度，如演示案例。所以为了能精确地表示、计算浮点数，
 * 		Java提供了BigDecimal类。
 * 
 * BigDecimal类：不可变的、任意精度的有符号十进制数，可以解决数据丢失问题。
 * 
 * 
 */
public class BigDecimalDemo {
	
	public static void main(String[] args) {
		// 出现问题
		System.out.println(0.09 + 0.01); // 0.09999999999999999
		System.out.println(1.0 - 0.32); // 0.6799999999999999
		System.out.println(1.015 * 100); // 101.49999999999999
		System.out.println(1.301 / 100); // 0.013009999999999999
		
		System.out.println(1.0 - 0.12); // 0.88
	}

}
