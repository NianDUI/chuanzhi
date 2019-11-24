package demo04_列表迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 *  列表迭代器
 *  	ListIterator<E> listIterator()：List特有的迭代器
 *  	该迭代器继承了Iterator迭代器，所以就可以直接使用hasNext()和next()方法。
 *  
 *  特有功能：
 *  E previous()：获取上一个元素
 *  boolean hasPrevious()：判断是否上一位置是否有元素
 *  
 *  注意：ListIterator可以实现逆向遍历，但必须先正向遍历，才能逆向遍历。
 *  	所以一般无意义，不使用。
 *  
 * public interface ListIterator<E>extends Iterator<E>：
	 boolean hasNext() 
	          以正向遍历列表时，如果列表迭代器有多个元素，则返回 true（换句话说，如果 next 返回一个元素而不是抛出异常，则返回 true）。 
	 E next() 
	          返回列表中的下一个元素。 
	 int nextIndex() 
	          返回对 next 的后续调用所返回元素的索引。 
	 boolean hasPrevious() 
	          如果以逆向遍历列表，列表迭代器有多个元素，则返回 true。 
	 E previous() 
	          返回列表中的前一个元素。 
	 int previousIndex() 
	          返回对 previous 的后续调用所返回元素的索引。 
	 void add(E e) 
	          将指定的元素插入列表（可选操作）。 在由 next 或 previous 返回的最后一个元素位置
	 void remove() 
	          从列表中移除由 next 或 previous 返回的最后一个元素（可选操作）。 
	 void set(E e) 
	          用指定元素替换 next 或 previous 返回的最后一个元素（可选操作）。 

 *  
 */
public class ListDemo {
	public static void main(String[] args) {
		// 创建List集合对象
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");

		// ListIterator<E> listIterator()：List特有的迭代器
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String) lit.next();
			System.out.println(s);
		}
		// 逆向遍历列表
		while (lit.hasPrevious()) {
			String s = (String) lit.previous();
			System.out.println(s);
		}
		System.out.println("------------");

		// 迭代器
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println("------------");

	}
}
