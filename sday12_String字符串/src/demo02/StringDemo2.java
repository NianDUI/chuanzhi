package demo02;

/*
 * 字符串如果是变量相加，先开空间，在拼接
 * 字符串如果是常量相加，是先加，然后再常量池里找，若果有就直接返回，否者就创建
 */
public class StringDemo2 {
	
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = new String("hello");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		String s4 = "hello";
		System.out.println(s2 == s4);
		System.out.println(s2.equals(s4));
		

		
		String ss1 = "H";
		String ss2 = "w";
		String ss3 = "Hw";
		System.out.println(ss3 == ss1 + ss2); // false
		System.out.println(ss3 == "Hw"); // true
		System.out.println(ss1 + ss2 == "Hw"); // false
		
	}

}
