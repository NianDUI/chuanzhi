package demo01_��ǿfor;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�ַ�����������Ҫ����뷺�ͣ�������ǿfor������
 * a:������
 * b:��ͨfor
 * c:��ǿfor
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// �������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		// ���������Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		// ��������
		// ������
		Iterator<String> it =  array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		// ��ͨfor
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
		System.out.println("-----------");
		
		// ��ǿfor
		for (String s : array) {
			System.out.println(s);
		}
		
		
	}
}
