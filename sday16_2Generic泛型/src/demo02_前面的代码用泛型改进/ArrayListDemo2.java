package demo02_前面的代码用泛型改进;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 存储自定义对象并遍历。
 * 
 * a:创建学生类。
 * b:创建集合对象。
 * c:创建元素对象。
 * d:把元素添加到集合，
 * e:遍历集合。
 * 
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象。
		// JDK7的新特性：泛型推断。
//		ArrayList<Student> array = new ArrayList<>();
		// 但是我不建议这样使用。
		ArrayList<Student> array = new ArrayList<Student>();
		
		// 创建学生对象。
		Student s1 = new Student("曹操", 40);
		Student s2 = new Student("蒋干", 30);
		Student s3 = new Student("诸葛亮", 26);
		
		// 把元素添加到集合，
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		// 遍历集合。
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s);
		}
		
	}
}
