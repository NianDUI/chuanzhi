package demo01_����;

import java.util.Random;

/*
 * Random�� �����ʵ���������������
 *	 
 * 	���췽����
 * 		Random() ����һ���µ��������������
 * 			û�и����ӣ��õ���Ĭ��ֵ���ǵ�ǰʱ��ĺ���ֵ��
 * 		Random(long seed) ʹ�õ��� long ���Ӵ���һ���µ��������������
 * 			����ָ��������
 * 	��Ҫ���ǣ����Ӳ�һ����һ��������
 * 		�������Ӻ�ÿ�εõ������������ͬ�ġ�
 * 
 * 	��Ա����
 * 		public int nextInt():���ص���int��Χ�ڵ��������
 * 		public int nextInt(int n):���ص���[0, n)��Χ�ڵ��������
 * 
 */
public class RandomDemo {

	public static void main(String[] args) {
//		Random r = new Random();
//		for (int i = 0; i < 10; i++) {
//			int num = r.nextInt();
//			System.out.println(num);
//		}
//		System.out.println("=============");
//		for (int i = 0; i < 10; i++) {
//			int num = r.nextInt(10) + 1;
//			System.out.println(num);
//		}

		// ���ӵ�����
		Random r = new Random(111);
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(10) + 1;
			System.out.println(num);
		}

	}

}
