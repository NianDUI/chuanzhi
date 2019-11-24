package demo01_Integer;

/*
 * 	需求一，我要求大家把衣摆这个数据的二进制八进制，十六进制计算出来。
 * 	需求二，我要求大家判断一个数据是否int的范围内的。
 * 		首先你得知道int的范围是多大？
 * 
 * 基本类型 包装类类型
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * 常见的操作:用于基本数据类型与字符串之间的转换。
 */
public class IntegerDemo {

	public static void main(String[] args) {
		//不麻烦的，就来了。
		
		// public static String toBinaryString(int i)以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式。 
		System.out.println(Integer.toBinaryString(100));
		// public static String toOctalString(int i)以八进制（基数 8）无符号整数形式返回一个整数参数的字符串表示形式。 
		System.out.println(Integer.toOctalString(100));
		// public static String toHexString(int i)以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。 
		System.out.println(Integer.toHexString(100));
		
		// public static final int MAX_VALUE值为 2^31－1 的常量，它表示 int 类型能够表示的最大值。 
		System.out.println(Integer.MAX_VALUE);
		// public static final int MIN_VALUE值为 －2^31 的常量，它表示 int 类型能够表示的最小值。 
		System.out.println(Integer.MIN_VALUE);
		
	}
	
}
