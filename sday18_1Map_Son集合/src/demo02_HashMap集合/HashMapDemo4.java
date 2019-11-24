package demo02_HashMap����;

import java.util.HashMap;
import java.util.Set;

/*
 *  HashMap<Student, String>
 *  ����Student
 *  	Ҫ��:�����������ĳ�Ա����ֵ����ͬ����Ϊͬһ����
 *  ֵ��String
 *  ��дԪ�ص�hashCode()��equals()����
 */
public class HashMapDemo4 {
	public static void main(String[] args) {
		// �������϶���
		HashMap<Student, String> hm = new HashMap<Student, String>();

		// ����ѧ������
		Student s1 = new Student("����", 27);
		Student s2 = new Student("���Ѿ�", 30);
		Student s3 = new Student("��ʩ", 33);
		Student s4 = new Student("����", 35);
		Student s5 = new Student("����", 27);

		// ���Ԫ��
		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "5555");
		hm.put(s4, "9999");
		hm.put(s5, "6666");

		// ����
		Set<Student> set = hm.keySet();
		for (Student key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}

	}
}
