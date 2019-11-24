package demo01_概述;

/*
 * Math：用于数学运算的类。
 * 成员变量：
 * 	public static final double E比任何其他值都更接近 e（即自然对数的底数）的 double 值。 
 * 	public static final double PI比任何其他值都更接近 pi（即圆的周长与直径之比）的 double 值。 
 * 
 * 
 * 成员方法：
 * 	public static int abs(int a)返回 int 值的绝对值。
 * 		多个类型的参数
 * 	public static double ceil(double a) 向上取整，（天花板） 返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。
 * 	public static double floor(double a) 向下取整，（地板） 返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数。
 * 	public static int max(int a, int b) 较大值， 返回两个 int 值中较大的一个。
 * 	public static int min(int a, int b) 较小值， 返回两个 int 值中较小的一个。
 * 	public static double pow(double a, double b)返回第一个参数的第二个参数次幂的值。
 * 	public static double random() 返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。[0.0, 1.0)
 * 	public static int round(float a) 四舍五入 （参数double自学）。
 * public static long round(double a) 四舍五入 返回最接近参数的 long。
 * 	public static double sqrt(double a) 正平方根 ，返回正确舍入的 double 值的正平方根。
 * 
 */
public class MathDemo {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		System.out.println(Math.E);
		System.out.println("--------------");
		
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println("--------------");
		

		System.out.println(Math.ceil(12.34));
		System.out.println(Math.ceil(12.56));
		System.out.println("--------------");
		
		System.out.println(Math.floor(12.34));
		System.out.println(Math.floor(12.56));
		System.out.println("--------------");
		

		System.out.println(Math.max(12, 23));
		// 我要获取三个数据中的最大值。方法的嵌套调用。
		System.out.println(Math.max(Math.max(12, 23), 18));
		// 我要获取四个 数据中的最大值
		System.out.println(Math.max(Math.max(12, 23), Math.max(78, 56)));
		System.out.println("--------------");

		System.out.println(Math.pow(2, 3));
		System.out.println("--------------");

		System.out.println(Math.random()); // [0.0, 1.0)
		// 获取一个一到100之间的随机数。
		System.out.println((int) (Math.random() * 100) +1);
		System.out.println("--------------");

		// 四舍五入。
		System.out.println(Math.round(12.34F));
		System.out.println(Math.round(12.56F));
		System.out.println("--------------");
		
		// 正平方根。
		System.out.println(Math.sqrt(4));
		System.out.println("--------------");
		
		
		
	}

}
