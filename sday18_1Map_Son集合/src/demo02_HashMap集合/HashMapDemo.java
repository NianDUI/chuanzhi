package demo02_HashMap集合;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap集合：
 *  基于哈希表的 Map 接口的实现。
 *  哈希表的作用是用来保证键的唯一性。
 *  
 *  此实现提供所有可选的映射操作，并允许使用 null 值和 null 键。
 *  
 *  HashMap<String, String>
 *  键：String
 *  值：String
 *  
 *  元素的hashCode()和equals()方法
 */
public class HashMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, String> hm = new HashMap<String, String>();

		// 创建元素并添加元素
		hm.put("it001", "马云");
		hm.put("it003", "马化腾");
		hm.put("it004", "乔布斯");
		hm.put("it005", "张朝阳");
		hm.put("it002", "裘伯君");
		hm.put("it001", "比尔盖茨");

		// 遍历
		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}

	}
}
