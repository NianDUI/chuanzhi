package demo08_产生10个1到20之间的随机数要求不能重复;

import java.util.HashSet;
import java.util.Random;

/*
 * 编写一个程序,获取10个1到20之间的随机数要求不能重复;
 * 
 * Set集合保证了唯一，长度size()方法保证
 * HashSet,唯一，无序
 * 
 * 分析：
 *  	a:创建随机数对象。
 *  	b:创建一个HashSet集合。
 *  	c:判断集合的长度是不是小于10。
 *  		是：就创建一个随机数添加。
 *  		不是：不搭理他
 *  	d:遍历HashSet集合。
 *  
 */
public class HashSetDemo {
	public static void main(String[] args) {
		// 创建随机数对象。
		Random r = new Random();
		
		// 创建一个HashSet集合。
		HashSet<Integer> ts = new HashSet<Integer>();
		
		// 判断集合的长度是不是小于10。
		while (ts.size() < 10) {
			int num = r.nextInt(20)  + 1;
			ts.add(num);
		}
		
		// 遍历Set集合。
		for (Integer i : ts) {
			System.out.println(i);
		}
		
	}
}
