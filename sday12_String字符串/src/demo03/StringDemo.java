package demo03;

/*
 * String类的判断功能：
 * 	 boolean equals(Object anObject)将此字符串与指定的对象比较。
 * 	 boolean equalsIgnoreCase(String anotherString)  忽略
		将此 String 与另一个 String 比较，不考虑大小写。 
 *   boolean contains(CharSequence s) 是否包含
          	当且仅当此字符串包含指定的 char 值序列时，返回 true。 
 *   boolean startsWith(String prefix)  以什么开头
          	测试此字符串是否以指定的前缀开始。 
 *   boolean endsWith(String suffix)  以什么结尾
          	测试此字符串是否以指定的后缀结束。 
 *   boolean isEmpty() 	内容是否为空
          	当且仅当 length() 为 0 时返回 true。 
 *  
 */
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("--------");
		

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("--------");

		System.out.println(s1.contains("ell"));
		System.out.println(s1.contains("ho"));
		System.out.println("--------");

		System.out.println(s1.startsWith("h"));
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.startsWith("el"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.endsWith("lo"));
		System.out.println(s1.endsWith("ll"));
		System.out.println("--------");

		String s4 = "";
		String s5 = null;
		System.out.println(s1.isEmpty()); // false
		System.out.println(s4.isEmpty()); // true
		// s5 对象不存在，所以不能调用方法，空指针异常
//		System.out.println(s5.isEmpty());
		System.out.println("--------");
		
	}
}
