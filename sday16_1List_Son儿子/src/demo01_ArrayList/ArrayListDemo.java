package demo01_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * LIst�����ص㣺
 *  	ArrayList��
 *  		�ײ����ݽṹ�����飬��ѯ�죬��ɾ����
 *  		�̲߳���ȫ��Ч�ʸߡ�
 *  	Vector��
 *  		�ײ����ݽṹ�����飬��ѯ�죬��ɾ����
 *  		�̰߳�ȫ��Ч�ʵ͡�
 *  	LinkedList��
 *  		�ײ����ݿ���������ѯ������ɾ�顣
 *  		�̲߳���ȫ��Ч�ʸߡ�
 *  
 *  ������
 *  	ʹ��List���κ�����洢�ַ������ߴ洢�Զ�����󲢱���
 *  
 *  ArrayList��ʹ�ã�
 *  	�洢�ַ���������
 *  
 *  		
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();
		
		// ����Ԫ�ض������Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		
		// ����
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println("------------");
		
		for (int i = 0; i < array.size(); i++) {
			String s = (String) array.get(i);
			System.out.println(s);
		}
		
	}
}
