package demo04_LinkedHashSet概述;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet: 底层数据机构由哈希表和链表组成
 *  具有可预知迭代顺序的 Set 接口的哈希表和链接列表实现
 *  
 *  HashSet：子类
 *  	LinkedHashSet
 *  
 *  哈希表保证了元素的唯一性。
 *  链表保证元素有序。（存储和取出一致）
 *  
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		// 创建并添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		hs.add("java");

		// 遍历
		for (String s : hs) {
			System.out.println(s);
		}
		/*
		 * hello world java
		 */
	}
}
