package demo04_ArrayList����_ȥ���ظ�ֵ;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayListȥ���������Զ��������ظ�ֵ������ĳ�Ա����ֵ����ͬ��
 * 
 * ���ǰ��պ��ַ���һ���Ĳ��������ֳ������ˡ�
 * Ϊʲô�أ�
 * 		���Ǳ���˼�����������⣿
 *  	ͨ���򵥵ķ���������֪��������������ж��ϣ�
 *  	������жϹ����Ǽ����Լ��ṩ�ģ��������������������֪����������жϵģ���Ӧ��ȥ��Դ�롣
 *  contains()�����ĵײ���������equals()������
 *  �����ǵ�ѧ������û��equals()��������ʱ��Ĭ��ʹ�õ���������Object��equals()������
 *  Object��equals()����Ĭ�ϱȽϵ��ǵ�ֵַ���������Ƕ���ȥ�ˣ���Ϊnew�Ķ��������Ե�ֵַ����ͬ��
 *  ���������Լ������󣬱Ƚϳ�Ա������ֵ��
 *  
 *  ��дequals()���ɡ��Զ����ɼ���
 *  
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array  = new ArrayList();
		
		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("��־��", 40);
		Student s3 = new Student("���", 35);
		Student s4 = new Student("ܽ�ؽ��", 18);
		Student s5 = new Student("�仨", 16);
		Student s6 = new Student("����ϼ", 27);
		Student s7 = new Student("����ϼ", 18);
		
		// ���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		

		// �����¼���
		ArrayList newArray = new ArrayList();

		// �����ɼ��ϣ���ȡ��ÿһ��Ԫ��
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			
			// �õ����Ԫ�ص��¼�����ȥ�ң�����û��
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}
		
		// �����¼���
		for (int i = 0; i < newArray.size(); i++) {
			Student s = (Student) newArray.get(i);
			System.out.println(s);
		}
		
	}
}
