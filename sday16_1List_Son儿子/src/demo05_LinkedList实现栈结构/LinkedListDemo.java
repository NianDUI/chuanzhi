package demo05_LinkedListʵ��ջ�ṹ;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList:
 *  ����LinkedListģ��ջ���ݽṹ�ļ��ϲ�����
 *  
 *  ��Ŀ����˼��
 *  	���Լ���һ�������࣬�������������ڲ�����ʹ��LinkedListģ�⡣
 *  
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// a:LinkedList��������ӹ���addFirst();
		// b:ջ���ص��Ƚ����

		LinkedList link = new LinkedList();

		// ���Ԫ��
		link.addFirst("hello");
		link.addFirst("world");
		link.addFirst("java");

		// ����
		Iterator it = link.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
		// ����Ϊʲô�أ�
		
		
	}
}
