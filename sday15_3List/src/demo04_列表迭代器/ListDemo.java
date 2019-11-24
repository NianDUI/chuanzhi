package demo04_�б������;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 *  �б������
 *  	ListIterator<E> listIterator()��List���еĵ�����
 *  	�õ������̳���Iterator�����������ԾͿ���ֱ��ʹ��hasNext()��next()������
 *  
 *  ���й��ܣ�
 *  E previous()����ȡ��һ��Ԫ��
 *  boolean hasPrevious()���ж��Ƿ���һλ���Ƿ���Ԫ��
 *  
 *  ע�⣺ListIterator����ʵ�����������������������������������������
 *  	����һ�������壬��ʹ�á�
 *  
 * public interface ListIterator<E>extends Iterator<E>��
	 boolean hasNext() 
	          ����������б�ʱ������б�������ж��Ԫ�أ��򷵻� true�����仰˵����� next ����һ��Ԫ�ض������׳��쳣���򷵻� true���� 
	 E next() 
	          �����б��е���һ��Ԫ�ء� 
	 int nextIndex() 
	          ���ض� next �ĺ�������������Ԫ�ص������� 
	 boolean hasPrevious() 
	          �������������б��б�������ж��Ԫ�أ��򷵻� true�� 
	 E previous() 
	          �����б��е�ǰһ��Ԫ�ء� 
	 int previousIndex() 
	          ���ض� previous �ĺ�������������Ԫ�ص������� 
	 void add(E e) 
	          ��ָ����Ԫ�ز����б���ѡ�������� ���� next �� previous ���ص����һ��Ԫ��λ��
	 void remove() 
	          ���б����Ƴ��� next �� previous ���ص����һ��Ԫ�أ���ѡ�������� 
	 void set(E e) 
	          ��ָ��Ԫ���滻 next �� previous ���ص����һ��Ԫ�أ���ѡ�������� 

 *  
 */
public class ListDemo {
	public static void main(String[] args) {
		// ����List���϶���
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");

		// ListIterator<E> listIterator()��List���еĵ�����
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String) lit.next();
			System.out.println(s);
		}
		// ��������б�
		while (lit.hasPrevious()) {
			String s = (String) lit.previous();
			System.out.println(s);
		}
		System.out.println("------------");

		// ������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println("------------");

	}
}
