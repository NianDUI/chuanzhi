package demo03_LIst特有功能;

import java.util.List;
import java.util.ArrayList;

/*
 * 集合的遍历
 * List集合特有遍历功能：
 * 		size()和get()功能结合
 */
public class ListDemo02 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 添加元素 
		list.add("hello");
		list.add("world");
		list.add("java");

		// E get(int index)：返回列表中指定位置的元素。
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		// IndexOutOfBoundsException
//		System.out.println(list.get(3));

		// 用循环改进
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}
	}
}
