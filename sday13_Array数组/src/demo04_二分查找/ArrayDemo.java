package demo04_���ֲ���;

/*
 * ���ң�
 * 		�������ң�����Ԫ�����򣨴�ͷ�ҵ�β����
 * 		���ֲ��ң��۰���ң�������Ԫ������		
 * 
 * ˼·��
 * 		A:������С���������������
 * 		B:������м�����
 * 		c:���м�������ֵ��Ҫ���ҵ�Ԫ�ؽ��бȽϡ�
 * 			��ȣ���ֱ�ӷ��ص�ǰ���м�������
 * 			����ȣ�
 * 				���� ������� 
 * 				С�� ���ұ���
 * 		D:��д��ȡ��С�����������������
 * 			���� ������ҡ�
 * 				max = mid - 1 
 * 			С�� ���ұ��ҡ�
 * 				min = mid + 1
 * 		E:�ص�B��λ��
 * 
 */
public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77 };
		
		// д����ʵ�֡�
		int index = getIndex(arr, 33);
		System.out.println(index);
		
		// �������Ԫ�ز����ڣ������ʲô����
		index = getIndex(arr, 333);
		System.out.println(index);
		
		
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
			if (min > max) { // ��ȵ�ʱ��1���ҵ���ѭ���жϽ��� 2�����һ��Ԫ����һѭ���˳�
				return -1;
			}
		}

		return mid;
	}

}
