package demo03_�ɱ�����ĸ�����ʹ��;

import java.util.Arrays;
import java.util.List;

/*
 * 
 *  Arrays�������е�һ������
 *  	public static <T> List<T> asList(T... a)
 *  		������ת���ɼ���
 *  		����һ����ָ������֧�ֵĹ̶���С���б�
 *  	�ɱ����������㼸���͸��㼸��
 *  ע�����
 *  	��Ȼ���԰�����ת�ɼ��ϣ������ϵĳ��Ȳ��ܸı䡣
 *  ԭ������Ϊ�伯�ϵı��ʻ�������
 */
public class ArraysDemo {
	public static void main(String[] args) {
		// ����һ������
//		String[] strArray = { "hello", "world", "java" };
//		List<String> list = Arrays.asList(strArray);

		List<String> list = Arrays.asList();
		list = Arrays.asList("hello");
		list = Arrays.asList("hello", "world");
		list = Arrays.asList("hello", "world", "java");

		// UnsupportedOperationException ��֧�ֵĲ����쳣
//		list.add("javaee");
		// UnsupportedOperationException ��֧�ֵĲ����쳣
//		list.remove("javaee");
		list.set(1, "javaee"); // �޸Ŀ���

		for (String s : list) {
			System.out.println(s);
		}
	}
}
