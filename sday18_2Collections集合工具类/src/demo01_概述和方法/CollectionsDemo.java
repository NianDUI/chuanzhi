package demo01_�����ͷ���;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  Collections: ����Լ��Ͻ��в����Ĺ����࣬���Ǿ�̬����
 *  
 *  �����⣺
 *  	Collection��Collections������
 * 		Collection���ǵ��м��ϵĶ���ӿڡ��нӿ�List��Set��
 *  	Collections������Լ��ϲ����Ĺ����ࡣ�жԼ��Ͻ�������Ͷ��ֲ��ҵķ�����
 *  
 *  Collections��Ҫ֪���ķ�����
 *  a:����
 *  	public static <T extends Comparable<? super T>> void sort(List<T> list)
 *  		����Ԫ�ص���Ȼ˳�� ��ָ���б������������
 *  	public static <T> void sort(List<T> list, Comparator<? super T> c)
 *  		����ָ���Ƚ���������˳���ָ���б��������
 *  b:���ֲ���
 *  	public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
 *  		ʹ�ö�������������ָ���б��Ի��ָ�������ڽ��д˵���֮ǰ����������б�Ԫ�ص���Ȼ˳����б������������
 *  	public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
 *  		ʹ�ö�������������ָ���б��Ի��ָ�������ڽ��д˵���֮ǰ���������ָ���ıȽ������б������������
 *  c:���ֵ
 *  	public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)
 *  		����Ԫ�ص���Ȼ˳�򣬷��ظ��� collection �����Ԫ�ء�
 *  	public static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp)
 *  		����ָ���Ƚ���������˳�򣬷��ظ��� collection �����Ԫ�ء�
 *  d:��Сֵ
 *  	min
 *  e:��ת
 *  	public static void reverse(List<?> list)
 *  		��תָ���б���Ԫ�ص�˳��
 *  f:����û�: ��Ԫ��λ�ý����������
 *  	public static void shuffle(List<?> list)
 *  		ʹ��Ĭ�����Դ��ָ���б�����û��������û������Ŀ����Զ��Ǵ�����ȵġ�
 *  
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		// �������϶���
		List<Integer> list = new ArrayList<Integer>();

		// ���Ԫ��
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("list:" + list);
		
		// ����:public static <T extends Comparable<? super T>> void sort(List<T> list)
//		Collections.sort(list);
//		System.out.println("list:" + list);
		// list:[10, 20, 30, 40, 50]
		
		// ���ֲ��ң�public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
		// �Ҳ���ʱ����������1��ȡ��
//		System.out.println("binarySearch:" + Collections.binarySearch(list, 30)); // 2
//		System.out.println("binarySearch:" + Collections.binarySearch(list, 300)); // -6
		
		// ���ֵ: public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)
//		System.out.println("max:" + Collections.max(list)); // 50
		
		// ��ת: public static void reverse(List<?> list)
//		Collections.reverse(list);
//		System.out.println("list:" + list);
		
		
		// ����û�: public static void shuffle(List<?> list)
		Collections.shuffle(list);
		System.out.println("list:" + list);
		
	}
}
