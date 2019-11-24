package demo03_������;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import demo02_��ϰtoArray.Student;

/*
 * Iterator<E> iterator()��������,���ϵ�ר�ñ�����ʽ
 * 
 * java.util �ӿ� Iterator<E>��
 *  boolean hasNext()
 *  	�������Ԫ�ؿ��Ե������򷵻� true��
 *  E next()
 *  	���ص�������һ��Ԫ�ء� 
 *  
 *  	NoSuchElementException��û��������Ԫ���쳣����Ϊ���Ѿ��ҵ������
 *  void remove()
 *  	�ӵ�����ָ��� collection ���Ƴ����������ص����һ��Ԫ�أ���ѡ��������
 *  	ÿ�ε��� next ֻ�ܵ���һ�δ˷�����
 *  	������е���ʱ�õ��ô˷���֮���������ʽ�޸��˸õ�������ָ��� collection��
 *  	�����������Ϊ�ǲ�ȷ���ġ� 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 30);
		Student s3 = new Student("�����", 33);
		Student s4 = new Student("����", 25);
		Student s5 = new Student("������", 22);

		// ��ѧ����ӵ����ϡ�
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// Iterator<E> iterator()��������,���ϵ�ר�ñ�����ʽ
		Iterator it = c.iterator(); // ʵ�ʷ��صĿ϶��Ǵ�����������Ƕ�̬��
		// ���ж��Ƿ�����һ��Ԫ��
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
//		it.next(); // NoSuchElementException
	}
}
