package demo01_Map集合概述和特点;

import java.util.HashMap;
import java.util.Map;

/*
 *  作为学生来说，是根据学号来区分不同的学生的。
 *  那么假设我现在已经知道了学生的学号，我要根据学生的学号去获取学生的姓名。
 *  怎么做呢？
 *  如果采用前面的讲解过的集合，我们只能把学号和学生姓名作为一个对象的成员，
 *  然后存储整个对象将来便利的时候。判断，获取对应的名称。
 *  但是呢，如果我都能把学生的姓名拿出来了，还需要根据编号去找吗？
 *  
 *  针对我们目前的这种需求：
 *  	仅仅知道学号，就想知道学生姓名的情况，咋们提供了一种新的集合Map。
 *  	通过查看API，我们知道了Map集合的一个最大的特点，就是它可以存储键值对的元素。
 *  	这个时候存储我们上面的需求	，就可以这样做。 
 *  		学号1	姓名1
 *  		学号2	姓名2
 *  		学号3	姓名3
 *  		学号2(不行)	姓名4
 *  		学号4	姓名3(可以)
 *  
 *  public interface Map<K,V>：（特点）
 *  	将键映射到值的对象。
 *  	一个映射不能包含重复的键；每个键最多只能映射到一个值。 
 *  
 *  K - 此映射所维护的键的类型
 *  V - 映射值的类型
 *  
 *  Map集合和Collection集合的区别？
 *  	Map集合存储元素是成对出现的，Map集合的键是唯一的值可以重复。可以把这个理解为：夫妻对
 *  	Collection集合存储元素是单独出现的，Collection的儿子Set是唯一的，List是可以重复的。可以把这个理解为：光棍
 *  
 *  注意：
 *  	Map集合的数据结构针对键有效，跟值无关
 *  	Collection集合的数据结构是针对元素有效的
 *  
 *  Map：
 *  	HashMap
 *  	TreeMap
 *  
 *  Map集合的功能概述：
 *  1：添加功能
 *  	V put(K key, V value)：添加元素。这个其实还有另一个功能？
 *  		如果键，是第一次存储和就直接存储元素，返回null
 *  		如果见不是第一次存储，就用值把以前的值替换掉，返回以前的值。
 *  	
 *  		将指定的值与此映射中的指定键关联（可选操作）。
 *  	void putAll(Map<? extends K,? extends V> m)：
 *  2：删除功能
 *  	void clear()：移除所有的键值对元素
 *  	V remove(Object key)：根据键删除键值对元素，并把值返回
 *  		如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
 *  3：判断功能
 *  	boolean containsKey(Object key)：判断集合是否包含指定的键
 *  		如果此映射包含指定键的映射关系，则返回 true。
 *  	boolean containsValue(Object value)：判断集合是否包含指定的值
 *  		如果此映射将一个或多个键映射到指定值，则返回 true。
 *  	boolean isEmpty()：判断集合是否为空
 *  		如果此映射未包含键-值映射关系，则返回 true。 
 *  4：获取功能
 *  	Set<Map.Entry<K,V>> entrySet()：获取所有键值对对象的集合
 *  		返回此映射中包含的映射关系的 Set 视图。
 *  	V get(Object key)：根据键获取值
 *  		返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。 
 *  	Set<K> keySet()：获取集合中所有键的集合
 *  		返回此映射中包含的键的 Set 视图。
 *  	Collection<V> values()：获取集合中所有值的集合
 *  		返回此映射中包含的值的 Collection 视图
 *  5：长度功能
 *  	int size()：返回集合中的键值对的对数
 *  		返回此映射中的键-值映射关系数。
 *  
 *  
 *  
 */
public class MapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();
		
		// 添加元素
		// V put(K key, V value)：添加元素。这个其实还有另一个功能？
//		System.out.println("put:" + map.put("文章", "马伊琍"));
//		System.out.println("put:" + map.put("文章", "姚笛"));
		
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("周杰伦", "蔡依林");
		map.put("刘恺威", "杨幂");
		
		// void clear()：移除所有的键值对元素
//		map.clear();
		
		// V remove(Object key)：根据键删除键值对元素，并把值返回
		// 存在返回键，不存在返回null
//		System.out.println("remove:" + map.remove("黄晓明")); // remove:杨颖
//		System.out.println("remove:" + map.remove("黄海波")); // remove:null
		
		// boolean containsKey(Object key)：判断集合是否包含指定的键
//		System.out.println("containsKey:" + map.containsKey("黄晓明")); // containsKey:true
//		System.out.println("containsKey:" + map.containsKey("黄海波")); // containsKey:false
		
		// boolean isEmpty()：判断集合是否为空
//		System.out.println("isEmpty:" + map.isEmpty());
		
		// int size()：返回集合中的键值对的对数
		System.out.println("size:" + map.size());
		
		// 输出集合名称
		System.out.println("map:" + map); 
	}
}
