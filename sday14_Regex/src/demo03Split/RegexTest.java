package demo03Split;

import java.util.Arrays;

/*
 * 一个字符串："91 27 46 38 50"
 * 实现输出："27 38 46 50 91"
 */
public class RegexTest {
	
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		
		String[] strArray = s.split(" ");
		int[] arr = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.append(i).append(" ");
		}
		String result = sb.toString().trim();
		System.out.println(sb + "|");
		System.out.println("result:" + result + "|");
	}

}
