package demo06_substring;

/*
 * StringBuffer的截取功能
 *  String substring(int start) 
          返回一个新的 String，它包含此字符序列当前所包含的字符子序列。 
 * 
 *  String substring(int start, int end) 
          返回一个新的 String，它包含此序列当前所包含的字符子序列。 
 * 
 * 
 */
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		
		
		System.out.println(sb.substring(5));
		System.out.println(sb.substring(5, 10));
		System.out.println(sb);
		
		
	}

}
