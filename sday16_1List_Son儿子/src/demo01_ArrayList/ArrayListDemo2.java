package demo01_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�Զ�����󲢱���
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����", 30);
		Student s2 = new Student("³����", 40);
		Student s3 = new Student("�ֳ�", 36);
		Student s4 = new Student("��־", 38);
		
		// ���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		// ����
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		for (int i = 0;  i < array.size(); i++) {
			Student s = (Student) array.get(i);
			System.out.println(s);
		}
		
	}
}
