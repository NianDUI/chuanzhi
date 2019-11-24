package demo06_TreeSet例子2_自然排序_多个次要条件;

/*
 * 如果一个类的元素想要能够进行自然排序，就必须实现自然排序接口。
 *  
 */
public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student s) {
		// 主要条件,姓名的长度相同
		int num = this.name.length() - s.name.length();
		// 姓名的长度相同,不带表姓名的内容相同
		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
		// 姓名的长度和内容相同，不代表年龄相同
		int num3 = num2 == 0 ? this.age - s.age : num2;
		return num3;
	}

}
