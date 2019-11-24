package demo01_Map集合概述和特点;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历：
 *  Map -- 夫妻对
 *  方式2:根据键值对对象找键和值
 *  思路：
 *  	a:获取所有结婚证的集合
 *  	b:遍历结婚证的集合，得到每一个结婚证
 *  	c:根据结婚证获取丈夫和妻子
 *  
 *  转换：
 *  	a:获取所有键值对对象的集合
 *  	b:遍历键值对对象的集合，得到每一个键值对对象。
 *  	c:根据键值对对象获取键和值。
 *  
 *  这里面最麻烦的就是键值对对象如何表示呢？
 *  看看我们开始的一个方法。
 *  
 * 获取功能
 *  	Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合
 *  		返回此映射中包含的映射关系的 Set 视图。
 *  
 *  Entry：实体
 *  
 *  public static interface Map.Entry<K,V>:
 *   	boolean equals(Object o)
 *   		比较指定对象与此项的相等性。 
 *   	K getKey() 
 *  		返回与此项对应的键。 
 *   	V getValue() 
 *  		返回与此项对应的值。 
 *   	int hashCode() 
 *  		返回此映射项的哈希码值。 
 *   	V setValue(V value)
 *   		用指定的值替换与此项对应的值（可选操作）。
 *  
 */
public class MapDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		// 创建元素并添加元素
		map.put("杨过", "小龙女");
		map.put("郭靖", "黄蓉");
		map.put("杨康", "穆念慈");
		map.put("陈玄风", "梅超风");

		// 遍历
		// a:获取所有键值对对象的集合
		Set<Map.Entry<String, String>> set = map.entrySet();
		// b:遍历键值对对象的集合，得到每一个键值对对象。
		for (Map.Entry<String, String> me : set) {
			// c:根据键值对对象获取键和值。
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "---" + value);
		}

	}
}
