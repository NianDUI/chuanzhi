package demo03_LinkedList特有功能;

import java.util.LinkedList;

/*
 * LinkedList的特有功能：
 *  a:添加功能
 *  	public void addFirst(E e)
 *  		将指定元素插入此列表的开头。 
 *  	public void addLast(E e)
 *  		将指定元素添加到此列表的结尾。 
 *  b:获取功能
 *  	public E getFirst()
 *  		返回此列表的第一个元素。 
 *  	public E getLast()
 *  		返回此列表的最后一个元素。
 *  c:删除功能
 *  	public E removeFirst()
 *  		移除并返回此列表的第一个元素。 
 *  	public E removeLast()
 *  		移除并返回此列表的最后一个元素。 
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedList link = new LinkedList();

		// 添加元素
		link.add("hello");
		link.add("world");
//		link.addLast("android"); // link:[hello, world, java, android]
		link.add("java");

		// public void addFirst(E e)
//		link.addFirst("javaee");

		// public void addLast(E e)
//		link.addLast("android");
		
		// public E getFirst()
//		System.out.println("getFirst:" + link.getFirst());
		
		// public E getLast()
//		System.out.println("getLast:" + link.getLast());
		
		// public E removeFirst()
		System.out.println("removeFirst:" + link.removeFirst());
		
		// public E removeLast()
		System.out.println("removeLast:" + link.removeLast());
		
		// 输出对象名
		System.out.println("link:" + link);
	}
}
