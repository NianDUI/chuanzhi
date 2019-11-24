package demo04_���ֲ���;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ע�⣺��������������������ġ�
 * ��Ϊ���鱾��������ģ�������������µĲ��Ҳ���ʹ�ö��ֲ��ҡ�
 * �������������ˣ������������ʱ���Ѿ��ı�������ԭʼ��Ԫ��������
 * 
 * ֻ��ʹ����ͨ����
 */
public class ArrayDemo2 {
	
	
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		
		// ����
		bubbleSort(arr);
		
		// ����
		int index = getIndex(arr, 80);
		
		System.out.println(index);
		
		
	}
	
	// ð���������
	public static void bubbleSort (int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// ���ֲ����㷨
	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length - 1;

		int mid;

		while (arr[(mid = (min + max) / 2)] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}
			if (min > max) { // ��ȵ�ʱ�򣬲��ҵ���ѭ���жϺ�Ž���
				return -1;
			}
		}

		return mid;
	}

}
