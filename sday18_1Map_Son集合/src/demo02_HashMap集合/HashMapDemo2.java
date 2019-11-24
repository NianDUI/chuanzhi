package demo02_HashMap����;

import java.util.HashMap;
import java.util.Set;

/*
 *  HashMap<Integer, String>
 *  ����Integer
 *  ֵ��String
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		// �������϶���
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// ����Ԫ�ز����Ԫ��
		hm.put(27, "����ϼ");
		hm.put(30, "������");
		hm.put(28, "����");
		hm.put(29, "����ϼ");

		// �����д���ǰ˽��ƣ����ǲ��ܳ��ְ����ϵĵ������ݡ�
//		hm.put(003, "hello");
//		hm.put(004, "hello");
//		hm.put(007, "hello");
//		hm.put(008, "hello"); // ����

		// ����
		Set<Integer> set = hm.keySet();
		for (Integer key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}

		// �������ַ�ʽ�����Ǽ���Ԫ�ص��ַ�����ʾ��
		System.out.println("hm:" + hm);
	}
}
