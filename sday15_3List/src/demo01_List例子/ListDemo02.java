package demo01_List����;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List���ϵ��ص㣺
 * 		���򣨴洢��ȡ����Ԫ��һ�£������ظ���
 * 
 * public interface List<E>extends Collection<E>
 * 	����� collection��Ҳ��Ϊ���У���
 * 		�˽ӿڵ��û����Զ��б���ÿ��Ԫ�صĲ���λ�ý��о�ȷ�ؿ��ơ�
 * 		�û����Ը���Ԫ�ص��������������б��е�λ�ã�����Ԫ�أ�
 * 		�������б��е�Ԫ�ء�
 * 	�� set ��ͬ���б�ͨ�������ظ���Ԫ�ء�
 */
public class ListDemo02 {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();
		
		// �洢Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("javaEE");
		list.add("android");
		list.add("javaEE");
		list.add("android");
		
		// ��������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
