package demo04_列表迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 *  问题？
 *  	我有一个集合元素。如下，请问我想判断里面有没有"word"这个元素，
 *  	如果有，我就添加一个"javaee"元素，倾斜代码实现
 *  
 *  ConcurrentModificationException
 *  	当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。 
 *  产生原因：
 *  	迭代器是依赖于集合而存在的，在判断成功后，集合中新添加了元素。
 *  	而迭代器却不知道，所以就报错了，这个错叫并发修改异常。
 *    其实这个问题描述的是：迭代器遍历元素的时候，通过集合是不能修改元素的。
 *  
 *  如何修改呢？
 *  a:迭代器迭代元素，迭代器修改元素。
 *  	元素是跟在刚才迭代的元素后面的。
 *  b:集合遍历元素，集合修改元素（普通for循环）。
 *  	元素在最后添加的。
 *  
 */
public class ListDemo2 {
	public static void main(String[] args) {
		// 创建List集合对象
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");

		// 迭代器遍历
		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			String s = (String) it.next();
//			if ("world".equals(s)) {
//				// ConcurrentModificationException
//				list.add("javaee");
//			}
//		}
		
		// 方式一:迭代器迭代元素，迭代器修改元素。
		// 而Iterator迭代器却没有添加功能，所以我们使用其子类接口ListIterator。
//		ListIterator lit = list.listIterator();
//		while (lit.hasNext()) {
//			String s = (String) lit.next();
//			if ("world".equals(s)) {
//				lit.add("javaee");
//			}
//		}
		
		// 方式2：集合遍历元素，集合修改元素（普通for循环）。
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			if ("world".equals(s)) {
				list.add("javaee");
			}
		}
		
		System.out.println("list:" + list);

	}
}
