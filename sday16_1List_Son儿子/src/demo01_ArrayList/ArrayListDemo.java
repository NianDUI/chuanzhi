package demo01_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * LIst子类特点：
 *  	ArrayList：
 *  		底层数据结构是数组，查询快，增删慢。
 *  		线程不安全，效率高。
 *  	Vector：
 *  		底层数据结构是数组，查询快，增删慢。
 *  		线程安全，效率低。
 *  	LinkedList：
 *  		底层数据库是链表，查询慢，增删块。
 *  		线程不安全，效率高。
 *  
 *  案例：
 *  	使用List的任何子类存储字符串或者存储自定义对象并遍历
 *  
 *  ArrayList的使用：
 *  	存储字符串并遍历
 *  
 *  		
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList array = new ArrayList();
		
		// 创建元素对象并添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		
		// 遍历
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println("------------");
		
		for (int i = 0; i < array.size(); i++) {
			String s = (String) array.get(i);
			System.out.println(s);
		}
		
	}
}
