package demo02_Vector;

import java.util.Enumeration;
import java.util.Vector;

/*
 *  Vector�����й���
 *  1����ӹ���
 *  	public void addElement(E obj) -- add()
 *  		��ָ���������ӵ���������ĩβ�������С���� 1��
 *  2����ȡ����
 *  	public E elementAt(int index) -- get()
 *  		����ָ��������������� 
 *  	public Enumeration<E> elements()�������ڵ�����  -- Iterator iterator()
 *  		���ش������������ö�١�
 *  
 *  java.util �ӿ� Enumeration<E>��
 *  	boolean hasMoreElements() -- hasNext()
 *  		���Դ�ö���Ƿ���������Ԫ�ء� 
 *  	E nextElement() -- next()
 *  		�����ö�ٶ������ٻ���һ�����ṩ��Ԫ�أ��򷵻ش�ö�ٵ���һ��Ԫ�ء�
 *  
 *  JDK������ԭ��
 *  	a:��ȫ
 *  	b:Ч��
 *  	c:����д
 *  
 */
public class VectorDemo {
	public static void main(String[] args) {
		// �������϶���
		Vector v = new Vector();
		
		// ��ӹ���
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		
		// ����
		for (int i = 0; i < v.size(); i++) {
			String s = (String) v.elementAt(i);
			System.out.println(s);
		}
		System.out.println("--------------");
		
		Enumeration en = v.elements(); // ����������ʵ����Ķ���
		while (en.hasMoreElements()) {
			String s = (String) en.nextElement();
			System.out.println(s);
		}
	}
}
