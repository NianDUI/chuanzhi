package demo04_ArrayList����_ȥ���ظ�ֵ;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayListȥ���������ַ������ظ�ֵ���ַ�����������ͬ��
 * Ҫ�󣺲��ܴ����µļ��ϣ�������ǰ�ļ���������
 * 
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ��Ӷ���ַ���Ԫ�أ�����������ͬ�ģ�
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		
		// ��ѡ������˼�룬��ô����ͨ������˼���������Ŀ
		// ��0������һ�κͺ���ıȽϣ��оͰѺ���ĸɵ�
		// ͬ����1����...
		for (int i = 0; i < array.size(); i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(i).equals(array.get(j))) {
					array.remove(j);
					j--; // ɾ��һ�����ȼ�һ������Ԫ�����ƣ���Ҫ�����ж�
				}
			}
		}
		
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
	}
}
