package demo01_ð������;

/*
 * ����ð������
 * 		����Ԫ�������Ƚϣ��������š����ֵ�������������������
 * 		�ܹ��Ƚ����鳤��-1�Σ�ÿ�αȽϱ����鳤��-1-0�β��ݼ���
 */
public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		printArray(arr);

		/*
		// arr.length - 1Ϊ�˷�ֹ�����±�Խ��
		// arr.length - 1 - 0 ��Ϊ�˼��ٱȽϵĴ���
		for (int i = 0; i < arr.length - 1 - 0; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		printArray(arr);

		// arr.length - 1Ϊ�˷�ֹ�����±�Խ��
		// arr.length - 1 - 1 ��Ϊ�˼��ٱȽϵĴ���
		for (int i = 0; i < arr.length - 1 - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		printArray(arr);
		
		// arr.length - 1Ϊ�˷�ֹ�����±�Խ��
		// arr.length - 1 - 2 ��Ϊ�˼��ٱȽϵĴ���
		for (int i = 0; i < arr.length - 1 - 2; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		printArray(arr);
		
		// arr.length - 1Ϊ�˷�ֹ�����±�Խ��
		// arr.length - 1 - 3 ��Ϊ�˼��ٱȽϵĴ���
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
		// ��ѭ���Ľ�
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
		
		// �����ҿ����ж������Ҫ����������Ҫд�ɷ���
		bubbleSort(arr);
		printArray(arr);
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
