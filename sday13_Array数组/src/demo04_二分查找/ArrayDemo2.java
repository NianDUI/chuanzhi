package demo04_二分查找;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 注意：下面这种做法是有问题的。
 * 因为数组本身是无序的，所以这种情况下的查找不能使用二分查找。
 * 所以你先排序了，但是你排序的时候已经改变了我最原始的元素索引。
 * 
 * 只能使用普通查找
 */
public class ArrayDemo2 {
	
	
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		
		// 排序
		bubbleSort(arr);
		
		// 查找
		int index = getIndex(arr, 80);
		
		System.out.println(index);
		
		
	}
	
	// 冒泡排序代码
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

	// 二分查找算法
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
			if (min > max) { // 相等的时候，才找到，循环判断后才结束
				return -1;
			}
		}

		return mid;
	}

}
