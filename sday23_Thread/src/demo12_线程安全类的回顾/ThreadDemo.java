package demo12_�̰߳�ȫ��Ļع�;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class ThreadDemo {
	public static void main(String[] args) {
		// �̰߳�ȫ����
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<String>();
		Hashtable<String, String> h = new Hashtable<String, String>();

		// Vector���̰߳�ȫ��ʱ��ſ���ʹ�ã������һ�˵����ʹҪ��ȫ����Ҳ�����㡣
		// ��ô����Ҫ��˭�أ�
		// public static <T> List<T> synchronizedList(List<T> list)
		// a	����ָ���б�֧�ֵ�ͬ�����̰߳�ȫ�ģ��б�
		// �̲߳���ȫ
		List<String> list1 = new ArrayList<String>();
		// �̰߳�ȫ
		List<String> list2 = Collections.synchronizedList(new ArrayList<String>());
		
		/*
		 	static <T> Collection<T> 
			 synchronizedCollection(Collection<T> c) 
			          ����ָ�� collection ֧�ֵ�ͬ�����̰߳�ȫ�ģ�collection�� 
			static <T> List<T> 
			 synchronizedList(List<T> list) 
			          ����ָ���б�֧�ֵ�ͬ�����̰߳�ȫ�ģ��б� 
			static <K,V> Map<K,V> 
			 synchronizedMap(Map<K,V> m) 
			          ������ָ��ӳ��֧�ֵ�ͬ�����̰߳�ȫ�ģ�ӳ�䡣 
			static <T> Set<T> 
			 synchronizedSet(Set<T> s) 
			          ����ָ�� set ֧�ֵ�ͬ�����̰߳�ȫ�ģ�set�� 
			static <K,V> SortedMap<K,V> 
			 synchronizedSortedMap(SortedMap<K,V> m) 
			          ����ָ������ӳ��֧�ֵ�ͬ�����̰߳�ȫ�ģ�����ӳ�䡣 
			static <T> SortedSet<T> 
			 synchronizedSortedSet(SortedSet<T> s) 
			          ����ָ������ set ֧�ֵ�ͬ�����̰߳�ȫ�ģ����� set�� 
		 */
	}
}
