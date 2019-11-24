package demo01_Map集合概述和特点;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历：
 *  Map -- 夫妻对
 *  方式1:根据键找值
 *  思路：
 *  	a:把所有的丈夫给集中起来。
 *  	b:遍历丈夫的集合,获取得到每一个丈夫。
 *  	c:让丈夫去找自己的妻子。
 *  转换：
 *  	a:获取所有的键
 *  	b:遍历键的集合，获取得到每一个键。
 *  	c:根据键去找值。
 *  
 */
public class MapDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		// 创建元素并添加元素
		map.put("杨过", "小龙女");
		map.put("郭靖", "黄蓉");
		map.put("杨康", "穆念慈");
		map.put("陈玄风", "梅超风");

		// 遍历
		// 1:Map -- 夫妻对
		// a:获取所有的键
		Set<String> set = map.keySet();
		// b:遍历键的集合，获取得到每一个键。
		for (String key : set) {
			// c:根据键去找值。
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
