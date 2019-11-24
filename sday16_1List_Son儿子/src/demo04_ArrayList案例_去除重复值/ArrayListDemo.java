package demo04_ArrayList����_ȥ���ظ�ֵ;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayListȥ���������ַ������ظ�ֵ���ַ�����������ͬ��
 * 
 * ˼·��
 * 	����һ���¼��ϣ��ȼ�����û�о���ӣ��оͲ����
 * 
 * ������
 * 	a:�������϶���
 *  b:��Ӷ���ַ���Ԫ�أ�����������ͬ�ģ�
 *  c:�����¼���
 *  d:�����ɼ��ϣ���ȡ��ÿһ��Ԫ��
 *  e:�õ����Ԫ�ص��¼�����ȥ�ң�����û��
 *  	�У���������
 *  	û�У�����ӵ��¼���
 *  f:�����¼���
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ��Ӷ���ַ���Ԫ�أ�����������ͬ�ģ�
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");

		// �����¼���
		ArrayList newArray = new ArrayList();

		// �����ɼ��ϣ���ȡ��ÿһ��Ԫ��
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			
			// �õ����Ԫ�ص��¼�����ȥ�ң�����û��
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}
		
		// �����¼���
		for (int i = 0; i < newArray.size(); i++) {
			String s = (String) newArray.get(i);
			System.out.println(s);
		}
	}
}
