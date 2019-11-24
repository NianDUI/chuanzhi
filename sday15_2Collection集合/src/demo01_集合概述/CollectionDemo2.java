package demo01_���ϸ���;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ˭��������˭��
 * 
 *  boolean addAll(Collection<? extends E> c)�����һ�����ϵ�Ԫ��
 *  boolean removeAll(Collection<?> c)���Ƴ�������ָ�������е�����Ԫ��		
 *  boolean containsAll(Collection<?> c)���жϼ������Ƿ����ָ���ļ�������Ԫ��
 *  boolean retainAll(Collection<?> c)���������϶��е�Ԫ�أ�˼��Ԫ��ȥ���ˣ����ص�boolean��ʲô��˼
 *  	����ֵ��ʾ����a�Ƿ����ı�
 *  
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		// ��������1
		Collection c1 = new ArrayList<>();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// ��������2
		Collection c2 = new ArrayList<>();
//		c2.add("abc1");
//		c2.add("abc2");
//		c2.add("abc3");
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");

		// boolean addAll(Collection<? extends E> c)�����һ�����ϵ�Ԫ��
//		System.out.println("addAll��" + c1.addAll(c2));

		// boolean removeAll(Collection<?> c)���Ƴ�������ָ�������е�����Ԫ��
		// ֻҪ��һ��Ԫ�ر��Ƴ���,�ͷ���ture��
//		System.out.println("removeAll��" + c1.removeAll(c2));

		// boolean containsAll(Collection<?> c)���жϼ������Ƿ����ָ���ļ�������Ԫ��
		// ֻ�а������е�Ԫ��,�ŷ���ture��
//		System.out.println("containsAll��" + c1.containsAll(c2));

		// boolean retainAll(Collection<?> c)���������϶��е�Ԫ�أ�˼��Ԫ��ȥ���ˣ����ص�boolean��ʲô��˼
		// ��������������a��b
		// a��b�����������ռ��ϱ�����a�У�b���䡣
		// ����ֵ��ʾ����a�Ƿ����ı�
		System.out.println("retainAll��" + c1.retainAll(c2));
		
		System.out.println("c1��" + c1);
		System.out.println("c1��" + c2);

	}
}
