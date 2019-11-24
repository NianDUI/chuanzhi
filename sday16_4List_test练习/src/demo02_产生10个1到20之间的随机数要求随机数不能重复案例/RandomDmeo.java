package demo02_产生10个1到20之间的随机数要求随机数不能重复案例;

import java.util.ArrayList;
import java.util.Random;

/*
 * 产生10个1到20之间的随机数,要求随机数不能重复案例
 * 
 *  用数组实现，但是数组的长度是固定的，长度不好确定。
 *  所以我们使用集合实现：
 *  
 *  分析：
 *  	a:创建产生随机数的对象
 *  	b:创建一个存储随机数的集合。
 *  	c:定义一个统计变量，从0开始。
 *  	d:判断统计遍历是否小于10
 *  		是：先产生一个随机数，判断该随机数菜集合中是否存在。
 *  			如果不存在：就添加，统计变量++。
 *  			如果存在：就不搭理他
 *  		否：不搭理他
 *  	e:遍历集合
 *  
 */
public class RandomDmeo {
	public static void main(String[] args) {
		// 创建产生随机数的对象
		Random r = new Random();

		// 创建一个存储随机数的集合
		ArrayList<Integer> array = new ArrayList<Integer>();

		// 定义一个统计变量，从0开始。
		int count = 0;

		// 判断统计遍历是否小于10
		while (count < 10) {
			// 产生一个随机数
			int number = r.nextInt(20) + 1;

			// 判断该随机数菜集合中是否存在
			if (!array.contains(number)) {
				// 如果不存在：就添加，统计变量++。
				array.add(number);
				count++;
			}
		}

		// 遍历集合
		for (Integer i : array) {
			System.out.println(i);
		}
	}
}
