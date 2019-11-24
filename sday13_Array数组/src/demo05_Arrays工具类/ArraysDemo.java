package demo05_Arrays工具类;

import java.util.Arrays;

/*
 * Arrays:针对数组进行操作的工具类。 比如说排序和查找。 对任意数组
 * 	1.public static String toString(int[] a) 返回指定数组内容的字符串表示形式。
 * 	2.public static void sort(int[] a) 对指定的 int 型数组按数字升序进行排序。
 * 	3.public static int binarySearch(int[] a, int key)
 * 		使用二分搜索法来搜索指定的 int 型数组，以获得指定的值。
 * 		必须在进行此调用之前对数组进行排序（通过 sort(int[]) 方法）。
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
