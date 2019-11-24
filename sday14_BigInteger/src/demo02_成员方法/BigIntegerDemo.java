package demo02_��Ա����;

import java.math.BigInteger;
import java.util.Arrays;

/*
 *  BigInteger add(BigInteger val)���� ������ֵΪ (this + val) �� BigInteger�� 
 *  BigInteger subtract(BigInteger val)����  ������ֵΪ (this - val) �� BigInteger�� 
 *  BigInteger multiply(BigInteger val)����  ������ֵΪ (this * val) �� BigInteger�� 
 *  BigInteger divide(BigInteger val)����  ������ֵΪ (this / val) �� BigInteger�� 
 *  BigInteger[] divideAndRemainder(BigInteger val)�������̺�����������
          ���ذ��� (this / val) ��� (this % val) ������ BigInteger �����顣 
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
