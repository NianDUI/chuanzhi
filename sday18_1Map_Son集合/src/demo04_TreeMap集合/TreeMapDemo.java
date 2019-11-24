package demo04_TreeMap集合;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap: 是基于红黑树的Map接口实现。
 *  	保证排序和唯一
 *  自然排序和比较器排序
 * 
 * TreeMap<String, String>:自然排序
 * 键：String
 * 值：String
 * 让元素所在的类实现Comparable接口。
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		TreeMap<String, String> tm = new TreeMap<String, String>();

		// 创建元素并添加元素
		tm.put("hello", "nihao");
		tm.put("world", "shijie");
		tm.put("java", "zhuwa");
		tm.put("world", "shijie2");
		tm.put("javaee", "zhuwaEE");

		// 遍历
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "-------" + value);
		}

	}
}
