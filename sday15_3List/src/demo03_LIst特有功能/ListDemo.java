package demo03_LIst���й���;

import java.util.ArrayList;
import java.util.List;

/*
 * LIst�������й��ܣ�
 *  a:��ӹ���
 *  	void add(int index, E element)�����б��ָ��λ�ò���ָ��Ԫ�أ���ѡ��������
 *  	boolean addAll(int index, Collection<? extends E> c)
 *  		��ָ�� collection �е�����Ԫ�ض����뵽�б��е�ָ��λ�ã���ѡ��������
 *  b:��ȡ����
 *  	E get(int index)�������б���ָ��λ�õ�Ԫ�ء�
 *  	int indexOf(Object o)
 *  		���ش��б��е�һ�γ��ֵ�ָ��Ԫ�ص�������������б�������Ԫ�أ��򷵻� -1��
 *  	int lastIndexOf(Object o)
 *  		���ش��б��������ֵ�ָ��Ԫ�ص�����������б�������Ԫ�أ��򷵻� -1��
 *  c:�б������
 *  	ListIterator<E> listIterator()��List���еĵ�����
 *  		���ش��б�Ԫ�ص��б�����������ʵ�˳�򣩡�
 *  	ListIterator<E> listIterator(int index)
 *  		�����б���Ԫ�ص��б�����������ʵ�˳�򣩣�
 *  		���б��ָ��λ�ÿ�ʼ��
 *  d:ɾ������
 *  	E remove(int index)����������ɾ��Ԫ�أ����شӱ��Ƴ���Ԫ�ء�
 *  		�Ƴ��б���ָ��λ�õ�Ԫ�أ���ѡ�������������еĺ���Ԫ�������ƶ������������� 1����
 *  		���ش��б����Ƴ���Ԫ�ء�
 *  e:�޸Ĺ���
 *  	E set(int index, E element)�����������޸�Ԫ�أ������޸�ǰ��Ԫ��
 *  		��ָ��Ԫ���滻�б���ָ��λ�õ�Ԫ�أ���ѡ��������
 *  f:��ȡ����
 *  	List<E> subList(int fromIndex, int toIndex)
 *  		�����б���ָ���� fromIndex������ ���� toIndex����������֮��Ĳ�����ͼ����
 *  
 */
public class ListDemo {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();
		
		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		
		// void add(int index, E element)�����б��ָ��λ�ò���ָ��Ԫ�أ���ѡ��������
		// �ڼ��ϳ���λ����ӿ��ԣ����ڳ���
//		list.add(1, "android");
//		// IndexOutOfBoundsException: Index: 11, Size: 4����Խ��
//		list.add(11, "android"); // ������
//		list.add(3, "javaee"); // û������
//		list.add(4, "javaee"); // ������
		
		// E get(int index)�������б���ָ��λ�õ�Ԫ�ء�
//		System.out.println("get:" + list.get(1)); 
//		// IndexOutOfBoundsException
//		System.out.println("get:" + list.get(11));  // ����Խ��
		
		//  remove(int index)����������ɾ��Ԫ�أ����شӱ��Ƴ���Ԫ�ء�
//		System.out.println("remove:" + list.remove(1));
////		// IndexOutOfBoundsException
//		System.out.println("remove:" + list.remove(11));
		
		// E set(int index, E element)�����������޸�Ԫ�أ������޸�ǰ��Ԫ��
		System.out.println("set:" + list.set(1, "javaee"));
		
		
		System.out.println("list:" + list);
	}
}
