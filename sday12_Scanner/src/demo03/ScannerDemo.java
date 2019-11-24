package demo03;

import java.util.Scanner;

/*
 * // 出现问题
		// 先获取一个数值，再获取一个字符串，会出现问题
		 * 原因：就是那个换行符的问题
 *	
 * 如何解决：
 * 	A:先获取一个数值后，在创建一个新的键盘录入对象获取字符串
 * 	B:把所有的数据新按照字符串获取，然后要什么，你就对应的转换成什么。
 * 
 *  
 */
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a + " " + b);

//		String s1 = sc.nextLine();
//		String s2 = sc.nextLine();
//		System.out.println(s1 + " " + s2);
		
//		String s1 = sc.nextLine();
//		int b = sc.nextInt();
//		System.out.println(s1 + " " + b);
		
//		// 出现问题
//		// 先获取一个数值，再获取一个字符串，会出现问题
//		int a = sc.nextInt();
//		String s2 = sc.nextLine();
//		System.out.println(a + "-" + s2);
		
		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String s = sc2.nextLine();
		System.out.println(a + "-" + s);
		
		
	}

}
