package demo02_������;

import java.util.Iterator;
import java.util.Scanner;

/*����:�����һ����������ʵ�ֻ�ȡ���ⷶΧ�ڵ��������(int)
 * 	
 * 
 */
public class MathDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ����");
		int start = sc.nextInt();
		System.out.println("�������������");
		int end = sc.nextInt();
		for (int i = 0; i < 100; i++) {
			int result = getRandom(start, end);
//			if (result == start || result == end)
			System.out.println("�����" + result);
		}

//		System.out.println(getRandom(6, 8));

	}

	public static int getRandom(int start, int end) {
		// ��ȡһ��һ��100֮����������(int) (Math.random() * 100) + 1
//		int number = (int) (Math.random() * end) + start; 
		// ����������
		// ��1����Ϊ��start������Сֵ�� �����������[0.0-��ֵ)��ȡ�������ֵ��
		// ��ֵ��1�����ȡ����,Ҳ��ȡ����Сֵ����Ϊ�������������[0.0, ��ֵ+1)
//		int number = (int) (Math.random() * (end - start + 1)) + start; 
//		return number;

		// �Լ�д��
//		return ((int) (Math.random() * Math.abs(start - end)) + Math.min(start, end));  
		return ((int) (Math.random() * Math.abs(start - end + 1)) + Math.min(start, end)); // �ú�
	}

}
