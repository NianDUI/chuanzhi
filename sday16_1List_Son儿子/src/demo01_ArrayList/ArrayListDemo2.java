package demo01_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList存储自定义对象并遍历
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList array = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("武松", 30);
		Student s2 = new Student("鲁智深", 40);
		Student s3 = new Student("林冲", 36);
		Student s4 = new Student("杨志", 38);
		
		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		// 遍历
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		for (int i = 0;  i < array.size(); i++) {
			Student s = (Student) array.get(i);
			System.out.println(s);
		}
		
	}
}
