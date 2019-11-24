package demo02_HashMap����;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap���ϣ�
 *  ���ڹ�ϣ��� Map �ӿڵ�ʵ�֡�
 *  ��ϣ���������������֤����Ψһ�ԡ�
 *  
 *  ��ʵ���ṩ���п�ѡ��ӳ�������������ʹ�� null ֵ�� null ����
 *  
 *  HashMap<String, String>
 *  ����String
 *  ֵ��String
 *  
 *  Ԫ�ص�hashCode()��equals()����
 */
public class HashMapDemo {
	public static void main(String[] args) {
		// �������϶���
		HashMap<String, String> hm = new HashMap<String, String>();

		// ����Ԫ�ز����Ԫ��
		hm.put("it001", "����");
		hm.put("it003", "����");
		hm.put("it004", "�ǲ�˹");
		hm.put("it005", "�ų���");
		hm.put("it002", "�ò���");
		hm.put("it001", "�ȶ��Ǵ�");

		// ����
		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}

	}
}
