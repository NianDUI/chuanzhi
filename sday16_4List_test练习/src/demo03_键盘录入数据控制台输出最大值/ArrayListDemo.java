package demo03_����¼�����ݿ���̨������ֵ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ��
 * 
 * ������
 * 		a:��������¼�����ݶ���
 *  	b:����¼��������,���ǲ�֪�����ٸ��������ü��ϴ洢
 *  	c:��0��������򵥣�ֻҪ����¼���������0�����ǾͲ�����¼�������ˡ�
 *  	d:�Ѽ���ת�����顣
 *  	e:����������
 *  	f:��ȡ�������е����������ֵ
 *  
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// ��������¼�����ݶ���
		Scanner sc = new Scanner(System.in);

		// ����¼��������,���ǲ�֪�����ٸ��������ü��ϴ洢
		ArrayList<Integer> array = new ArrayList<Integer>();

		// ��0��������򵥣�ֻҪ����¼���������0�����ǾͲ�����¼��������
		while (true) {
			System.out.println("���������ݣ�");
			int number = sc.nextInt();
			if (number == 0) {
				break;
			}
			array.add(number);
		}

		// �Ѽ���ת������
		// public <T> T[] toArray(T[] a)
		Integer[] i = new Integer[array.size()];
//		Integer[] ii = array.toArray(i);
//		System.out.println(i == ii); // true
		array.toArray(i);

		// ����������
		Arrays.sort(i);

		// ��ȡ�������е����������ֵ
		System.out.println("�����ǣ�" + Arrays.toString(i) + "\n���ֵ�ǣ�" + i[i.length - 1]);

	}
}
