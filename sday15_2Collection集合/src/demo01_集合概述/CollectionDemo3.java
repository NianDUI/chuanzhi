package demo01_���ϸ���;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���ϵı��������λ�ȡ���ϵ��е�ÿһ��Ԫ��
 * 
 * Object[] toArray()���Ѽ���ת��Ϊ���飬����ʵ�ֱȼ��ϵı���
 * 
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();
		
		// ���Ԫ��
		c.add("hello"); // Object obj = "hello"; ����ת��
		c.add("world");
		c.add("java");
		
		// ����
		// Object[] toArray()���Ѽ���ת��Ϊ���飬����ʵ�ֱȼ��ϵı���
		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++) {
			// System.out.println(objs[i]);
			// ��֪��Ԫ�����ַ��������ڻ�ȡ��Ԫ�ص�ͬʱ������֪��Ԫ�صĳ��ȡ�
			// ����ת��
			String s = (String) objs[i];
			System.out.println(s + "---" + s.length());
			
		}
		
	}
}
