package demo05_TreeSet����_��Ȼ����;

import java.util.TreeSet;

/*
 * TreeSet�洢�Զ�����󲢱�֤�����Ψһ
 * 
 * ���⣺
 *  a:��û�и�������ô����
 *  	��Ȼ���򣬰���������С��������
 *  b:Ԫ��ʲô�����Ψһ��Ҳû�����ҡ�
 *  	��Ա����ֵ��ͬһ��Ԫ��
 *  
 *  .�޲ι��������Ȼ����
 *  ��Ȼ�������Ҫ��ȥʵ��comparable�ӿڵ�compareTo����
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		// �������϶���
		TreeSet<Student> ts = new TreeSet<Student>();

		// ����Ԫ��
		Student s1 = new Student("lingqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("lingqingxia", 27);
		Student s5 = new Student("lingqingxia", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingyang", 22);

		// ���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);

		// ����
		for (Student s : ts) {
			System.out.println(s);
		}
	}
}
