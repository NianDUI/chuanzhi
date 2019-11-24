package demo01_Map���ϸ������ص�;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�����
 *  Map -- ���޶�
 *  ��ʽ2:���ݼ�ֵ�Զ����Ҽ���ֵ
 *  ˼·��
 *  	a:��ȡ���н��֤�ļ���
 *  	b:�������֤�ļ��ϣ��õ�ÿһ�����֤
 *  	c:���ݽ��֤��ȡ�ɷ������
 *  
 *  ת����
 *  	a:��ȡ���м�ֵ�Զ���ļ���
 *  	b:������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
 *  	c:���ݼ�ֵ�Զ����ȡ����ֵ��
 *  
 *  ���������鷳�ľ��Ǽ�ֵ�Զ�����α�ʾ�أ�
 *  �������ǿ�ʼ��һ��������
 *  
 * ��ȡ����
 *  	Set<Map.Entry<K,V>> entrySet()�����ص��Ǽ�ֵ�Զ���ļ���
 *  		���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ��
 *  
 *  Entry��ʵ��
 *  
 *  public static interface Map.Entry<K,V>:
 *   	boolean equals(Object o)
 *   		�Ƚ�ָ����������������ԡ� 
 *   	K getKey() 
 *  		����������Ӧ�ļ��� 
 *   	V getValue() 
 *  		����������Ӧ��ֵ�� 
 *   	int hashCode() 
 *  		���ش�ӳ����Ĺ�ϣ��ֵ�� 
 *   	V setValue(V value)
 *   		��ָ����ֵ�滻������Ӧ��ֵ����ѡ��������
 *  
 */
public class MapDemo4 {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		// ����Ԫ�ز����Ԫ��
		map.put("���", "С��Ů");
		map.put("����", "����");
		map.put("�", "�����");
		map.put("������", "÷����");

		// ����
		// a:��ȡ���м�ֵ�Զ���ļ���
		Set<Map.Entry<String, String>> set = map.entrySet();
		// b:������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
		for (Map.Entry<String, String> me : set) {
			// c:���ݼ�ֵ�Զ����ȡ����ֵ��
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "---" + value);
		}

	}
}
