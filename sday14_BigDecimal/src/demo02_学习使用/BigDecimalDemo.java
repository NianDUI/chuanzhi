package demo02_学习使用;

import java.math.BigDecimal;

/*
 * 构造方法：
 * public BigDecimal(String val)将 BigDecimal 的字符串表示形式转换为 BigDecimal。
 * 			数值转换为BigDecimal时不会出现任何问题, 
 * 
 * public BigInteger add(BigInteger val)
 * public BigInteger subtract(BigInteger val)
 * public BigInteger multiply(BigInteger val)
 * public BigInteger divide(BigInteger val)
 * public BigInteger divide(BigInteger divisor,int scale,int roundingMode)商，小数位数，如何舍取
 * 
 * 
 */
public class BigDecimalDemo {
	
	public static void main(String[] args) {
//		// 出现问题
//		System.out.println(0.09 + 0.01); // 0.09999999999999999
//		System.out.println(1.0 - 0.32); // 0.6799999999999999
//		System.out.println(1.015 * 100); // 101.49999999999999
//		System.out.println(1.301 / 100); // 0.013009999999999999
		
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println(bd1.add(bd2));
		System.out.println("----------------------");
		
		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println(bd3.subtract(bd4));
		System.out.println("----------------------");
		
		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println(bd5.multiply(bd6));
		System.out.println("----------------------");
		
		BigDecimal bd7 = new BigDecimal("1.301");
		BigDecimal bd8 = new BigDecimal("100");
		System.out.println(bd7.divide(bd8));
		System.out.println(bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP));
		System.out.println(bd7.divide(bd8, 8, BigDecimal.ROUND_HALF_UP));
		
	}

}
