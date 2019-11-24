package demo02_HashSet;

import java.util.HashSet;

/*
 * HashSet����
 *  	a:�ײ����ݽṹ�ǹ�ϣ��
 * 		b:��ϣ��ײ�������Ԫ�صģ�hashCode()��equals()����
 * 			ִ��˳��
 * 				���ȱȽϹ�ϣֵ�Ƿ���ͬ
 * 					��ͬ������ִ��equals()����
 * 						����true��Ԫ���ظ��ˣ������
 * 						����false��ֱ�Ӱ�Ԫ����ӵ�����
 * 					����ͬ����ֱ�Ӱ�Ԫ����ӵ�����
 * 		c:��α�֤Ԫ�ص�Ψһ�Ե��أ�
 * 			��hashCode()��equals()��֤��
 * 		d:������ʱ�򣬴���ǳ��򵥣��Զ����ɼ��ɡ�
 * 
 * 
 * ���⣺
 *  	Ϊʲô�洢�ַ���ֻ�洢��һ���أ�
 *  
 *  ͨ���鿴add������Դ�룬����֪������������ײ�����������������hashCode()��equals()
 *  ���裺
 *  	���ȱȽϹ�ϣֵ��
 *  	�����ͬ�������ߣ��Ƚϵ�ֵַ������equals()��
 *  	�����ͬ����ֱ����ӵ������С�
 *  ���շ����Ĳ�����˵��
 *  	a:���ȿ�hashCode()ֵ�Ƿ���ͬ��
 *  		��ͬ��������equals()����
 *  			����true��˵��ԭ���ظ��Ͳ���ӡ�
 *  			����false��˵��Ԫ�ز��ظ�������ӵ����ϡ�
 *  		��ͬ����ֱ�Ӱ�Ԫ����ӵ����ϡ�
 *  
 *  �����û����д������������Ĭ��ʹ�õ�Object()��һ����˵����ͬ��  
 *  ��String����д��hashCode()��equals()�������������Ϳ��԰�������ͬ���ַ���ȥ����ֻ����һ��
 *  
 */
public class HashSetDemo {
	public static void main(String[] args) {
		// �������϶���
		HashSet<String> hs = new HashSet<String>();
		
		// ���������Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		
		// ��������
		for (String s : hs) {
			System.out.println(s);
		}
	}
}
