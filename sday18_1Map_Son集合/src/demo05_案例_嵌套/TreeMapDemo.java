package demo05_����_Ƕ��;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * ����"aababcabcdabcde"����ȡ�ַ�����ÿһ����ĸ���ֵĴ���
 * 		Ҫ������a(5)b(4)c(3)d(2)e(1)
 * 
 * ������
 *  	a:����һ���ַ��������ԸĽ�Ϊ����¼�롣��
 *  	b:����һ��TreeMap���ϡ�
 *  		����Character
 * 			ֵ�� Integer
 * 		c:���ַ���תΪ�ַ����顣
 *  	d:�����ַ�����õ�ÿһ���ַ���
 *  	e:�õ��ղŵ��ַ���Ϊ����������ȥ��ֵ��������ֵ��
 *  		��null��˵���ü������ڡ��Ͱ��ַ���Ϊ����һ��Ϊֵ�洢��
 *  		����null��˵���ü����ڣ��Ͱ�ֵ��1��Ȼ���ڴ洢�ü���ֵ��
 *  	f:�����ַ���������������
 *  	g:�������ϵõ�����ֵ���У�����Ҫ��ƴ�ӡ�
 *  	h:���ַ���������ת��Ϊ�ַ��������
 * 
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// a:����һ���ַ��������ԸĽ�Ϊ����¼�롣��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();

		// b:����һ��TreeMap���ϡ�
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// c:���ַ���תΪ�ַ����顣
		char[] chs = line.toCharArray();

		// d:�����ַ�����õ�ÿһ���ַ���
		for (char ch : chs) {
			// e:�õ��ղŵ��ַ���Ϊ����������ȥ��ֵ��������ֵ��
			Integer i = tm.get(ch);
			if (i == null) {
				// ��null��˵���ü������ڡ��Ͱ��ַ���Ϊ����һ��Ϊֵ�洢��
				i = 0; // �Զ�װ��
			}
			i++;
			tm.put(ch, i);
		}

		// f:�����ַ�������������
		StringBuilder sb = new StringBuilder();

		// g:�������ϵõ�����ֵ���У�����Ҫ��ƴ�ӡ�
		Set<Character> set = tm.keySet();
		for (Character key : set) {
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}

		// h:���ַ���������ת��Ϊ�ַ��������
		String result = sb.toString();
		System.out.println(result);

	}
}
