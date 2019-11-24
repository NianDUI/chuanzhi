package demo01_集合概述;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 谁调方法，谁变
 * 
 *  boolean addAll(Collection<? extends E> c)：添加一个集合的元素
 *  boolean removeAll(Collection<?> c)：移除集合中指定集合中的所有元素		
 *  boolean containsAll(Collection<?> c)：判断集合中是否包含指定的集合所有元素
 *  boolean retainAll(Collection<?> c)：两个集合都有的元素，思考元素去哪了，返回的boolean是什么意思
 *  	返回值表示的是a是否发生改变
 *  
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		// 创建集合1
		Collection c1 = new ArrayList<>();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// 创建集合2
		Collection c2 = new ArrayList<>();
//		c2.add("abc1");
//		c2.add("abc2");
//		c2.add("abc3");
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");

		// boolean addAll(Collection<? extends E> c)：添加一个集合的元素
//		System.out.println("addAll：" + c1.addAll(c2));

		// boolean removeAll(Collection<?> c)：移除集合中指定集合中的所有元素
		// 只要有一个元素被移除了,就返回ture。
//		System.out.println("removeAll：" + c1.removeAll(c2));

		// boolean containsAll(Collection<?> c)：判断集合中是否包含指定的集合所有元素
		// 只有包含所有的元素,才返回ture。
//		System.out.println("containsAll：" + c1.containsAll(c2));

		// boolean retainAll(Collection<?> c)：两个集合都有的元素，思考元素去哪了，返回的boolean是什么意思
		// 假设有两个集合a，b
		// a对b做交集，最终集合保存在a中，b不变。
		// 返回值表示的是a是否发生改变
		System.out.println("retainAll：" + c1.retainAll(c2));
		
		System.out.println("c1：" + c1);
		System.out.println("c1：" + c2);

	}
}
