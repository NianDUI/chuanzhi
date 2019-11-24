package demo04_TreeMap����;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap: �ǻ��ں������Map�ӿ�ʵ�֡�
 *  	��֤�����Ψһ
 *  ��Ȼ����ͱȽ�������
 * 
 * TreeMap<String, String>:��Ȼ����
 * ����String
 * ֵ��String
 * ��Ԫ�����ڵ���ʵ��Comparable�ӿڡ�
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// �������϶���
		TreeMap<String, String> tm = new TreeMap<String, String>();

		// ����Ԫ�ز����Ԫ��
		tm.put("hello", "nihao");
		tm.put("world", "shijie");
		tm.put("java", "zhuwa");
		tm.put("world", "shijie2");
		tm.put("javaee", "zhuwaEE");

		// ����
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "-------" + value);
		}

	}
}
