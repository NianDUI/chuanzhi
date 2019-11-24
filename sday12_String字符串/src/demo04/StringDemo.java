package demo04;


/*
 * String类的获取功能
 *  int length() 
          返回此字符串的长度。 
 *  char charAt(int index) 
          返回指定索引处的 char 值。 
 *  int indexOf(int ch) 
          返回指定字符在此字符串中第一次出现处的索引。 
 *  int indexOf(String str) 
          返回指定子字符串在此字符串中第一次出现处的索引。 
 *  int indexOf(int ch, int fromIndex) 
          返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。 
 *  int indexOf(String str, int fromIndex) 
          返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。 
 * 	String substring(int beginIndex) 
          该子字符串从指定索引处的字符开始，直到此字符串末尾。
 *  String substring(int beginIndex, int endIndex) 
           该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。
 * 
 */
public class StringDemo {
	
	public static void main(String[] args) {
		String s = "helloworld";
		
		System.out.println(s.length());
		System.out.println("-----------");
		
		System.out.println(s.charAt(7));
		System.out.println("-----------");

		System.out.println(s.indexOf("owo"));
		System.out.println("-----------");

		System.out.println(s.indexOf('l'));
		System.out.println("-----------");
		
		System.out.println(s.indexOf("owo"));
		System.out.println("-----------");

		System.out.println(s.indexOf('l', 4));
		System.out.println(s.indexOf('k', 4));
		System.out.println(s.indexOf('k', 40));
		System.out.println("-----------");

		System.out.println(s.indexOf("owo", 5));
		System.out.println("-----------");

		System.out.println(s.substring(5)); // 包含索引
		System.out.println(s.substring(0)); // 包含索引
		System.out.println("-----------");

		// 包左不包右
		System.out.println(s.substring(3, 8)); // 不包含末尾索引
		System.out.println(s.substring(0, s.length())); // 不包含末尾索引
//		System.out.println(s.substring(8, 15)); // 不包含末尾索引
		System.out.println("-----------");
		
		
	}

}
