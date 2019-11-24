package demo03_迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import demo02_练习toArray.Student;

/*
 * Iterator<E> iterator()：迭代器,集合的专用遍历方式
 * 
 * java.util 接口 Iterator<E>：
 *  boolean hasNext()
 *  	如果仍有元素可以迭代，则返回 true。
 *  E next()
 *  	返回迭代的下一个元素。 
 *  
 *  	NoSuchElementException：没有这样的元素异常，因为你已经找到最后了
 *  void remove()
 *  	从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
 *  	每次调用 next 只能调用一次此方法。
 *  	如果进行迭代时用调用此方法之外的其他方式修改了该迭代器所指向的 collection，
 *  	则迭代器的行为是不确定的。 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		// 创建集合对象。
		Collection c = new ArrayList();

		// 创建学生对象。
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		Student s3 = new Student("令狐冲", 33);
		Student s4 = new Student("吴鑫", 25);
		Student s5 = new Student("刘晓曲", 22);

		// 把学生添加到集合。
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// Iterator<E> iterator()：迭代器,集合的专用遍历方式
		Iterator it = c.iterator(); // 实际返回的肯定是此类对象，这里是多态。
		// 先判断是否有下一个元素
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
//		it.next(); // NoSuchElementException
	}
}
