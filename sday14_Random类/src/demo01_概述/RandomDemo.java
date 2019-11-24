package demo01_概述;

import java.util.Random;

/*
 * Random： 此类的实例用于生成随机数
 *	 
 * 	构造方法。
 * 		Random() 创建一个新的随机数生成器。
 * 			没有给种子，用的是默认值，是当前时间的毫秒值。
 * 		Random(long seed) 使用单个 long 种子创建一个新的随机数生成器。
 * 			给出指定的种子
 * 	重要的是：种子不一样和一样的区别
 * 		给定种子后，每次得到的随机数是相同的。
 * 
 * 	成员方法
 * 		public int nextInt():返回的是int范围内的随机数。
 * 		public int nextInt(int n):返回的是[0, n)范围内的随机数。
 * 
 */
public class RandomDemo {

	public static void main(String[] args) {
//		Random r = new Random();
//		for (int i = 0; i < 10; i++) {
//			int num = r.nextInt();
//			System.out.println(num);
//		}
//		System.out.println("=============");
//		for (int i = 0; i < 10; i++) {
//			int num = r.nextInt(10) + 1;
//			System.out.println(num);
//		}

		// 种子的问题
		Random r = new Random(111);
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(10) + 1;
			System.out.println(num);
		}

	}

}
