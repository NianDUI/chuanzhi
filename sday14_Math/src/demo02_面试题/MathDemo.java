package demo02_面试题;

import java.util.Iterator;
import java.util.Scanner;

/*需求:请设计一个方法可以实现获取任意范围内的随机数。(int)
 * 	
 * 
 */
public class MathDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始数：");
		int start = sc.nextInt();
		System.out.println("请输入结束数：");
		int end = sc.nextInt();
		for (int i = 0; i < 100; i++) {
			int result = getRandom(start, end);
//			if (result == start || result == end)
			System.out.println("结果：" + result);
		}

//		System.out.println(getRandom(6, 8));

	}

	public static int getRandom(int start, int end) {
		// 获取一个一到100之间的随机数。(int) (Math.random() * 100) + 1
//		int number = (int) (Math.random() * end) + start; 
		// 发现问题了
		// 加1是因为，start就是最小值了 ，随机的数是[0.0-差值)，取不到最大值，
		// 差值加1后就能取到了,也能取到最小值，因为产生的随机数是[0.0, 差值+1)
//		int number = (int) (Math.random() * (end - start + 1)) + start; 
//		return number;

		// 自己写的
//		return ((int) (Math.random() * Math.abs(start - end)) + Math.min(start, end));  
		return ((int) (Math.random() * Math.abs(start - end + 1)) + Math.min(start, end)); // 该后
	}

}
