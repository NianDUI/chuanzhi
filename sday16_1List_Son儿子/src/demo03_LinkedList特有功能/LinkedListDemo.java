package demo03_LinkedList���й���;

import java.util.LinkedList;

/*
 * LinkedList�����й��ܣ�
 *  a:��ӹ���
 *  	public void addFirst(E e)
 *  		��ָ��Ԫ�ز�����б�Ŀ�ͷ�� 
 *  	public void addLast(E e)
 *  		��ָ��Ԫ����ӵ����б�Ľ�β�� 
 *  b:��ȡ����
 *  	public E getFirst()
 *  		���ش��б�ĵ�һ��Ԫ�ء� 
 *  	public E getLast()
 *  		���ش��б�����һ��Ԫ�ء�
 *  c:ɾ������
 *  	public E removeFirst()
 *  		�Ƴ������ش��б�ĵ�һ��Ԫ�ء� 
 *  	public E removeLast()
 *  		�Ƴ������ش��б�����һ��Ԫ�ء� 
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// �������϶���
		LinkedList link = new LinkedList();

		// ���Ԫ��
		link.add("hello");
		link.add("world");
//		link.addLast("android"); // link:[hello, world, java, android]
		link.add("java");

		// public void addFirst(E e)
//		link.addFirst("javaee");

		// public void addLast(E e)
//		link.addLast("android");
		
		// public E getFirst()
//		System.out.println("getFirst:" + link.getFirst());
		
		// public E getLast()
//		System.out.println("getLast:" + link.getLast());
		
		// public E removeFirst()
		System.out.println("removeFirst:" + link.removeFirst());
		
		// public E removeLast()
		System.out.println("removeLast:" + link.removeLast());
		
		// ���������
		System.out.println("link:" + link);
	}
}
