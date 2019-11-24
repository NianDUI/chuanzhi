package demo04_ArrayList案例_去除重复值;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList去除集合中字符串的重复值（字符串的内容相同）
 * 
 * 思路：
 * 	创建一个新集合，先集合中没有就添加，有就不添加
 * 
 * 分析：
 * 	a:创建集合对象
 *  b:添加多个字符串元素（包含内容相同的）
 *  c:创建新集合
 *  d:遍历旧集合，获取到每一个元素
 *  e:拿到这个元素到新集合中去找，看有没有
 *  	有：不搭理他
 *  	没有：就添加到新集合
 *  f:遍历新集合
 * 
 */
public class ArrayListDemo {
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

		// 创建新集合
		ArrayList newArray = new ArrayList();

		// 遍历旧集合，获取到每一个元素
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			
			// 拿到这个元素到新集合中去找，看有没有
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}
		
		// 遍历新集合
		for (int i = 0; i < newArray.size(); i++) {
			String s = (String) newArray.get(i);
			System.out.println(s);
		}
	}
}
