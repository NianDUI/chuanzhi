package demo03_LIst���й���;

import java.util.List;
import java.util.ArrayList;

/*
 * ���ϵı���
 * List�������б������ܣ�
 * 		size()��get()���ܽ��
 */
public class ListDemo02 {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ���Ԫ�� 
		list.add("hello");
		list.add("world");
		list.add("java");

		// E get(int index)�������б���ָ��λ�õ�Ԫ�ء�
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		// IndexOutOfBoundsException
//		System.out.println(list.get(3));

		// ��ѭ���Ľ�
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}
	}
}
