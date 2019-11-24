package demo01_冒泡排序;

/*
 * 数组冒泡排序
 * 		相邻元素两两比较，大的往后放。最大值出现在了最大索引处；
 * 		总共比较数组长度-1次，每次比较比数组长度-1-0次并递减；
 */
public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		printArray(arr);

		/*
		// arr.length - 1为了防止数组下标越界
		// arr.length - 1 - 0 是为了减少比较的次数
		for (int i = 0; i < arr.length - 1 - 0; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		printArray(arr);

		// arr.length - 1为了防止数组下标越界
		// arr.length - 1 - 1 是为了减少比较的次数
		for (int i = 0; i < arr.length - 1 - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		printArray(arr);
		
		// arr.length - 1为了防止数组下标越界
		// arr.length - 1 - 2 是为了减少比较的次数
		for (int i = 0; i < arr.length - 1 - 2; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		printArray(arr);
		
		// arr.length - 1为了防止数组下标越界
		// arr.length - 1 - 3 是为了减少比较的次数
		for (int i = 0; i < arr.length - 1 - 3; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		printArray(arr);
		*/
		
		
		 /*
		// 用循环改进
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printArray(arr);
		*/
		
		// 由于我可能有多个数组要排序，所以我要写成方法
		bubbleSort(arr);
		printArray(arr);
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
