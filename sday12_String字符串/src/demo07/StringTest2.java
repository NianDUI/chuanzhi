package demo07;

public class StringTest2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(arrayToString(arr));
	}
	
	public static String arrayToString(int[] arr) {
		String s = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i] + "]";
			} else {				
				s += arr[i] + ", ";
			}
		}
		return s;
	}

}
