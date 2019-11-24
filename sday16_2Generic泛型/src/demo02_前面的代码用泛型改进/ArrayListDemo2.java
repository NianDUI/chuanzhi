package demo02_ǰ��Ĵ����÷��͸Ľ�;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * �洢�Զ�����󲢱�����
 * 
 * a:����ѧ���ࡣ
 * b:�������϶���
 * c:����Ԫ�ض���
 * d:��Ԫ����ӵ����ϣ�
 * e:�������ϡ�
 * 
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		// JDK7�������ԣ������ƶϡ�
//		ArrayList<Student> array = new ArrayList<>();
		// �����Ҳ���������ʹ�á�
		ArrayList<Student> array = new ArrayList<Student>();
		
		// ����ѧ������
		Student s1 = new Student("�ܲ�", 40);
		Student s2 = new Student("����", 30);
		Student s3 = new Student("�����", 26);
		
		// ��Ԫ����ӵ����ϣ�
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		// �������ϡ�
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s);
		}
		
	}
}
