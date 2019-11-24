package demo05_LinkedList实现栈结构;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList:
 *  请用LinkedList模拟栈数据结构的集合并测试
 *  
 *  题目的意思：
 *  	你自己定一个集合类，在这个集合类的内部可以使用LinkedList模拟。
 *  
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// a:LinkedList的特有添加功能addFirst();
		// b:栈的特点先进后出

		LinkedList link = new LinkedList();

		// 添加元素
		link.addFirst("hello");
		link.addFirst("world");
		link.addFirst("java");

		// 遍历
		Iterator it = link.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
		// 错误，为什么呢？
		
		
	}
}
