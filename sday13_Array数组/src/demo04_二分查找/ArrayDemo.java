package demo04_二分查找;

/*
 * 查找：
 * 		基本查找：数组元素无序（从头找到尾）；
 * 		二分查找（折半查找）：数组元素有序；		
 * 
 * 思路：
 * 		A:定义最小索引，最大索引。
 * 		B:计算出中间索引
 * 		c:拿中间索引的值和要查找的元素进行比较。
 * 			相等：就直接返回当前的中间索引；
 * 			不相等：
 * 				大了 在左边找 
 * 				小了 在右边找
 * 		D:重写获取最小索引或者最大索引。
 * 			大了 在左边找。
 * 				max = mid - 1 
 * 			小了 在右边找。
 * 				min = mid + 1
 * 		E:回到B的位置
 * 
 */
public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77 };
		
		// 写功能实现。
		int index = getIndex(arr, 33);
		System.out.println(index);
		
		// 假如这个元素不存在，会出现什么现象？
		index = getIndex(arr, 333);
		System.out.println(index);
		
		
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
			if (min > max) { // 相等的时候，1、找到，循环判断结束 2、最后一个元素下一循环退出
				return -1;
			}
		}

		return mid;
	}

}
