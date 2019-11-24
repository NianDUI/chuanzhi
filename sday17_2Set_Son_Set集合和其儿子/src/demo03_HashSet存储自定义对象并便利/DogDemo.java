package demo03_HashSet�洢�Զ�����󲢱���;

import java.util.HashSet;

/*
 * HashSet���ϴ洢ʿ�����󣬲��������������ĳ�Ա����ֵ��ͬ����Ϊͬһ����
 * 
 * ע���ˣ�
 *  ��ʹ�õ���HashSet���ϡ�������ϵײ�ʵ���ǹ�ϣ��ṹ
 * 	����ϣ��ṹ�ײ��������Ƕ���ģ�hashCode()��equals()����
 * �������Ϊ����ĳ�Ա����ֵ��ͬ����Ϊͬһ������Ļ������Ӧ����д������������
 * ��δ�д�أ����õ��ģ��Զ����ɼ��ɡ�
 *  
 */
public class DogDemo {
	public static void main(String[] args) {
		// �������϶���
		HashSet<Dog> hs = new HashSet<Dog>();

		// ��������
		Dog d1 = new Dog("����", 25, "��ɫ", '��');
		Dog d2 = new Dog("a", 25, "bs", 'n');
		Dog d3 = new Dog("����", 20, "��ɫ", 'm');
		Dog d4 = new Dog("����", 25, "��ɫ", '��');
		Dog d5 = new Dog("e", 56, "cs", 'm');
		Dog d6 = new Dog("f", 22, "hs", 'n');
		Dog d7 = new Dog("f", 22, "hs", 'n');
		Dog d8 = new Dog("f", 22, "hs", 'm');

		// ��ӵ�����
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);
		hs.add(d8);

		// ����
		for (Dog d : hs) {
			System.out.println(d);
		}
	}
}
