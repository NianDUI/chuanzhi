package demo01_Map集合概述和特点;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 获取功能
 *  	V get(Object key)：根据键获取值
 *  		返回指定键所映射的值；
 *  		如果此映射不包含该键的映射关系，则返回 null。 
 *  	Set<K> keySet()：获取集合中所有键的集合
 *  		返回此映射中包含的键的 Set 视图。
 *  	Collection<V> values()：获取集合中所有值的集合
 *  		返回此映射中包含的值的 Collection 视图
 */
public class MapDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();
		
		// 创建元素并添加元素
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("周杰伦", "蔡依林");
		map.put("刘恺威", "杨幂");
		
		// V get(Object key)：根据键获取值
		System.out.println("get:" + map.get("周杰伦"));
		System.out.println("get:" + map.get("周杰")); // get:null
		
		System.out.println("---------------");
		
		// Set<K> keySet()：获取集合中所有键的集合
		Set<String> set = map.keySet();
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("---------------");
		
		// Collection<V> values()：获取集合中所有值的集合
		Collection<String> con = map.values();
		for (String s : con) {
			System.out.println(s);
		}
		
		// 
		
	}
}
