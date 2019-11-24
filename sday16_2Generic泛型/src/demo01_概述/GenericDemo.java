package demo01_概述;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList存储字符串并遍历\
 * 
 *  我们按照正确的写法来写这个程序，结果却出错了。
 *  为什么呢？
 *  	因为我们开始存储的时候，存储了String和Integer两种类型的数据。
 *  	而在遍历的时候，我们把他们都当做了String类型处理，做了转换，所以就报错了。
 *  但是呢，他在编译期间却没有告诉我们。
 *  所以，我就觉得这个设计的不好。
 *  回想一下，我们的数组
 *  	String[] strArray = new String[3];
 *  	strArray[0] = "hello";
 *  	strArray[1] = "world";
 *  	strArray[2] = 10; // 报错
 *  集合也模仿着数组的这种做法，在创建对象的时候，明确元素的数据类型，这样就不会再有问题了。
 *  而这种技术被称为：泛型。
 *  
 *  泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊类型。
 *  	也叫参数化类型，把类型当做参数一样的传递。
 *  格式：
 *  	<数据类型>
 *  	此处的数据类型只能是引用类型。
 *  
 *  好处：
 *  	a:把运行时期的问题提前到了编译期间。
 *  	b:避免了强制类型转换，
 *  	c:优化了程序设计，解决了黄色警告线。
 */
public class GenericDemo {
	public static void main(String[] args) {
		// 创建
		ArrayList<String> array = new ArrayList<String>();

		// 添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
//		array.add(new Integer(100));
//		array.add(10); // 只能是引用类型，JDK1.5自动装箱
		// 等价于：array.add(Integer.valueOf(10));

		// 遍历
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			// ClassCastException
//			String s = (String) it.next();
			String s = it.next();
			System.out.println(s);
		}

//		// 看下面的代码
//		String[] strArray = new String[3];
//		strArray[0] = "hello";
//		strArray[1] = "world";
//		strArray[2] = 10; // 报错
	}
}
