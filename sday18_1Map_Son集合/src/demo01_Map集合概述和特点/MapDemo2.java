package demo01_Map���ϸ������ص�;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ��ȡ����
 *  	V get(Object key)�����ݼ���ȡֵ
 *  		����ָ������ӳ���ֵ��
 *  		�����ӳ�䲻�����ü���ӳ���ϵ���򷵻� null�� 
 *  	Set<K> keySet()����ȡ���������м��ļ���
 *  		���ش�ӳ���а����ļ��� Set ��ͼ��
 *  	Collection<V> values()����ȡ����������ֵ�ļ���
 *  		���ش�ӳ���а�����ֵ�� Collection ��ͼ
 */
public class MapDemo2 {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();
		
		// ����Ԫ�ز����Ԫ��
		map.put("�˳�", "��ٳ");
		map.put("������", "��ӱ");
		map.put("�ܽ���", "������");
		map.put("������", "����");
		
		// V get(Object key)�����ݼ���ȡֵ
		System.out.println("get:" + map.get("�ܽ���"));
		System.out.println("get:" + map.get("�ܽ�")); // get:null
		
		System.out.println("---------------");
		
		// Set<K> keySet()����ȡ���������м��ļ���
		Set<String> set = map.keySet();
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("---------------");
		
		// Collection<V> values()����ȡ����������ֵ�ļ���
		Collection<String> con = map.values();
		for (String s : con) {
			System.out.println(s);
		}
		
		// 
		
	}
}
