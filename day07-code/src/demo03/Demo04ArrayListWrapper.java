package demo03;

import java.util.ArrayList;

/*
 * ��������  ��Ӧ�İ�װ��
 * byte    Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * ��JDK1.5��ʼ���������Ϳ��ԺͶ�Ӧ�İ�װ������Զ�װ�����
 * װ�䣺�������� --����װ��
 * ���䣺��װ�� --�� ��������
 */
public class Demo04ArrayListWrapper {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(200);
		list.add(300);

		System.out.println(list.get(1));

	}

}
