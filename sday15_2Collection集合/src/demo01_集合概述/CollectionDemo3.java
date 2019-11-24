package demo01_集合概述;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合的遍历：依次获取集合当中的每一个元素
 * 
 * Object[] toArray()：把集合转换为数组，可以实现比集合的遍历
 * 
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();
		
		// 添加元素
		c.add("hello"); // Object obj = "hello"; 向上转型
		c.add("world");
		c.add("java");
		
		// 遍历
		// Object[] toArray()：把集合转换为数组，可以实现比集合的遍历
		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++) {
			// System.out.println(objs[i]);
			// 我知道元素是字符串，我在获取到元素的同时，还想知道元素的长度。
			// 向下转型
			String s = (String) objs[i];
			System.out.println(s + "---" + s.length());
			
		}
		
	}
}
