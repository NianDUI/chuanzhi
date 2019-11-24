package demo01;

import java.util.Date;

public class Demo03StringInit {
	public static void main(String[] args) {
		char[] array = { 'H', 'e', 'l', 'l', 'o' };

		String str1 = new String(array);
		System.out.println(str1);

		System.out.println("================");

		String str2 = new String(array, 1, 3);
		System.out.println(str2);
		System.out.println(new Date());
		
	}
}
