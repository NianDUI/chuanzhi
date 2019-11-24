package demo01_���ϸ���;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  
 *  ���ϵ�������
 *  	��������
 *  
 *  ����ͼ��ϵ�����
 *  	a:��������
 *  		����ĳ��Ȳ���
 *  		���ϵĳ��ȿɱ�
 *  	b:���ݲ���
 *  		����洢����ͬһ�����͵�Ԫ��
 *  		�����Ͽ��Դ洢��ͬ���͵�Ԫ��
 *  	c:Ԫ�ص�������������
 *  		������Ѵ洢�����������ͣ�Ҳ���Ѵ洢������������
 *  		����ֻ�ܴ洢��������
 *  
 *  ��������ص㣺
 *  	..
 *  
 *  ��˵�������Ǵ洢���Ԫ�صģ������أ��洢���Ԫ������Ҳ����ͬ������ġ�
 *  	����˵����Ҫ����Ԫ���в�������ͬ��Ԫ�ء��ٱ���˵����Ҫ����Ԫ�ذ���ĳ�ֹ�������һ�¡�
 *  
 *  ��Բ�ͬ������java�ṩ�˲�ͬ�ļ����࣬������java���ṩ�˺ܶ�������ࡣ
 *  ��������������ݽṹ��ͬ���ṹ��ͬ������Ҫ�ġ���Ҫ������Ҫ�ܹ��洢���������һ��ܹ�ʹ����Щ����������˵�жϣ���ȡ�ȡ�
 *  ��Ȼ��������ô���������������й��Ե����ݵ����ǰ���Щ������Ĺ������ݲ��ϵ�������ȡ�����վ����γɼ��ϵļ̳���ϵ�ṹ��
 *  
 *  ���ݽṹ�����ݵĴ洢��ʽ��
 *  	
 *  Collection���Ǽ��ϵĶ���ӿڣ���������ϵ���ظ��ģ���Ψһ�ģ�������ģ�������ģ����潲�⣩
 *  
 *  collection�Ĺ��ܸ�����
 *  	1:��ӹ���
 *  		boolean add(E e) // boolean add(Object o) ���һ��Ԫ��
 *  		boolean addAll(Collection<? extends E> c)�����һ�����ϵ�Ԫ��
 *  	2:ɾ������
 *  		void clear()���Ƴ��� collection �е�����Ԫ�أ���ѡ��������
 *  		boolean remove(Object o)���Ƴ�һ��ָ����Ԫ��
 *  		boolean removeAll(Collection<?> c)���Ƴ�������ָ�������е�����Ԫ��		
 *  
 *  	3:�жϹ���
 *  		boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ�ء�
 *  		boolean containsAll(Collection<?> c)���жϼ������Ƿ����ָ���ļ�������Ԫ��
 *  		boolean isEmpty()���жϽ���Ƿ�Ϊ�գ�
 *  	
 *  	4:��ȡ����
 *  		Iterator<E> iterator()�����ص㣩�����ڴ� collection ��Ԫ���Ͻ��е����ĵ�����
 *  
 *  	5:���ȹ���
 *  		int size()�����ش� collection �е�Ԫ������
 *  		�����⣺������û��length()�����أ��ַ�����û��length()�����أ�������û��length()�����أ�
 *  
 *  	6:��������
 *  		boolean retainAll(Collection<?> c)���������϶��е�Ԫ�أ�˼��Ԫ��ȥ���ˣ����ص�boolean��ʲô��˼
 *  			�Ƴ��� collection ��δ������ָ�� collection �е�����Ԫ�ء�
 *  	7:�Ѽ���ת��Ϊ����
 *  		Object[] toArray()
 *  
 */
public class CollectionDemo {
	public static void main(String[] args) {
		// ���Բ���All�ķ���
		
		// �������϶���
//		Collection c = new Collection(); // ������Ϊ�ӿڲ���ʵ����
		Collection c = new ArrayList();
		
		// boolean add(E e)�����һ��Ԫ��
//		System.out.println("add:" + c.add("hello")); // true
		c.add("hello");
		c.add("world");
		c.add("java");
		
		// void clear()���Ƴ�����Ԫ��
//		c.clear();
		
		// boolean remove(Object o)���Ƴ�һ��ָ����Ԫ��
//		System.out.println("remove:" + c.remove("hello"));
//		System.out.println("remove:" + c.remove("javaee")); // false
		
		// boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ�ء�
//		System.out.println("contains:" + c.contains("hello"));
//		System.out.println("contains:" + c.contains("android"));
		
		// boolean isEmpty()���жϽ���Ƿ�Ϊ�գ�
		System.out.println("isEmpty:" + c.isEmpty());
		
		// int size()��Ԫ������
		System.out.println("size:" + c.size());
		
		
		System.out.println("c:" + c);
		
		
	}
}
