package demo05_reverse;

/*
 * StringBuffer的反转功能
 *  StringBuffer reverse() 
          将此字符序列用其反转形式取代。 
 * 
 * 
 */
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
	}

}
