package demo07;

/*
 * Æ´½Ó
 * 
 * 
 * 	
 */
public class StringBufferTest2 {

	public static void main(String[] args) {
		int[] arr = { 44, 33, 55, 11, 22 };
		System.out.println(arrayToString	(arr));
		System.out.println(arrayToString2(arr));
	}
	

	public static String arrayToString2(int[] arr) {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]).append("]");
			} else {				
				sb.append(arr[i]).append(", ");
			}
		}
		return sb.toString();
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
