package demo05_����_Ƕ��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * ����
 *  ����HashMap���ϵ�Ԫ����ArrayList��������
 *  	ÿһ��ArrayList���ϵ�ֵ���ַ���
 *  	
 *  	Ԫ�����Ѿ���ɣ������
 *  �����
 *  	��������
 *  		����
 *  		���
 *  	Ц������
 *  		�����
 *  		��ƽ֮
 *  	�������
 *  		����
 *  		���
 *  
 *  
 */
public class HashMapIncludeArrayListDemo {
	public static void main(String[] args) {
		// �������϶���
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// ��������Ԫ��1
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("����");
		array1.add("���");
		hm.put("��������", array1);

		// ��������Ԫ��2
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("�����");
		array2.add("��ƽ֮");
		hm.put("Ц������", array2);

		// ��������Ԫ��3
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("����");
		array3.add("���");
		hm.put("�������", array3);

		// ��������
		Set<String> set = hm.keySet();
		for (String key : set) {
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for (String s : value) {
				System.out.println("\t" + s);
			}
		}

	}
}
