package demo01_增强for;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList存储自定义对象并遍历，要求加入泛型，并用增强for遍历。
 * a:迭代器
 * b:普通for
 * c:增强for
 * 
 * LinkedList, Vector,Collection,List等存储我还讲么？不讲了，但是要求你们练习
 * 
 * 增强for：是用来替代迭代器的
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		// 创建学生对象
		Student s1 = new Student("a", 27);
		Student s2 = new Student("b", 22);
		Student s3 = new Student("c", 24);
		Student s4 = new Student("d", 21);
		Student s5 = new Student("e", 21);
		
		
		// 创建并添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
		// 遍历集合
		// 迭代器
		Iterator<Student> it =  array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		// 普通for
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s);
		}
		System.out.println("-----------");
		
		// 增强for
		for (Student s : array) {
			System.out.println(s);
		}
		
		
	}
}
