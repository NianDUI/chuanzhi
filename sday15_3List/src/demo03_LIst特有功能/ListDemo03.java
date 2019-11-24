package demo03_LIst特有功能;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 存储自定义对象并遍历，用普通for循环。（size和get结合）
 */
public class ListDemo03 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("林黛玉", 18);
		Student s2 = new Student("刘姥姥", 88);
		Student s3 = new Student("王熙凤", 38);

		// 把学生对象添加到集合对象中
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// 遍历
		// 迭代器遍历
		Iterator it  = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
		System.out.println("----------");
		
		// 普通for循环
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			System.out.println(s);
		}
	}
}
