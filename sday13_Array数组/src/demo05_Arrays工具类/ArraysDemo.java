package demo05_Arrays������;

import java.util.Arrays;

/*
 * Arrays:���������в����Ĺ����ࡣ ����˵����Ͳ��ҡ� ����������
 * 	1.public static String toString(int[] a) ����ָ���������ݵ��ַ�����ʾ��ʽ��
 * 	2.public static void sort(int[] a) ��ָ���� int �����鰴���������������
 * 	3.public static int binarySearch(int[] a, int key)
 * 		ʹ�ö���������������ָ���� int �����飬�Ի��ָ����ֵ��
 * 		�����ڽ��д˵���֮ǰ�������������ͨ�� sort(int[]) ��������
 * 
 */
public class ArraysDemo {
	
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 57));
		System.out.println(Arrays.binarySearch(arr, 577));
		
	}

}
