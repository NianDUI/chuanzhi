package demo01_集合概述;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  
 *  集合的由来：
 *  	。。。。
 *  
 *  数组和集合的区别：
 *  	a:长度区别
 *  		数组的长度不变
 *  		集合的长度可变
 *  	b:内容不容
 *  		数组存储的是同一种类型的元素
 *  		而集合可以存储不同类型的元素
 *  	c:元素的数据类型问题
 *  		数组可已存储基本数据类型，也可已存储引用数据类型
 *  		集合只能存储引用类型
 *  
 *  集合类的特点：
 *  	..
 *  
 *  刚说过集合是存储多个元素的，但是呢，存储多个元素我们也是有同的需求的。
 *  	比如说：我要这多个元素中不能有相同的元素。再比如说，我要这多个元素按照某种规则排序一下。
 *  
 *  针对不同的需求，java提供了不同的集合类，这样的java就提供了很多个集合类。
 *  这多个集合类的数据结构不同，结构不同，不重要的。重要的是你要能够存储东西，并且还能够使用这些东西，比如说判断，获取等。
 *  既然这样，那么，这多个集合类是有共性的内容的我们把这些集合类的共性内容不断的向上提取，最终就能形成集合的继承体系结构。
 *  
 *  数据结构：数据的存储方式。
 *  	
 *  Collection：是集合的顶层接口，他的子体系有重复的，有唯一的，有有序的，有无序的（后面讲解）
 *  
 *  collection的功能概述：
 *  	1:添加功能
 *  		boolean add(E e) // boolean add(Object o) 添加一个元素
 *  		boolean addAll(Collection<? extends E> c)：添加一个集合的元素
 *  	2:删除功能
 *  		void clear()：移除此 collection 中的所有元素（可选操作）。
 *  		boolean remove(Object o)：移除一个指定的元素
 *  		boolean removeAll(Collection<?> c)：移除集合中指定集合中的所有元素		
 *  
 *  	3:判断功能
 *  		boolean contains(Object o)：判断集合中是否包含指定的元素。
 *  		boolean containsAll(Collection<?> c)：判断集合中是否包含指定的集合所有元素
 *  		boolean isEmpty()：判断结合是否为空，
 *  	
 *  	4:获取功能
 *  		Iterator<E> iterator()：（重点）返回在此 collection 的元素上进行迭代的迭代器
 *  
 *  	5:长度功能
 *  		int size()：返回此 collection 中的元素数。
 *  		面试题：数组有没有length()方法呢？字符串有没有length()方法呢？集合有没有length()方法呢？
 *  
 *  	6:交集功能
 *  		boolean retainAll(Collection<?> c)：两个集合都有的元素，思考元素去哪了，返回的boolean是什么意思
 *  			移除此 collection 中未包含在指定 collection 中的所有元素。
 *  	7:把集合转换为数组
 *  		Object[] toArray()
 *  
 */
public class CollectionDemo {
	public static void main(String[] args) {
		// 测试不带All的方法
		
		// 创建集合对象
//		Collection c = new Collection(); // 错误，因为接口不能实例化
		Collection c = new ArrayList();
		
		// boolean add(E e)：添加一个元素
//		System.out.println("add:" + c.add("hello")); // true
		c.add("hello");
		c.add("world");
		c.add("java");
		
		// void clear()：移除所有元素
//		c.clear();
		
		// boolean remove(Object o)：移除一个指定的元素
//		System.out.println("remove:" + c.remove("hello"));
//		System.out.println("remove:" + c.remove("javaee")); // false
		
		// boolean contains(Object o)：判断集合中是否包含指定的元素。
//		System.out.println("contains:" + c.contains("hello"));
//		System.out.println("contains:" + c.contains("android"));
		
		// boolean isEmpty()：判断结合是否为空，
		System.out.println("isEmpty:" + c.isEmpty());
		
		// int size()：元素数。
		System.out.println("size:" + c.size());
		
		
		System.out.println("c:" + c);
		
		
	}
}
