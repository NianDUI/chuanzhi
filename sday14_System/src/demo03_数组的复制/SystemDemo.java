package demo03_数组的复制;

import java.util.Arrays;

/*
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * 		从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 *	src - 源数组。
	srcPos - 源数组中的起始位置。
	dest - 目标数组。
	destPos - 目标数据中的起始位置。
	length - 要复制的数组元素的数量。
 * 
 */
public class SystemDemo {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		
		// 请大家看这个代码的意思
		System.arraycopy(arr, 1, arr2, 2, 2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

}
