package demo04_Collection��ϰ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * �洢�ַ���������
 * 
 * ������
 * 	a:�������϶���
 *  b:�����ַ�������
 *  c:���ַ�����ӵ�������
 *  d:��������
 */
public class CollectionTest {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();
		
		// �����ַ�������
		// ���ַ�����ӵ�������
		c.add("����ϼ");
		c.add("������");
		c.add("����");
		c.add("����");
		c.add("������");
		
		// ��������
		// ͨ�����϶����ȡ����������
		Iterator it = c.iterator();
		// ͨ�������������hasNext()�����ж���û�У�
		while (it.hasNext()) {
			// ͨ�������������next()������ȡԪ�ء�
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
