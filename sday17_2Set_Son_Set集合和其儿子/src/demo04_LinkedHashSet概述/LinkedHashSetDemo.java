package demo04_LinkedHashSet����;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet: �ײ����ݻ����ɹ�ϣ����������
 *  ���п�Ԥ֪����˳��� Set �ӿڵĹ�ϣ��������б�ʵ��
 *  
 *  HashSet������
 *  	LinkedHashSet
 *  
 *  ��ϣ��֤��Ԫ�ص�Ψһ�ԡ�
 *  ����֤Ԫ�����򡣣��洢��ȡ��һ�£�
 *  
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// �������϶���
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		// ���������Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		hs.add("java");

		// ����
		for (String s : hs) {
			System.out.println(s);
		}
		/*
		 * hello world java
		 */
	}
}
