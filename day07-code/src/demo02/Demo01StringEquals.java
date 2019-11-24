package demo02;

/*
 * equals()不区分大小写
 * equalsIgnoreCase()不区分大小写
 */
public class Demo01StringEquals {
	public static void main(String[] args) {
		char[] array = { 'a', 'b', 'c' };
		String str1 = new String(array);

		String str2 = "abc";

		System.out.println(str1 == str2); // false

		boolean same = str1.equals(str2);
		System.out.println(same); // true

		System.out.println("=============");

		System.out.println("abc".equals(str2));
		System.out.println(str2.equals("abc"));

		String str3 = null;
		System.out.println("abc".equals(str3));
		// System.out.println(str3.equals("abc"));

		String str4 = "ABC";
		System.out.println(str4.equals(str2));
		System.out.println(str4.equalsIgnoreCase(str2));

	}
}
