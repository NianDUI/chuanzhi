package demo04_ArrayList案例_去除重复值;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList去除集合中字符串的重复值（字符串的内容相同）
 * 要求：不能创建新的集合，就在以前的集合上做。
 * 
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList array = new ArrayList();

		// 添加多个字符串元素（包含内容相同的）
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		
		// 有选择排序思想，我么可以通过这种思想做这个题目
		// 拿0索引的一次和后面的比较，有就把后面的干掉
		// 同理，拿1索引...
		for (int i = 0; i < array.size(); i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(i).equals(array.get(j))) {
					array.remove(j);
					j--; // 删了一个长度减一，下面元素上移，需要重新判断
				}
			}
		}
		
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
	}
}
