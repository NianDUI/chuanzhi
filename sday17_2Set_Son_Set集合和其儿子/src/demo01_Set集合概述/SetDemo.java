package demo01_Set���ϸ���;

import java.util.HashSet;
import java.util.Set;

/*
 * Collection
 *  1:List
 *  	���򣨴洢ѭ���ȡ��˳��һ�£������ظ�
 *  2:Set
 *  	���򣨴洢ѭ���ȡ��˳��һ�£���Ψһ
 *  
 *  Set:
 *  	��Collection���û�����ⷽ��
 *  
 *  HashSet:
 *  	������֤ set �ĵ���˳���ر���������֤��˳���ò���
 *  
 *  ע�⣺
 *  	��ȻSet�ü��ϵ�Ԫ�����򣬵�����Ϊ������˵�����϶������Լ��Ĵ洢˳��
 *  	�����˳��ǡ�ú����Ĵ洢˳��һ�£����������������Զ�洢һЩ���ݣ����ܿ���Ч����
 *  
 */
public class SetDemo {
	public static void main(String[] args) {
		// �������϶���
		Set<String> set = new HashSet<String>();

		// ���������Ԫ��
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");

		// ��ǿfor
		for (String s : set) {
			System.out.println(s);
		}
		/*
		 * java world hello
		 */
	}
}
