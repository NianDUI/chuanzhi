package demo02_成员方法;

import java.math.BigInteger;
import java.util.Arrays;

/*
 *  BigInteger add(BigInteger val)：加 返回其值为 (this + val) 的 BigInteger。 
 *  BigInteger subtract(BigInteger val)：减  返回其值为 (this - val) 的 BigInteger。 
 *  BigInteger multiply(BigInteger val)：乘  返回其值为 (this * val) 的 BigInteger。 
 *  BigInteger divide(BigInteger val)：除  返回其值为 (this / val) 的 BigInteger。 
 *  BigInteger[] divideAndRemainder(BigInteger val)：返回商和余数的数组
          返回包含 (this / val) 后跟 (this % val) 的两个 BigInteger 的数组。 
 * 
 */
public class BigIntegerDemo {
	
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("50");
		
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
		System.out.println(Arrays.toString(bi1.divideAndRemainder(bi2)));
		
		
	}

}
