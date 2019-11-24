package demo04_Collection练习;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储自定义对象并遍历Student(name, age)
 * 分析：
 *  a:创建学生类
 *  b:创建集合对象
 *  c:创建学生对象
 *  d:把学生对象添加到集合对象
 *  e:遍历集合
 */
public class CollectionTest2 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();
		
		// 创建学生对象
		Student s1 = new Student("貂蝉", 25);
		Student s2 = new Student("小乔", 16);
		Student s3 = new Student("黄月英", 20);
		Student s4 = new Student();
		s4.setName("大乔");
		s4.setAge(26);
		
		// 把学生对象添加到集合对象
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(new Student("孙尚香", 18)); // 匿名对象
		
		// 遍历集合
		Iterator it = c.iterator();
		
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" +s.getAge());
		}
	}
}
