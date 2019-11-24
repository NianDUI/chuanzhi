package demo01_Map���ϸ������ص�;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�����
 *  Map -- ���޶�
 *  ��ʽ1:���ݼ���ֵ
 *  ˼·��
 *  	a:�����е��ɷ������������
 *  	b:�����ɷ�ļ���,��ȡ�õ�ÿһ���ɷ�
 *  	c:���ɷ�ȥ���Լ������ӡ�
 *  ת����
 *  	a:��ȡ���еļ�
 *  	b:�������ļ��ϣ���ȡ�õ�ÿһ������
 *  	c:���ݼ�ȥ��ֵ��
 *  
 */
public class MapDemo3 {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		// ����Ԫ�ز����Ԫ��
		map.put("���", "С��Ů");
		map.put("����", "����");
		map.put("�", "�����");
		map.put("������", "÷����");

		// ����
		// 1:Map -- ���޶�
		// a:��ȡ���еļ�
		Set<String> set = map.keySet();
		// b:�������ļ��ϣ���ȡ�õ�ÿһ������
		for (String key : set) {
			// c:���ݼ�ȥ��ֵ��
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
