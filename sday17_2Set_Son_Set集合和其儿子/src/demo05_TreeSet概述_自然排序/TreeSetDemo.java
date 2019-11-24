package demo05_TreeSet����_��Ȼ����;

import java.util.TreeSet;

/*
 *  TreeSet����
 *  	a:�ײ����ݽṹ�Ǻ��������һ����ƽ��Ķ�������
 *  	b:����֤Ԫ�ص�����ʽ
 *  		a:��Ȼ����Ԫ�ؾ߱��Ƚ��ԣ�
 *  			��Ԫ����������ʵ��Comparable�ӿ�
 *  		b:�Ƚ������򣨼��Ͼ߱��Ƚ��ԣ�
 *  			�ü��Ϲ��췽������Comparator�ӿڵ�ʵ�������
 *  	c:�����Ĵ��뿴һ�鼴��
 *  	
 *  	��Ҫ�����Ͷ����Ҫ������
 *  		��Ҫ������������ĿҪ��ģ�
 *  		��Ҫ���������Ǹ�Ԫ�ض�������������г�Ա��������compareTo()�Ƚϣ�
 *  
 *  
 *  TreeSet�ǻ��� TreeMapʵ�ֵġ�
 *  TreeMap�ײ�ʵ���Ƕ����������������һ����ƽ��Ķ�������
 *  	�ܹ���Ԫ�ذ���ĳ�ֹ����������
 *  ���������ַ�ʽ��������ȡ���ڹ��졣
 *  a:��Ȼ����
 *  b:�Ƚ�������
 *  publlic TreeSet() 
 *  	����һ���µĿ� set���� set ������Ԫ�ص���Ȼ˳���������
 *  public TreeSet(Comparator<? super E> comparator)
 *  	����һ���µĿ� TreeSet��������ָ���Ƚ�����������
 *  
 *  tree������
 *  
 *  TreeSet���ϵ��ص㣺�����Ψһ
 *  
 *  ͨ���۲���۲�TreeSet��Add()����������֪��������Ҫ��TreeMap��put()����
 *  
 *  TreeMap�ĵײ�ʵ���ǻ��ڶ������ṹ��
 *  �����ıȽ���������Ԫ�ص�compareTo()������
 *  ����������Ƕ�����Comparable��������Ȼ��������ġ�
 *  ���ԣ���Ҫ����д�÷������ͱ�����ʵ��Comparable�ӿڡ�
 *  �����ڱ�ʾ�ľ�����Ȼ����
 *  
 *  ��һ��Ҫ��������Ҫ�����Ͷ����Ҫ������
 *  	������2
 *  
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// �������϶���
		// ��Ȼ�����������
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// ����Ԫ�ز����
		ts.add(20);
		ts.add(18); //
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18); //
		ts.add(24);

		// ����
		for (Integer i : ts) {
			System.out.println(i);
		}
	}
}
