package demo03_����ĸ���;

import java.util.Arrays;

/*
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * 		��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
 *	src - Դ���顣
	srcPos - Դ�����е���ʼλ�á�
	dest - Ŀ�����顣
	destPos - Ŀ�������е���ʼλ�á�
	length - Ҫ���Ƶ�����Ԫ�ص�������
 * 
 */
public class SystemDemo {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		
		// ���ҿ�����������˼
		System.arraycopy(arr, 1, arr2, 2, 2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

}
