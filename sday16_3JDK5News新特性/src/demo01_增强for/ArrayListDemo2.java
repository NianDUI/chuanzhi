package demo01_��ǿfor;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�Զ�����󲢱�����Ҫ����뷺�ͣ�������ǿfor������
 * a:������
 * b:��ͨfor
 * c:��ǿfor
 * 
 * LinkedList, Vector,Collection,List�ȴ洢�һ���ô�������ˣ�����Ҫ��������ϰ
 * 
 * ��ǿfor�������������������
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList<Student> array = new ArrayList<Student>();
		
		// ����ѧ������
		Student s1 = new Student("a", 27);
		Student s2 = new Student("b", 22);
		Student s3 = new Student("c", 24);
		Student s4 = new Student("d", 21);
		Student s5 = new Student("e", 21);
		
		
		// ���������Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
		// ��������
		// ������
		Iterator<Student> it =  array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		// ��ͨfor
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s);
		}
		System.out.println("-----------");
		
		// ��ǿfor
		for (Student s : array) {
			System.out.println(s);
		}
		
		
	}
}
