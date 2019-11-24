package demo03_可变参数的概述和使用;

import java.util.Arrays;
import java.util.List;

/*
 * 
 *  Arrays工具类中的一个方法
 *  	public static <T> List<T> asList(T... a)
 *  		把数组转换成集合
 *  		返回一个受指定数组支持的固定大小的列表。
 *  	可变参数：想给你几个就给你几个
 *  注意事项：
 *  	虽然可以把数组转成集合，但集合的长度不能改变。
 *  原因：是因为其集合的本质还是数组
 */
public class ArraysDemo {
	public static void main(String[] args) {
		// 定义一个数组
//		String[] strArray = { "hello", "world", "java" };
//		List<String> list = Arrays.asList(strArray);

		List<String> list = Arrays.asList();
		list = Arrays.asList("hello");
		list = Arrays.asList("hello", "world");
		list = Arrays.asList("hello", "world", "java");

		// UnsupportedOperationException 不支持的操作异常
//		list.add("javaee");
		// UnsupportedOperationException 不支持的操作异常
//		list.remove("javaee");
		list.set(1, "javaee"); // 修改可以

		for (String s : list) {
			System.out.println(s);
		}
	}
}
