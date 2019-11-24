package demo07_TreeSet_�Ƚ�������_���췽���в�_���ⲿ��������ڲ���;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * �Ƚ�������
 * �����밴�������ĳ�������
 * 
 * ��Ҫ����,�����ĳ�����ͬ
 * ��Ҫ����1�������ĳ�����ͬ,������������������ͬ
 * ��Ҫ����2�������ĳ��Ⱥ�������ͬ��������������ͬ
 * 
 *  TreeSe���ϱ�֤Ԫ�������Ψһ�Ե�ԭ��
 *  	Ψһ�ԣ��Ǹ��ݱȽϵķ����Ƿ���0�������ġ�
 *  	����
 *  		a:��Ȼ����(Ԫ�ؾ߱��Ƚ���)
 *  			��Ԫ����������ʵ����Ȼ����ӿ�Comparable
 *  		b:�Ƚ�������(���Ͼ߱��Ƚ���)
 *  			�ü��ϵĹ��췽������һ���Ƚ����ӿڵ��������Comparator
 */
public class TreeDemo {
	public static void main(String[] args) {
		// �������϶���
//		TreeSet<Student> ts = new TreeSet<Student>(); // ��Ȼ����
		// public TreeSet(Comparator<? super E> comparator) // �Ƚ�������
		// E-->Student
//		TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());

		// ���һ�������Ĳ����ǽӿڣ���ô����Ҫ���ǽӿڵ�ʵ����Ķ���
		// �������۲��۾Ϳ���ʵ�����������
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// ��������
				int num = s1.getName().length() - s2.getName().length();
				// ��������
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				// ����
				int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
				return num3;
			}
		});

		// ����Ԫ��
		Student s1 = new Student("lingqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("lingqingxia", 27);
		Student s5 = new Student("lingqingxia", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingyang", 22);
		Student s8 = new Student("lingqingxia", 29);

		// ���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// ����
		for (Student s : ts) {
			System.out.println(s);
		}
	}

}
