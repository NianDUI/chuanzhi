package demo01;

public class Demo04StringPool {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";

		System.out.println(str1 == str2); // true

		char[] array = { 'H', 'e', 'l', 'l', 'o' };
		String str3 = new String(array);
		String str4 = new String(array);

		System.out.println(str3 == str4);
		
		System.out.println(str3);
		
		String str5 = str1;
		str5 += str3;
		System.out.println(str5);
		
		
		
	}
}
