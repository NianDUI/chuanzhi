package demo07;

import java.util.Scanner;

/*
 * ·´×ª
 * 
 * 
 * 	
 */
public class StringBufferTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(myReverse(s));
	}
	

	public static String myReverse(String s) {
//		StringBuffer sb = new StringBuffer(s);
//		sb.reverse();
//		return sb.toString();
		
		return new StringBuffer(s).reverse().toString();
	}

}
