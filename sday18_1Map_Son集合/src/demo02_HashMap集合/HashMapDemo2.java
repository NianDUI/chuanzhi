package demo02_HashMap集合;

import java.util.HashMap;
import java.util.Set;

/*
 *  HashMap<Integer, String>
 *  键：Integer
 *  值：String
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// 创建元素并添加元素
		hm.put(27, "林青霞");
		hm.put(30, "风清扬");
		hm.put(28, "刘意");
		hm.put(29, "林青霞");

		// 下面的写法是八进制，但是不能出现八以上的单个数据。
//		hm.put(003, "hello");
//		hm.put(004, "hello");
//		hm.put(007, "hello");
//		hm.put(008, "hello"); // 报错

		// 遍历
		Set<Integer> set = hm.keySet();
		for (Integer key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}

		// 下面这种方式仅仅是集合元素的字符串表示。
		System.out.println("hm:" + hm);
	}
}
