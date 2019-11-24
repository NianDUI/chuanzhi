package demo05_����_Ƕ��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 *  ArrayList����Ƕ��HashMap���ϲ�����
 *  ����
 *  	����ArrayList���ϵ�Ԫ���Ǻ�˹�����������
 *  	ÿһ��HashMap���ϵļ���ֵ��ʰ�ַ���
 *  	Ԫ�����ѽ���ɣ������
 *  �����
 *  	���---С��
 *  	����---����
 *  
 *  	����---����
 *  	���---С��Ů
 *  
 *  	�����---��ӯӯ
 *  	��ƽ֮---����ɺ
 *  
 */
public class ArrayListIncludeHashMapDemo {
	public static void main(String[] args) {
		// �������϶���
		ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

		// ����Ԫ��1
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("���", "С��");
		hm1.put("����", "����");
		// ��Ԫ��1��ӵ�arraylimian
		array.add(hm1);

		// ����Ԫ��2
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("����", "����");
		hm2.put("���", "С��Ů");
		// ��Ԫ��2��ӵ�arraylimian
		array.add(hm2);

		// ����Ԫ��3
		HashMap<String, String> hm3 = new HashMap<String, String>();
		hm3.put("�����", "��ӯӯ");
		hm3.put("��ƽ֮", "����ɺ");
		// ��Ԫ��3��ӵ�arraylimian
		array.add(hm3);

		// ����
		for (HashMap<String, String> hm : array) {
			System.out.println();
			Set<String> set = hm.keySet();
			for (String key : set) {
				String value = hm.get(key);
				System.out.println("\t" + key + "---" + value);
			}
		}

	}
}
