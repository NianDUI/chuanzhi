package demo04_Collection练习;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 存储字符串并遍历
 * 
 * 分析：
 * 	a:创建集合对象
 *  b:创建字符串对象
 *  c:把字符串添加到集合中
 *  d:遍历集合
 */
public class CollectionTest {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();
		
		// 创建字符串对象
		// 把字符串添加到集合中
		c.add("林青霞");
		c.add("风清扬");
		c.add("刘意");
		c.add("吴鑫");
		c.add("刘晓曲");
		
		// 遍历集合
		// 通过集合对象获取迭代器对象。
		Iterator it = c.iterator();
		// 通过迭代器对象的hasNext()方法判断有没有，
		while (it.hasNext()) {
			// 通过迭代器对象的next()方法获取元素。
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
