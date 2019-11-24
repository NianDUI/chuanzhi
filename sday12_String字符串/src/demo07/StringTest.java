package demo07;

import java.util.Scanner;

/*
 * ×Ö·û´®·´×ª
 */
public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(myReverse(sc.nextLine()));
	}
	
	public static String myReverse(String s) {
		String result = "";
//		for (int i = s.length() - 1; i >= 0; i--) {
//			result += s.charAt(i);
//		}
		
		char[] chs = s.toCharArray();
		for (int i = chs.length - 1; i >= 0; i--) {
			result += chs[i];
		}
		return result;
	}

}
