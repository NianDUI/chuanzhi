package demo09_����¼��ѧ����Ϣ�����ܷ����������ڿ���̨����;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼�����ѧ����Ϣ(���������ĳɼ�����ѧ�ɼ���Ӣ��ɼ�)�������ִܷӸߵ������������̨��
 * 
 *  ����
 *  	a:����ѧ����
 *  	b:����һ��TreeSet����
 *  	c:�ִܷӸߵ��ͣ����ʵ���أ�
 *  	e:����¼�����ѧ����Ϣ��
 *  	f:����TreeSet���ϡ�
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// ����һ��TreeSet����
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// �ִܷӸߵ���
				int num = s2.getSum() - s1.getSum();
				// �ִܷӵ͵���
//				int num = s1.getSum()- s2.getSum();
				
				// �ܷ���ͬ�Ĳ�һ��������ͬ
				int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				// �ܷ���ͬ�Ĳ�һ����ѧ��ͬ
				int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
				// �ܷ���ͬ�Ĳ�һ��Ӣ����ͬ
				int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
				// ��������һ����ͬ
				int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName()) : num4;

				return num5;
			}

		});
		
		
		// ����¼�����ѧ����Ϣ��
		for (int i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������" + i + "��ѧ��������:");
			String name = sc.nextLine();
			System.out.println("�������" + i + "��ѧ�������ĳɼ�:");
			String chineseString = sc.nextLine();
			System.out.println("�������" + i + "��ѧ������ѧ�ɼ�:");
			String mathString = sc.nextLine();
			System.out.println("�������" + i + "��ѧ����Ӣ��ɼ�:");
			String englishString = sc.nextLine();
			
			// �����ݷ�װ��ѧ������
			Student s = new Student();
			s.setName(name);
			s.setChinese(Integer.parseInt(chineseString));
			s.setMath(Integer.parseInt(mathString));
			s.setEnglish(Integer.parseInt(englishString));
			
			// ��ѧ��������ӵ�����
			ts.add(s);
		}
		System.out.println("ѧ����Ϣ¼�����");
		
		System.out.println("ѧ���ɼ��Ӹߵ�����������:");
		// ����TreeSet���ϡ�
		for (Student s : ts) {
			System.out.println(s);
		}

	}
}
