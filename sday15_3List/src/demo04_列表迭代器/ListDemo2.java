package demo04_�б������;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 *  ���⣿
 *  	����һ������Ԫ�ء����£����������ж�������û��"word"���Ԫ�أ�
 *  	����У��Ҿ����һ��"javaee"Ԫ�أ���б����ʵ��
 *  
 *  ConcurrentModificationException
 *  	��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣�� 
 *  ����ԭ��
 *  	�������������ڼ��϶����ڵģ����жϳɹ��󣬼������������Ԫ�ء�
 *  	��������ȴ��֪�������Ծͱ����ˣ������в����޸��쳣��
 *    ��ʵ��������������ǣ�����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�صġ�
 *  
 *  ����޸��أ�
 *  a:����������Ԫ�أ��������޸�Ԫ�ء�
 *  	Ԫ���Ǹ��ڸղŵ�����Ԫ�غ���ġ�
 *  b:���ϱ���Ԫ�أ������޸�Ԫ�أ���ͨforѭ������
 *  	Ԫ���������ӵġ�
 *  
 */
public class ListDemo2 {
	public static void main(String[] args) {
		// ����List���϶���
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");

		// ����������
		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			String s = (String) it.next();
//			if ("world".equals(s)) {
//				// ConcurrentModificationException
//				list.add("javaee");
//			}
//		}
		
		// ��ʽһ:����������Ԫ�أ��������޸�Ԫ�ء�
		// ��Iterator������ȴû����ӹ��ܣ���������ʹ��������ӿ�ListIterator��
//		ListIterator lit = list.listIterator();
//		while (lit.hasNext()) {
//			String s = (String) lit.next();
//			if ("world".equals(s)) {
//				lit.add("javaee");
//			}
//		}
		
		// ��ʽ2�����ϱ���Ԫ�أ������޸�Ԫ�أ���ͨforѭ������
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			if ("world".equals(s)) {
				list.add("javaee");
			}
		}
		
		System.out.println("list:" + list);

	}
}
