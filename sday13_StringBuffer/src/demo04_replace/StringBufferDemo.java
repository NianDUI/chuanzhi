package demo04_replace;


/*
 * StringBuffer的替换功能；
 * 
 *  StringBuffer replace(int start, int end, String str) 
          使用给定 String 中的字符替换此序列的子字符串中的字符。 
          	包左不包右
 *	
 * 
 * 
 * 
 */
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		
		sb.replace(5, 10, "节日快乐");
		
		
		System.out.println(sb);
	}

}
