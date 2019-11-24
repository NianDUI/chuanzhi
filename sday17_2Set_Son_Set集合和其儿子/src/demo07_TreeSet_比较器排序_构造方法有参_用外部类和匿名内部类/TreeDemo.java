package demo07_TreeSet_比较器排序_构造方法有参_用外部类和匿名内部类;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 比较器排序
 * 需求：请按照姓名的长度排序
 * 
 * 主要条件,姓名的长度相同
 * 次要条件1：姓名的长度相同,不带表姓名的内容相同
 * 次要条件2：姓名的长度和内容相同，不代表年龄相同
 * 
 *  TreeSe集合保证元素排序和唯一性的原理
 *  	唯一性：是根据比较的返回是否是0来决定的。
 *  	排序：
 *  		a:自然排序(元素具备比较性)
 *  			让元素所属的类实现自然排序接口Comparable
 *  		b:比较器排序(集合具备比较性)
 *  			让集合的构造方法接收一个比较器接口的子类对象Comparator
 */
public class TreeDemo {
	public static void main(String[] args) {
		// 创建集合对象
//		TreeSet<Student> ts = new TreeSet<Student>(); // 自然排序
		// public TreeSet(Comparator<? super E> comparator) // 比较器排序
		// E-->Student
//		TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());

		// 如果一个方法的参数是接口，那么真正要的是接口的实现类的对象
		// 而匿名累不累就可以实现这个东西。
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// 姓名长度
				int num = s1.getName().length() - s2.getName().length();
				// 姓名内容
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				// 年龄
				int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
				return num3;
			}
		});

		// 创建元素
		Student s1 = new Student("lingqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("lingqingxia", 27);
		Student s5 = new Student("lingqingxia", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingyang", 22);
		Student s8 = new Student("lingqingxia", 29);

		// 添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// 遍历
		for (Student s : ts) {
			System.out.println(s);
		}
	}

}
