package demo06;


/*
 * String类的其他功能
 *  String replace(char oldChar, char newChar) 
          返回一个新的字符串，它是通过用 newChar 
          替换此字符串中出现的所有 oldChar 得到的。 
 *  String replace(CharSequence target, CharSequence replacement) 
          使用指定的字面值替换序列
          替换此字符串所有匹配字面值目标序列的子字符串。  
 *  String trim() 
          返回字符串的副本，忽略前导空白和尾部空白。 
 *  int compareTo(String anotherString) 
          按字典顺序比较两个字符串。 
 *  int compareToIgnoreCase(String str) 
          按字典顺序比较两个字符串，不考虑大小写。 
 * 
 */
public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = "helloworld";
		System.out.println(s1.replace('l', 'k'));
		System.out.println(s1.replace("owo", "ak47"));
		System.out.println("-------------");

		
		String s2 = "   hello world   ";
		System.out.println("|||" + s2 + "|||");
		System.out.println("|||" + s2.trim() + "|||");
		System.out.println("-------------");
		
		String s3 = "hello";
		String s4 = "hello";
		String s5 = "abc";
		String s6 = "xyz";
		// 遇到不同的字符前一个减后一个，返回的到的值
		System.out.println(s3.compareTo(s4)); // 0
		System.out.println(s3.compareTo(s5)); // 7
		System.out.println(s3.compareTo(s6)); // -16
		
	}

}
