package demo02_��ϰtoArray;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ��ϰ���ü��ϴ洢���ѧ�����󣬲���ѧ��������б�����
 * 
 * ������
 * A������ѧ���ࡣ
 * B���������϶���
 * C������ѧ������
 * D����ѧ����ӵ����ϡ�
 * E���Ѽ���ת�����顣
 * F���������顣
 */
public class StudentDemo {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 30);
		Student s3 = new Student("�����", 33);
		Student s4 = new Student("����", 25);
		Student s5 = new Student("������", 22);

		// ��ѧ����ӵ����ϡ�
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++) {
//			System.out.println(objs[i]);
			Student s = (Student) objs[i];
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
