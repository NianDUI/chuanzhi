package demo07;

import java.util.Scanner;

/*
 * 
 * 
 * 
 * 	
 */
public class StringBufferTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isSame(s));
		System.out.println(isSame2(s));
	}

	public static boolean isSame2(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}

	public static boolean isSame(String s) {
		char[] chs = s.toCharArray();
		for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
			if (chs[start] != chs[end]) {
				return false;
			}
		}
		return true;
	}

}
