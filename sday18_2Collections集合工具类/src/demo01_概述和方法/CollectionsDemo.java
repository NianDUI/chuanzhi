package demo01_概述和方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  Collections: 是针对集合进行操作的工具类，都是静态方法
 *  
 *  面试题：
 *  	Collection和Collections的区别？
 * 		Collection：是单列集合的顶层接口。有接口List和Set。
 *  	Collections：是针对集合操作的工具类。有对集合进行排序和二分查找的方法。
 *  
 *  Collections类要知道的方法：
 *  a:排序
 *  	public static <T extends Comparable<? super T>> void sort(List<T> list)
 *  		根据元素的自然顺序 对指定列表按升序进行排序。
 *  	public static <T> void sort(List<T> list, Comparator<? super T> c)
 *  		根据指定比较器产生的顺序对指定列表进行排序。
 *  b:二分查找
 *  	public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
 *  		使用二分搜索法搜索指定列表，以获得指定对象。在进行此调用之前，必须根据列表元素的自然顺序对列表进行升序排序。
 *  	public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
 *  		使用二分搜索法搜索指定列表，以获得指定对象。在进行此调用之前，必须根据指定的比较器对列表进行升序排序。
 *  c:最大值
 *  	public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)
 *  		根据元素的自然顺序，返回给定 collection 的最大元素。
 *  	public static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp)
 *  		根据指定比较器产生的顺序，返回给定 collection 的最大元素。
 *  d:最小值
 *  	min
 *  e:反转
 *  	public static void reverse(List<?> list)
 *  		反转指定列表中元素的顺序。
 *  f:随机置换: 对元素位置进行随机调换
 *  	public static void shuffle(List<?> list)
 *  		使用默认随机源对指定列表进行置换。所有置换发生的可能性都是大致相等的。
 *  
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List<Integer> list = new ArrayList<Integer>();

		// 添加元素
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("list:" + list);
		
		// 排序:public static <T extends Comparable<? super T>> void sort(List<T> list)
//		Collections.sort(list);
//		System.out.println("list:" + list);
		// list:[10, 20, 30, 40, 50]
		
		// 二分查找：public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
		// 找不到时：是索引加1，取反
//		System.out.println("binarySearch:" + Collections.binarySearch(list, 30)); // 2
//		System.out.println("binarySearch:" + Collections.binarySearch(list, 300)); // -6
		
		// 最大值: public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)
//		System.out.println("max:" + Collections.max(list)); // 50
		
		// 反转: public static void reverse(List<?> list)
//		Collections.reverse(list);
//		System.out.println("list:" + list);
		
		
		// 随机置换: public static void shuffle(List<?> list)
		Collections.shuffle(list);
		System.out.println("list:" + list);
		
	}
}
