package demo02_ѡ������;

/*
 * ѡ������
 * 	��0������ʼ�����κͺ���Ԫ�رȽϣ�������ǰ�ţ���һ����ϣ���Сֵ��������С��������
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
		// ������0��ʼ���������������鳤��-1 -1����
		for (int i = 0; i < arr.length - 1; i++) {
			// ����������������+1�ȣ��ȵ������һ�������������󽻻�
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
