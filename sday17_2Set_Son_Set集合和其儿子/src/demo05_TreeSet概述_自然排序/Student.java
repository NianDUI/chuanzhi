package demo05_TreeSet����_��Ȼ����;

/*
 * ���һ�����Ԫ����Ҫ�ܹ�������Ȼ���򣬾ͱ���ʵ����Ȼ����ӿڡ�
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
//		return 0; // ���͸���ͬ
//		return 1; // ���ŵ��ұ�
//		return -1; // ���ŵ����

		// ���ﷵ��ʲô����ʵӦ�ø����ҵ������������
		// ������������,��Ҫ����
		int num = this.age - s.age;
		// ��Ҫ����
		// ������ͬ��ʱ�򣬻�Ҫȥ�������Ƿ�Ҳ��ͬ��
		// ����������������ͬ����ͬһ��Ԫ�ء�
		int num2 = num == 0 ? this.name.compareTo(s.name): num;
		return num2;
	}

}
