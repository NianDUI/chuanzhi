package demo03_�ַ���������;

/*
 * ���ַ����е��ַ���������
 * 		������"dacgebf"
 * 		�����"abcdefg"
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		String s = "dacgebf";
		
		char[] chs = s.toCharArray();
		
//		bubbleSort(chs);
		selectSort(chs);
		
		String result = String.valueOf(chs);
		System.out.println(result);
	}
	
	// ð������
	public static void bubbleSort(char[] chs) {
		for (int i = 0; i < chs.length - 1; i++) {
			for (int j = 0; j < chs.length - 1 -i; j++) {
				if (chs[j] > chs[j + 1]) {
					char temp = chs[j];
					chs[j] = chs[j + 1];
					chs[j + 1] = temp;
				}
			}
		}
	}
	
	// ѡ������
	public static void selectSort(char[] chs) {
		for (int i = 0; i < chs.length - 1; i++) {
			for (int j = i + 1; j < chs.length; j++) {
				if (chs[i] > chs[j]) {
					char temp = chs[i];
					chs[i] = chs[j];
					chs[j] = temp;
				}
			}
		}
	}

}
