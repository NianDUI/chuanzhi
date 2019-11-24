package demo02_选择排序;

/*
 * 选择排序
 * 	从0索引开始，依次和后面元素比较，晓得往前放，第一次完毕，最小值出在了最小索引处；
 * 
 */
public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		printArray(arr);
		selectSort(arr);
		printArray(arr);
	}

	public static void selectSort(int[] arr) {
		// 从索引0开始，到索引等于数组长度-1 -1结束
		for (int i = 0; i < arr.length - 1; i++) {
			// 索引处的数和索引+1比，比到和最后一个数，索引处大交换
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
	}
}
