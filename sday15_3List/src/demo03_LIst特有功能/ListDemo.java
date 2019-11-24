package demo03_LIst特有功能;

import java.util.ArrayList;
import java.util.List;

/*
 * LIst集合特有功能：
 *  a:添加功能
 *  	void add(int index, E element)：在列表的指定位置插入指定元素（可选操作）。
 *  	boolean addAll(int index, Collection<? extends E> c)
 *  		将指定 collection 中的所有元素都插入到列表中的指定位置（可选操作）。
 *  b:获取功能
 *  	E get(int index)：返回列表中指定位置的元素。
 *  	int indexOf(Object o)
 *  		返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
 *  	int lastIndexOf(Object o)
 *  		返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
 *  c:列表迭代器
 *  	ListIterator<E> listIterator()：List特有的迭代器
 *  		返回此列表元素的列表迭代器（按适当顺序）。
 *  	ListIterator<E> listIterator(int index)
 *  		返回列表中元素的列表迭代器（按适当顺序），
 *  		从列表的指定位置开始。
 *  d:删除功能
 *  	E remove(int index)：根据索引删除元素，返回从被移除的元素。
 *  		移除列表中指定位置的元素（可选操作）。将所有的后续元素向左移动（将其索引减 1）。
 *  		返回从列表中移除的元素。
 *  e:修改功能
 *  	E set(int index, E element)：根据索引修改元素，返回修改前的元素
 *  		用指定元素替换列表中指定位置的元素（可选操作）。
 *  f:截取功能
 *  	List<E> subList(int fromIndex, int toIndex)
 *  		返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。（
 *  
 */
public class ListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();
		
		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		// void add(int index, E element)：在列表的指定位置插入指定元素（可选操作）。
		// 在集合长度位置添加可以，大于出错
//		list.add(1, "android");
//		// IndexOutOfBoundsException: Index: 11, Size: 4索引越界
//		list.add(11, "android"); // 有问题
//		list.add(3, "javaee"); // 没有问题
//		list.add(4, "javaee"); // 有问题
		
		// E get(int index)：返回列表中指定位置的元素。
//		System.out.println("get:" + list.get(1)); 
//		// IndexOutOfBoundsException
//		System.out.println("get:" + list.get(11));  // 索引越界
		
		//  remove(int index)：根据索引删除元素，返回从被移除的元素。
//		System.out.println("remove:" + list.remove(1));
////		// IndexOutOfBoundsException
//		System.out.println("remove:" + list.remove(11));
		
		// E set(int index, E element)：根据索引修改元素，返回修改前的元素
		System.out.println("set:" + list.set(1, "javaee"));
		
		
		System.out.println("list:" + list);
	}
}
