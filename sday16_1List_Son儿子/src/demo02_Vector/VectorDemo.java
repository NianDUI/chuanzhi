package demo02_Vector;

import java.util.Enumeration;
import java.util.Vector;

/*
 *  Vector的特有功能
 *  1：添加功能
 *  	public void addElement(E obj) -- add()
 *  		将指定的组件添加到此向量的末尾，将其大小增加 1。
 *  2：获取功能
 *  	public E elementAt(int index) -- get()
 *  		返回指定索引处的组件。 
 *  	public Enumeration<E> elements()：类似于迭代器  -- Iterator iterator()
 *  		返回此向量的组件的枚举。
 *  
 *  java.util 接口 Enumeration<E>：
 *  	boolean hasMoreElements() -- hasNext()
 *  		测试此枚举是否包含更多的元素。 
 *  	E nextElement() -- next()
 *  		如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。
 *  
 *  JDK升级的原因：
 *  	a:安全
 *  	b:效率
 *  	c:简化书写
 *  
 */
public class VectorDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Vector v = new Vector();
		
		// 添加功能
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		
		// 遍历
		for (int i = 0; i < v.size(); i++) {
			String s = (String) v.elementAt(i);
			System.out.println(s);
		}
		System.out.println("--------------");
		
		Enumeration en = v.elements(); // 返回数的是实现类的对象
		while (en.hasMoreElements()) {
			String s = (String) en.nextElement();
			System.out.println(s);
		}
	}
}
